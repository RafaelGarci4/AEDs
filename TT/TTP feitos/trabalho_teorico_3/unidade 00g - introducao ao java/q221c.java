public class q221c {
    
    public static void main(String[] args) {
        int lin = 0;
        int col = 0;
       
        MyIO.print("Numero de linhas : ");
       lin =  MyIO.readInt();
       MyIO.print("Numero de colunas : ");
       col =  MyIO.readInt();

       int matrix[][] = new int[lin][col];
       int matrix2[][] = new int[lin][col];
       
       for(int i = 0; i < lin; i++){
           
           for(int j = 0;j < col;j++ ){

              MyIO.print("A : ");
              matrix[i][j] = MyIO.readInt();
            
            }
        }

        for(int i = 0; i < lin; i++){
           
            for(int j = 0;j < col;j++ ){
 
               MyIO.print("B : ");
               matrix2[i][j] = MyIO.readInt();
             
             }
         }
      
        
         MyIO.println("Matriz A : ");
        for(int i = 0; i < lin; i++){
            
            for(int j = 0;j < col;j++ ){
                
               MyIO.print(matrix[i][j] + " ");

            }
            MyIO.println(" ");
         }
         MyIO.println("Matriz B : ");
         for(int i = 0; i < lin; i++){
            
            for(int j = 0;j < col;j++ ){
                
               MyIO.print(matrix2[i][j] + " ");

            }
            MyIO.println(" ");
         }

         MyIO.println("Soma das matrizes : ");
          
         for(int i = 0; i < lin; i++){
            
            for(int j = 0;j < col;j++ ){
                
               MyIO.print(matrix[i][j]+matrix2[i][j] + " ");

            }
            MyIO.println(" ");
         }
    }
}
