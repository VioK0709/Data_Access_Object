package com.example.data_access_object.controller;

import java.util.List;

import com.example.data_access_object.service.ServiceApp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@AllArgsConstructor
@Controller
public class ControllerApp {

    ServiceApp service;

    @GetMapping("/products/fetch-product")
    @ResponseBody
    public List<String> getProductName(@RequestParam("name") String name) {
        return service.getProducts(name);
    }
}