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
public class Diretor extends CargoDeConfianca implements Contratacao{
    private double PREMIO = 0.5;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal=0;
        salarioFinal += salario*PREMIO;
        salarioFinal += salario*0.35;
        salarioFinal += salario;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\n admitindo funcionario: " + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\n demitindo funcionario: " + funcionario);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n salario final: " + getSalarioFinal();
    }

    

    
    
    
}
