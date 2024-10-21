package com.example.laptop_service.service;

import com.example.laptop_service.model.Laptop;
import com.example.laptop_service.repository.LaptopRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    private final JPAStreamer jpaStreamer;

    @Autowired
    public LaptopService(final JPAStreamer jpaStreamer) {
        this.jpaStreamer = jpaStreamer;
    }

    public List<Laptop> saveLaptops(List<Laptop> laptops) {
        return laptopRepository.saveAll(laptops);
    }

    public Map<String, Double> getAverageLaptopPriceByBrand() {
        return jpaStreamer.stream(Laptop.class)
                .collect(Collectors.groupingBy(Laptop::getLaptopBrand,
                        Collectors.averagingDouble(Laptop::getLaptopPrice)));
    }

    public Map<String, List<Laptop>> groupByLaptopBrand(){
        return jpaStreamer.stream(Laptop.class).collect(Collectors.groupingBy(Laptop::getLaptopBrand));
    }

    public List<Laptop> getLaptopsByBrand(String brand) {
        return jpaStreamer.stream(Laptop.class)
                .filter(laptop -> laptop.getLaptopBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    public List<Laptop> getLaptopsByColor(String color) {
        return jpaStreamer.stream(Laptop.class)
                .filter(laptop -> laptop.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

}
