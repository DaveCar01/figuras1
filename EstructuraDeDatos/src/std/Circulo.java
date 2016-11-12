package std;

import javax.swing.JOptionPane;

public class Circulo extends FiguraGeometrica
{
	/*float radio;
	Punto centro = new Punto();
	
	public Circulo() {
		super();
		
	}

	public Circulo(float radio, Punto punto) {
		super();
		this.radio = radio;
		this.centro = punto;
	}

	public void setRadio()
	{
		this.radio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del radio"));
		
	}
	
	
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public Punto getPunto() {
		return centro;
	}

	public void setPunto(Punto punto) {
		this.centro = punto;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", punto=" + centro + "]";
	}*/
	Punto punto;
	private double radio;
	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
		
		punto= new Punto();
	}
	public Circulo(Punto punto, double radio) {
		super();
		this.punto = punto;
		this.radio = radio;
	}
	public Punto getPunto() {
		return punto;
	}
	public void setPunto(Punto punto) {
		this.punto = punto;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
		
		
	}
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Circulo [punto=" + punto + ", radio=" + radio + "]";
	}
	
	
	
	
}
