package std;

public class Rectangulo extends FiguraGeometrica
{
	private Punto pOrigen;
	private int alto;
	private int ancho;

	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Rectangulo(Punto pOrigen, int alto, int ancho) {
		super();
		this.pOrigen = new Punto();
		this.alto = alto;
		this.ancho = ancho;
	}




	public Punto getpOrigen() {
		return pOrigen;
	}




	public void setpOrigen(Punto pOrigen) {
		this.pOrigen = pOrigen;
	}




	public int getAlto() {
		return alto;
	}




	public void setAlto(int alto) {
		this.alto = alto;
	}




	public int getAncho() {
		return ancho;
	}




	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	@Override
	public double calcularArea() {
	
		return alto*ancho;
	}
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
}
