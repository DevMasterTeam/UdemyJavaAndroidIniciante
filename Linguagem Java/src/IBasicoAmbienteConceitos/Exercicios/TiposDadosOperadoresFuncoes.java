package IBasicoAmbienteConceitos.Exercicios;

/*
1. Escreva uma função privada chamada helloWorld que não possui retorno algum e não recebe nenhum parâmetro.

2. Modifique a função helloWorld para que receba uma String e retorne a quantidade de caracteres como um número inteiro.

3. Modifique o retorno para que a função retorne uma String com o seguinte formato:
"A palavra possui X caracteres."
X - Deve ser a quantidade de caracteres da palavra passada por parâmetro.

4. Crie uma nova função capaz de receber dois números e retornar a soma dos mesmos.

5. Crie uma função que receba 3 números com casas decimais e execute o seguinte cálculo:
((x + y) * x) / z
Faça o retorno com casas decimais.

*/

public class TiposDadosOperadoresFuncoes {

    // 1
    // private void helloWorld() { }

    // 2
    // private int helloWorld(String str) {
        // return str.length();
    // }

    // 3
    private String helloWorld(String str) {
        return "A palavra possui " + str.length() + " caracteres.";
    }

    // 4
    private int soma(int a, int b) {
        return a + b;
    }

    // 5
    private float calculo(float x, float y, float z) {
        return ((x + y) * x) / z;
    }

}
