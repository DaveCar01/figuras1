package std;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Punto 
{
	

	private double x;
	private double y;
	public Punto() {
		super();// por defecto las coordenadas son en el origen
		// TODO Auto-generated constructor stub
	}
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	/*@Override
	public double calcularArea() {
		return x;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}*/
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
