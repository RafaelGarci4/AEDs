import java.util.Scanner;
public class leia2ints {
    


    public static void main(String[] args) {
    Scanner scan =  new Scanner(System.in);

    
    int n1 = 0;
    int n2 = 0;
    double resp = 0.00;
    int maior = 0;
    System.out.print("N1 : ");
    n1 = scan.nextInt();
    System.out.print("N2 : ");
    n2 = scan.nextInt();
    
    if(n1 > 45 || n2 > 45){
        resp = (n1 + n2);
        System.out.println(resp);
    }else if(n1 > 20 && n2 > 20){
        
        if(n1>n2){
        maior = n1;
        resp = maior - n2;
        System.out.println(resp);
        }else{
            maior = n2;
            resp = maior - n1;
            System.out.println(resp);
        }

        
    
    }else if((n1 < 10 && n2 != 0) || (n2 < 10 && n1 != 0)  ){
        resp = n1/n2;
        System.out.println(resp);
    }else{
        System.out.println("Rafael Ferreira Garcia Almeida");
    }


}


}
