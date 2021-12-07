public class q216a {



    public static int menorElemento(int array[], int tamanho){

        int menor = array[0];
        int i = 0;

        for( i = 0;i<tamanho;i++){

                if(menor > array[i]){
                    menor = array[i];
                }
        
            }
        
        i=0;
        while(menor != array[i]){


            i++;

        }
        
        MyIO.println("O menor array valor do array esta na posicao : "+i);

        return menor;
    }

    public static void main(String[] args) {
        
        MyIO.print("Tamanho do array :");
        int tamanho =  MyIO.readInt();
        int array[] = new int[tamanho];
    
        for(int i = 0 ; i < tamanho; i++){

            MyIO.print("valor da posicao "+i+" :");
            array[i] = MyIO.readInt();

        }

        int menorNoArray = menorElemento(array, tamanho);

        
        
    
    }
}
