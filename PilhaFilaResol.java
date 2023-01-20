package pilhafilaresol;

import java.util.Scanner;


/*
* Turma: 2 MD
* Aluno: Pedro Ricardo Da Silva Rodrigues
* Matrícula: 01565486
* Curso: Ciências da computação
*/

public class PilhaFilaResol {
    
    
    
    public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      int opc = 0;
       Pilhas p = new Pilhas(5);
       Fila f = new Fila();
        
        while (opc != 7){
            
            System.out.println("#### PILHA ####\n");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Listar Pilha");
            System.out.println("\n##############\n");
            System.out.println("\n#### FILA ####\n");
            System.out.println("4 - Incluir Fila");
            System.out.println("5 - Remover Fila");
            System.out.println("6 - Listar Fila");
            System.out.println("\n##############\n");
            System.out.println("7 - Sair");
            System.out.println("");
            System.out.print("Informe a opção desejada: ");
            opc = ler.nextInt();
            switch (opc){
                case 1:
                    //EMPILHAR
                    for(int i= p.topo; i <= p.pilhas.length - 1 ;i++){
                        if(p.topo==4){
                            System.out.println("\n A PILHA JÁ ESTÁ CHEIA \n");
                            break;
                        }
                        System.out.println(" ");
                        System.out.print("Digite um valor para empilhar: ");                        
                        String esc = ler.next(); 
                        p.empilhar(esc); 
                        System.out.println(" ");
                        System.out.println("Deseja inserir mais um valor? ");
                        System.out.println(" 1- SIM ou 2- NÃO ");
                        int continuar = ler.nextInt(); 
                        if (continuar==2){
                            break;
                        }
                    }
                    
                    break;
                case 2:
                    //DESEMPILHAR
                    
                    p.desempilhar(p.pilhas);
                    
                    break;
                case 3:
                    //LISTAR PILHA
                    p.exibePilha(p.pilhas);
                    
                    break;
                case 4:
                    //INCLUIR FILA
                    
                    for(int i = f.topo; i <= f.elementos.length - 1 ; i++){
                        if(f.topo == 4){
                            System.out.println(" ");
                            System.out.println("\n A FILA JÁ ESTÁ CHEIA \n");
                            break;
                        } else {
                            System.out.print("Digite um valor para incluir na fila: ");
                            String esc = ler.next(); 
                            f.IncluirFila(esc); 
                            System.out.println("Deseja inserir mais um valor?"); 
                            System.out.println(" 1 - SIM ou 2 - NÃO ");

                            int continuar = ler.nextInt(); 
                            if (continuar==2){
                                break;
                            }
                        }
                    }
                    
                    break;
                case 5:
                    //EXCLUIR FILA
                    f.ExcluirFila();
                    break;
                case 6:
                    //LISTAR FILA
                    f.ListarFila(f.elementos);
                    
                    break;
                case 7:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }      
    }
    }   
}
