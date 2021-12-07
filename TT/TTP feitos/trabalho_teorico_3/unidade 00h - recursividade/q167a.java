public class q167a {
 
    
    public static int multiplicacaoPorSoma(int n1, int n2){

        int resp = 0;

        resp =  multiplicacaoPorSoma2(n1, n2, 0,0);


        return resp;
    }

  
  
    public static int multiplicacaoPorSoma2(int n1, int n2, int i,int resp){

       

        if(i < n2){

        
        resp =  multiplicacaoPorSoma2(n1, n2, i+1,resp += n1);


        }


        return resp;
    }

    
    
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        
        MyIO.print("Entre com o n1 : ");
        n1 = MyIO.readInt();
        MyIO.print("Entre com o n2 : ");
        n2 = MyIO.readInt();
        MyIO.println("multiplicacao por soma = "+multiplicacaoPorSoma(n1, n2));
    }
}
