package com.schmitt.exer_testes.exer2;

public class Estacoes {
    public static String verificaEstacao(int numEstacao) {
        switch (numEstacao) {
            case 1: return "É verão - e o tempo está quente";
            case 2: return "É outono - e as folhas caem";
            case 3: return "É inverno - e o tempo está frio";
            case 4: return "É primavera - e as flores desabrocham";
        };
        throw new RuntimeException("Número Inválido para uma estação (1-4)");
    }
}
