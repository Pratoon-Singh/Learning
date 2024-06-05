package jpa.jpa_learn.controller;

import jpa.jpa_learn.model.MyModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class MyController {
    @GetMapping(value = "/get")
    public List<MyModel> getCourse() {
        return Arrays.asList(
                new MyModel(1, "Aws", "Learn AWS"),
                new MyModel(2, "Azure", "Learn Azure"),
                new MyModel(3, "DevOps", "Learn DevOps"),
                new MyModel(4, "GCP", "Learn GCP")
        );
    }
}
