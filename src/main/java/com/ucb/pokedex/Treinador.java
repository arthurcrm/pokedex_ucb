package com.ucb.pokedex;

import java.util.Scanner;
public class Treinador extends Caracteristica {
    String regiao;
    
 
    public Treinador() {
        super();
    }

   
    
    public String getRegiao() {
    	return regiao;
	  }

	public void setRegiao(String regiao) {
	    this.regiao = regiao;
	}




	public void listar() {
		super.imprimirNome();
		super.imprimirAltura();
		System.out.println("Regiao: "+getRegiao());
	  
}
	public void cadastrar(){
		Scanner sc= new Scanner(System.in);
		System.out.println("------Cadastro de treinador------");
		System.out.println("Digite o nome do treinador: ");
		this.setNome(sc.nextLine());
		System.out.println("Digite a região do treinador: ");
		this.setRegiao(sc.nextLine());
		System.out.println("Digite a altura do treinador: ");
	    this.setAltura(sc.nextDouble());
	}
}