package com.schmitt.exer_testes.testes;

import com.schmitt.exer_testes.exer3.Pessoa;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exer3Test {
    @Test
    void deveGerarNomeStarWarsQuandoInformacoesInformadas(){
        //Arrange
        Pessoa pessoa = new Pessoa("Vitor", "Schmitt", "Wandscheer", "Indaial");
        //Act
        String nomeStarWars = pessoa.montarNomeStarWars(pessoa);
        //Assert
        Assertions.assertThat(nomeStarWars).isEqualTo("SchVi WaInd");
    }
}
