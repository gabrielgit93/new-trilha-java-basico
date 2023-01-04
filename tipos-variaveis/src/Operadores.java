public class Operadores {

    public static void main(String[] args) {

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);


        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);


        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        //int numero = 5;
        // x repeticao
        numero = numero + 1;
        System.out.println(++numero);
        System.out.println(numero);


        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);

        int a, b;
        a = 6;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";

        //String resultado = "";
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);


        String nomeUm = "GABRIEL";
        String nomeDois = new String("GABRIEL");
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        if (numero1 == numero2) {
            System.out.println("a nossa condição é verdadeira");
        }
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);


    }
}