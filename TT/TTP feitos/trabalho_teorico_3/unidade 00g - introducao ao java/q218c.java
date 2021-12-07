public class q218c {
    



    public static void main(String[] args) {
        int countPar = 0;
        int countImp = 0;
        MyIO.print("Entre com o tamanho : ");
        int n = MyIO.readInt();
        int array[] = new int[n];


        for(int i = 0;i < n; i++){

            MyIO.print("Entre com um numero : ");
            array[i] = MyIO.readInt();

        }

        for(int i = 0; i < n ; i++){

            if(array[i]%2 == 0){
                 countPar++;
            }

            if(array[i]%3 == 0){
                countImp++;
            }
        }
        
        MyIO.println("O numero de pares dentro do array e : "+countPar);
        
        MyIO.println("O numero de divisiveis por 3 dentro do array e : "+countImp);
    }
}
