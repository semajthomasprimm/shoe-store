package com.semajthomasprimm.shoestore.controller;

import com.semajthomasprimm.shoestore.database.ProductDataServiceImpl;
import com.semajthomasprimm.shoestore.domain.Cart;
import com.semajthomasprimm.shoestore.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ShoeController {

    private final ProductDataServiceImpl productDataService;

    public ShoeController(ProductDataServiceImpl productDataService) {
        this.productDataService = productDataService;
    }

    Cart cart = new Cart();

    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index", "cart", cart);
    }

    @GetMapping("/shop")
    public String shop(Model model){
        List<Product> products = productDataService.getProducts();
        model.addAttribute("cart", cart);
        model.addAttribute("products", products);
        return "shop";
    }

    @GetMapping("/cart")
    public ModelAndView cart(){
        return new ModelAndView("/cart", "cart", cart);
    }
}
