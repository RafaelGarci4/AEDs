class palindromo {

    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static String inverterPalavra(String palavra) {

        //int resp = 0;

        String reverso = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {

            reverso += palavra.charAt(i);
            // MyIO.println(reverso);

        }

        return reverso;
    }

    public static boolean compararPalavras(String palavra, String reverso) {

        boolean resp = true;
        for (int i = 0; i < palavra.length(); i++) {

            if (palavra.charAt(i) != reverso.charAt(i)) {
                resp = false;

            }
        }

        return resp;
    }

    public static void main(String[] args) {

        String palavra = "";
        String reverso = "";

        palavra = MyIO.readLine();
        while(isFim(palavra)==false){
            reverso = inverterPalavra(palavra);
            
            if (compararPalavras(palavra, reverso)) 
            {
                MyIO.println("SIM");
            
            } else {
            
                MyIO.println("NAO");
            
            }

            palavra = MyIO.readLine();
        }

    }

}