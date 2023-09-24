package com.github.jorgesartori;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.StringReader;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.github.jorgesartori.dto.CatalogDTO;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

@QuarkusTest
public class GreetingResourceTest {

	@Test
	@Disabled
	public void testHelloEndpoint() {
		given().when().get("/hello").then().statusCode(200).body(is("Hello from RESTEasy Reactive"));
	}

	@Test
	public void unmarchallerTest() throws JAXBException {
		var xml = "<CATALOG>\n" + "<CD>\n" + "<TITLE>Empire Burlesque</TITLE>\n" + "<ARTIST>Bob Dylan</ARTIST>\n"
				+ "<COUNTRY>USA</COUNTRY>\n" + "<COMPANY>Columbia</COMPANY>\n" + "<PRICE>10.90</PRICE>\n"
				+ "<YEAR>1985</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>Hide your heart</TITLE>\n"
				+ "<ARTIST>Bonnie Tyler</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n" + "<COMPANY>CBS Records</COMPANY>\n"
				+ "<PRICE>9.90</PRICE>\n" + "<YEAR>1988</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>Greatest Hits</TITLE>\n" + "<ARTIST>Dolly Parton</ARTIST>\n" + "<COUNTRY>USA</COUNTRY>\n"
				+ "<COMPANY>RCA</COMPANY>\n" + "<PRICE>9.90</PRICE>\n" + "<YEAR>1982</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>Still got the blues</TITLE>\n" + "<ARTIST>Gary Moore</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n"
				+ "<COMPANY>Virgin records</COMPANY>\n" + "<PRICE>10.20</PRICE>\n" + "<YEAR>1990</YEAR>\n" + "</CD>\n"
				+ "<CD>\n" + "<TITLE>Eros</TITLE>\n" + "<ARTIST>Eros Ramazzotti</ARTIST>\n" + "<COUNTRY>EU</COUNTRY>\n"
				+ "<COMPANY>BMG</COMPANY>\n" + "<PRICE>9.90</PRICE>\n" + "<YEAR>1997</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>One night only</TITLE>\n" + "<ARTIST>Bee Gees</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n"
				+ "<COMPANY>Polydor</COMPANY>\n" + "<PRICE>10.90</PRICE>\n" + "<YEAR>1998</YEAR>\n" + "</CD>\n"
				+ "<CD>\n" + "<TITLE>Sylvias Mother</TITLE>\n" + "<ARTIST>Dr.Hook</ARTIST>\n"
				+ "<COUNTRY>UK</COUNTRY>\n" + "<COMPANY>CBS</COMPANY>\n" + "<PRICE>8.10</PRICE>\n"
				+ "<YEAR>1973</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>Maggie May</TITLE>\n"
				+ "<ARTIST>Rod Stewart</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n" + "<COMPANY>Pickwick</COMPANY>\n"
				+ "<PRICE>8.50</PRICE>\n" + "<YEAR>1990</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>Romanza</TITLE>\n"
				+ "<ARTIST>Andrea Bocelli</ARTIST>\n" + "<COUNTRY>EU</COUNTRY>\n" + "<COMPANY>Polydor</COMPANY>\n"
				+ "<PRICE>10.80</PRICE>\n" + "<YEAR>1996</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>When a man loves a woman</TITLE>\n" + "<ARTIST>Percy Sledge</ARTIST>\n"
				+ "<COUNTRY>USA</COUNTRY>\n" + "<COMPANY>Atlantic</COMPANY>\n" + "<PRICE>8.70</PRICE>\n"
				+ "<YEAR>1987</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>Black angel</TITLE>\n"
				+ "<ARTIST>Savage Rose</ARTIST>\n" + "<COUNTRY>EU</COUNTRY>\n" + "<COMPANY>Mega</COMPANY>\n"
				+ "<PRICE>10.90</PRICE>\n" + "<YEAR>1995</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>1999 Grammy Nominees</TITLE>\n" + "<ARTIST>Many</ARTIST>\n" + "<COUNTRY>USA</COUNTRY>\n"
				+ "<COMPANY>Grammy</COMPANY>\n" + "<PRICE>10.20</PRICE>\n" + "<YEAR>1999</YEAR>\n" + "</CD>\n"
				+ "<CD>\n" + "<TITLE>For the good times</TITLE>\n" + "<ARTIST>Kenny Rogers</ARTIST>\n"
				+ "<COUNTRY>UK</COUNTRY>\n" + "<COMPANY>Mucik Master</COMPANY>\n" + "<PRICE>8.70</PRICE>\n"
				+ "<YEAR>1995</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>Big Willie style</TITLE>\n"
				+ "<ARTIST>Will Smith</ARTIST>\n" + "<COUNTRY>USA</COUNTRY>\n" + "<COMPANY>Columbia</COMPANY>\n"
				+ "<PRICE>9.90</PRICE>\n" + "<YEAR>1997</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>Tupelo Honey</TITLE>\n" + "<ARTIST>Van Morrison</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n"
				+ "<COMPANY>Polydor</COMPANY>\n" + "<PRICE>8.20</PRICE>\n" + "<YEAR>1971</YEAR>\n" + "</CD>\n"
				+ "<CD>\n" + "<TITLE>Soulsville</TITLE>\n" + "<ARTIST>Jorn Hoel</ARTIST>\n"
				+ "<COUNTRY>Norway</COUNTRY>\n" + "<COMPANY>WEA</COMPANY>\n" + "<PRICE>7.90</PRICE>\n"
				+ "<YEAR>1996</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>The very best of</TITLE>\n"
				+ "<ARTIST>Cat Stevens</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n" + "<COMPANY>Island</COMPANY>\n"
				+ "<PRICE>8.90</PRICE>\n" + "<YEAR>1990</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>Stop</TITLE>\n"
				+ "<ARTIST>Sam Brown</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n" + "<COMPANY>A and M</COMPANY>\n"
				+ "<PRICE>8.90</PRICE>\n" + "<YEAR>1988</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>Bridge of Spies</TITLE>\n" + "<ARTIST>T'Pau</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n"
				+ "<COMPANY>Siren</COMPANY>\n" + "<PRICE>7.90</PRICE>\n" + "<YEAR>1987</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>Private Dancer</TITLE>\n" + "<ARTIST>Tina Turner</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n"
				+ "<COMPANY>Capitol</COMPANY>\n" + "<PRICE>8.90</PRICE>\n" + "<YEAR>1983</YEAR>\n" + "</CD>\n"
				+ "<CD>\n" + "<TITLE>Midt om natten</TITLE>\n" + "<ARTIST>Kim Larsen</ARTIST>\n"
				+ "<COUNTRY>EU</COUNTRY>\n" + "<COMPANY>Medley</COMPANY>\n" + "<PRICE>7.80</PRICE>\n"
				+ "<YEAR>1983</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>Pavarotti Gala Concert</TITLE>\n"
				+ "<ARTIST>Luciano Pavarotti</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n" + "<COMPANY>DECCA</COMPANY>\n"
				+ "<PRICE>9.90</PRICE>\n" + "<YEAR>1991</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>The dock of the bay</TITLE>\n" + "<ARTIST>Otis Redding</ARTIST>\n"
				+ "<COUNTRY>USA</COUNTRY>\n" + "<COMPANY>Stax Records</COMPANY>\n" + "<PRICE>7.90</PRICE>\n"
				+ "<YEAR>1968</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>Picture book</TITLE>\n"
				+ "<ARTIST>Simply Red</ARTIST>\n" + "<COUNTRY>EU</COUNTRY>\n" + "<COMPANY>Elektra</COMPANY>\n"
				+ "<PRICE>7.20</PRICE>\n" + "<YEAR>1985</YEAR>\n" + "</CD>\n" + "<CD>\n" + "<TITLE>Red</TITLE>\n"
				+ "<ARTIST>The Communards</ARTIST>\n" + "<COUNTRY>UK</COUNTRY>\n" + "<COMPANY>London</COMPANY>\n"
				+ "<PRICE>7.80</PRICE>\n" + "<YEAR>1987</YEAR>\n" + "</CD>\n" + "<CD>\n"
				+ "<TITLE>Unchain my heart</TITLE>\n" + "<ARTIST>Joe Cocker</ARTIST>\n" + "<COUNTRY>USA</COUNTRY>\n"
				+ "<COMPANY>EMI</COMPANY>\n" + "<PRICE>8.20</PRICE>\n" + "<YEAR>1987</YEAR>\n" + "</CD>\n"
				+ "</CATALOG>";

		JAXBContext jaxbContext = JAXBContext.newInstance(CatalogDTO.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

		StringReader reader = new StringReader(xml);
		CatalogDTO catalog = (CatalogDTO) unmarshaller.unmarshal(reader);

		assertEquals("Bob Dylan", catalog.cds.get(0).ARTIST);

	}

}