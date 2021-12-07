class arrayinteiros{

/** 
 * @param array = Conjunto de inteiros pre atribuidos
 * @param tamanho = tamanho do array 
 * @param busca = numero a ser procurado 
 * @return resp = valor booleano para se um valor esta contido ou nao no array 
 */

 public static boolean estaOuNao(int array[], int tamanho, int busca){ // funcao para saber se um numero esta contido em um array 

 boolean resp = false;   // inicialmente declaramos o valor boleano como falso 

    for(int i =0; i<tamanho;i++){ // percorremos todo o tamanho do array 

        if(array[i] == busca){ // caso algum valor em sua devida posicao seja de valor igual ao da busca... 

            resp = true; // ...definimos como verdadeiro o valor booleano 

        }

    }


 return resp; // retornar o resultado
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
    

    MyIO.print("Numero a procurar : ");
   
   
    int busca = MyIO.readInt(); // declarada e atribuida a variavel destinada ao numero que sera procurado dentro do array 
    
    if(estaOuNao(array, tamanho, busca)){ // caso esta dentro...

            MyIO.println("SIM"); // ...mostrar que esta 

    }else{

        MyIO.println("NAO"); // ...ou que nao esta 
    }
    


}



}