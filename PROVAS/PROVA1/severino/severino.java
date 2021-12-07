 public class severino {

    public static void organizar(int [] vetor, int n) {
        for (int i=0; i<(n-1); i++) {
            int menor = i;
            int aux;
            for (int j= (i+1); j<n; j++) {
                if (vetor[menor] > vetor[j]) {
                    menor = j;
                }
            }

            aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;

        }
    }

    public static void main(String[] args) {

        int quantidade = MyIO.readInt();
        int breakpoint = 0;
        
        while ( breakpoint < 2 ) {
            
            int x[] = new int[quantidade];
            
            for (int i=0; i<quantidade; i++) {
                x[i] = MyIO.readInt();
            }
            
            organizar(x, quantidade);
            
            for (int i=0; i<quantidade; i++) {
                
                System.out.println(String.format("%04d", x[i]));
            
            }
            breakpoint++;
            
            if (breakpoint == 2) {
                break;
            }
            quantidade = MyIO.readInt();
        }

    }
}