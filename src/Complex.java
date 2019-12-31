import javax.print.DocFlavor;
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
	
	public Complex(float x)
	{
		re = (double)x;
	}
	
	public Complex(int x)
	{
		re = (double)x;
	}
	
	public Complex(long x)
	{
		re = (double)x;
	}
	
	public Complex(double x, double y)
	{
		re = x;
		im = y;
	}
	
	public Complex(double x, float y)
	{
		re = x;
		im = (double)y;
	}
	
	public Complex(double x, int y)
	{
		re = x;
		im = (double)y;
	}
	
	public Complex(double x, long y)
	{
		re = x;
		im = (double)y;
	}
	
	public Complex(float x, double y)
	{
		re = (double)x;
		im = y;
	}
	
	public Complex(float x, float y)
	{
		re = (double)x;
		im = (double)y;
	}
	
	public Complex(float x, int y)
	{
		re = (double)x;
		im = (double)y;
	}
	
	public Complex(float x, long y)
	{
		re = (double)x;
		im = (double)y;
	}
	
	public Complex(int x, double y)
	{
		re = (double)x;
		im = y;
	}
	
	public Complex(int x, float y)
	{
		re = (double)x;
		im = (double)y;
	}
	
	public Complex(int x, int y)
	{
		re = (double)x;
		im = (double)y;
	}
	
	public Complex(int x, long y)
	{
		re = (double)x;
		im = (double)y;
	}
	
	public Complex(long x, double y)
	{
		re = (double)x;
		im = y;
	}
	
	public Complex(long x, float y)
	{
		re = (double)x;
		im = (double)y;
	}
	
	public Complex(long x, int y)
	{
		re = (double)x;
		im = (double)y;
	}
	
	public Complex(long x, long y)
	{
		re = (double)x;
		im = (double)y;
	}
	
	public static double E = Math.E;
	
	public static double PI = Math.PI;
	
	public static Complex toRectangular(double rad, double arc)
	{
		return new Complex(Math.cos(arc) * rad, Math.sin(arc) * rad);
	}
	
	public static Complex toRectangular(double rad, float arc)
	{
		return toRectangular(rad, (double)arc);
	}
	
	public static Complex toRectangular(double rad, int arc)
	{
		return toRectangular(rad, (double)arc);
	}
	
	public static Complex toRectangular(double rad, long arc)
	{
		return toRectangular(rad, (double)arc);
	}
	
	public static Complex toRectangular(float rad, double arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(float rad, float arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(float rad, int arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(float rad, long arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(int rad, double arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(int rad, float arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(int rad, int arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(int rad, long arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(long rad, double arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(long rad, float arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(long rad, int arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public static Complex toRectangular(long rad, long arc)
	{
		return toRectangular((double)rad, arc);
	}
	
	public Complex plus(Complex zeta)
	{
		return new Complex(re + zeta.re, im + zeta.im);
	}
	
	public Complex plus(double a)
	{
		return this.plus(new Complex(a));
	}
	
	public Complex plus(float a)
	{
		return this.plus(new Complex(a));
	}
	
	public Complex plus(int a)
	{
		return this.plus(new Complex(a));
	}
	
	public Complex plus(long a)
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
	
	public Complex minus(float a)
	{
		return this.minus(new Complex(a));
	}
	
	public Complex minus(int a)
	{
		return this.minus(new Complex(a));
	}
	
	public Complex minus(long a)
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
	
	public Complex times(float a)
	{
		return this.times(new Complex(a));
	}
	
	public Complex times(int a)
	{
		return this.times(new Complex(a));
	}
	
	public Complex times(long a)
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
	
	public Complex dividedBy(float a)
	{
		return this.dividedBy(new Complex(a));
	}
	
	public Complex dividedBy(int a)
	{
		return this.dividedBy(new Complex(a));
	}
	
	public Complex dividedBy(long a)
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
	
	public static Complex divide(Complex a, double b)
	{
		return a.dividedBy(new Complex(b));
	}
	
	public static Complex divide(double a, Complex b)
	{
		return new Complex(a).dividedBy(b);
	}
	
	public static Complex divide(double a, double b)
	{
		return new Complex(a).dividedBy(new Complex(b));
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
	
	public static double abs(double a)
	{
		return Math.abs(a);
	}
	
	public static float abs(float a)
	{
		return Math.abs(a);
	}
	
	public static int abs(int a)
	{
		return Math.abs(a);
	}
	
	public static long abs(long a)
	{
		return Math.abs(a);
	}
	
	public static double abs(Complex a)
	{
		return (a.rad);
	}
	
	public static Complex acos(double a)
	{
		return acos(new Complex(a));
	}
	
	public static Complex acos(Complex a)
	{
		return new Complex();
	}
	
	public static int addExact(int x, int y)
	{
		return Math.addExact(x, y);
	}
	
	public static long addExact(long x, long y)
	{
		return Math.addExact(x, y);
	}
	
	public static Complex asin(double a)
	{
		return asin(new Complex(a));
	}
	
	public static Complex asin(Complex a)
	{
		return new Complex();
	}
	
	public static double atan(double a)
	{
		return Math.atan(a);
	}
	
	public static Complex atan(Complex a)
	{
		return new Complex();
	}
	
	public static double atan2(double x, double y)
	{
		return Math.atan2(x, y);
	}
	
	public static double cbrt(double a)
	{
		return Math.cbrt(a);
	}
	
	public static Complex cbrt(Complex a)
	{
		return pow(a, 1 / 3);
	}
	
	public static double ceil(double a)
	{
		return Math.ceil(a);
	}
	
	public static double copySign(double magnitude, double sign)
	{
		return Math.copySign(magnitude, sign);
	}
	
	public static Complex copySign(double magnitude, Complex sign)
	{
		return toRectangular(magnitude,sign.arc);
	}
	
	public static Complex copySign(Complex magnitude, double sign)
	{
		return toRectangular(magnitude.rad,new Complex(sign).arc);
	}
	
	public static Complex copySign(Complex magnitude, Complex sign)
	{
		return toRectangular(magnitude.rad, sign.arc);
	}
	
	public static float copySign(float magnitude, float sign)
	{
		return Math.copySign(magnitude, sign);
	}
	
	public static Complex copySign(float magnitude, Complex sign)
	{
		return toRectangular(magnitude, sign.arc);
	}
	
	public static Complex copySign(Complex magnitude, float sign)
	{
		return toRectangular(magnitude.rad, new Complex(sign).arc);
	}
	
	public static double cos(double a)
	{
		return Math.cos(a);
	}
	
	public static Complex cos(Complex a)
	{
		return new Complex();
	}
	
	public static double cosh(double x)
	{
		return Math.cosh(x);
	}
	
	public static Complex cosh(Complex x)
	{
		return new Complex();
	}
	
	public static double exp(double a)
	{
		return Math.exp(a);
	}
	
	public static Complex exp(Complex a)
	{
		return pow(a, Math.E);
	}
	
	public static double expm1(double x)
	{
		return Math.expm1(x);
	}
	
	public static Complex expm1(Complex x)
	{
		return pow(x, Math.E).minus(1);
	}
	
	public static double floor(double a)
	{
		return Math.floor(a);
	}
	
	public static int floorDiv(int x, int y)
	{
		return Math.floorDiv(x, y);
	}
	
	public static long floorDiv(long x, long y)
	{
		return Math.floorDiv(x, y);
	}
	
	public static int floorMod(int x, int y)
	{
		return Math.floorMod(x, y);
	}
	
	public static long floorMod(long x, long y)
	{
		return Math.floorMod(x, y);
	}
	
	public static int getExponent(double d)
	{
		return Math.getExponent(d);
	}
	
	public static int getExponent(float f)
	{
		return Math.getExponent(f);
	}
	
	public static double hypot(double x, double y)
	{
		return Math.hypot(x, y);
	}
	
	public static double IEEEremainder(double f1, double f2)
	{
		return Math.IEEEremainder(f1, f2);
	}
	
	public static int incrementExact(int a)
	{
		return Math.incrementExact(a);
	}
	
	public static long incrementExact(long a)
	{
		return Math.incrementExact(a);
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
	
	public static Complex log1p(Complex x)
	{
		return logBase(x.plus(1), Math.E);
	}
	
	public static Complex log1p(double x)
	{
		return logBase(x + 1, Math.E);
	}
	
	public static double max(double a, double b)
	{
		return Math.max(a, b);
	}
	
	public static float max(float a, float b)
	{
		return Math.max(a, b);
	}
	
	public static int max(int a, int b)
	{
		return Math.max(a, b);
	}
	
	public static long max(long a, long b)
	{
		return Math.max(a, b);
	}
	
	public static double min(double a, double b)
	{
		return Math.min(a, b);
	}
	
	public static float min(float a, float b)
	{
		return Math.min(a, b);
	}
	
	public static int min(int a, int b)
	{
		return Math.min(a, b);
	}
	
	public static long min(long a, long b)
	{
		return Math.min(a, b);
	}
	
	public static int multiplyExact(int x, int y)
	{
		return Math.multiplyExact(x, y);
	}
	
	public static long multiplyExact(long x, long y)
	{
		return Math.multiplyExact(x, y);
	}
	
	public static int negateExact(int a)
	{
		return Math.negateExact(a);
	}
	
	public static long negateExact(long a)
	{
		return Math.negateExact(a);
	}
	
	public static double nextAfter(double start, double direction)
	{
		return Math.nextAfter(start, direction);
	}
	
	public static float nextAfter(float start, float direction)
	{
		return Math.nextAfter(start, direction);
	}
	
	public static double nextDown(double d)
	{
		return Math.nextDown(d);
	}
	
	public static float nextDown(float f)
	{
		return Math.nextDown(f);
	}
	
	public static double nextUp(double d)
	{
		return Math.nextUp(d);
	}
	
	public static float nextUp(float f)
	{
		return Math.nextUp(f);
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
		return pow(new Complex(a),new Complex(b));
	}
	
	public static double random()
	{
		return Math.random();
	}
	
	public static double rint(double a)
	{
		return Math.rint(a);
	}
	
	public static long round(double a)
	{
		return Math.round(a);
	}
	
	public static int round(float a)
	{
		return Math.round(a);
	}
	
	public static double scalb(double d, int scaleFactor)
	{
		return Math.scalb(d, scaleFactor);
	}
	
	public static float scalb(float f, int scaleFactor)
	{
		return Math.scalb(f, scaleFactor);
	}
	
	public static Complex signum(Complex c)
	{
		return c.dividedBy(c.rad);
	}
	
	public static double signum(double d)
	{
		return Math.signum(d);
	}
	
	public static double sin(double a)
	{
		return Math.sin(a);
	}
	
	public static Complex sin(Complex a)
	{
		return new Complex();
	}
	
	public static double sinh(double x)
	{
		return Math.sinh(x);
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
	
	public static double tan(double a)
	{
		return Math.tan(a);
	}
	
	public static Complex tan(Complex a)
	{
		return new Complex();
	}
	
	public static double tanh(double x)
	{
		return Math.tanh(x);
	}
	
	public static Complex tanh(Complex x)
	{
		return new Complex();
	}
	
	public static double toDegrees(double angrad)
	{
		return Math.toDegrees(angrad);
	}
	
	public static int toIntExact(long value)
	{
		return Math.toIntExact(value);
	}
	
	public static double toRadians(double angdeg)
	{
		return Math.toRadians(angdeg);
	}
	
	public static double ulp(double d)
	{
		return Math.ulp(d);
	}
	
	public static float ulp(float f)
	{
		return Math.ulp(f);
	}
}
