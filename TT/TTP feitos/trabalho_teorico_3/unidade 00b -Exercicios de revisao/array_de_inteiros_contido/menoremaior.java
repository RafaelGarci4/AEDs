class menoremaior{


/**
 * 
 * @param array = array de numeros inteiros para fazer a comparacao
 * @param tamanho = tamanho do array 
 */
 public static void maiorEMenor(int array[], int tamanho){ // funcao para saber o maior e o menor inteiro contido dentro do array 

 

 int maior = array[0]; //declaramos maior como a posicao inicial para ultilizarmo eles nas condicionais 
 int menor = array[0]; //declaramos menor como a posicao inicial para ultilizarmo eles nas condicionais


     for(int i =0; i<tamanho;i++){ // percorremos todo o tamanho do array 

        if(array[i] > maior){ //se array na posicao i for maior que o valor contido em maior...

            maior = array[i]; //...maior ira receber esse valor

        }

        if(array[i] < menor){ //se array na posicao i for menor que o valor contido em menor...

            menor = array[i]; //...menor ira receber esse valor

        }
    
    }

    MyIO.print("Maior: ");
    MyIO.println(maior); // mostrar o maior numero contido no array 

    MyIO.print("Menor: ");
    MyIO.println(menor); // mostrar o menor numero contido no array 

}


public static void main(String[] args) {
    
    int tamanho = 0; //declarada a variavel que ira receber o tamanho do array
    
    MyIO.print("Tamanho do Array : ");
    tamanho = MyIO.readInt(); // operacao para definir o tamanho do Array
    
    int array[]  =  new int[tamanho] ; // declarada a variavel que estara contida os valores do array com o tamanho escolhido
    
    
    for(int i = 0; i<tamanho; i++){ // percorre o array da sua posicao inicial ate o tamanho escolhido...

        MyIO.print("Digite um numero : ");
        array[i] = MyIO.readInt(); // ...atribuindo os valores inteiros nas suas respectivas posicoes 

    }
    

    maiorEMenor(array, tamanho); // chamada da funcao com o array ja estabelecido e o tamanho do mesmo 


}



}