package com.finxster.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.finxster.dao.EnderecoDAO;

public class CEPControllerTest {

    @Test
    public void getEndereco() {
        CEPController controller = new CEPController();
        controller.setEnderecoDAO(new EnderecoDAO());
        String endereco = controller.getEndereco("01504-001");
        assertEquals(
                "{ \"RUA\": \"Rua Vergueiro, 943\", \"BAIRRO\": \"Vergueiro\", \"CIDADE\": \"São Paulo\", \"ESTADO\": \"São Paulo\" } ",
                endereco);
    }

    @Test
    public void getEnderecoQueNaoExiste() {
        CEPController controller = new CEPController();
        controller.setEnderecoDAO(new EnderecoDAO());
        // 01504-002 não existe na base
        String endereco = controller.getEndereco("01504-002");
        assertEquals("{ \"RUA\": \"Rua Vergueiro\", \"BAIRRO\": \"Vergueiro\", \"CIDADE\": \"São Paulo\", \"ESTADO\": \"São Paulo\" } ",
                endereco);
    }

    @Test
    public void getOutroEnderecoQueNaoExiste() {
        CEPController controller = new CEPController();
        controller.setEnderecoDAO(new EnderecoDAO());
        // 01504-032 não existe na base
        String endereco = controller.getEndereco("01504-032");
        assertEquals("{ \"RUA\": \"Rua Vergueiro\", \"BAIRRO\": \"Vergueiro\", \"CIDADE\": \"São Paulo\", \"ESTADO\": \"São Paulo\" } ",
                endereco);
    }

    @Test
    public void getMaisUmEnderecoQueNaoExiste() {
        CEPController controller = new CEPController();
        controller.setEnderecoDAO(new EnderecoDAO());
        // 01504-432 não existe na base
        String endereco = controller.getEndereco("01504-432");
        assertEquals("{ \"RUA\": \"Rua Vergueiro\", \"BAIRRO\": \"Vergueiro\", \"CIDADE\": \"São Paulo\", \"ESTADO\": \"São Paulo\" } ",
                endereco);
    }
}
