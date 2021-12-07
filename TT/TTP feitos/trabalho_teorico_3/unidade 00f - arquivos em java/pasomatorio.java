public class pasomatorio {
    

 public static int somatorio(int n, double a, double b){

    int resp = 0;

    for(int i = 0; i < n ; i++){
        resp += (a + (b*i));
       
    }

    return resp;
 }



    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        int n =0;


       n= MyIO.readInt();
       a = MyIO.readDouble();
       b = MyIO.readDouble();

        MyIO.println(somatorio(n, a, b));

    }
}
