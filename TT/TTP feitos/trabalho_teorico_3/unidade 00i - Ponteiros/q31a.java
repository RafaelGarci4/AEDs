/** 
public class q31a {
    class Ponteiro04Objeto {
        public static void main (String[] args){
        Cliente c1 = null, c2 = null, c3 = null;
        escrever("ADDRs:\nc1(" + c1 + ")\nc2(" + c2 + ")\nc3(" + c3 + ")");
        c1 = new Cliente(1, "aa");
        c2 = c1; c3 = new Cliente(2, "bb");
        escrever("ADDRs:\nc1(" + c1 + ")\nc2(" + c2 + ")\nc3(" + c3 + ")");
        c2.setCodigo(3);
        escrever(“ATRIBUTOs:”);
        escrever(“c1(” + c1.getCodigo() + “ / ” + c1.getNome() + “)”);
        escrever(“c2(” + c2.getCodigo() + “ / ” + c2.getNome() + “)”);
        escrever(“c3(” + c3.getCodigo() + “ / ” + c3.getNome() + “)”);
        }
        }
}
*/