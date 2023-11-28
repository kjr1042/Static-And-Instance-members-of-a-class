import java.util.*;
class Businessman
{
	private float si;
	private float p;
	private float t;
	private float r;
	public void acceptInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		p=scan.nextFloat();
		System.out.println("Enter the tenure: ");
		t=scan.nextFloat();
		r=15.2f;
		
		
	}
	public void calculate()
	{
		si=(p*t*r)/100;
	}
	public void disp()
	{
		System.out.println(si);
	}
}
public class staticAndInstance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Businessman b1=new Businessman();
		b1.acceptInput();
		b1.calculate();
		b1.disp();

		Businessman b2=new Businessman();
		b2.acceptInput();
		b2.calculate();
		b2.disp();
		
		Businessman b3=new Businessman();
		b3.acceptInput();
		b3.calculate();
		b3.disp();

	}

}
