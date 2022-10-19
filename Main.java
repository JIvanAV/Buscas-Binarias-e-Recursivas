package Buscas;

public class BrincandoComBusca { //Lugar de testes
    
    public static void main(String[] args) {
        Busca_IF b           = new Busca();
        int[] vetorNumRandom = b.geraVetorNumericoOrdenado(10000);
        
        long antes = System.nanoTime();
        b.buscaLinear_iterativa (vetorNumRandom, -1);
        long depois = System.nanoTime() - antes;
        System.out.println("Busca Linear Iterativa: " + depois + " nanosegundos");
        
        antes = System.nanoTime();
        b.buscaLinear_recursiva (vetorNumRandom, -1);
        depois = System.nanoTime() - antes;
        System.out.println("Busca Linear Recursiva: " + depois + " nanosegundos");
        
        antes = System.nanoTime();
        b.buscaBinaria_iterativa(vetorNumRandom,-1);
        depois = System.nanoTime() - antes;
        System.out.println("Busca Binária Iterativa: " + depois + " nanosegundos");
        
        antes = System.nanoTime();
        b.buscaBinaria_recursiva(vetorNumRandom, -1);
        depois = System.nanoTime() - antes;
        System.out.println("Busca Binária Recursiva: " + depois + " nanosegundos");
    }
}
