package voz;

public class Bure extends Teret {
	private double r, h;
	
	public Bure(double specTez, double r, double h) {
		super(specTez);
		this.r = r;
		this.h = h;
	}
	
	@Override
	public char vrsta() {
		return 'B';
	}
	
	@Override
	public double zapremina() {
		return r * r * Math.PI * h;
	}
}
