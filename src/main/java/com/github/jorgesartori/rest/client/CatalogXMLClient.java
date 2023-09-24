package com.github.jorgesartori.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.github.jorgesartori.dto.CatalogDTO;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RegisterRestClient(baseUri = "https://www.w3schools.com/xml/")
public interface CatalogXMLClient {

	@GET
	@Path("cd_catalog.xml")
	// @Consumes(MediaType.APPLICATION_SVG_XML)
	// @Produces(MediaType.MULTIPART_FORM_DATA)
	// it doesn't matter consumes or produces configurations, always XML here!
	Uni<CatalogDTO> getXML();

}
