package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j12_ejermetodos2 {

	public static boolean bisiesto(int a){

        if ((a%4==0 && a%100!=0)||(a%400==0)) return true;
        return false;
    }

    /*****************************************************************************/
    public static int ndias (int a, int m){
        int diames=30;
       switch (m){
           case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               diames = 31;
               break;
           case 2:
               diames = bisiesto(a)? 29 : 28;
               break;
           default: if (m > 12 || m < 1) {System.out.println("Mes incorrecto.");}
       }
       return diames;
    }

    /*****************************************************************************/

    public static void main(String[] args) throws IOException {

        BufferedReader lector;
        InputStreamReader stream;

        stream = new InputStreamReader(System.in);
        lector = new BufferedReader(stream);

        System.out.println("Introduzca el año");
        int anno = Integer.valueOf(lector.readLine());

        System.out.println("Introduzca el mes");
        int mes = Integer.valueOf(lector.readLine());

        System.out.println("Numero de dias: "+ndias(anno,mes));

    }
}
