package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j12_ejermetodos3 {

	public static double suma (double a, double b){
            return a + b;
    }
    public static double resta (double a, double b){
            return a - b;
    }
    public static double multi (double a, double b){        
            return a * b;
    }
    public static double div (double a, double b){  
            return a / b;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader lector;
        InputStreamReader stream;

        stream = new InputStreamReader(System.in);
        lector = new BufferedReader(stream);

        System.out.println("Dame un numero");
        double n1 = Double.parseDouble(lector.readLine());
        System.out.println("Dame otro numero");
        double n2 = Double.parseDouble(lector.readLine());

        System.out.println(suma(n1,n2));
        System.out.println(resta(n1,n2));
        System.out.println(multi(n1,n2));
        System.out.println(div(n1,n2));

        System.out.printf("%.2f + %.2f =%10.2f\n ",n1,n2,suma(n1,n2));
        System.out.printf("%.2f - %.2f =%10.2f\n ",n1,n2,resta(n1,n2));
        System.out.printf("%.2f * %.2f =%10.2f\n ",n1,n2,multi(n1,n2));
        System.out.printf("%.2f / %.2f =%10.2f\n ",n1,n2,div(n1,n2));
    }
}
