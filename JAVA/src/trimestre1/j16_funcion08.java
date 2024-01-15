package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j16_funcion08 {
	
	public static int convertirASegundos(int horas, int minutos) {
		
		
        int segundosHoras = horas * 3600;
        int segundosMinutos = minutos * 60;
        int totalSegundos = segundosHoras + segundosMinutos;
        
        System.out.println(horas+":"+minutos+" horas son "+totalSegundos+" segundos");
        return totalSegundos;
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);
		
		System.out.println("dime las horas y los minutos que quieras pasara a segundos");
		
		System.out.print("horas: ");
		int horas = Integer.parseInt(lector.readLine());
		System.out.print("minutos: ");
		int minutos = Integer.parseInt(lector.readLine());
		
		convertirASegundos(horas, minutos);
		
	

	}

}
