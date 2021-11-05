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
public class Administracao extends Funcionario
{
    private int faltas;

    public Administracao(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        faltas= 0;
    }
    
    public void registrarFalta()
    {
        faltas++;
    }
    
    @Override
    public void novoMes()
    {
        faltas= 0;
    }
    
    @Override
    public double salarioLiquido()
    {
        return getSalBase() - (getSalBase()/30) * faltas;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Faltas no mês:" + faltas);
    }
    
    public static void cabecalho(){
        Funcionario.cabecalho();
        System.out.printf("%10s |","FALTAS");
    
    }
    
    
    @Override
     public void Dados(){
        super.Dados();
        System.out.printf("%11d|",faltas);
    
    
    }
    

    public int getFaltas() 
    {
        return faltas;
    }
    
    
}
