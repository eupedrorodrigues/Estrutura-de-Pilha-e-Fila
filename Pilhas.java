package pilhafilaresol;

public class Pilhas {
    String pilhas[];
    int topo;
    
    
    public Pilhas (int tam){
        topo = -1; // a pilha está vazia na posição 1
        pilhas = new String[5];//5 posições
        
    }
    public boolean vazia() { // Irá identificar se está vazia a Pilha
        if (topo == -1){
            return true;
        }else{
            return false;
    }
}    
    public boolean cheia(){ // Irá identificar se está cheia a Pilha
        if(topo == 4){
            return true;
        }else{
            return false;
        }
    }
   
    public void empilhar(String valor){ //Empilha o vetor 
        if (cheia() == false){
            topo++;
            pilhas[topo] = valor;
        }else{
            System.out.println("\n Pilha cheia \n");
        }
    }
    
    public Object desempilhar(String vet[]){ //Desempilha o vetor 
        if (topo == -1){
            System.out.println("\n A pilha está vazia \n");
        }else{
            System.out.println("Você desempilhou o elemento da posição: " + topo);
            vet[topo] = null;
            topo--;
        }
        return null;
    }
     
    public void exibePilha(String vet[]){ //Listar a Pilha
     if (vazia()==true){
         System.out.println("Pilha Vazia");
     }else{
         for(int i = topo;i >= 0; i--){
             System.out.println("Elemento" + vet[i] + " posicao " + i);
         }
             
     }
    }
}
