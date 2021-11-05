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
public class Producao extends Funcionario
{
    private int hrDia, hrNoite;

    public Producao(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        hrDia= 0;
        hrNoite= 0;
    }
    
    @Override
    public void novoMes()
    {
        hrDia= 0;
        hrNoite= 0;
    }
    
    public void registrarHorasDiurnas(int horas)
    {
        hrDia += horas;
    }
    
    public void registrarHorasNoturnas(int horas)
    {
        hrNoite += horas;
    }
    
    @Override
    public double salarioLiquido()
    {
        return getSalBase()*hrDia + ((getSalBase()*hrNoite)*1.3);
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        
    }    
    
    public static void cabecalho(){
        Funcionario.cabecalho();
        System.out.printf("%10s |%10s|","HD","HN");
    
    }
    
    @Override
    public void Dados(){
     super.Dados();
     System.out.printf("    %5d  |%10d|",hrDia,hrNoite);
       
    
    }

    public int getHrDia() 
    {
        return hrDia;
    }

    public int getHrNoite() 
    {
        return hrNoite;
    }
    
    
}
