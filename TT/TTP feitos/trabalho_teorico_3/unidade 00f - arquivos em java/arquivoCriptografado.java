public class arquivoCriptografado{
    // Rafael Ferreira Garcia ALmeida  - 712841

    /**
     * 
     * @param palavra = conteudo do arquivo 
     * @return = conteudo criptografado K3
     */
    public static String criptografar(String palavra){
        String criptografago = ""; // variavel que ira receber o conteudo criptografado
   
        for (int i = 0; i < palavra.length(); i++){ // ir ate o total do conteudo 
            
            criptografago += (char)(palavra.charAt(i)+3); // criptografado recebe um caractere do conteudo original porem adicionado +3 de valor da tabela ASCII

        }
    
        return criptografago; // retorna o conteudo criptografado
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
  
    public static void main(String[] args) {
        String arquivoA = ""; // variavel que ira conter o nome do arquivo A
        String conteudoA = ""; // variavel que ira conter o conteudo do arquivo A
        String conteudoCriptografado = "";
       MyIO.println("Nome do arquivo A :");
       arquivoA =  MyIO.readLine()+".txt"; // imput do nome do arquivo A

       conteudoA = leituraEAtribuicao(arquivoA); // chamada para receber o conteudo do arquivo o qual o nome foi entregue como paramentro no caso conteudo A

       conteudoCriptografado = criptografar(conteudoA);
       MyIO.println(conteudoCriptografado);
      
    }
}

/** RESUMO :
O programa funciona recebendo primeiramente nomes de arquivos e adicionando o ".txt" logo apos isso ele recebe o conteudo deles e envia para a funcao "criptografar" para que
seus caracteres tenham +3 de valor adicionado na tabela ASCII. Apos isso mostra na tela.
 * 
 */