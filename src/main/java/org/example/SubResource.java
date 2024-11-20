package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

public class SubResource {

	@GET
	@Path("/")
	String yes() {
		return "";
	}
}
