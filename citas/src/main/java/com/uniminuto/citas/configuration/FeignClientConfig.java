package com.uniminuto.citas.configuration;

import feign.Logger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class FeignClientConfig {
    @Bean
    Logger.Level feingLoggerLevel(){return Logger.Level.FULL;}
    private final ObjectFactory<HttpMessageConverters> messageConverters;

}
