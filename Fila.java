
package pilhafilaresol;

public class Fila {

 String elementos[];
 int topo;
 
    public Fila(){
        elementos = new String[5]; // 5 posições
        topo = -1; //A pilha está vazia na posição -1
    }

    public void IncluirFila(String valor){
        if (topo == 4) {
            System.out.println("\n A FILA JÁ ESTÁ CHEIA \n"); 
        }
        topo++;
        if(elementos[topo] == null){ 
            elementos[topo] = valor; 
        }
    }

    public void ExcluirFila(){
        if (topo == -1) {
            System.out.println("\n A FILA ESTÁ VAZIA \n");
        } else {
            System.out.println(" Você tirou o elemento: " + elementos[0]);
            elementos[0] = null; 
            for(int i=0;i<elementos.length-1;i++){ 
                elementos[i]=elementos[i+1];
                elementos[i+1] = null; 
            }
            topo--;
        }
        
    }

    public void ListarFila(String fila[]){
        System.out.println("\n LISTANDO FILA \n");
        for (String string : fila) {
            System.out.println (string);
        }
        System.out.println("--------------------------");
    }
}
