package com.example.data_access_object.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.data_access_object.repository.RepositoryApp;

import java.util.List;

@AllArgsConstructor
@Service
public class ServiceApp {

    private final RepositoryApp repositoryApp;

    public List<String> getProducts(String name) {
        return repositoryApp.getProductName(name);
    }
}