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
public class ExTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ListaF l1;
        l1= new ListaF(3);
        
        Administracao a1= new Administracao("João", "1234-05", 10000);
        Administracao a2= new Administracao("Pedro", "1334-05", 12000);
        
        //a1.hollerith();
        a1.registrarFalta();
        a1.registrarFalta();
        a2.registrarFalta();
        //a1.hollerith();//
        
        Producao p1= new Producao("José","23455-94",50);
        Producao p2= new Producao("Joca","24445-94",60);
        
        p1.registrarHorasDiurnas(100);
        p1.registrarHorasNoturnas(100);
        p2.registrarHorasDiurnas(80);
        p2.registrarHorasNoturnas(80);
        
        //p1.hollerith();//
        
        Vendas v1= new Vendas("Maria", "76535-12", 1200);
        Vendas v2= new Vendas("Rita", "45765-12", 1500);
        
        v1.registrarVenda(200000);
        v2.registrarVenda(250000);
        
        //v1.hollerith();
        //v1.novoMes();
        //v1.hollerith();
        //System.out.println();
        
     
        l1.addFunc(a1);
        l1.addFunc(a2);
       
        
       
        l1.relatorioAdministracao();
     
        
        
    }
    
}
