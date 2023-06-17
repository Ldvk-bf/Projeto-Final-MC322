package unicamp.ic.mc322.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;


public class Util {
	static ArrayList<Integer> ids = new ArrayList<Integer>();
	
	static boolean validadoresAtivos = true;
	
	static public interface Funcao {
		void executar();
	}
	
	static public LocalDate parseLocalDate(String data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return LocalDate.parse(data, formatter);
	}
	
	// Torna ids unicos agora
	static public int criarId() {
    	Random random = new Random();
    	Integer valor;
    	do {
    		valor = random.nextInt(10000);    		
    	}while(ids.contains(valor));
    	Util.ids.add(valor);
		return valor;
    }
}
