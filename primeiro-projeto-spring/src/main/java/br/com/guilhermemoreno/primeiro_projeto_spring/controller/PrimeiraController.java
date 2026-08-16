package br.com.guilhermemoreno.primeiro_projeto_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

//Anotação que indica que a classe é um controlador REST
@RestController
//Anotação que indica o caminho do controlador
@RequestMapping("/primeiraController")
//Classe que representa o controlador
public class PrimeiraController {
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiraMensagem(@PathVariable(name = "id") String id){
        return "Olá Mundo " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam(name = "id") String id){
        return "Olá Mundo " + id;
    }

    @PostMapping("/metodoComBody")
    public String metodoComBody(@RequestBody String username){
        return "Olá Mundo " + username;
    }
}
