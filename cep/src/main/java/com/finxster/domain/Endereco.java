package com.finxster.domain;

/**
 * Representa um endereço.
 *
 * @author finx
 * @created 01/08/2015
 */
public class Endereco {

    private Long id;

    private String rua;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    /**
     * Construtor vazio.
     */
    public Endereco() {
    }

    /**
     * Construtor. Recebe os atributos do endereço.
     *
     * @param id o id do endereço.
     * @param rua a rua do endereço.
     * @param bairro o bairro do endereço.
     * @param cidade a cidade do endereço.
     * @param estado o estado do endereço.
     * @param cep o cep do endereço.
     */
    public Endereco(Long id, String rua, String bairro, String cidade, String estado, String cep) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return this.rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return this.bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return this.cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return this.cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Retorna o endereço em formato JSON.
     *
     * @return o endereço em formato JSON.
     */
    public String toJson() {
        StringBuilder json = new StringBuilder();
        json.append("{ ");
        json.append("\"RUA\": \"" + this.rua + "\", ");
        json.append("\"BAIRRO\": \"" + this.bairro + "\", ");
        json.append("\"CIDADE\": \"" + this.cidade + "\", ");
        json.append("\"ESTADO\": \"" + this.estado + "\" ");
        json.append("} ");
        return json.toString();
    }

}
