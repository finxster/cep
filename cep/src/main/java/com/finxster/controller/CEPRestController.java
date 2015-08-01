package com.finxster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finxster.util.CEPUtils;

@RestController
public class CEPRestController {

    @Autowired
    private CEPController cepController;

    @RequestMapping("/")
    String getEndereco(@RequestParam(value = "cep") String cep) {
        if (!CEPUtils.isCepValido(cep)) {
            return "CEP inválido";
        }
        return this.cepController.getEndereco(cep);
    }

}
