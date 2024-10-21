package com.example.laptop_service.controller;

import com.example.laptop_service.model.Laptop;
import com.example.laptop_service.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @PostMapping("/laptops")
    public List<Laptop> saveLaptops(@RequestBody List<Laptop> laptops) {
        return laptopService.saveLaptops(laptops);
    }

    @GetMapping("/laptops")
    public Map<String, Double> getAverageLaptopPriceByBrand() {
        return laptopService.getAverageLaptopPriceByBrand();
    }

    @GetMapping("/laptops/brand/{brand}")
    public List<Laptop> getLaptopsByBrand(@PathVariable String brand) {
        return laptopService.getLaptopsByBrand(brand);
    }

    @GetMapping("/laptops/color/{color}")
    public List<Laptop> getLaptopsByColor(@PathVariable String color) {
        return laptopService.getLaptopsByColor(color);
    }


}
