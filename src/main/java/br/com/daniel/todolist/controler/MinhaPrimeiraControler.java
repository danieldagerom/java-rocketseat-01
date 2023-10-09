package br.com.daniel.todolist.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraControler {



    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou!";
    }
    
}
