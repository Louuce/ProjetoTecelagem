/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extecelagem;

/**
 *
 * @author paulo
 */
public class ListaF {
    
    private Funcionario lista[];
    private int count;
    
    public ListaF(int max){
        lista = new Funcionario[max];
    
    
    }
    
    
    public boolean addFunc(Funcionario f){
           if(count>lista.length) {return false;}
           lista[count]=f;
           count++;
           return true;
    }
    
    public void relatorioAdministracao(){
        float sa = 0;
        System.out.print(" ===================Relatório da Administracao==================");
        Administracao.cabecalho();
        for(int i=0; i<count; i++)
            if(lista[i] instanceof Administracao){
                
            Administracao a= (Administracao)lista[i];
            
            a.Dados();
            
            
            
            sa+=a.salarioLiquido();
            
            }
    
        System.out.println("\n" + " ========= " + "O salario liquido acumulado eh: " + sa + " ===========");  
    } 
    
    public void relatorioVendas(){
        System.out.print(" =======================Relatório da Vendas=======================");
        Vendas.cabecalho();
    float vt=0;
    for(int i=0; i<count; i++)
        if(lista[i] instanceof Vendas){
        
        Vendas a= (Vendas)lista[i];
        a.Dados();
        
        vt+=a.getTotVendas();
        }
        
        System.out.println("\n" + " ============= " + "Total de vendas acumuladas: "+ vt + " ==============");
        System.out.println(" =================================================================");
    
    }
    
    public void relatorioProducao(){
    float ht=0;
        System.out.print(" ==========================Relatório da producao===========================");
    Producao.cabecalho();
    for(int i=0; i<count;i++)
        if(lista[i] instanceof Producao){
        Producao a= (Producao)lista[i];
            
        a.Dados();
        
        ht+=a.getHrDia() + a.getHrNoite();
        }
       
        System.out.println("\n" + " ==================== " + "Total de horas trabalhadas: " + ht + " ===================");
        System.out.println(" ==========================================================================");
        
    
    }
    
}
