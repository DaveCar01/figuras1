package std;

public class Triangulo extends Punto
{
	Punto p1,p2,p3;

	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangulo(Punto p1, Punto p2, Punto p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public Punto getP3() {
		return p3;
	}

	public void setP3(Punto p3) {
		this.p3 = p3;
	}


	public double distancia(Punto p1 ,Punto p2)
	{
		double d;
		d= Math.hypot(p1.getY()-p2.getY(), p1.getX()-p2.getX());
		return d;
	}
	/*public double altura()
	
	{
		double a;
		a=
		return a;
	}*/	
		
	
	
	
	
}
