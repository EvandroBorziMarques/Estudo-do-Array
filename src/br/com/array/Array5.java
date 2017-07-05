/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

import java.awt.BorderLayout;

/**
 * Estudo do Array Exemplo 5 
 * @author Evandro Borzi Marques
 */
public class Array5 {
    public static void main(String[] args) {
	//instanciando um array de tamanho variavel
	int[] pares = {2,4,6,8};
	//a estrututra abaixo percorre o array de 0 até o seu tamanho máximo
	for (int i = 0; i < pares.length; i++) {
	    System.out.println("pares[" + i + "] = " + pares[i]);
	}
	    //usando uma estrutura simplificada do laço for(foreach) para percorrer o array
	    System.out.println("Uso do foreach: ");
	    for (int i : pares){
		System.out.println(i);
		   	    
	}
    }
    
}
