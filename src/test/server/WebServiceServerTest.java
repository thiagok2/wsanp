package test.server;

import javax.xml.ws.Endpoint;

public class WebServiceServerTest {
	public static void main(String[] args) {
        String bindingURI = "http://localhost:9898/anpws/fs";
        FileTransferer service = new FileTransfererImpl();
        Endpoint.publish(bindingURI, service);
        System.out.println("Server started at: " + bindingURI);
    }
}
