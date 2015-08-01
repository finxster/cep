package com.finxster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finxster.util.CEPUtils;

/**
 * RestController que vai receber a requisição do usuário.
 *
 * @author finx
 * @created 01/08/2015
 */
@RestController
public class CEPRestController {

    @Autowired
    private CEPController cepController;

    /**
     * Retorna o endereço a partir do cep.
     *
     * @param cep o cep que vai ser utilizado para buscar o endereço.
     * @return json do endereço.
     */
    @RequestMapping("/")
    public String getEndereco(@RequestParam(value = "cep") String cep) {
        if (!CEPUtils.isCepValido(cep)) {
            return "CEP inválido";
        }
        return this.cepController.getEndereco(cep);
    }

}
