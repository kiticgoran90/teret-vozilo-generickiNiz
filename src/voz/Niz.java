package voz;

import greske.GPunNiz;
import greske.GIndeks;

public class Niz<E> {
	private E[] niz;		//niz elemenata
	private int n = 0;		//duzina niza
	
	@SuppressWarnings("unchecked")
	public Niz(int kap) {
		niz = (E[])new Object[kap];
	}
	
	public int duzina() {
		return n;
	}
	
	public Niz<E> dodaj(E e) throws GPunNiz {
		if(n == niz.length) throw new GPunNiz();
		niz[n++] = e;
		return this;
	}
	
	public E dohvati(int i) throws GIndeks {
		if(i<0 || i>niz.length) throw new GIndeks();
		return niz[i];
	}
}
