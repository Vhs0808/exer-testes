package com.schmitt.exer_testes.exer3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String nomeSolteiroMae;
    private String cidadeNatal;

    public String montarNomeStarWars(Pessoa pessoa){
        String texto;
        return texto =
                        pessoa.sobrenome.substring(0,3) +
                        pessoa.nome.substring(0,2) +
                                " " +
                        pessoa.nomeSolteiroMae.substring(0,2) +
                        pessoa.cidadeNatal.substring(0,3);
    }
}
