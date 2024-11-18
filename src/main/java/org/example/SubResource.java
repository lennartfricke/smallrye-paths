package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

public class SubResource {

	@GET
	@Path("/{period}")
	String yes(@PathParam("period") String period) {
		return "";
	}
}
