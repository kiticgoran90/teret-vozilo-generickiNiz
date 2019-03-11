package voz;

public class Lokomotiva extends Vozilo {
	private double vucnaSila;
	
	public Lokomotiva(double sopTez, double vucnaSila) {
		super(sopTez);
		this.vucnaSila = vucnaSila;
	}
	
	@Override
	public double vucnaSila() {
		return vucnaSila;
	}
	
	@Override
	public String toString() {
		return "L(" + ukTezina() + "," + vucnaSila + ")";
	}
}
