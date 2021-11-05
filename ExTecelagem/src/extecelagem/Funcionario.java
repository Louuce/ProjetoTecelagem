/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extecelagem;

/**
 *
 * @author Usuario
 */
public abstract class Funcionario
{
    private String nome, rg;
    private double salBase;

    public Funcionario(String nome, String rg, double salBase) 
    {
        this.nome = nome;
        this.rg = rg;
        this.salBase = salBase;
    }
    
    // Getters e setters

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getRg() 
    {
        return rg;
    }

    public void setRg(String rg) 
    {
        this.rg = rg;
    }

    public double getSalBase() 
    {
        return salBase;
    }

    public void setSalBase(double salBase) 
    {
        this.salBase = salBase;
    }
    
    // Métodos
    public void hollerith()
    {
        System.out.println(
                 nome + "\t" + rg + "\t" + salBase + "\t"  + salarioLiquido());
    }
    
    public abstract double salarioLiquido();
    
    public abstract void novoMes();
    
    public void print()
    {
        System.out.println(nome + rg);
    }
    
    public static void cabecalho(){
        System.out.printf("\n |%-10s | %-10s | %-10s | %-10s|","Nome","RG","SLB","SL");
    
    }
    
    
    public void Dados(){
        System.out.printf("\n |%-10s |%-11s |%9.2f   |%11.2f|",nome,rg,salBase, salarioLiquido());
    
    
    }
    
}
