package BloqueEjercicios3º;

import javax.swing.JOptionPane;

public class Ejercicio2º {

	public static void main(String[] args) {
		String menu = "MENU\n"
				+ "1.- Suma de dos números\n"
				+ "2.- Resta de dos numeros";
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		if (opcion<1 || opcion>2) {
			JOptionPane.showMessageDialog(null,"Error.\nNo se pueden introducir casos que no existan.");
			System.exit(0);
		}
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca primer número: "));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número: "));
		int suma=num1+num2;
		int resta=num1-num2;
		
		switch (opcion) {
		case 1: //suma de dos numeros
			JOptionPane.showMessageDialog(null, "Resultaado "+suma);
			break;
		case 2: //resta de dos numeros
			JOptionPane.showMessageDialog(null, "Resultaado "+resta);
			break;
		}

	}

}
