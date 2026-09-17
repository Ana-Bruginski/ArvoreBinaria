import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class ArvoreBinaria{

    class No{
        int dado;
        No esquerda;
        No direita;

        No(int elemento){
            this.dado = elemento;
            this.esquerda = null;
            this.direita = null;
        }
    }

    No raiz = null;

    public void insereElemento(int elemento){
        No novoNo = new No(elemento);
        No atual = raiz;

        if (raiz == null){
            raiz = novoNo;
            System.out.println("Inserido: " + elemento);
        } else{
            while(true){
                if (elemento < atual.dado){
                    if (atual.esquerda == null){
                        atual.esquerda = novoNo;
                        System.out.println("Inserido: " + elemento);
                        return;
                    }
                    atual = atual.esquerda;
                } else{
                    if (atual.direita == null){
                        atual.direita = novoNo;
                        System.out.println("Inserido: " + elemento);
                        return;
                    }
                    atual = atual.direita;
                }
            }
        }
    }

    public void removeElemento(int elemento){

    }

    public void buscaElemento(int elemento){

    }

    public void exibeArvore(){
        No atual = raiz;
    }

    public static void main(String[] args){
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.insereElemento(50);
        arvore.insereElemento(30);
        arvore.insereElemento(70);
        arvore.insereElemento(20);
        arvore.insereElemento(40);
        arvore.insereElemento(35);
    }
}