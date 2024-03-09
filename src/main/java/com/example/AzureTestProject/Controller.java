package com.example.AzureTestProject;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("hello");
    }
}
