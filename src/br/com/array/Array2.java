/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

import java.util.Random;

/**
 * Estudo do Array Exemplo 2 (Sorteio de uma carta)
 *
 * @author Evandro Borzi Marques
 */
public class Array2 {

    public static void main(String[] args) {
	String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
	String[] faces = {"AZ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
	//A linha abaixo cria um objeto chamado sorteio usando o modelo da classe Random
	Random sorteio = new Random();
	//a linha abaixo faz o sorteio do índice dos nipes, usando o objeto sorteio e atribui o resultado a variável indice_face
	//o número (4) gera números aleatórios no intervalo de 0 até 3
	int indice_nipe = sorteio.nextInt(4);
	//a linha abaixo faz o sorteio do indice das faces das cartas, usando o objeto sorteio e atribui o resultado a variável indice_faces
	//o.lenght gera números aleatórios no intervalo do tamanho total do array
	int indice_face = sorteio.nextInt(faces.length);
	//as linhas abaixo atribuem o resultado do sorteio ao array correspondente
	String face = faces[indice_face];
	String nipe = nipes[indice_nipe];
	//a linha abaixo exibe a carta sorteada
	System.out.println(face + " de " + nipe);
    }

}
