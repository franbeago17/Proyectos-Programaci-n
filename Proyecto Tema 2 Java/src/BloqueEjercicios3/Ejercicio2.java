package BloqueEjercicios3;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		String menu = "MENU\n"
				+ "1.- Suma de dos numeros.\n"
				+ "2.- Resta de dos numeros.\n"
				+ "3.- Multiplicacion de dos numeros.\n"
				+ "4.- Division de dos numeros.\n"
				+ "5.- Raiz de un numero.\n"
				+ "6.- Potencia de un numero.\n"
				+ "7.- Modulo entre dos numeros";
		
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		if (opcion<1 || opcion>7) {
			JOptionPane.showMessageDialog(null,"Error!!\nNo se pueden introducir casos que no existan.");
			System.exit(0);
		}
		float num1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca primer numero: "));
		float num2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo numero: "));
		float suma=num1+num2;
		float resta=num1-num2;
		float multiplicacion=num1*num2;
		float division=num1/num2;
		float raiz=(float)Math.sqrt(num1);
		float potencia=(float)Math.pow(num1, num2);
		float modulo=num1%num2;
		
		switch (opcion) {
		case 1: //suma de dos numeros
			JOptionPane.showMessageDialog(null, "El resultado es "+suma);
			break;
		case 2: //resta de dos numeros
			JOptionPane.showMessageDialog(null, "El resultado es "+resta);
			break;
		case 3: //multiplicacion de dos numeros
			JOptionPane.showMessageDialog(null, "El resultado es "+multiplicacion);
			break;
		case 4: //division de dos numeros
			JOptionPane.showMessageDialog(null, "El resultado es "+division);
			break;
		case 5: //raiz de dos numeros
			JOptionPane.showMessageDialog(null, "El resultado es "+raiz);
			break;
		case 6: //potencia de dos numeros
			JOptionPane.showMessageDialog(null, "El resultado es "+potencia);
			break;
		case 7: //modulo de dos numeros
			JOptionPane.showMessageDialog(null, "El resultado es "+modulo);
			break;
		}

	}

}
