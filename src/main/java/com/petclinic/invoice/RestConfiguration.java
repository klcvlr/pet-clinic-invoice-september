package com.petclinic.invoice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestConfiguration {

    @Bean
    RestClient restClient(){
        return RestClient.create();
    }
}
