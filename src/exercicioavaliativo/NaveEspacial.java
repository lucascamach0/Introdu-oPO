/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioavaliativo;

import java.util.Random;

/**
 *
 * @author Rafael
 */
public class NaveEspacial {
	
	//propriedades da nave
	private String nome;
    private int velocidade;
    private static int numTotal = 0;
    
   
	//construtor
	public NaveEspacial(String n) {
		super();
		this.nome = n;
		Random randomNumbers = new Random();
		this.velocidade = randomNumbers.nextInt(10);
		numTotal++;
	}
	
	//get and sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public static int getNumTotal() {
		return numTotal;
	}
	public static void setNumTotal(int numTotal) {
		NaveEspacial.numTotal = numTotal;
	}
	
	//mostrar nave
	public void mostrarNave(){
		
		//verificação da superlotação
		if(numTotal > 3){
			System.out.println("Superpopulação de Naves");
			System.out.println("\nNave Espacial: \nNome: Nave com defeito! \nVelocidade: " + 
					 "Nave com defeito! \nNúmero Total: 0");
		}
		else{
			System.out.println("Nave Espacial: \nNome: " + this.nome + "\nVelocidade: " + 
					 this.velocidade + "\nNúmero Total: " + numTotal);
		}
		
		//verificação se a velocidade está 0
		if(this.velocidade == 0){
			System.out.println("\nNúmero total de Naves:" + numTotal);
			System.out.println("\nNaves Operantes:  " + (numTotal - 1));
		}
		
	}
	
	//metodo de combater
	public void combaterNave(NaveEspacial n){
		if(n.velocidade > this.velocidade){
			System.out.println("\n" + n.nome + " possui maior valor de velocidade");
		}
		else{
			System.out.println("\n" + this.nome + " possui maior valor de velocidade!!");
		}

	}

    
}
