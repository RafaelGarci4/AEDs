class appCalorias{

    public static int comparar (int[] numeros){
        int resp  =0;
        //TESTE 1
        if(numeros[0] >= numeros[1]){
            if((numeros[0] - numeros[1]) <= numeros[3]){
                resp = numeros[1];
            }
        }

        if(numeros[1] >= numeros[0]){
            if((numeros[1] - numeros[0]) <= numeros[3]){
                resp = numeros[1];
            }
        }
        //TESTE 2
        if(numeros[0] >= numeros[1]){
            if((numeros[0] - numeros[1]) >= numeros[3]){
                resp = numeros[2];
            }
        }

        if(numeros[1] >= numeros[0]){
            if((numeros[1] - numeros[0]) >= numeros[3]){
                resp = numeros[2];
            }
        }

    
        return resp;
    }




    public static void main(String[] args) {
        int[] numeros = new int[4];
        int resp = 0;
       numeros[0]= MyIO.readInt();

       numeros[1]= MyIO.readInt();

       numeros[2]= MyIO.readInt();

       numeros[3]= MyIO.readInt();


       resp = comparar(numeros);
        MyIO.println(resp);
    }
}