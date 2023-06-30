/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal=0;
        salarioFinal += salario*0.45;
        salarioFinal += salario;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n salario final: " + getSalarioFinal();
    }

   


    
    
   

    

    
    
    
    

   
    
    
    
}
