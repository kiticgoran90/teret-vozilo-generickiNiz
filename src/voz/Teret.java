package voz;

public abstract class Teret {
	private static int ID = 0;
	private int id = ++ID;
	private double specTezina;		//sigma - oznaka za specificnu tezinu
	
	public Teret(double specTezina) {
		this.specTezina = specTezina;
	}
	
	public abstract char vrsta();
	
	public abstract double zapremina();
	
	public double tezina() {
		return zapremina() * specTezina;
	}
	
	@Override
	public String toString() {
		return "" + vrsta() + id;
	}

}
