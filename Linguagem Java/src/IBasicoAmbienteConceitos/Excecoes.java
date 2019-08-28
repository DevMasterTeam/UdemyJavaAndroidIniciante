package IBasicoAmbienteConceitos;

/**
 * try-catch é uma maneira de tratar problemas esperados e principalmente não esperados.
 * finally é uma instrução opcional, pode existir try-catch sem finally.
 * finally, diferente do catch, é sempre executado.
 * É possível que as instruções dentro do catch não sejam executadas, porém as instruções dentro do finally sempre serão.
 */
public class Excecoes {

    public static void main(String[] args) {

        try {

            // NumberFormatException
            // Integer.valueOf("1a");

            // NullPointerException
            String str = null;
            System.out.println(str.length());

        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão de número!");
        } catch (Exception e) {
            System.out.println("Erro!");
        } finally {
            System.out.println("Execução da mesma maneira.");
        }

        /*
            Quando existe mais de um tipo de exceção sendo capturada, a Exception mais genérica deve sempre
            vir por último. No caso, trata-se a exceção de formato de número para depois tratar a exceção genérica.
        */

    }

    // Método faz a divisão de dois números e possui anotação que lança exceção.
    private void divisao(int numerador, int denominador) throws Exception {
        if (denominador == 0)
            throw new Exception("Denominador não pode ser zero.");

        /*
            Quando um método lança exceção, quem faz a chamada deve obrigatoriamente tratar a exceção ou
            lançá-la novamente.
         */
    }

}