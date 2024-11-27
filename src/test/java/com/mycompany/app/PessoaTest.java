package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void testGetNome() {
        // Cria uma instância da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Thulio");
        // Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Thulio", pessoa1.getNome());
    }
}

//instancia de pessoa com um nome

//getNome
//retorna o nome da pessoa
//comparar com o nome que foi passado no setNome

//setNome
//atribuir um valor para a propriedade nome
//comparar se o valor que vem do getNome é o mesmo valor que foi passado no setNome

//getLivros
//atribuir uma lista de livros para uma pessoa
//comparar se a lista retornada é a mesma lista que foi passada para o setLivros

//setLivros
//atribuir uma lista de livros para uma pessoa
//comparar se o valor do getLivros é o mesmo que foi passado para o setLivros
