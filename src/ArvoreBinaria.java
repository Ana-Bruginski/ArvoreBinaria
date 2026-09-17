public class ArvoreBinaria {

    class No {
        int dado;
        No esquerda;
        No direita;

        No(int elemento) {
            this.dado = elemento;
            this.esquerda = null;
            this.direita = null;
        }
    }

    No raiz = null;

    public void insereElemento(int elemento) {
        No novoNo = new No(elemento);
        No atual = raiz;

        if (raiz == null) {
            raiz = novoNo;
            System.out.println("Inserido: " + elemento);
        } else {
            while (true) {
                if (elemento < atual.dado) {
                    if (atual.esquerda == null) {
                        atual.esquerda = novoNo;
                        System.out.println("Inserido: " + elemento);
                        return;
                    }
                    atual = atual.esquerda;
                } else {
                    if (atual.direita == null) {
                        atual.direita = novoNo;
                        System.out.println("Inserido: " + elemento);
                        return;
                    }
                    atual = atual.direita;
                }
            }
        }
    }

    public void buscaElemento(int elemento) {
        No atual = raiz;

        while (atual != null) {
            if (elemento == atual.dado) {
                System.out.println("Encontrado: " + elemento);
                return;
            }
            if (elemento < atual.dado) {
                atual = atual.esquerda;
            } else {
                atual = atual.direita;
            }
        }
        System.out.println("Elemento nao encontrado: " + elemento);
    }

    public void removeElemento(int elemento) {
        No atual = raiz;
        No pai = null;

        while (atual != null && atual.dado != elemento) {
            pai = atual;
            if (elemento < atual.dado) {
                atual = atual.esquerda;
            } else {
                atual = atual.direita;
            }
        }

        if (atual == null) {
            System.out.println("Elemento nao encontrado: " + elemento);
            return;
        }

        if (atual.esquerda != null && atual.direita != null) {
            No paiSubstituto = atual;
            No substituto = atual.direita;

            while (substituto.esquerda != null) {
                paiSubstituto = substituto;
                substituto = substituto.esquerda;
            }

            atual.dado = substituto.dado;
            atual = substituto;
            pai = paiSubstituto;
        }

        No filho = atual.esquerda;
        if (filho == null) {
            filho = atual.direita;
        }

        if (pai == null) {
            raiz = filho;
        } else if (pai.esquerda == atual) {
            pai.esquerda = filho;
        } else {
            pai.direita = filho;
        }

        System.out.println("Removido: " + elemento);
    }

    public void exibeArvore(No no) {
        if (no == null) {
            return;
        }
        exibeArvore(no.esquerda);
        System.out.print(no.dado + " ");
        exibeArvore(no.direita);
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.insereElemento(50);
        arvore.insereElemento(30);
        arvore.insereElemento(70);
        arvore.insereElemento(20);
        arvore.insereElemento(40);
        arvore.insereElemento(60);
        arvore.insereElemento(80);

        arvore.exibeArvore(arvore.raiz);
        System.out.println();

        arvore.buscaElemento(40);
        arvore.buscaElemento(99);

        arvore.removeElemento(20);
        arvore.removeElemento(30);
        arvore.removeElemento(50);
        arvore.removeElemento(99);

        arvore.exibeArvore(arvore.raiz);
        System.out.println();
    }
}