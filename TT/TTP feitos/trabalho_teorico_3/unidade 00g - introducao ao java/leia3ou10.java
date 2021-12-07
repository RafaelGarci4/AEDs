import java.lang.reflect.Array;
import java.util.Scanner;

public class leia3ou10 {
    

    public static void maioremenor(int array[], int tamanho){

        int maior = array[0];
        int menor = array[1];

        for(int i = 0; i < tamanho; i++){

                if(array[i] < menor){
                    menor = array[i];
                }

                if(array[i] > maior){
                    maior = array[i];
                }
        }

        System.out.println("Maior entre"+tamanho+" : "+maior+"\nMenor entre"+tamanho+" : "+menor);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho = 0;
        int numero = 0;
        System.out.println("10 ou 3");
        int teste = scan.nextInt();
        if(teste == 3){
            tamanho = 3;
        }else{
            tamanho = 10;
        }
        int array[] = new int[tamanho];

        for(int i  = 0; i < tamanho; i++){

            array[i] = scan.nextInt();
        }
    
        maioremenor(array, tamanho);
    }

}
