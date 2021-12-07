import java.util.Scanner;


public class triangulo {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Entre com o lado A do triangulo :");
        double ladoA =  scan.nextDouble();
        System.out.print("Entre com o lado B do triangulo :");
        double ladoB =  scan.nextDouble();
        System.out.print("Entre com o lado C do triangulo :");
        double ladoC =  scan.nextDouble();


        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("O triangulo e equilatero");
        }else if((ladoA == ladoB && ladoA != ladoC) || (ladoB == ladoC && ladoB != ladoA) || (ladoC == ladoA && ladoC != ladoB)){
            System.out.println("O triangulo e isoseles");
        }else{
            System.out.println("O triangulo e escaleno" );
        }
    }
}
