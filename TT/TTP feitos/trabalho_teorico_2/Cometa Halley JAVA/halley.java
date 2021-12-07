//PRONTA
class halley {

    public static void main(String[] args) {
       
        int anoImput = 0; // declarada a variavel que receber o pub
        anoImput = MyIO.readInt(); // ler a primeira linha do pub para inicial o while de maneira TRUE
        int anoEntrada = 2020; // ano que ira servir para calcula o paramentro no somatorio 
       
        while (anoImput != 0) { // Enquanto o ano do imput for diferente de 0 (corresponte o final do pub) executar o seguinte...
       
            int anoParam = (76 - (anoEntrada - 1986)) + anoEntrada; // anoParam = ( 76 - (menor ano da lista - ultima aparicao) + menor ano da lista)
       
            while (anoParam <= anoImput) { // enquanto 2062 < que o ano do imput 
       
                anoParam = anoParam + 76; // 2062 = 2062 + 76

            }
       
            MyIO.println(anoParam); // aparicao mais proxima
            anoImput = MyIO.readInt(); // receber a proxima entrada ate receber um 0 que indicara FALSE
        }
       
    }

}