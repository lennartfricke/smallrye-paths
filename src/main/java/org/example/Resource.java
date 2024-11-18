package org.example;

import jakarta.ws.rs.Path;

@Path("/")
public interface Resource extends ScopedResource<SubResource> {

}
