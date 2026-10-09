package com.schmitt.exer_testes.testes;

import com.schmitt.exer_testes.exer5.Estado;
import com.schmitt.exer_testes.exer5.Pessoa;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class Exer5Test {
    @Test
    void deveAplicarZeroAlicotaQuandoRenda0a4000(){
        //Arrange
        Pessoa pessoa = new Pessoa("Vitor", "123.456.789-00", Estado.SC, 3999.99);
        //Act
        double valorImposto = pessoa.calcularImposto(pessoa.getRendaAnual());
        //Assert
        Assertions.assertThat(valorImposto).isEqualTo(0);
    }
    @Test
    void deveAplicarCincoVirgulaOitoAlicotaQuandoRenda4001a9000(){
        //Arrange
        Pessoa pessoa = new Pessoa("Vitor", "123.456.789-00", Estado.SC, 8999.99);
        //Act
        double valorImposto = pessoa.calcularImposto(pessoa.getRendaAnual());
        //Assert
        Assertions.assertThat(valorImposto).isEqualTo(pessoa.getRendaAnual() * (5.8/100));
    }

    @Test
    void deveAplicarQuinzeAlicotaQuandoRenda9001a25000(){
        //Arrange
        Pessoa pessoa = new Pessoa("Vitor", "123.456.789-00", Estado.SC, 24999.99);
        //Act
        double valorImposto = pessoa.calcularImposto(pessoa.getRendaAnual());
        //Assert
//        Assertions.assertThat(valorImposto).isEqualTo(3749.9985);
        Assertions.assertThat(valorImposto).isEqualTo(pessoa.getRendaAnual() * (15/100));

    }

    @Test
    void deveAplicarVinteESeteVirgulaCincoAlicotaQuandoRenda25001a35000(){
        //Arrange
        Pessoa pessoa = new Pessoa("Vitor", "123.456.789-00", Estado.SC, 34999.99);
        //Act
        double valorImposto = pessoa.calcularImposto(pessoa.getRendaAnual());
        //Assert
        Assertions.assertThat(valorImposto).isEqualTo(pessoa.getRendaAnual() * (27.5/100));
    }

    @Test
    void deveAplicarTrintaAlicotaQuandoRendaAcima35001(){
        //Arrange
        Pessoa pessoa = new Pessoa("Vitor", "123.456.789-00", Estado.SC, 59999.99);
        //Act
        double valorImposto = pessoa.calcularImposto(pessoa.getRendaAnual());
        //Assert
        Assertions.assertThat(valorImposto).isEqualTo(pessoa.getRendaAnual() * (30/100));
    }
}
