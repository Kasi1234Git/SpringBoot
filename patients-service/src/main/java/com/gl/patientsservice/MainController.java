package com.gl.patientsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/patients")
    public String doctors(){
        return "List of patients";
    }
}
