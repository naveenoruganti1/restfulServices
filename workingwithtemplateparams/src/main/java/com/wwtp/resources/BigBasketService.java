package com.wwtp.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/bigbasket")
public class BigBasketService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{productNo: \\d+}/product")
	public StreamingOutput getProduct(@PathParam("productNo") int productNo) {
		return (os) -> {
			os.write(("{'productNo' :'" + productNo + "', 'description':'television', 'price':28383}").getBytes());
			os.close();
		};
	}
}
