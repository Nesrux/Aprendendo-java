package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String v1 = JOptionPane.showInputDialog("Digite o primeiro n�mero");
		
		String v2 =JOptionPane.showInputDialog("digite umsegunfo valor");
		
		System.out.println(v1 + v2);//N�o somou pq � uma String
		
		double n1 = Double.parseDouble(v1);
		double n2 = Double.parseDouble(v2);
		
		double soma = n1 + n2;
		System.out.println("soma � " + soma);
		System.out.println("a m�dia � "+ soma/2);
		//Trans 
	}
}
