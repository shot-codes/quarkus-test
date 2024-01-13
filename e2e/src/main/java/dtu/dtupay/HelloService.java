package dtu.dtupay;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Produces;

@Path("/hello")
@RegisterRestClient
public interface HelloService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	String hello();
}
