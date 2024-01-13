package dtu.dtupay;

// import org.eclipse.microprofile.rest.client.inject.RestClient;
import jakarta.inject.Inject;

public class ClientApplication {

	// @RestClient
	@Inject
	HelloService helloService;

	public static void main(String[] args) {
		ClientApplication clientApp = new ClientApplication();
		String response = clientApp.helloService.hello();
		System.out.println(response);
	}
}
