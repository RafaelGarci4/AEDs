public class q219a {
    
    public static void main(String[] args) {
        
        MyIO.print("Entre com o tamanho : ");
        int n = MyIO.readInt();
        int array[] = new int[n];


        for(int i = 0;i < n; i++){

            MyIO.print("Entre com um numero : ");
            array[i] = MyIO.readInt();

        }

        int j = n-1;

        for(int i = 0; i < n; i++){

            MyIO.println("A soma da posicao "+i+" com "+(j)+" e: "+(array[i]+array[j]));
            j--;
        }
    }
}
