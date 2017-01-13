package org.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class HelloWorld {

    // curl http://localhost:8080/helloworld-rs-1.0.0/json
	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getHelloWorldJSON() {
		return "{\"result\":\"Hello World!\"}";
	}

	// curl http://localhost:8080/helloworld-rs-1.0.0/xml
	@GET
	@Path("/xml")
	@Produces({ "application/xml" })
	public String getHelloWorldXML() {
		return "<xml><result>Hello World!</result></xml>";
	}

}
