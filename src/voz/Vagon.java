package voz;

import greske.*;

public class Vagon extends Vozilo {
	private Niz<Teret> tereti;
	
	public Vagon(double sopTez, int kap) {
		super(sopTez);
		tereti = new Niz<Teret>(kap);
	}
	
	public Vagon dodaj(Teret t) throws GPunNiz {
		tereti.dodaj(t);
		return this;
	}
	
	@Override
	public double vucnaSila() {
		return 0;
	}

	@Override
	public double ukTezina() {		//ukupna tezina = tezina samog vagona + tezina tereta
		double t = super.ukTezina();
		try {
			for(int i=0; i<tereti.duzina(); i++)
				t += tereti.dohvati(i).tezina();
		}catch(GIndeks g) {}
		return t;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("V(");
		sb.append(ukTezina()).append("|");
		try {
			for(int i=0; i<tereti.duzina(); i++) {
				if(i>0) sb.append(",");
				sb.append(tereti.dohvati(i));
			}
		}catch(GIndeks g) {}
		return sb.append(")").toString();
	}
}
