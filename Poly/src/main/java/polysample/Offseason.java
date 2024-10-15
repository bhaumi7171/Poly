package polysample;

public class Offseason extends Onseason {
int c;
public void season()
{
	c=(a*15)/100;
	super.season();
	System.out.println(" The Discount on Offseason is "+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason e=new Offseason();
		e.season();  
	}
}
