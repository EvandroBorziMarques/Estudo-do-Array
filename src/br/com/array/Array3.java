/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

/**
 *
 * Estudo do Array Exemplo 3 
 *
 * @author Evandro Borzi Marques
 */
public class Array3 {

    public static void main(String[] args) {
	//Iniciando um Array com tamanho fixo d 5 variaveis
	int[] impares = new int[5];
	impares[0] = 1;
	impares[1] = 3;
	impares[2] = 5;
	impares[3] = 7;
	impares[4] = 9;

	System.out.println("Tamanho do Array: " + impares.length);
	System.out.println("Posição 1 do Array: " + impares[1]);
	//a linha abaixo gera 1 erro pois  tamanho do Array é 5
	impares[5] = 11;

    }

}
