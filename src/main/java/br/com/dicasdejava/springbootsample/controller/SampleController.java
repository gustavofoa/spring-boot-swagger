package br.com.dicasdejava.springbootsample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("endpoint")
public class SampleController {


    @GetMapping
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
