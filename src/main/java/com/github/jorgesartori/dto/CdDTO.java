package com.github.jorgesartori.dto;

import jakarta.xml.bind.annotation.XmlElement;

public class CdDTO {

	@XmlElement(name = "TITLE")
	public String TITLE;

	@XmlElement
	public String ARTIST;

	@XmlElement
	public String COUNTRY;

	@XmlElement
	public String COMPANY;

	@XmlElement
	public double PRICE;

	@XmlElement
	public int YEAR;

}
