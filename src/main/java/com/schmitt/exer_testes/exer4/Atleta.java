package com.schmitt.exer_testes.exer4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Atleta {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Atleta(String nome, int idade, double altura, double peso) {
        if(idade < 5) throw new RuntimeException("Idade inválida");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public static String verificarCategoria(Atleta atleta){
        int idade = atleta.idade;
        if(idade >= 5 && idade <=7) return "Pré-Mirim";
        if(idade >= 8 && idade <=10) return "Mirim";
        if(idade >= 11 && idade <=13) return "Infantil";
        if(idade >= 14 && idade <=17) return "Infanto-Juvenil";
        if(idade >= 18 && idade <=20) return "Juvenil";
        else return "Adulto";
    }

    public String calcularIMC(double altura, double peso) {
        double imc = peso / (altura * altura);

        if (imc < 18.5) return "Magreza";
        if (imc < 25) return "Saudável";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidade Grau I";
        if (imc < 40) return "Obesidade Grau II (severa)";

        return "Obesidade Grau III (mórbida)";
    }

}
