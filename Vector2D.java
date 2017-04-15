
public class Vector2D {
	public double xp;//wspolrzedna poczatkowa x
	public double yp;//wspolrzedna poczatkowa y
	public double xk;//wspolrzedna koncowa x
	public double yk;//wspolrzedna koncowa y
	public double x;// wspolrzedna x wektora (xk-xp)
	public double y;//wspolrzedna y wektora (yk-yp)
	public double d; //dlugosc wektora
	public Vector2D(){ // konstruktor domyslny
		this.xp=0;
		this.yp=0;
		this.xk=0;
		this.yk=0;
		this.x=0;
		this.y=0;
		this.d=0;
	}
	public Vector2D(double xp,double xk,double yp,double yk){ //konstruktor z parametrami
		this.xp=xp;
		this.xk=xk;
		this.yp=yp;
		this.yk=yk;
		
	}
	public Vector2D sumaVector(Vector2D wektor){ //suma wektora dla którego zosta³a wywo³ana metoda i wektora podanego jako parametr
		Vector2D wektor1= new Vector2D(this.xp+wektor.xp,this.xk+wektor.xk,this.yp+wektor.yp,this.yk+wektor.yk)	;
		return wektor1;
	}
	
	public Vector2D minusVector(Vector2D wektor){ //roznica wektora dla którego zosta³a wywo³ana metoda i wektora podanego jako parametr.
		Vector2D wektor2= new Vector2D(this.xp-wektor.xp,this.xk+wektor.xk,this.yp+wektor.yp,this.yk+wektor.yk)	;
		return wektor2;
	}
	public Vector2D mnozenieVector(double s){ // metoda z parametrem, przemnozenie wsp. wektora przez stala
		Vector2D wektor3=new Vector2D(s*this.xp,s*this.xk,s*this.yp,s*this.yk);
		return wektor3;
	}
	public void Dlugosc(){ //metoda bez parametrow zwracajaca dlugosc wektora
		this.x=this.xk-this.xp;
		this.y=this.yk-this.yp;
		this.d=Math.sqrt(Math.pow(x, 2)+(Math.pow(y, 2)));
		System.out.println("dlugosc wynosi:"+this.d+"\n");
		}
	public double getDlugosc(){
		return this.d;
	}
	public Vector2D normalVector(Vector2D wektor){ // normalizacja wektora
		Vector2D wektor4=new Vector2D(this.xp/this.d,this.xk/this.d,this.yp/this.d,this.yk/this.d);
		return wektor4;
	}
		public void wysw(){
			System.out.println("wspolrzedna xp wynosi: "+this.xp+"\n"+"wspolrzedna wektora xk wynosi: "+this.xk);
			System.out.println("wspolrzedna yp wynosi: "+this.yp+"\n"+"wspolrzedna yk wynosi: "+this.yk);
			Dlugosc();
	
	}
	}

