package com.efjunior.projetovendas;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean (name = "applicationName")
    @Qualifier ("applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }
}
