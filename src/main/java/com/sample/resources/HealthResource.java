package com.sample.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/health/status")
@Produces(MediaType.APPLICATION_JSON)
public class HealthResource {

    private class HealthResponse {
        @JsonProperty
        private String status;

        public HealthResponse() {
        }

        public HealthResponse(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    @Inject
    public HealthResource() {
    }

    @GET
    public HealthResponse processImage() {
        return new HealthResponse("OK");
    }
}
