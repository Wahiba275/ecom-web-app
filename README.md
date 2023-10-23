# EcomWebApp
## Table of Contents
- [Backend Services](#backend-services)
  - [Config Service](#config-service)
  - [Gateway Service](#gateway-service)
  - [Customer Service](#customer-service)
  - [Inventory Service](#inventory-service)
  - [Order Service](#order-service)
  - [Billing Service](#billing-service)
- [Frontend with Angular](#frontend-with-angular)

  
## Backend Services

### Config Service
The Config Service is responsible for managing the configurations of all other services in the system.<br>
To initiate the Consul server, run the following command:<br>
`consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=@IP`<br>
You can view all the registered services by navigating to:<br>
`http://localhost:8500/`

![Alt text](URL)

Here are the registered services : 

![Alt text](URL)

### Gateway Service

```java
package org.sid.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class GatewayServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	@Bean
	DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc , DiscoveryLocatorProperties dlp){
                    return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
	}
}

````

The snippet I've provided is a Java method utilizing Spring Cloud Gateway with Spring Cloud's discovery client to enable dynamic routing based on services registered with a service registry like Consul.

### Customer Service

![Alt text](URL)

### Inventory Service

![Alt text](URL)

### Order Service

![Alt text](URL)

### Billing Service

![Alt text](URL)

## Frontend with Angular

![Alt text](URL)

![Alt text](URL)

![Alt text](URL)



