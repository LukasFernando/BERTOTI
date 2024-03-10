package com.restaurante.controller;

import com.restaurante.food.DTOFood;
import com.restaurante.food.Food;
import com.restaurante.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/cadastro")
public class CadastroDePrato {
    @Autowired
    private FoodRepository foodRepository;
    @GetMapping
    String getPaginaInicial2(Model model){
        List<Food> listFood = foodRepository.findAll();
        model.addAttribute("listFood", listFood);
        return "cadastro";
    }

    @PostMapping
    String salvar(DTOFood dtoFood){
        Food novoPrato = new Food(dtoFood);
        foodRepository.save(novoPrato);
        return "cadastro";
//        return ResponseEntity.ok().build();
    }
}
