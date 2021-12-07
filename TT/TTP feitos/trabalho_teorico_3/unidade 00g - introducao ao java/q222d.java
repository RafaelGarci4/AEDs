public class q222d {
    
    public static void main(String[] args) {
        int lin = 0;
        int col = 0;
       
        MyIO.print("Numero de linhas : ");
       lin =  MyIO.readInt();
       MyIO.print("Numero de colunas : ");
       col =  MyIO.readInt();

       int matrix[][] = new int[lin][col];
        double array[] = new double[lin];
       
       for(int i = 0; i < lin; i++){
           
           for(int j = 0;j < col;j++ ){
               
              matrix[i][j] = MyIO.readInt();


            }
        }

        for(int j = 0; j < col; j++){
           
            for(int i = 0;i < lin;i++ ){
                
               array[i] += matrix[i][j] ;
 
 
             }
         }


         for(int i = 0; i < col; i++){

            MyIO.println("Media : "+(array[i]/col));

         }

    }
}
