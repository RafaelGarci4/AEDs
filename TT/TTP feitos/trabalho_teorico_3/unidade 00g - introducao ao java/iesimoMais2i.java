public class iesimoMais2i {
    



    public static void main(String[] args) {
        

        MyIO.print("Tamanho do array : ");
        int tamanhoArray =  MyIO.readInt();
        int array[] = new int[tamanhoArray];
        double mediaArray = 0;

        for(int i  = 0; i < tamanhoArray; i++){

            array[i] = MyIO.readInt();
        }

        for(int i = 0; (2*i+1) < tamanhoArray;i++){
            MyIO.println("A soma do termo "+i+"("+array[i]+")"+" com o termo "+(2*i+1)+"("+array[2*i+1]+")"+" e "+(array[i]+array[2*i+1]));
        }
    }
}
