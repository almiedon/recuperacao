/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.avaliacao;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA("engenharia"),
    JURIDICO("juridico"),
    RECURSOS_HUMANOS("recursos humanos"),
    MARKETING("marketing"),
    OPERACOES("operações");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
