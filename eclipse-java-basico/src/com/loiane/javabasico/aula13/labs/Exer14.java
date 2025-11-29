package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		//   1 MB =   8 Mb
		// 100 MB = 800 Mb
		
		System.out.println("Entre com o tamanho do arquivo:");
		double arquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet:");
		double velocidade = scan.nextDouble();
		
		double download = (arquivo * 8) / velocidade / 60;
		
		System.out.println("Tempo de download em min: " + String.format("%.1f", download) + " minutos");
		System.out.println("Tempo de download em seg: " + String.format("%.1f", download * 60) + " segundos");
	}

}
