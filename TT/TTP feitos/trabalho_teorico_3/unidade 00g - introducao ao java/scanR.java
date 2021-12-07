import java.util.Scanner;
class scanR {








public static void main(String[] args)throws Exception {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("String :");
    String str = scan.nextLine();
    System.out.print("Caractere :");
    char caractere = scan.next().charAt(0);
    System.out.print("Inteiro :");
    int inteiro = scan.nextInt();
    System.out.print("Real |SEPARADO POR VIRGULA !!!| :");
    double  real = scan.nextDouble(); // o problema esta aqui quando ele recebe um numero separado por um ponto //o problema se solucionou quando o numero esta separado por virgula 

   
    System.out.println("\nString :"+str+"\nCaractere :"+caractere+"\nInteiro :"+inteiro+"\nReal :"+real);
    scan.close();

}











}