/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

/**
 *  Etudo do Array Exemplo 6 Array Multidimensional
 * @author Evandro Borzi Marques
 */
public class Array6 {
    public static void main(String[] args) {
	//a linha abaixo cria um array de duas dimensões com 3 linhas e 3 colunas
	String[][] agenda = {{"Bill","1111-1111","bill@outlook.com"},{"Linus","2222-2222","linus@tux.com"}, {"Steve", "3333-3333", "steve@icloud.com"}};
	//exemplo 1: recuperando o eamil do bill
	//System.out.println(agenda[0][2]);
	//exemplo 2: montando a agenda de contatos
	//1 laço percorre as linhas
	for (int i = 0; i < agenda.length;i++) {
	    System.out.println("_____________________________________________");
	    //o segundo laço dentro do primeiro laço, percorre as colunas, montando a agenda
	    for (int j = 0; j < agenda[i].length; j++) {
		System.out.println(agenda[i][j]);
		
	    }
	    
	}
	
    }
    
}
