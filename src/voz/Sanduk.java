package voz;

public class Sanduk extends Teret {
	private double a, b, c;
	
	public Sanduk(double specTez, double a, double b, double c) {
		super(specTez);
		this.a = a; this.b = b; this.c = c;
	}
	
	@Override
	public char vrsta() {
		return 'S';
	}
	
	@Override
	public double zapremina() {
		return a * b * c;
	}
}
