package std;

public class Linea extends Punto
{
	Punto Cp1,Cp2;

	public Linea() {
		super();
		Cp1=new Punto();
		Cp2=new Punto();
			
		// TODO Auto-generated constructor stub
	}

	public Linea(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	

public Linea(Punto cp1, Punto cp2) {
		super();
		Cp1 = cp1;
		Cp2 = cp2;
	}

	
public Punto getCp1() {
	return Cp1;
}

public void setCp1(Punto cp1) {
	Cp1 = cp1;
}

public Punto getCp2() {
	return Cp2;
}

public void setCp2(Punto cp2) {
	Cp2 = cp2;
}

public double distancia(Punto Cp1 ,Punto Cp2){
		
		double d;
		d= Math.hypot(Cp1.getY()-Cp2.getY(), Cp1.getX()-Cp2.getX());
		return d;
	}

@Override
public String toString() {
	return "Linea [Cp1=" +Cp1.toString() + ", Cp2=" + Cp2.toString() + "]"+"\n la distancia entre puntos es: "+distancia(Cp1, Cp2);
}

		
	
}
