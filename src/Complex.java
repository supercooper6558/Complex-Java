import java.lang.Math;

public class Complex
{
	double re;
	double im;
	
	double rad=Math.sqrt(Math.pow(re,2)+Math.pow(im,2));
	double arc=Math.atan2(im,re);
	
	Complex()
	{
		re=0;
		im=0;
	}
	
	Complex(double x)
	{
		re=x;
		im=0;
	}
	
	Complex(double x,double y)
	{
		re=x;
		im=y;
	}
}
