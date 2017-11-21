/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioavaliativo;

/**
 *
 * @author Rafael
 */
public class ExercicioAvaliativo {

    public static void main(String[] args) {
    
    	//criação de 3 objetos de nav
		NaveEspacial n1 = new NaveEspacial("nave1");
		NaveEspacial n2 = new NaveEspacial("nave2");
		NaveEspacial n3 = new NaveEspacial("nave3");
		
		n3.mostrarNave();
		n3.combaterNave(n1);
		n3.combaterNave(n2);
    	
    	System.out.println("-------------------------");
    	
    	//criação de uma conta corrente
    	ContaCorrente conta1 = new ContaCorrente("123456789", 1000.0);
    	conta1.sacar(500.0);
    	conta1.realizarSaldo();
    	conta1.depositar(600.0);
    	conta1.realizarSaldo();
    	
    	
    	System.out.println("Conta Especial");
    	
    	//criação de uma conta corrente especial
    	ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial("987645312", 1000.0);
    	conta2.sacar(500.0);
    	conta2.realizarSaldo();
    	conta2.depositar(600.0);
    	conta2.realizarSaldo();
    	
    	System.out.println("-------------------------");
    	
    	//criação de uma data
    	Data data1 = new Data(01,03,1994);
    	data1.displayData();
    }
    
}
