package com.finxster.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.finxster.domain.Endereco;

@Repository
public class EnderecoDAO {

    private Map<String, Endereco> enderecosPorCep;

    public EnderecoDAO() {
        this.enderecosPorCep = new HashMap<String, Endereco>();
        this.enderecosPorCep.put("04122-030",
                new Endereco(1L, "Rua do Arraial, 114", "Vila Mariana", "São Paulo", "São Paulo", "04122-030"));
        this.enderecosPorCep.put("04142-081", new Endereco(2L, "Avenida Bosque da Saúde, 610", "Saúde", "São Paulo", "São Paulo",
                "04142-081"));
        this.enderecosPorCep.put("01504-001", new Endereco(3L, "Rua Vergueiro, 943", "Vergueiro", "São Paulo", "São Paulo", "01504-001"));
        this.enderecosPorCep.put("01504-000", new Endereco(4L, "Rua Vergueiro", "Vergueiro", "São Paulo", "São Paulo", "01504-001"));
    }

    public List<Endereco> findAll() {
        return new ArrayList<Endereco>(this.enderecosPorCep.values());
    }

    public Endereco findByCep(String cep) {
        return this.enderecosPorCep.get(cep);
    }

}
