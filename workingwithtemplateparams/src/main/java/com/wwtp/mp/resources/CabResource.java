package com.wwtp.mp.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.StreamingOutput;

@Path("/cab")
public class CabResource {

	@GET
	@Path("/nearby/{pickupPoint}/{dropPoint}/{cabType}")
	@Produces(MediaType.TEXT_PLAIN)
	public StreamingOutput getAvailableCabs(@PathParam("pickupPoint") PathSegment pickupPointPS,
			@PathParam("dropPoint") PathSegment dropPointPS, @PathParam("cabType") PathSegment cabTypePS) {
		return (os) -> {
			StringBuilder builder = null;

			builder = new StringBuilder();
			builder.append("path segument->pickupPoint :").append(pickupPointPS.getPath()).append(";");
			builder.append("matrix:").append(getMatrixParameters(pickupPointPS.getMatrixParameters()));

			builder.append(" pathsegment -> dropPoint: ").append(dropPointPS.getPath()).append(";");
			builder.append("matrix: ").append(getMatrixParameters(dropPointPS.getMatrixParameters()));

			builder.append(" path segment -> cabType :").append(cabTypePS.getPath()).append("matrix :")
					.append(getMatrixParameters(cabTypePS.getMatrixParameters()));
			

			os.write(builder.toString().getBytes());
			os.close();
		};
	}

	private String getMatrixParameters(MultivaluedMap<String, String> matrixParameters) {
		StringBuilder builder = null;

		builder = new StringBuilder();
		for (String paramName : matrixParameters.keySet()) {
			builder.append(paramName).append("=");
			for (Object paramValue : matrixParameters.get(paramName)) {
				builder.append(paramValue).append(",");
			}
		}
		builder.append(";");
		return builder.toString();
	}
}
