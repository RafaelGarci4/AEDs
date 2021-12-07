public class q220b {
    
    public static void main(String[] args) {
        
        int i = 0;
        MyIO.print("Entre com o tamanho de A: ");
        int n = MyIO.readInt();
        
        MyIO.print("Entre com o tamanho de M: ");
        int n2 = MyIO.readInt();
       
        int soma = 0;
        int array[] = new int[n];
        int array2[] = new int[n2];

        for( i = 0;i < n; i++){

            MyIO.print("Entre com um numero do array A : ");
            array[i] = MyIO.readInt();


        }


        for( i = 0;i < n2; i++){

            MyIO.print("Entre com um numero do array B : ");
            array2[i] = MyIO.readInt();

        }
        
      

        for( i = 0;i < n; i++){


            MyIO.println("A : "+array[i]);
          
            MyIO.println("M : "+array2[i]);
            
            

        }
        
    }
}
