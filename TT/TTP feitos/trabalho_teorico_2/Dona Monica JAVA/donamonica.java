
class donamonica {
    public static int maiorEntreDois(int n1,int n2,int n3){
        int maior = 0;

        
        if(n1 > n2 && n1 > n3){
            maior = n1;
        }
        if(n2 > n1 && n2 > n3){
            maior = n2;
        }
        if(n3 > n1 && n3 > n2){
            maior = n3;
        }




        return maior ; 
    }
    public static void main(String[] args) {

        int n0 = 0; // declarada a idade que ira recber o valor da Dona n0
        int n1 = 0; // declarada a idadae que ira receber o valor do primeiro filho mais novo
        int n2 = 0; // declarada a idade que ira receber o valor do segundo filho mais novo
        int n3 = 0; // declarada a variavel que ira vir a ser a idade do filho mais velho
        int maior = 0;
        n0 = MyIO.readInt();// ler idade da n0 inicialmete para dar inicio a repeticao;
       
        while (n0 != 0) { // enquanto o o valor de n0 for diferente de 0 execute os metodos abaixo

            n1 = MyIO.readInt();// ler idade da primeiro filho mais novo;
            n2 = MyIO.readInt();// ler idade da segundo filho mais novo;
            
            n3 = n0 - (n1 + n2); // a idade do filho mais velho e igual a idade de
                                                                 // maior - (a idade de n1 + filhoNovo2)
                                                                 maior = maiorEntreDois(n1, n2, n3);
            MyIO.println(maior); // mostrar na tela a idade do filho maisn velho;
            n0 = MyIO.readInt();// ler idade da n0 novamente para continuar o while;

        }

    }
}