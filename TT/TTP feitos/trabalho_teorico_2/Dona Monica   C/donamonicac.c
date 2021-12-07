#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>


    int maiorEntreDois(int n1,int n2,int n3){
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
   


int main (){

    int n0 = 0; // declarada a idade que ira recber o valor da Dona n0
    int n1 = 0;// declarada a idadae que ira receber o valor do primeiro filho mais novo
    int n2 = 0;// declarada a idade que ira receber o valor do segundo filho mais novo
    int n3 = 0;// declarada a variavel que ira vir a ser a idade do filho mais velho
    int maior = 0;
    scanf("%i",&n0);// ler idade da n0 inicialmete para dar inicio a repeticao;
   
    while (n0 != 0)// enquanto o o valor de n0 for diferente de 0 execute os metodos abaixo
    {
        scanf("%i",&n1);// ler idade da primeiro filho mais novo;
        scanf("%i",&n2);// ler idade da segundo filho mais novo;
        
        n3 = n0 - (n1 + n2);// a idade do filho mais velho e igual a idade de n0 - (a idade de n1 + n2)
        maior = maiorEntreDois(n1, n2, n3);
        printf("%i\n",maior);// mostrar na tela a idade do filho maisn velho;
        scanf("%i",&n0);// ler idade da n0 novamente para continuar o while;
        
    }
    
    return 0;
}