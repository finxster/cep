package com.finxster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finxster.domain.CEP;
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
    @RequestMapping(value = "/cep", method = RequestMethod.POST)
    public String getEndereco(@RequestBody CEP cep) {
        if (!CEPUtils.isCepValido(cep.getCep())) {
            return "CEP inválido";
        }
        return this.cepController.getEndereco(cep.getCep());
    }

}
