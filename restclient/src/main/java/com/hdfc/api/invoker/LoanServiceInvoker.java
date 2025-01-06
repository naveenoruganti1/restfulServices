package com.hdfc.api.invoker;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Cookie;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;

public class LoanServiceInvoker {
	private final String BASE_URI = "http://localhost:8082/resourceinjection/rest/loan";
	private Client client;

	public LoanServiceInvoker() {
		ClientBuilder clientBuilder = null;

		clientBuilder = ClientBuilder.newBuilder();
		clientBuilder.property("connection.timeout", 6000);
		client = clientBuilder.build();
	}

	public String getLoanStatus(String applicationNo) {
		String loanStatus = null;
		WebTarget webTarget = null;
		Invocation invocation = null;
		Invocation.Builder inBuilder = null;
		Response response = null;

		webTarget = client.target(BASE_URI).path("/{applicationNo}/status");
		webTarget = webTarget.resolveTemplate("applicationNo", applicationNo);

		inBuilder = webTarget.request();
		invocation = inBuilder.buildGet();
		response = invocation.invoke();
		if (response.getStatus() == 200) {
			loanStatus = response.readEntity(String.class);
		}

		return loanStatus;
	}

	/**
	 * ./{income}/{loanType}/eligibility
	 * 
	 * @param applicantName = query param
	 * @param mobileNo      = query param
	 * @param grossIncome   = path param
	 * @param loanType      = path param
	 * @return
	 */
	public String getEligibleAmount(String applicantName, String mobileNo, double grossIncome, String loanType) {
		String eligibility = null;
		WebTarget webTarget = null;
		Invocation invocation = null;
		Invocation.Builder inBuilder = null;
		Response response = null;

		webTarget = client.target(BASE_URI).path("/{income}/{loanType}/eligibility")
				.resolveTemplate("income", grossIncome).resolveTemplate("loanType", loanType)
				.queryParam("applicantName", applicantName).queryParam("mobileNo", mobileNo);
		inBuilder = webTarget.request();
		invocation = inBuilder.buildGet();
		response = invocation.invoke();
		if (response.getStatus() == 200) {
			eligibility = response.readEntity(String.class);
		}

		return eligibility;
	}

	/**
	 * ./{city}/{area}/nearestbranch
	 * 
	 * @param city     = path
	 * @param area     = path
	 * @param landMark = matrix
	 * @param loanType = query
	 * @return
	 */
	public String nearestBranch(String city, String area, String landMark, String loanType) {
		String nearestBranch = null;
		Response response = null;
		WebTarget webTarget = null;
		Invocation.Builder inBuilder = null;
		Invocation invocation = null;

		webTarget = client.target(BASE_URI).path("/{city}/{area}").resolveTemplate("city", city)
				.resolveTemplate("area", area).matrixParam("landMark", landMark).path("/nearestbranch")
				.queryParam("loanType", loanType);
		inBuilder = webTarget.request();
		invocation = inBuilder.buildGet();
		response = invocation.invoke();
		if (response.getStatus() == 200) {
			response.bufferEntity();
			nearestBranch = response.readEntity(String.class);
		}

		return nearestBranch;
	}

	/**
	 * ./enquire: POST
	 * 
	 * @param applicantName   = query
	 * @param principleAmount = formParam
	 * @param tenure          = formParam
	 * @param loanType        = formParam
	 * @param contactNo       = formParam
	 * @return
	 */
	public String enquire(String applicantName, double principleAmount, int tenure, String loanType, String contactNo) {
		String enquire = null;
		Response response = null;
		WebTarget webTarget = null;
		Invocation.Builder builder = null;
		Invocation invocation = null;
		Form form = null;

		webTarget = client.target(BASE_URI).path("/enquire").queryParam("applicantName", applicantName);
		builder = webTarget.request();

		form = new Form();
		form.param("principleAmount", String.valueOf(principleAmount)).param("tenure", String.valueOf(tenure))
				.param("loanType", loanType).param("contactNo", contactNo);
		invocation = builder.buildPost(Entity.form(form));
		response = invocation.invoke();
		if (response.getStatus() == 200) {
			enquire = response.readEntity(String.class);
		}

		return enquire;
	}

	/**
	 * ./{pancard}/cibilscore
	 * 
	 * @param pancardno = path param
	 * @param appCode   = cookie param
	 * @param agentType = header param
	 * @return
	 */
	public String getCibilScore(String pancardno, String appCode, String agentType) {
		String cibilScore = null;

		cibilScore = client.target(BASE_URI).path("/{pancard}/cibilscore").resolveTemplate("pancard", pancardno)
				.request().header("agentType", agentType).cookie("appcode", appCode).get(String.class);

		return cibilScore;

	}

	public void close() {
		if (client != null) {
			client.close();
			client = null;
		}
	}

}
