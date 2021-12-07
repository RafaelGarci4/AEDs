import java.util.Scanner;

import java.lang.Math;

public class raizCubica {
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    double n1 = 0.00;
    double n2 = 0.00;
    double resp1 = 0.00;
    double resp2 = 0.00;
    double maior = 0.00;
    double menor = 0.00;
        
    
        System.out.print("N1 : ");
        n1 = scan.nextDouble();
        System.out.print("N2 : ");
        n2 = scan.nextDouble();
       
        if(n1>n2){
            maior = n1;
            menor = n2;
        }else{
            maior = n2;
            menor = n1;

        }

    
        resp1 = Math.cbrt(menor);
        resp2 = Math.log10(maior);

        System.out.println("raiz cubica de "+menor+" e :"+resp1);

        System.out.println("Log10 de "+maior+" e :"+resp2);

    }
}
