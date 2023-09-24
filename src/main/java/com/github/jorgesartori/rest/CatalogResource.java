package com.github.jorgesartori.rest;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.github.jorgesartori.dto.CatalogDTO;
import com.github.jorgesartori.rest.client.CatalogXMLClient;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/catalog")
public class CatalogResource {
	@Inject
	@RestClient
	CatalogXMLClient client;

	@GET
	// @Produces(MediaType.APPLICATION_XML) -> by default produces json
	public Uni<CatalogDTO> getXML() {
		return client.getXML();
	}

}
