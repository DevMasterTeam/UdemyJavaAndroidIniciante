package IBasicoAmbienteConceitos;

/**
 * Todos os tipos de dados possuem tipos primitivos associados, exceto String.
 *
 * Double       - double
 * Float        - float
 * Long         - long
 * Integer      - int
 * Short        - short
 * Byte         - byte
 * Boolean      - boolean
 * Character    - char
 *
 * A diferença entre os dois tipos, é que os tipos primitivos ocupam muito menos memória
 * e também não possuem as operações/funções que as classes possuem.
 * No entando, eles representam exatamente a mesma informação caso use um primitivo ou não.
 *
 * Por exemplo,
 * int n1 = 10;
 * Integer n2 = 10;
 *
 * Representam a mesma informação. Diferem no tamanho ocupado na memória e nos métodos auxiliares.
 *
 * */
public class TiposPrimitivos {

    public static void main(String[] args) {

        Integer valor1 = 10;
        int valor2 = 20;

        // Faz a conversão de um inteiro para String
        valor1.toString();

        // Não existe
        // valor2.toString();

    }

}
