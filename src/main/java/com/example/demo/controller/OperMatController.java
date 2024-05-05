package com.example.demo.controller;

import com.example.demo.model.OperacaoMatematica;
import org.springframework.web.bind.annotation.*;

@RestController
public class OperMatController {
    @PostMapping("/calcular/add")
    double add(@RequestBody OperacaoMatematica operacaoMatematica) {
        return operacaoMatematica.calcularSoma();
    }

    @PostMapping("/calcular/sub")
    double sub(@RequestBody OperacaoMatematica operacaoMatematica) {
        return operacaoMatematica.calcularSubtracao();
    }

    @PostMapping("/calcular/div")
    double div(@RequestBody OperacaoMatematica operacaoMatematica) {
        return operacaoMatematica.calcularDvisao();
    }

    @PostMapping("/calcular/mult")
    double mult(@RequestBody OperacaoMatematica operacaoMatematica) {
        return operacaoMatematica.calcularMultiplicacao();
    }

    @PostMapping("/calcular/exp")
    double exp(@RequestBody OperacaoMatematica operacaoMatematica) {
        return operacaoMatematica.calcularExponeciacao();
    }


    @GetMapping("/calcular/add")
    double add(@RequestParam double num1, @RequestParam double num2) {
        OperacaoMatematica operacaoMatematica = new OperacaoMatematica(num1, num2);
        return operacaoMatematica.calcularSoma();
    }

    @GetMapping("/calcular/sub")
    double sub(@RequestParam double num1, @RequestParam double num2) {
        OperacaoMatematica operacaoMatematica = new OperacaoMatematica(num1, num2);
        return operacaoMatematica.calcularSubtracao();
    }

    @GetMapping("/calcular/div")
    double div(@RequestParam double num1, @RequestParam double num2) {
        OperacaoMatematica operacaoMatematica = new OperacaoMatematica(num1, num2);
        return operacaoMatematica.calcularDvisao();
    }

    @GetMapping("/calcular/mult")
    double mult(@RequestParam double num1, @RequestParam double num2) {
        OperacaoMatematica operacaoMatematica = new OperacaoMatematica(num1, num2);
        return operacaoMatematica.calcularMultiplicacao();
    }

    @GetMapping("/calcular/exp")
    double exp(@RequestParam double num1, @RequestParam double num2) {
        OperacaoMatematica operacaoMatematica = new OperacaoMatematica(num1, num2);
        return operacaoMatematica.calcularExponeciacao();
    }
}
