package com.subhankar.learned.config;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class GatewayRoutesConfig {
    private final CustomGatewayFilter customGatewayFilter;


    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/api/user/**")
                        .filters(f -> f.filter(customGatewayFilter))
                        .uri("lb://user-service"))
                .route("auth-service", r -> r.path("/api/auth/**")
                        .filters(f -> f.filter(customGatewayFilter))
                        .uri("lb://auth-service"))
                .build();
    }
}
