public class q219b {
    

    public static void main(String[] args) {
        
        MyIO.print("Entre com o tamanho : ");
        int n = MyIO.readInt();
        int soma = 0;
        int array[] = new int[n];


        for(int i = 0;i < n; i++){

            MyIO.print("Entre com um numero : ");
            array[i] = MyIO.readInt();

        }


        for(int i = 0;i < n; i++){

         if(array[i]%3 == 0){

            soma = soma + array[i];
         }

        }
        MyIO.println("A soma dos numeros divididos por 3 e : "+soma);
    }
}
