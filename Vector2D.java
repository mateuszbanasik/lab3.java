
public class Vector2D {
	public double xp;
	public double yp;
	public double xk;
	public double yk;
	public double x;
	public double y;
	public double d; //dlugosc wektora
	public Vector2D(){
		this.xp=0;
		this.yp=0;
		this.xk=0;
		this.yk=0;
		this.x=0;
		this.y=0;
		this.d=0;
	}
	public Vector2D(double xp,double xk,double yp,double yk){
		this.xp=xp;
		this.xk=xk;
		this.yp=yp;
		this.yk=yk;
		
	}
	public Vector2D sumaVector(Vector2D wektor){
		Vector2D wektor1= new Vector2D(this.xp+wektor.xp,this.xk+wektor.xk,this.yp+wektor.yp,this.yk+wektor.yk)	;
		return wektor1;
	}
	
	public Vector2D minusVector(Vector2D wektor){
		Vector2D wektor2= new Vector2D(this.xp-wektor.xp,this.xk+wektor.xk,this.yp+wektor.yp,this.yk+wektor.yk)	;
		return wektor2;
	}
	public Vector2D mnozenieVector(double s){
		Vector2D wektor3=new Vector2D(s*this.xp,s*this.xk,s*this.yp,s*this.yk);
		return wektor3;
	}
	public void Dlugosc(){
		this.x=this.xk-this.xp;
		this.y=this.yk-this.yp;
		this.d=Math.sqrt(Math.pow(x, 2)+(Math.pow(y, 2)));
		System.out.println("dlugosc wynosi:"+this.d);
		}
	public double getDlugosc(){
		return this.d;
	}
		public void wysw(){
			System.out.println("wspolrzedna xp wynosi"+this.xp+"wspolrzedna wektora xk wynosi"+this.xk);
			System.out.println("wspolrzedna yp wynosi"+this.yp+"wspolrzedna yk wynosi"+this.yk);
			Dlugosc();
	
	}
	}

