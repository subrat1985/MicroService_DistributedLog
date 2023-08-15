package com.scb.card.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CardConfig {
    @Bean
   public RestTemplate template(){
       return new RestTemplate();
   }
}
