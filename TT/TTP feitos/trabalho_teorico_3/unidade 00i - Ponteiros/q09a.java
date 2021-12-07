public class q09a {
    public static void passagemDeTipoPrimitivo(int a){
        MyIO.println("a: "+ a);
        a = 10;
        MyIO.println("a: "+ a);
        }
        public static void main(String[] args) {
        int x = 5;
        MyIO.println("x: "+ x);
        passagemDeTipoPrimitivo(x);
        MyIO.println("x: "+ x);
        }
}
