package com.example.soapuserservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/users";

    // This method handles getUserRequest and returns user data
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();

        // Handle different user IDs
        if (request.getId() == 1) {
            response.setName("ESHETU");
            response.setEmail("eshetu@gmail.com");
        } else if (request.getId() == 2) {
            response.setName("JEREMY");
            response.setEmail("jeremy@gmail.com");
        } else {
            response.setName("UNKNOWN");
            response.setEmail("unknown@gamil.com");
        }

        response.setId(request.getId());
        return response;
    }
}
