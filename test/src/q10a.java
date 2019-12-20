import advMaths.calc;
import advMaths.triplet;

public class q10a {

	public static void main(String Args[])
	{
		calc c1=new calc(120);
		triplet t1=new triplet();
		double y=c1.cal();
		System.out.println("y :"+y);
		t1.tri(20);
	}
}