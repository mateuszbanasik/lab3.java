
public class Test {
		public static void main(String[] args) {
			Vector2D wektorr1=new Vector2D(2,3,4,5);
			wektorr1.wysw();
			
			Vector2D wektorr2=new Vector2D(7,8,9,10);
			wektorr2.wysw();
			Vector2D wektorr3=new Vector2D();
			Vector2D wektorr4=new Vector2D();
			Vector2D wektorr5=new Vector2D();
			
			wektorr3=wektorr1.sumaVector(wektorr2);
			wektorr3.wysw();
			wektorr4=wektorr1.minusVector(wektorr2);
			wektorr4.wysw();
			wektorr5=wektorr1.mnozenieVector(5);
			wektorr5.wysw();
			
			
		}
		
}
