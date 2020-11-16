package org.acme.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/test")
public class TestResource {

    @GET
        public String hello() {
            return "hello";
        }
        
  
}