package com.finxster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.finxster.dao.EnderecoDAO;
import com.finxster.domain.Endereco;

/**
 * Controller responsável por executar as regras de negócio para quando o usuário estiver tentando buscar um endereço através de um cep.
 *
 * @author finx
 * @created 01/08/2015
 */
@Controller
public class CEPController {

    @Autowired
    private EnderecoDAO enderecoDAO;

    /**
     * Retorna um endereço a partir de um cp.
     *
     * @param cep o cep utilizado na busca.
     * @return json com as informações do endereço. Para mais detalhes, ver {@link Endereco#toJson()}.
     */
    public String getEndereco(String cep) {
        Endereco endereco = this.enderecoDAO.findByCep(cep);
        // encontrou o endereço exato
        if (endereco != null) {
            return endereco.toJson();
        }
        // se não encontrou o endereço, substitui o último número por 0 até que o endereço seja localizado
        String novoCep = cep.substring(0, 8) + "0";
        Endereco novoEndereco = this.enderecoDAO.findByCep(novoCep);
        if (novoEndereco != null) {
            return novoEndereco.toJson();
        }
        // se não encontrou novamente, repete o procedimento
        novoCep = cep.substring(0, 7) + "00";
        novoEndereco = this.enderecoDAO.findByCep(novoCep);
        if (novoEndereco != null) {
            return novoEndereco.toJson();
        }
        // se não encontrou novamente, repete o procedimento
        novoCep = cep.substring(0, 6) + "000";
        novoEndereco = this.enderecoDAO.findByCep(novoCep);
        if (novoEndereco != null) {
            return novoEndereco.toJson();
        }
        // se não encontrou, devolve uma mensagem de erro.
        return "Não encontrou endereço para o CEP " + cep;
    }

    /**
     * @param enderecoDAO the enderecoDAO to set
     */
    public void setEnderecoDAO(EnderecoDAO enderecoDAO) {
        this.enderecoDAO = enderecoDAO;
    }

    public void incluirEndereco(Endereco endereco) {
        this.enderecoDAO.incluirEndereco(endereco);
    }

    public void atualizarEndereco(Endereco endereco) {
        this.enderecoDAO.atualizarEndereco(endereco);
    }

    public void excluirEndereco(Endereco endereco) {
        this.enderecoDAO.excluirEndereco(endereco);
    }

    public Endereco consultarEndereco(Endereco endereco) {
        return this.enderecoDAO.findById(endereco.getId());
    }

}
