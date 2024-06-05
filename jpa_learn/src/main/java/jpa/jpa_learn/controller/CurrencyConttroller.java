package jpa.jpa_learn.controller;

import jpa.jpa_learn.configuration.CurrencyConfiguration;
import jpa.jpa_learn.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConttroller {
    @Autowired
    CurrencyConfiguration configuration;
    @GetMapping(value = "/currency")
    public CurrencyConfiguration getCourse() {
        return configuration;
    }
}
