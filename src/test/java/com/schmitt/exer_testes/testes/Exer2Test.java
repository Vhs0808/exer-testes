package com.schmitt.exer_testes.testes;

import com.schmitt.exer_testes.exer2.Estacoes;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exer2Test {
    @Test
    void deveVerificarEstacaoDoAnoVeraoQuandoNumero1(){
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
    void deveVerificarEstacaoDoAnoOutonoQuandoNumero2(){
        //Arrange
        int numEstacao = 2;
        //Act
        String mensagem = Estacoes.verificaEstacao(numEstacao);
        //Assert
        Assertions.assertThat(mensagem).isEqualTo(
                "É outono - e as folhas caem"
        );
    }

    @Test
    void deveVerificarEstacaoDoAnoInvernoQuandoNumero3(){
        //Arrange
        int numEstacao = 3;
        //Act
        String mensagem = Estacoes.verificaEstacao(numEstacao);
        //Assert
        Assertions.assertThat(mensagem).isEqualTo(
                "É inverno - e o tempo está frio"
        );
    }

    @Test
    void deveVerificarEstacaoDoAnoPrimaveraQuandoNumero4(){
        //Arrange
        int numEstacao = 4;
        //Act
        String mensagem = Estacoes.verificaEstacao(numEstacao);
        //Assert
        Assertions.assertThat(mensagem).isEqualTo(
                "É primavera - e as flores desabrocham"
        );
    }

    @Test
    void deveLançarExcessaoQuandoEstacaoInformadaErrada(){
        //Arrange
        int numEstacao = 5;
        //Act e Assert
        Assertions.assertThatThrownBy(() -> Estacoes.verificaEstacao(numEstacao))
                .isInstanceOf(RuntimeException.class);
    }
}
