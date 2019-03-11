package voz;

import greske.*;

public class Voz {
	private Niz<Vozilo> vozila;
	
	public Voz(int kap) {
		vozila = new Niz<Vozilo>(kap);
	}
	
	public int duzina() {
		return vozila.duzina();
	}
	
	public Voz dodaj(Vozilo v) throws GPunNiz, GPreopterecen {
		if(opterecenje(v)) throw new GPreopterecen();
		vozila.dodaj(v);
		return this;
	}
	
	private boolean opterecenje(Vozilo v) {			//privatna metoda koju cu da koristim samo u ovoj klasi 
		double teret = 0, sila = 0;					//da ispitam da li je Voz preopterecen
		try {
			for(int i=0; i<vozila.duzina(); i++) {
				Vozilo w = vozila.dohvati(i);
				teret += w.ukTezina();
				sila += w.vucnaSila();
			}		
		}catch(GIndeks g) {}
		return teret + v.ukTezina() > sila + v.vucnaSila();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		try {
			for(int i=0; i<vozila.duzina(); i++)
				sb.append(vozila.dohvati(i)).append("\n");
		}catch(GIndeks g) {}
		return sb.toString();
	}	
}
