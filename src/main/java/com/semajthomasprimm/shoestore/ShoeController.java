package com.semajthomasprimm.shoestore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}