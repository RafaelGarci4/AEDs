public class q221a {
    

    public static void main(String[] args) {
        int lin = 0;
        int col = 0;
       
        MyIO.print("Numero de linhas : ");
       lin =  MyIO.readInt();
       MyIO.print("Numero de colunas : ");
       col =  MyIO.readInt();

       int matrix[][] = new int[lin][col];

       
       for(int i = 0; i < lin; i++){
           
           for(int j = 0;j < col;j++ ){
               
              matrix[i][j] = MyIO.readInt();


            }
        }
        
        for(int i = 0; i < lin; i++){
            
            for(int j = 0;j < col;j++ ){
                
               MyIO.print(matrix[i][j] + " ");

            }
            MyIO.println(" ");
         }
          
    }
}
