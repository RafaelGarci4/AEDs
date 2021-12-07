public class q220a {

    

    public static void main(String[] args) {
        
         
        MyIO.print("Entre com o tamanho : ");
        int n = MyIO.readInt();
        int soma = 0;
        int array[] = new int[n];
        int array2[] = new int[n];

        for(int i = 0;i < n; i++){

            MyIO.print("Entre com um numero do array A : ");
            array[i] = MyIO.readInt();

            MyIO.print("Entre com um numero do array B : ");
            array2[i] = MyIO.readInt();

        }
        
        for(int i = 0;i < n; i++){


            
                MyIO.println("A : "+array[i]);
          
                MyIO.println("B : "+array2[i]);
            

        }
        
    }
}
