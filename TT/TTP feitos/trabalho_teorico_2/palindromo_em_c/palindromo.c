#include <stdio.h>
#include <string.h>

void ler(char palavra[1000])
{
   char caractere;
   int i = 0;
  
   do
   {
        caractere = getchar();
        palavra[i] = caractere;
        ++i;
   } while(caractere != '\n');
   palavra[i-1]= '\0';
}


int eFim(char palavra[]){

int resp = 0;
    if (palavra[0] == 'F' && palavra[1] == 'I' && palavra[2] == 'M' && strlen(palavra)==3)
    {
        resp = 1;
    }
    
    return resp;
}


/*  FUNCAO PARA CHECAR SE E PALINDROMO 
 *  @param (palavra a ser checada)
 *   
 *
*/
void isPalindrome(char str[])
{
    // comecar da esquerda e da direita
    int l = 0;
    int h = strlen(str) - 1;
 
    // comparar
    while (h > l)
    {
        if (str[l++] != str[h--])
        {
            printf("NAO\n");
            return;
        }
    }
    printf("SIM\n");
}
 
//main
int main()
{

    char palavra[1000];
    
    ler(palavra);
    
    while (eFim(palavra) == 0)
    {
        isPalindrome(palavra);
        ler(palavra);
       
    }
    
    
    
    /*
    
    isPalindrome("abba");
    isPalindrome("abbccbba");
    isPalindrome("ana");
    isPalindrome("rafael");
    isPalindrome("a a");
    isPalindrome("a'a");
    isPalindrome("@!@");
    */
    
    return 0;
}