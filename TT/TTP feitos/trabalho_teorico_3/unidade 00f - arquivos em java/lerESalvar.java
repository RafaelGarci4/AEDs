public class lerESalvar {
    
    public static void main(String[] args) {
        
        String nomeArquivo = ""; // variavel que ira receber o nome do arquivo sem o ".txt"
        String frase = ""; // variavel que ira receber a frase a ser colocada dentro do arquivo 

        MyIO.print("Entre com o nome do arquivo :");
        nomeArquivo= MyIO.readLine(); // leitura do nome do arquivo 
        MyIO.print("Entre com a frase :");
        frase= MyIO.readLine(); // leitura da frase a ser colocada dentro do arquivo

        Arq.openWrite(nomeArquivo+".txt"); // coloca o ".txt" ao lado do nome e abre ou cria um arquivo com a String nomeArquivo
        Arq.println(frase); // printa a frase presente na variavel 
        Arq.close(); // fecha o arquivo |INDICADO PARA LEITURA E ESCRITA|
    }
}
