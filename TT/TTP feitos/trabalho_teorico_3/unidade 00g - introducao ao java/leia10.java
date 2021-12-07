

public class leia10 {
    
    public static void maiorMenor(int array[]){
        int menor = array[0];
        int maior = array[1];
        
        for(int i = 0;i < 10;i++){

            if(array[i] > maior){
                maior = array[i]; 
            }

            if(array[i] < menor){
                menor = array[i];
            }

        }

        MyIO.println("O maior entre os 10 numeros : "+maior);
        MyIO.println("O menor entre os 10 numeros : "+menor);
    }



    public static void main(String[] args) {
        
        int array[] = new int[10];

        for(int i = 0; i < 10; i++){

            MyIO.print("Entre com o numero da posicao "+i+" : ");
            array[i] = MyIO.readInt();

        }

        maiorMenor(array);
    }
}
