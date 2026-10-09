package com.schmitt.exer_testes.testes;

import com.schmitt.exer_testes.exer1.Numero;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exer1Test {
    @Test
    void deveVerificarQuandoNumeroPar(){
        //Arrange
        int num = 2;
        //Act
        boolean resultado = Numero.verificaPar(num);
        //Assert
        Assertions.assertThat(resultado).isEqualTo(true);
    }

    @Test
    void deveVerificarQuandoNumeroImpar(){
        //Arrange
        int num = 1;
        //Act
        boolean resultado = Numero.verificaPar(num);
        //Assert
        Assertions.assertThat(resultado).isEqualTo(false);
    }
}
