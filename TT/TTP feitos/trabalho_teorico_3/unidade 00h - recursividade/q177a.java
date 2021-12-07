public class q177a {

     public  static int maior(int vet[], int n) {
        return maior2(vet, n, 0);
    }

     public static  int maior2(int vet[], int n, int i) {
        int resp;
        if (i == n - 1) {
            resp = vet[n - 1];
        } else {
            resp = maior2(vet, n, i + 1);
            if (resp < vet[i]) {
                resp = vet[i];
            }
        }
        return resp;
    }

    public static void main(String[] args) {

        int n  = 0;

        MyIO.print("tamanho do array : ");
        n =  MyIO.readInt();

        int array[] = new int[n];

        for(int i  = 0; i <  n ;i++){
            array[i] = MyIO.readInt();
        }

        MyIO.println(maior(array,n));
    }
}
