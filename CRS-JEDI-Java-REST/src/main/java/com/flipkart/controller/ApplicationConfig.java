package com.flipkart.controller;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author JEDI-6-Flipkart-G1
 * Class to register all API controller classes for using REST requests
 */

public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        // All the web services to be registered Here
        register(StudentRestAPI.class);
        register(UserRestAPI.class);
        register(ProfessorRestAPI.class);
        register(AdminRestAPI.class);

    }

}
