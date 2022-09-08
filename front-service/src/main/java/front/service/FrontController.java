package front.service;

import dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class FrontController {
//
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private RestTemplate restTemplate;

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
    @GetMapping("/api/v1/front")
    public ProductDto[] getAllProducts() {

        ResponseEntity<ProductDto[]> response = restTemplate().getForEntity("http://product-service/api/v1/products",
                ProductDto[].class);
        ProductDto[] productDto = response.getBody();
        return productDto;
    }

}
