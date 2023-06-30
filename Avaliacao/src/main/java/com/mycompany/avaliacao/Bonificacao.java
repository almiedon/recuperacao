/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.avaliacao;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GERENTE(0.35),
    DIRETOR(0.45);
    
    public double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    
    
}
