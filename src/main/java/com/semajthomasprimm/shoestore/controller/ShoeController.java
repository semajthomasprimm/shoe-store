package com.semajthomasprimm.shoestore.controller;

import com.semajthomasprimm.shoestore.domain.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoeController {

    Cart cart = new Cart();

    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index", "cart", cart);
    }

    @GetMapping("/shop")
    public ModelAndView shop(){
        return new ModelAndView("/shop", "cart", cart);
    }

    @GetMapping("/cart")
    public ModelAndView cart(){
        return new ModelAndView("/cart", "cart", cart);
    }
}
