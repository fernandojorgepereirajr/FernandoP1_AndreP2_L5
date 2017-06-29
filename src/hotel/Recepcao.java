package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList<Estadias> estadias;

	public Recepcao() {
		estadias = new ArrayList<Estadias>();
	}
	public void checkIn(String nome, String tipo, int idade, int dias,double valor) {
		Estadia estadia =  new Estadia(nome, tipo, idade ,dias, valor);
		estadias.add(estadia);
	}

}
