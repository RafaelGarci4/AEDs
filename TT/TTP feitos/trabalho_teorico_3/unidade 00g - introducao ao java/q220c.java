public class q220c {
    

    public static void main(String[] args) {
        int array[] = new int[5];


        for(int x = 0; x < array.length; x++){
            array[x] = MyIO.readInt();
        }

        for(int i = 0; i < array.length;i++){
            for(int j = i+1 ; j < array.length; j++){


                int temporario = 0;

                if(array[i] > array[j]){

                    temporario = array[i];
                    array[i] = array[j];
                    array[j] = temporario; 
                }
            }

            MyIO.println("array organizado : "+array[i]);
        }
    }

}
