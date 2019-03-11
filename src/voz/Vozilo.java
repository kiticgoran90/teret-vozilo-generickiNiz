package voz;

public abstract class Vozilo {
	private double sopTez;
	
	public Vozilo(double sopTez) {
		this.sopTez = sopTez;
	}

	public double ukTezina() {
		return sopTez;
	}
	
	public abstract double vucnaSila();
}
