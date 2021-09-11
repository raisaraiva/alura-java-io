package model;

import java.io.Serializable;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cpf;

    private String nome;

    private String profissao;

    // getters and setters


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
