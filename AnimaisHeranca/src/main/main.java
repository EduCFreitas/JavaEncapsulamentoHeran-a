package main;

import model.Cachorro;
import model.Gato;

public class main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("Lulu");
		cachorro.setMama(false);
		cachorro.setFocinho(true);
		cachorro.setPorte("M�dio");
		
		cachorro.andar();
		cachorro.fazerBarulho();
		cachorro.latir();
		
		System.out.println("\n------------------------------------------\n");
		
		Gato gato = new Gato();
		
		gato.setNome("Mingau");
		gato.setMama(true);
		gato.setBigode(true);
		gato.setFocinho(true);
		
		gato.andar();
		gato.fazerBarulho();
		gato.miar();

	}

}
