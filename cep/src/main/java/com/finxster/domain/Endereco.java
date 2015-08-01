package com.finxster.domain;

public class Endereco {

    private Long id;

    private String rua;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    public Endereco() {
    }

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
