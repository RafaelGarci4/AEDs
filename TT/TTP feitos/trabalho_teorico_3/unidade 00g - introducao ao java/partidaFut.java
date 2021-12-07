import java.util.Scanner;

public class partidaFut {
    


    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
    String mandante = "";
    int golsM = 0;
    String visitante = "";
    int golsV = 0;
    
    System.out.print("Qual o nome do mandante ? : ");
    mandante = scan.nextLine();
    System.out.print("Qual o nome do visitante ? : ");
    visitante = scan.nextLine();
    
    System.out.print("Quantos gols o "+mandante+" marcou ? : ");
    golsM = scan.nextInt();
    System.out.print("Quantos gols o "+visitante+" marcou ? : ");
    golsV = scan.nextInt();


    if(golsM > golsV){
     
        System.out.print("Quem ganhou foi "+mandante+" com "+golsM+" marcados !");
    
    }else if(golsV > golsM){

        System.out.print("Quem ganhou foi "+visitante+" com "+golsV+" marcados !");

    }else{

        System.out.println("O jogo resultou em empate !!!");
    }

    }

}
