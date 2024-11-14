package io.github.mycodethesaurus.notifier.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ConfigureRestClient {

  @Bean
  public RestClient getRestClient() {
    return RestClient.create();
  }
}
