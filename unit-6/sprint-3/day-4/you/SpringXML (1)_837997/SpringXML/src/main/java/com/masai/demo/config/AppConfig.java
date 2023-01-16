package com.masai.demo.config;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.masai.demo"})
@PropertySource("db.properties")
public class AppConfig {

    @Bean("cities")
    public List<String> getCities() {
       List<String> cities = new ArrayList<>();
       cities.add("Delhi");
       cities.add("Hyd");
       cities.add("Blr");
       return cities;
    }
}
