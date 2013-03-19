package br.com.ideais.estagio.model;

import java.util.Comparator;

public class EtapaComparator implements Comparator<Etapa> {

	public int compare(Etapa e1, Etapa e2) {
		return e1.getOrdem().compareTo(e2.getOrdem());
	}

}
