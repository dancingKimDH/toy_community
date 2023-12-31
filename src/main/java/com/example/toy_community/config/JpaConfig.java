package com.example.toy_community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.swing.text.html.Option;
import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware(){
//        스트링 시큐리티로 인증 기능을 구현할 때 수정할 것
        return () -> Optional.of("DH");
        
    }
}
