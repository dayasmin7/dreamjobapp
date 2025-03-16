package com.example.apigateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {
	@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("employer-service", r -> r.path("/employer/**")
                .uri("lb://EMPLOYER-SERVICE"))
            .route("jobseeker-service", r -> r.path("/jobseeker/**")
                .uri("lb://JOBSEEKER-SERVICE"))
            .route("application-service", r -> r.path("/application/**")
                .uri("lb://APPLICATION-SERVICE"))
            .route("jobopening-service", r -> r.path("/jobopening/**")
                .uri("lb://JOBOPENING-SERVICE"))
            .build();
    }
}
