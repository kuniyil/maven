package com.gopaddle.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/")
public class HelloWorldService {
 
	@GET
	public Response getMsg() {
 
		String output = "Hellooooo World This is a Test Page !!!!" ;
 
		return Response.status(200).entity(output).build();
 
	}
 
}
