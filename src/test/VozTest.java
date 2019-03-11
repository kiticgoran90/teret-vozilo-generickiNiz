package test;

import voz.Bure;
import voz.Lokomotiva;
import voz.Sanduk;
import voz.Vagon;
import voz.Voz;
import greske.*;

public class VozTest {

	public static void main(String[] args) {
		try {
			Voz voz = new Voz(3);
			voz.dodaj(new Lokomotiva(200, 3000));
			Vagon vagon = new Vagon(100, 5);
			vagon.dodaj(new Sanduk(3,2,1,3)).dodaj(new Bure(2,2,4));
			voz.dodaj(vagon);
			vagon = new Vagon(150, 10);
			vagon.dodaj(new Sanduk(4,2,10,3)).dodaj(new Bure(6,3,8));
			voz.dodaj(vagon);
			System.out.println(voz);
		}catch(GPreopterecen | GPunNiz g) {
			System.out.println(g);
		}
	}
}
