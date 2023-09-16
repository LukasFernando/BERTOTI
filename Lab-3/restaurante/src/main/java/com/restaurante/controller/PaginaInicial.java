package com.restaurante.controller;


import com.restaurante.food.Food;
import com.restaurante.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PaginaInicial {
    @Autowired
    private FoodRepository foodRepository;
    @GetMapping("")
    String getPaginaInicial2(){

        List<Food> listFood = foodRepository.findAll();


        return "paginaInicial";
    }
}
