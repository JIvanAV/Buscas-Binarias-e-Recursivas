package Buscas;

public interface Busca_IF { //Interfase para implementação da classe "busca".
    
    int[] geraVetorNumericoOrdenado(int tamanho);
    
    boolean buscaLinear_iterativa(int[] numeros, int num);

    boolean buscaLinear_recursiva(int[] numeros, int num);

    boolean buscaBinaria_iterativa(int[] numeros, int num);

    boolean buscaBinaria_recursiva(int[] numeros, int num);
}
