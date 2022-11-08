package nl.rickyvanrijn.configuration;


import com.github.tomakehurst.wiremock.core.Options;
import org.springframework.cloud.contract.wiremock.WireMockSpring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("default")
public class StubServerConfiguration {
    @Bean
    public Options wireMockOptions() {
        return WireMockSpring.options()
                .port(8000)
                .withRootDirectory("/")
                .maxRequestJournalEntries(100);
    }
}
