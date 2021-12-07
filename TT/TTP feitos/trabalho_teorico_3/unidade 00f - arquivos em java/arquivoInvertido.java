public class arquivoInvertido {
    // Rafael Ferreira Garcia ALmeida  - 712841



    /**
     * 
     * @param conteudo = uma string contendo o conteudo do arquivo
     * @return = o conteudo invertido
     */
    public static String invertido(String conteudo){
       
        String reverso = ""; // variavel que ira recever o conteudo invertido

        for (int i = conteudo.length() - 1; i >= 0; i--) { //comecando de do ultimo caractere ate que nao tenham mais...

            reverso += conteudo.charAt(i);//... reverso recebe o caracter da posicao "i" do conteudo
         
        }

        return reverso; // retorna o conteudo invertido
    }

    /**
     * 
     * @param nomeArquivo = nome do arquivo que ira ter seu conteudo lido
     * @return conteudo do arquivo
     */
    
     public static String leituraEAtribuicao(String nomeArquivo){

        String conteudo = ""; // variavel que ira receber o conteudo do arquivo 
       
        Arq.openRead(nomeArquivo); // abrir o arquivo em modo de leitura
        conteudo = Arq.readAll(); // ler o conteudo do arquivo 
        Arq.close(); // fechar o arquivo |RECOMENDADO PARA ESCRITA E LEITURA|
       
        return conteudo; // retornar o conteudo do arquivo 
        
        
    }

    /**
     * 
     * @param conteudoA = conteudo do arquivo A
     * @param arquivoB = nome do arquivo B que ira receber ambos os conteudos
     * @param conteudoB = conteudo do arquivo B
     */
   
     public static void aParaOb(String conteudoA, String arquivoB, String conteudoB ){

        Arq.openWrite(arquivoB); // abrir o arquivo B em modo de escrita

        Arq.println(conteudoB); // escrever o conteudo que ja estava contido dentro dele em maiusculo
        Arq.println(conteudoA); // escrever o conteudo que estava presente no arquivo A em maiusculo

        Arq.close(); // fechar o arquivo |RECOMENDADO PARA ESCRITA E LEITURA|
    }

    public static void main(String[] args) {
        String arquivoA = ""; // variavel que ira conter o nome do arquivo A
        String arquivoB = ""; //  variavel que ira conter o nome do arquivo B 
        String conteudoA = ""; // variavel que ira conter o conteudo do arquivo A
        String conteudoB = ""; // variavel que ira conter o conteudo do arquivo B
        String conteudoAinvertido = "";
        String conteudoBinvertido = "";
       MyIO.println("Nome do arquivo A :");
       arquivoA =  MyIO.readLine()+".txt"; // imput do nome do arquivo A
       MyIO.println("Nome do arquivo B :");
       arquivoB =  MyIO.readLine()+".txt"; // imput do nome do arquivo B

       conteudoA = leituraEAtribuicao(arquivoA); // chamada para receber o conteudo do arquivo o qual o nome foi entregue como paramentro no caso conteudo A
       conteudoB = leituraEAtribuicao(arquivoB); // chamada para receber o conteudo do arquivo o qual o nome foi entregue como paramentro no caso conteudo B
       conteudoAinvertido =  invertido(conteudoA);
       conteudoBinvertido =  invertido(conteudoB);
      
       aParaOb(conteudoAinvertido, arquivoB,conteudoBinvertido); // chamada para copiar o conteudo de A e de B invertido dentro do arquivo B 
    }
}

/** RESUMO :
O programa funciona recebendo primeiramente nomes de arquivos e adicionando o ".txt" logo apos isso ele recebe o conteudo deles e envia para a funcao "invertido" para que
seus caracteres tenham suas posicoes trocadas. Apos isso envia para "aParaOb" e primeiramente printando todo o conteudo de B e depois o de A 
para que nao seja perdido o arquivo previamente contido em B
 * 
 */