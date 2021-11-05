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
public class Vendas extends Funcionario
{
    private double totVendas;

    public Vendas(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        totVendas= 0;
    }
    
    public void registrarVenda(double valor)
    {
        totVendas += valor;
    }
    
    @Override
    public void novoMes()
    {
        totVendas= 0;
    }
    
    @Override
    public double salarioLiquido()
    {
        return getSalBase() + totVendas*0.03;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Total de vendas: " + totVendas);
    }
    
     public static void cabecalho(){
        Funcionario.cabecalho();
        System.out.printf("%10s |","Total Vendas");
    
    }
    
    @Override
     public void Dados(){
        super.Dados();
        System.out.printf("|%13.2f|",totVendas);
        
    
    
    }

    public double getTotVendas() 
    {
        return totVendas;
    }
    
    
}
