package com.schmitt.exer_testes.exer5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pessoa {
    private String nome;
    private String cpf;
    private Estado estado;
    private double rendaAnual;

    public double calcularImposto(double rendaAnual){
        if (rendaAnual >= 0 && rendaAnual <= 4000) return 0;
        if (rendaAnual > 4000 && rendaAnual <= 9000) return rendaAnual * (5.8/100);
        if (rendaAnual > 9000 && rendaAnual <= 25000) return rendaAnual * (15/100);
        if (rendaAnual > 25000 && rendaAnual <= 35000) return rendaAnual * (27.5/100);
        if (rendaAnual > 35000) return rendaAnual * (30/100);

        throw new RuntimeException("Valor de renda anual inválido");
    }
}
