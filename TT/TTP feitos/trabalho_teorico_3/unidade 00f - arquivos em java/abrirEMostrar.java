public class abrirEMostrar {
    //Rafael Ferreira Garcia Almeida - 712841

    public static void main(String[] args) {
        String nomeArquivo = ""; //variavel que ira receber o nome do arquivo sem o ".txt"
        String frase = ""; // variavel que ira receber a frase contida no "nomeArquivo".txt


        MyIO.println("Nome do arquivo :");
        nomeArquivo = MyIO.readLine(); //leitura do nome do arquivo sem o .txt
        
        Arq.openRead(nomeArquivo+".txt");//procura ou criacao do arquivo de nome desejado 
        frase = Arq.readLine(); // atribuicao do conteudo do arquivo a variavel 
        Arq.close(); // fechar o arquivo |INDICADO PARA ESCRITA E LEITURA|
        
        MyIO.println("As frases contidas no "+nomeArquivo+".txt sao :"); 
        MyIO.println(frase); // mostrar na tela o conteudo do arquivo
    }

}
