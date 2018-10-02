package BloqueEjercicios1º;

import javax.swing.JOptionPane;

public class EjercicioMonedasInventado {

	public static void main(String[] args) {
		
		String str=JOptionPane.showInputDialog("Introduce el precio del producto: ");
		int costo=Integer.parseInt(str);
		
		str=JOptionPane.showInputDialog("Introduce el dinero: ");
		int dinero=Integer.parseInt(str);
		
		int vuelta=dinero-costo;
		int moneda1=1;
		int moneda2=5;
		int moneda3=25;
		int moneda4=50;
		int moneda5=100;
		
	}	
}
