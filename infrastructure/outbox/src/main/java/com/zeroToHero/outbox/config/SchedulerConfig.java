package com.zeroToHero.outbox.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class SchedulerConfig {
    //if i need any custom configuration during serialization we can add here..For example unknown properties

   /* @Bean
    @Primary
    public ObjectMapper objectMapper(){
        return new ObjectMapper()
                .setSerialization(JsonInclude.Include.NOW.NULL)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(new JavaTimeModule());
    }*/
    //but for this app we dont need any custom  bean

}
