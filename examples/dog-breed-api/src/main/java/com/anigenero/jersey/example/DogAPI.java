package com.anigenero.jersey.example;

import com.anigenero.jersey.proxy.ResourceProxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;

@Path("/api")
@ResourceProxy(name = "dog-api", url = "https://dog.ceo")
public interface DogAPI {

    @Path("/breeds/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    APIResult<HashMap<String, List<String>>> getAllBreeds();

}
