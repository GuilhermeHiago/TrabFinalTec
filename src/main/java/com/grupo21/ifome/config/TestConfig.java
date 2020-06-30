package com.grupo21.ifome.config;

import com.grupo21.ifome.CasosDeUso.Servicos.DBServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBServico dbServico;

    @Bean
    public boolean instantiateDatabase() {
        dbServico.instantiateTestDatabase();
        return true;
    }
}
