package com.finxster.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.finxster.domain.Endereco;

/**
 * DAO para Endereço.
 *
 * @author finx
 * @created 01/08/2015
 */
@Repository
public class EnderecoDAO {

    private Map<String, Endereco> enderecosPorCep;

    private Map<Long, Endereco> enderecosPorId;

    public EnderecoDAO() {
        Endereco e1 = new Endereco(1L, "Rua do Arraial, 114", "Vila Mariana", "São Paulo", "São Paulo", "04122-030");
        Endereco e2 = new Endereco(2L, "Avenida Bosque da Saúde, 610", "Saúde", "São Paulo", "São Paulo", "04142-081");
        Endereco e3 = new Endereco(3L, "Rua Vergueiro, 943", "Vergueiro", "São Paulo", "São Paulo", "01504-001");
        Endereco e4 = new Endereco(4L, "Rua Vergueiro", "Vergueiro", "São Paulo", "São Paulo", "01504-001");

        this.enderecosPorCep = new HashMap<String, Endereco>();
        this.enderecosPorCep.put("04122-030", e1);
        this.enderecosPorCep.put("04142-081", e2);
        this.enderecosPorCep.put("01504-001", e3);
        this.enderecosPorCep.put("01504-000", e4);

        this.enderecosPorId = new HashMap<Long, Endereco>();
        this.enderecosPorId.put(1L, e1);
        this.enderecosPorId.put(2L, e2);
        this.enderecosPorId.put(3L, e3);
        this.enderecosPorId.put(4L, e4);

    }

    public List<Endereco> findAll() {
        return new ArrayList<Endereco>(this.enderecosPorCep.values());
    }

    public Endereco findByCep(String cep) {
        return this.enderecosPorCep.get(cep);
    }

    public void incluirEndereco(Endereco endereco) {
        Long id = this.enderecosPorCep.size() + 1L;
        endereco.setId(id);
        this.enderecosPorCep.put(endereco.getCep(), endereco);
        this.enderecosPorId.put(endereco.getId(), endereco);
    }

    public void atualizarEndereco(Endereco endereco) {
        this.enderecosPorCep.put(endereco.getCep(), endereco);
        this.enderecosPorId.put(endereco.getId(), endereco);
    }

    public void excluirEndereco(Endereco endereco) {
        this.enderecosPorCep.remove(endereco.getCep());
        this.enderecosPorId.remove(endereco.getId());
    }

    public Endereco findById(Long id) {
        return this.enderecosPorId.get(id);
    }

}
