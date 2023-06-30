/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.avaliacao;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Avaliacao {

    public static void main(String[] args) {
        Motorista motorista = new Motorista("carteira", "nome", "cpf", "rg", new Endereco("logradouro", "76552", "complemento", "cep", "limoeiro", UnidadeFederativa.SAO_PAULO), Setor.OPERACOES, Genero.FEMININO, 300, LocalDate.of(2001, 4, 7));
        System.out.println(motorista);  
        
        
        Advogado advogado = new Advogado("asada", "joze", "36634334", "1231231231231231231", new Endereco("fffffffff", "77777", "zxczxcz", "5436", "opopo", UnidadeFederativa.BAHIA), Setor.MARKETING, Genero.FEMININO, 30, LocalDate.of(2009, 04, 23));
        System.out.println(advogado);
        
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "jorge", "123123123", "321321321", new Endereco("asadas", "2221", "ruazinha", "33333", "salvador", UnidadeFederativa.RIO_DE_JANEIRO), Setor.JURIDICO, Genero.MASCULINO, 500, LocalDate.of(1990, 2, 28));
        System.out.println(diretor);
        System.out.println("--------------");
        
        diretor.demitir(motorista);
        System.out.println("-------------");
        
        
        
        
        
        
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "gerente", "5", "6", new Endereco("ababa", "numero", "nsei", "0783452", "camaçari", UnidadeFederativa.BAHIA), Setor.MARKETING, Genero.FEMININO, 1000, LocalDate.of(1800, 06, 23));
        System.out.println(gerente);
        
        
      
        
      
        
        
        
      
        
        
        
    }
}
