package std;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args)
	{
		
		JOptionPane.showMessageDialog(null, "Punto, lineas , figuras");
		JOptionPane.showMessageDialog(null, "Punto");		
		Punto punto = new Punto();
		JOptionPane.showMessageDialog(null, punto.toString());
		JOptionPane.showMessageDialog(null, "Linea\n Ingrese las coordenadas de los 2 puntos");
		Punto linea1= new Linea(coorPunto(), coorPunto());
		JOptionPane.showMessageDialog(null, linea1 );
		
		

	}
	public static Punto coorPunto(){
		Punto aux;
		String linea= JOptionPane.showInputDialog("PUNTO\nIngrese las coordenadas del punto separadas por una coma:  ");
		StringTokenizer tokens= new StringTokenizer(linea, ",");
		int x= Integer.parseInt(tokens.nextToken());
		int y= Integer.parseInt(tokens.nextToken());
		aux= new Punto(x,y);
		return aux;
	}
	

}
