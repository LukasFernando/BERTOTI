package com.restaurante.controller;


import com.restaurante.food.DTOFood;
import com.restaurante.food.Food;
import com.restaurante.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class PaginaInicial {
    @Autowired
    private FoodRepository foodRepository;
    /*
    private Long id;
    private String name;
    private String description;
    private double ;
    private String imapricege;
     */

    @GetMapping
    String getPaginaInicial2(Model model){
        List<Food> listFood = foodRepository.findAll();
        model.addAttribute("listFood", listFood);
        return "paginaInicial";
    }
}
