public class q218a {
    



    public static void main(String[] args) {
        MyIO.print("valor de N :");
        int n = MyIO.readInt();
        int array[] = new int[n];

        for(int i = 0; i < n; i++){
            MyIO.print("entre com um numero :");
            array[i] = MyIO.readInt();
        }
    
        if(n%2 == 0){

            for(int i =0; i < n ; i++){

                MyIO.println("A soma do termo atual com o proximo e : "+(array[i]+array[i+1]));
                i = i +1;
            }

        }
    }
}
