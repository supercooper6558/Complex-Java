import java.lang.Math;

public class Complex
{
	private double re;
	private double im;
	
	private double rad = Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
	private double arc = Math.atan2(im, re);
	
	public double getRe()
	{
		return re;
	}
	
	public double getIm()
	{
		return im;
	}
	
	public double getRad()
	{
		return rad;
	}
	
	public double getArc()
	{
		return arc;
	}
	
	public Complex()
	{
		re = 0;
		im = 0;
	}
	
	public Complex(double x)
	{
		re = x;
		im = 0;
	}
	
	public Complex(double x, double y)
	{
		re = x;
		im = y;
	}
	
	public static Complex toRectangular(double rad, double arc)
	{
		return new Complex(Math.cos(arc) * rad, Math.sin(arc) * rad);
	}
	
	public Complex plus(Complex zeta)
	{
		return new Complex(re + zeta.re, im + zeta.im);
	}
	
	public Complex plus(double a)
	{
		return this.plus(new Complex(a));
	}
	
	public Complex minus(Complex zeta)
	{
		return new Complex(re - zeta.re, im - zeta.im);
	}
	
	public Complex minus(double a)
	{
		return this.minus(new Complex(a));
	}
	
	public Complex times(Complex zeta)
	{
		return toRectangular(rad * zeta.rad, arc + zeta.arc);
	}
	
	public Complex times(double a)
	{
		return this.times(new Complex(a));
	}
	
	public Complex dividedBy(Complex zeta)
	{
		return toRectangular(rad / zeta.rad, arc - zeta.arc);
	}
	
	public Complex dividedBy(double a)
	{
		return this.dividedBy(new Complex(a));
	}
	
	public static Complex add(Complex a, Complex b)
	{
		return a.plus(b);
	}
	
	public static Complex add(Complex a, double b)
	{
		return add(a, new Complex(b));
	}
	
	public static Complex add(double a, Complex b)
	{
		return add(new Complex(a), b);
	}
	
	public static Complex add(double a, double b)
	{
		return new Complex(a + b);
	}
	
	public static Complex subtract(Complex a, Complex b)
	{
		return b.minus(a);
	}
	
	public static Complex subtract(Complex a, double b)
	{
		return subtract(a, new Complex(b));
	}
	
	public static Complex subtract(double a, Complex b)
	{
		return subtract(new Complex(a), b);
	}
	
	public static Complex subtract(double a, double b)
	{
		return new Complex(b - a);
	}
	
	public static Complex multiply(Complex a, Complex b)
	{
		return a.times(b);
	}
	
	public static Complex multiply(Complex a, double b)
	{
		return multiply(a, new Complex(b));
	}
	
	public static Complex multiply(double a, Complex b)
	{
		return multiply(new Complex(a), b);
	}
	
	public static Complex multiply(double a, double b)
	{
		return new Complex(a * b);
	}
	
	public static Complex divide(Complex a, Complex b)
	{
		return a.dividedBy(b);
	}
	
	public static Complex logBase(Complex a, Complex b)
	{
		return new Complex();
	}
	
	public static Complex logBase(Complex a, double b)
	{
		return logBase(a, new Complex(b));
	}
	
	public static Complex logBase(double a, Complex b)
	{
		return logBase(new Complex(a), b);
	}
	
	public static Complex logBase(double a, double b)
	{
		return logBase(new Complex(a), new Complex(b));
	}
	
	public static double abs(Complex a)
	{
		return (a.rad);
	}
	
	public static Complex acos(double a)
	{
		return new Complex();
	}
	
	public static Complex acos(Complex a)
	{
		return new Complex();
	}
	
	public static Complex asin(double a)
	{
		return new Complex();
	}
	
	public static Complex asin(Complex a)
	{
		return new Complex();
	}
	
	public static Complex atan(Complex a)
	{
		return new Complex();
	}
	
	public static Complex cbrt(Complex a)
	{
		return pow(a, 1 / 3);
	}
	
	public static Complex cos(Complex a)
	{
		return new Complex();
	}
	
	public static Complex cosh(Complex x)
	{
		return new Complex();
	}
	
	public static Complex exp(Complex a)
	{
		return pow(a, Math.E);
	}
	
	public static Complex expm1(Complex x)
	{
		return pow(x, Math.E).minus(1);
	}
	
	public static Complex log(Complex a)
	{
		return logBase(a, Math.E);
	}
	
	public static Complex log(double a)
	{
		return logBase(a, Math.E);
	}
	
	public static Complex log10(Complex a)
	{
		return logBase(a, 10);
	}
	
	public static Complex log10(double a)
	{
		return logBase(a, 10);
	}
	
	public static Complex log1p(Complex a)
	{
		return logBase(a.plus(1), Math.E);
	}
	
	public static Complex log1p(double a)
	{
		return logBase(a + 1, Math.E);
	}
	
	public static Complex pow(Complex a, Complex b)
	{
		return toRectangular(Math.pow(a.rad, b.re), b.re * a.arc)
				.times(toRectangular(1, Math.log(a.rad) * b.im))
				.dividedBy(toRectangular(1, b.im));
	}
	
	public static Complex pow(Complex a, double b)
	{
		return pow(a, new Complex(b));
	}
	
	public static Complex pow(double a, Complex b)
	{
		return pow(new Complex(a), b);
	}
	
	public static Complex pow(double a, double b)
	{
		return new Complex(Math.pow(a, b));
	}
	
	public static Complex signum(Complex c)
	{
		return c.dividedBy(c.rad);
	}
	
	public static Complex sin(Complex a)
	{
		return new Complex();
	}
	
	public static Complex sinh(Complex x)
	{
		return new Complex();
	}
	
	public static Complex sqrt(Complex a)
	{
		return pow(a, 1 / 2);
	}
	
	public static Complex sqrt(double a)
	{
		return pow(a, 1 / 2);
	}
	
	public static Complex tan(Complex a)
	{
		return new Complex();
	}
	
	public static Complex tanh(Complex x)
	{
		return new Complex();
	}
}
