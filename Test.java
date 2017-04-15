
public class Test {
		public static void main(String[] args) {
			Vector2D wektorr1=new Vector2D(2,3,4,5); //tworzymy wektor1 za pomoca konstruktora z parametrami
			System.out.println("Wektor 1");
			wektorr1.wysw();
			Vector2D wektorr2=new Vector2D(7,8,9,10);//tworzymy wektor2 za pomoca konstruktora z parametrami
			System.out.println("Wektor 2");
			wektorr2.wysw();
			Vector2D wektorr3=new Vector2D();
			Vector2D wektorr4=new Vector2D();
			Vector2D wektorr5=new Vector2D();
			Vector2D wektorr6=new Vector2D();
			wektorr3=wektorr1.sumaVector(wektorr2); //tworzymy nowy wektor(wektorr3) majacy wspolrzedne sumy wektorr1+wektorr2
			System.out.println("Wektor 3");
			wektorr3.wysw();
			System.out.println("Wektor 4");
			wektorr4=wektorr1.minusVector(wektorr2); //tworzymy nowy wektor(wektorr4) majacy wspolrzedne roznicy wektorr1-wektorr2
			wektorr4.wysw();
			wektorr5=wektorr1.mnozenieVector(5);//tworzymy wektor(wektorr5) maj¹cy wspó³rzêdne 5krotnie wiêksze od wektorr1
			System.out.println("Wektor 5");
			wektorr5.wysw();
			wektorr6=wektorr1.normalVector(wektorr1);//tworzymy wektor(wektorr6) który jest znormalizowanym wektorrem1
			System.out.println("Wektor 6");
			wektorr6.wysw();
			
			
			
		}
		
}
