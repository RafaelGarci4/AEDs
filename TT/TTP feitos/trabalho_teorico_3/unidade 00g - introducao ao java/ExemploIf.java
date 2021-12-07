import java.util.Scanner;
public class ExemploIf {
    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a nota do aluno:");
        int nota =  scan.nextInt();

        if(nota >= 80){
            System.out.println("Parabens, muito bom !");
        }else if(nota >=70 && nota < 80){
            System.out.println("Parabens, aprovado !");
        }else{
            System.out.println( "Infelizmente,reprovado");
        }
    }
}
