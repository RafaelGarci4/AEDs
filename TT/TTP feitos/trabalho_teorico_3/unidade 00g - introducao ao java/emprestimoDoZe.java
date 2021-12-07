import java.util.Scanner;

public class emprestimoDoZe {
    


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double  salario = 0.00;
        double emprestimoP = 0.00;
        double emprestimoR = 0.00;
        double prestacaoP = 0.00;
        double prestacaoR = 0.00;

        System.out.println("Qual seu salario ?");
        salario = scan.nextDouble();
        System.out.println("qual o valor da prestacao ?");
        emprestimoP = scan.nextDouble();


    
        prestacaoR = ((salario*40)/100);
    
        if(emprestimoP == prestacaoR){

            System.out.println("Sim sera concedida !");


        }else{


            System.out.println("Nao sera concedida !");

        }
    }

}
