// let's change 'r' value to static in order to achieve memory efficiency
import java.util.*;
class Businessman1
{
	private float p;
	private float t;
	private float si;
	static float r;
	static
	{
		r=15.2f;
	}
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		p=scan.nextFloat();
		System.out.println("Enter the tenure");
		t=scan.nextFloat();
	}
	void calculate()
	{
		si=(p*t*r)/100;
	}
	void disp()
	{
		System.out.println(si);
	}
}
public class staticAndInstance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Businessman1 b1=new Businessman1();
		b1.acceptInput();
		b1.calculate();
		b1.disp();

		Businessman1 b2=new Businessman1();
		b2.acceptInput();
		b2.calculate();
		b2.disp();
		
		Businessman1 b3=new Businessman1();
		b3.acceptInput();
		b3.calculate();
		b3.disp();
		

	}

}
