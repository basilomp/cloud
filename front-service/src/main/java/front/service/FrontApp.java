package front.service;

import dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
@RequiredArgsConstructor
@EnableEurekaClient
public class FrontApp {
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(FrontApp.class, args);
    }

//    @GetMapping("/api/v1/front")
//    public ProductDto[] getAllProducts() {
//
//        ResponseEntity<ProductDto[]> response = restTemplate().getForEntity("http://product-service/api/v1/products",
//                ProductDto[].class);
//        ProductDto[] productDto = response.getBody();
//        return productDto;
//    }

}

