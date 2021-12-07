
class arquivocopia{
  
public static void main(String[] args) {
    

    Arq.openRead("original.txt");
    String palavra = "";
    
    
    while(Arq.hasNext() == true){
        palavra += Arq.readLine() +'\n';
    }

    Arq.close();
    Arq.openWrite("copia.txt");
    Arq.print(palavra);
    Arq.close();
    //System.out.println(palavra);
    //Arq.openWrite("copia.txt");
}



}