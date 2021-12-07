public class q180a {
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

     /**
      * @param str = palavra sendo testada
      * @param s = posicao da esquerda
      * @param e = posicao da direita
      * @return = se a palavra e um palindromo ou nao
      */
      
    static boolean checagem(String str,int esquerda, int direita)
    {
        // checa se possui apenas uma letra,numero,simbolo
        if (esquerda == direita)
            return true;
 
        //caso a posicao da esquerda(s) e a da direita(e) nao sejam iguais retorna como falso
        if ((str.charAt(esquerda)) != (str.charAt(direita)))
            return false;
 
        // caso possua mais que duas letras testa novamente nas outras posicoes
        if (esquerda < direita + 1)
            return checagem(str, esquerda + 1, direita - 1);
 
        return true;
    }
 
    static boolean ePalindromo(String str)
    {
        int tamanho = str.length();
 
        // checa se a string esta vazia poia uma String vazia e um palindromo
        if (tamanho == 0)
            return true;
 
        return checagem(str, 0, tamanho - 1);
    }
    public static void main(String[] args) {
        
        String palavra = "";
        palavra = MyIO.readLine();
        int i = (palavra.length()-1);
       
        while(isFim(palavra)==false){
       
            
            if (ePalindromo(palavra)) 
            {
                MyIO.println("SIM");
            
            } else {
            
                MyIO.println("NAO");
            
            }

            palavra = MyIO.readLine();
        }

    }
}
