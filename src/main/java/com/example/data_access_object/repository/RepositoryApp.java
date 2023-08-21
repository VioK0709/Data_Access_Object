package com.example.data_access_object.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class RepositoryApp {

    private final NamedParameterJdbcTemplate template;
    private final String scriptFileName = read("select_product_name.sql");

    public RepositoryApp(NamedParameterJdbcTemplate template) {
        this.template = template;
    }


    public List<String> getProductName(String name) {
        List<String> result = template.queryForList(scriptFileName, Map.of("name", name), String.class);
        System.out.println(result);
        return result;
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}