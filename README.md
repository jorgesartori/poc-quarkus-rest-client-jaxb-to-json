# POC Quarkus / Restclient JAXB

This project uses Quarkus, with RestEasy, RestClient and JAXB.
Expose a service that read XML response by client, deserialize for DTO with JAXB and return JSON to original request.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Usage

Call a GET http://localhost:8080/catalog and will return https://www.w3schools.com/xml/cd_catalog.xml in JSON.
