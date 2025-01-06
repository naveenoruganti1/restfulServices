package com.hdfc.api.invoker;

public class LoanServiceTest {
	public static void main(String[] args) {
		LoanServiceInvoker loanServiceInvoker = new LoanServiceInvoker();
		/*
		 * String loanStatus = loanServiceInvoker.getLoanStatus("a0208303");
		 * System.out.println("loan status : " + loanStatus);
		 */
		/*
		 * String eligibility = loanServiceInvoker.getEligibleAmount("Alex", "39380383",
		 * 2300000, "home loan"); System.out.println("eligibility :" + eligibility);
		 */
		/*
		 * String nearestBranch = loanServiceInvoker.nearestBranch("hyderabad",
		 * "madhapur", "omni hospitals", "home loan");
		 * System.out.println(nearestBranch);
		 */
		/*
		 * String enquire = loanServiceInvoker.enquire("John", 100000, 24,
		 * "Personal Loan", "9839383938"); System.out.println(enquire);
		 */
		String cibilScore = loanServiceInvoker.getCibilScore("a230383", "ac9383", "Android");
		System.out.println(cibilScore);

		loanServiceInvoker.close();
	}
}
