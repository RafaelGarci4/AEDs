public class arrayNmedia {
    
    public static double media(int array[], int n){

        int mediaArray = 0;
        int soma =0;
        double resp = 0;
        for(int i =0; i < n ; i++){

            soma += array[i];
            
        }

        resp = (soma/n);

        return resp;
    } 

    public static void main(String[] args) {
        
        MyIO.print("Tamanho do array : ");
       int tamanhoArray =  MyIO.readInt();
        int array[] = new int[tamanhoArray];
        double mediaArray = 0;

        for(int i  = 0; i < tamanhoArray; i++){

            array[i] = MyIO.readInt();
        }

       mediaArray  = media(array,tamanhoArray);

        for(int i = 0; i < tamanhoArray; i++){

            if(array[i] > mediaArray){
                MyIO.println("O valor "+array[i]+" contido na posicao "+i+" e maior que a media "+mediaArray);
            }
        }
    }
}
