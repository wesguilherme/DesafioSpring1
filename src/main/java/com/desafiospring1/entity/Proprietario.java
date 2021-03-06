package com.desafiospring1.entity;

import lombok.Data;

import java.text.ParseException;
import java.time.LocalDate;

@Data
public class Proprietario extends Pessoa {

    private Long id;
    private LocalDate dataDeNascimento;
    private String endereco;
    private String telefoneContato;

    public Proprietario() {

    }

    public Proprietario(Long id, String cpf, String nome, String sobrenome, LocalDate dataDeNascimento, String endereco, String telefoneContato) throws ParseException {
        super(cpf, nome, sobrenome);
        this.id = id;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
    }

    public Proprietario(String cpf, String nome, String sobrenome, LocalDate dataDeNascimento, String endereco, String telefoneContato) throws ParseException {
        super(cpf, nome, sobrenome);
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
    }


    @Override
    public String toString() {
        return "{" +
                "\"id\":" + getId() +
                ", \"cpf\":\"" + super.getCpf() + "\"" +
                ", \"nome\":\"" + super.getNome() + "\"" +
                ", \"sobrenome\":\"" + super.getSobrenome() + "\"" +
                ", \"dataDeNascimento\":\"" + dataDeNascimento + "\"" +
                ", \"endereco\":\"" + endereco + "\"" +
                ", \"telefoneContato\":\"" + telefoneContato + "\"" +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.getCpf().equals(((Proprietario) obj).getCpf());
    }
}
