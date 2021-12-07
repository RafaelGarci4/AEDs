public class mediaDaSala {
   
    public static int media(int alunos[]){

        int mediaAlunos = 0;
        int soma =0;

        for(int i =0; i < 20 ; i++){

            soma += alunos[i];
            
        }

        mediaAlunos = (soma/20);

        return mediaAlunos;
    } 

    public static void main(String[] args) {
        int alunos[] = new int[20];
        int notaMax = 0;
        int mediaDaSala = 0;
        int countMenorQueMedia = 0;
        int countConceitoA = 0;
        
        MyIO.print("nota maxima : ");
        notaMax = MyIO.readInt();

        int nota60 = ((notaMax*60)/100);
        int nota90 = ((notaMax*90)/100);

        for(int i = 0; i < 20; i++){

            MyIO.print("Insira a nota do aluno "+i+" : ");
            alunos[i] = MyIO.readInt();
        }

            mediaDaSala = media(alunos);

        for(int i = 0; i < 20; i++){

            if(alunos[i] < nota60){
                countMenorQueMedia++;
            }

            if(alunos[i] > nota90){
                countConceitoA++;
            }

        }

        MyIO.println("A media da sala foi : "+mediaDaSala+"\nNumero de alunos abaixo da media : "+countMenorQueMedia+"\n Numero de alunos com conceito A : "+countConceitoA);
        

    }
}
