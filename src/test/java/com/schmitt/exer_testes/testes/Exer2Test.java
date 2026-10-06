package com.schmitt.exer_testes.testes;

import com.schmitt.exer_testes.exer2.Estacoes;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exer2Test {
    @Test
    void deveVerificarEstacaoDoAnoQuandoInformada(){
        //Arrange
        int numEstacao = 1;
        //Act
        String mensagem = Estacoes.verificaEstacao(numEstacao);
        //Assert
        Assertions.assertThat(mensagem).isEqualTo(
                "É verão - e o tempo está quente"
        );
    }

    @Test
    void deveLançarExcessaoQuandoEstacaoinformadaErrada(){
        //Arrange
        int numEstacao = 5;
        //Act e Assert
        Assertions.assertThatThrownBy(() -> Estacoes.verificaEstacao(numEstacao))
                .isInstanceOf(RuntimeException.class);
    }
}
