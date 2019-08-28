package IBasicoAmbienteConceitos;

public class Funcoes {

    // Função sem argumentos, sem parâmetros
    private void helloWorld() {
        System.out.println("Olá, mundo!");
    }

    // Função espera um parâmetro do tipo String
    private void hello(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    // Função espera dois parâmetros do tipo inteiro e retorna um tipo inteiro
    private int soma(int n1, int n2) {
        return n1 + n2;
    }


    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        funcoes.helloWorld();
        funcoes.hello("mundo");
        System.out.println(funcoes.soma(2, 2));
    }

}