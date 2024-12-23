package com.wwtp.mp.resources;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/journeyplanner")
public class JourneyPlanner {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{travelBy}/{source}/{destination}/availableSeats")
	public StreamingOutput availableSeats(@PathParam("travelBy") String travelBy, @PathParam("source") String source,
			@PathParam("destination") String destination, @QueryParam("jdt") Date journeyDate,
			@QueryParam("jc") String journeyClass, @MatrixParam("seatpreference") String seatPreference,
			@MatrixParam("duration") int duration) {
		return (os) -> {
			StringBuilder builder = new StringBuilder();
			builder.append("travelBy : ").append(travelBy).append(" source : ").append(source).append(" destination : ")
					.append(destination).append(" jdt :").append(journeyDate).append(" jc").append(journeyClass)
					.append(" seatpreference :").append(seatPreference).append(" duration :").append(duration);
			os.write(builder.toString().getBytes());
			os.close();
		};
	}

}
