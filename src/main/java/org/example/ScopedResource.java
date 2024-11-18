package org.example;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

public interface ScopedResource<R> {


    @Path("park/{ident}")
    public R park(@PathParam("ident") final String parkIdent);


}
