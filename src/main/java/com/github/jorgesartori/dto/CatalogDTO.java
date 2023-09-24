package com.github.jorgesartori.dto;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CATALOG")
public class CatalogDTO {

	@XmlElement(name = "CD")
	public List<CdDTO> cds;

}
