package it.develhope.Deploy02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    public int sum(@RequestParam int firstNumber, @RequestParam int secondNumber) {
        return firstNumber + secondNumber;
    }
}
