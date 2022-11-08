package nl.rickyvanrijn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@SpringBootApplication
@AutoConfigureWireMock
public class WiremockStandAloneApplication {

    public WiremockStandAloneApplication() {}

    public static void main(String[] args) {
        SpringApplication.run(WiremockStandAloneApplication.class, args);
    }
}
