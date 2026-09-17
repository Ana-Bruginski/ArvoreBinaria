# Árvore Binária de Busca

Implementação de uma árvore binária de busca em Java, usando apenas tipos primitivos, referências e estruturas básicas de controle.

Valores menores vão para a subárvore esquerda e maiores ou iguais para a direita.

## Operações

- `insereElemento(int)` — insere o valor na posição correta, como folha.
- `buscaElemento(int)` — busca por valor e informa quando o elemento não é encontrado.
- `removeElemento(int)` — remove por valor, tratando nó folha, nó com um filho e nó com dois filhos. Informa quando o elemento não é encontrado.
- `exibeArvore(No)` — percorre em in-ordem, imprimindo os elementos em ordem crescente.

Na remoção de nós com dois filhos é usado o critério do menor elemento da subárvore direita.
