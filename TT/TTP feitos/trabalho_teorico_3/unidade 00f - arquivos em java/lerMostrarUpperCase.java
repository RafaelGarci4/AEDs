public class lerMostrarUpperCase {
   
    

    public static void main(String[] args) {
        String nomeArquivo = "";
        String conteudo = "";

        MyIO.println("Nome do arquivo a ser lido :");
         nomeArquivo = MyIO.readLine()+".txt";
         
         Arq.openRead(nomeArquivo);

        conteudo = Arq.readAll();

        Arq.close();
        MyIO.println("O conteudo do arquivo "+nomeArquivo+" em upper case e :");
        MyIO.println(conteudo.toUpperCase());

    
    }
}
