public class q10a {
    public static void passagemDeArray(int[ ] b){
        for (int i = 0; i < 5; i++){
        b[i] *= 5;
        MyIO.println("b[" + i + "]: " + b[i]);
        }
        b = new int [5];
        for (int i = 0; i < 5; i++){
        b[i] = i;
        MyIO.println("b[" + i + "]: " + b[i]);
        }
        }

    public static void main(String[] args) {
        int [] y = new int [5];
        for (int i = 0; i < 5; i++){
        y[i] = i;
        MyIO.println("y[" + i + "]: " + y[i]);; // 0 - 5 || 0 - 5 
        }
        passagemDeArray(y);
        for (int i = 0; i < 5; i++){
        MyIO.println("y[" + i + "]:"  + y[i]);
        }
        }
}
