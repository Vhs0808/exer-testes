package com.schmitt.exer_testes.testes;

import com.schmitt.exer_testes.exer4.Atleta;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exer4Test {
    @Test
    void deveCategorizarAtletaPreMirimQuandoIdadeEntre5e7(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 5, 1.10, 18.4);
        //Act
        String categoria = atleta.verificarCategoria(atleta);
        //Assert
        Assertions.assertThat(categoria).isEqualTo("Pré-Mirim");
    }

    @Test
    void deveCategorizarAtletaMirimQuandoIdadeEntre8e10(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 8, 1.27, 25.4);
        //Act
        String categoria = atleta.verificarCategoria(atleta);
        //Assert
        Assertions.assertThat(categoria).isEqualTo("Mirim");
    }

    @Test
    void deveCategorizarAtletaMirimQuandoIdadeEntre11e13(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 11, 1.44, 35.7);
        //Act
        String categoria = atleta.verificarCategoria(atleta);
        //Assert
        Assertions.assertThat(categoria).isEqualTo("Infantil");
    }

    @Test
    void deveCategorizarAtletaMirimQuandoIdadeEntre14e17(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 14, 1.63, 48.7);
        //Act
        String categoria = atleta.verificarCategoria(atleta);
        //Assert
        Assertions.assertThat(categoria).isEqualTo("Infanto-Juvenil");
    }

    @Test
    void deveCategorizarAtletaMirimQuandoIdadeEntre18e20(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 18, 1.73, 68.9);
        //Act
        String categoria = atleta.verificarCategoria(atleta);
        //Assert
        Assertions.assertThat(categoria).isEqualTo("Juvenil");
    }

    @Test
    void deveCategorizarAtletaMirimQuandoIdadeMaiorIgual21(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 21, 1.75, 70.9);
        //Act
        String categoria = atleta.verificarCategoria(atleta);
        //Assert
        Assertions.assertThat(categoria).isEqualTo("Adulto");
    }

    @Test
    void deveLancarErroQuandoIdadeMenor5(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 4, 0.97, 16.7);
        //Act
        String categoria = atleta.verificarCategoria(atleta);
        //Assert
        Assertions.assertThat(categoria).isEqualTo("Adulto");
    }

    @Test
    void deveCalcularImcQuandoAtletaEstaEmMagreza(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 21, 1.75, 55.8);
        //Act
        String resultado = atleta.calcularIMC(atleta.getAltura(), atleta.getPeso());
        //Assert
        Assertions.assertThat(resultado).isEqualTo("Magreza");
    }

    @Test
    void deveCalcularImcQuandoAtletaEstaSaudavel(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 21, 1.75, 59.6);
        //Act
        String resultado = atleta.calcularIMC(atleta.getAltura(), atleta.getPeso());
        //Assert
        Assertions.assertThat(resultado).isEqualTo("Saudável");
    }

    @Test
    void deveCalcularImcQuandoAtletaEstaEmSobrepeso(){
        //Arrange
        Atleta atleta = new Atleta("Vitor", 21, 1.75, 75.4);
        //Act
        String resultado = atleta.calcularIMC(atleta.getAltura(), atleta.getPeso());
        //Assert
        Assertions.assertThat(resultado).isEqualTo("Sobrepeso");
    }

}
