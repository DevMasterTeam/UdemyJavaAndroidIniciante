package IBasicoAmbienteConceitos;

public class Strings {
    public static void main(String[] args) {

        // Uma String é um cadeia de caracteres
        String nome = "Java";

        // Cada posição da String corresponde a um caracter
        System.out.println("Letra 1: " + nome.charAt(0));
        System.out.println("Letra 2: " + nome.charAt(1));
        System.out.println("Letra 3: " + nome.charAt(2));
        System.out.println("Letra 4: " + nome.charAt(3));

        // O exemplo acima também mostra a possibilidade de concatenar Strings
        // É possível concatenar quantos valores desejar.
        String sobrenome = "Rules";
        System.out.println(nome + " " + sobrenome);

        // Propriedade interessante sobre concatenação
        // Qualquer tipo de dado quando concatenado será convertido para um String
        Integer idade = 19;
        System.out.println("Idade: " + idade);

        // Também é possível converter diversos tipos de dados para String
        String intStr = String.valueOf(idade);
        String doubleStr = String.valueOf(12.0);
        String floatStr = String.valueOf(12f);
        String longStr = String.valueOf(12l);

    }
}