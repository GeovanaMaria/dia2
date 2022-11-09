import java.util.Scanner;

public class dia2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

       //FUNÇÕES ARITMÉTICAS

       /* Assim como na matemática, na construção dos programas mais comuns utilizamos algumas operações
        matemáticas, e para isso, exite uma biblioteca que facilita bastante nessas horas (Match), essa
        biblioteca nos permite realizar operações como:

        potenciação
                exponenciação
        raiz quadrada
        valores absolutos
        entre outros

        //FUNÇÕES MATEMÁTICAS MAIS UTILIZADAS

        Math.sqrt(x); Variável A recebe a raiz quadrada de x
        Math.pow(x, y); Variável A recebe o resultado de x elevado a y
        Math.abs(x); Variável A recebe o valor absoluto de x

        SIMPLIFICANDO...
        sqrt > calcula raiz quadrada
        pow > calcula potenciação
        abs > calcula valor absoluto
-----------------------------------------------------------------------------------------------------------------*/
        //EXEMPLOS:

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
/*------------------------------------------------------------------------------------------------------------------
        Algumas funções e expressões mais elaboradas, precisam ser organizadas de uma maneira mais precisa
        para não ocorrer erro na operação quando a maquina estiver executando o código. A fórmula de báscara
        por exemplo, ficaria da seguinte forma:


        delta = Math.pow(b, 2.0) - 4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
-----------------------------------------------------------------------------------------------------------------*/

        /*Exercicio 1: Leia a largura e altura de um terreno retangular e o valor do metro quadrado. Retorne a
         área e o preço do terreno com duas casas decimais.
         Nesse programa deve se aplicar o (printf) para ter a precisão de duas casas decimais, como solicitado
         no exercício.
         É possivel fazer a declaração da variável e a leitura o mesmo tempo, segue o exemplo do programa abaixo:*/

        System.out.println("informe a largura e altura do terreno: ");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();
        System.out.println("Informe o valor do metroquadrado ");
        double ValorMQ = sc.nextDouble();

        double area = largura * altura;
        double preco = area * ValorMQ;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
/*-------------------------------------------------------------------------------------------------------------------
        Exercicio 2: Ler a base e altura de um retângulo e mostrar o valor da área, perímetro e diagonal deste retângulo,
        (com quatro casas decimais).*/

        System.out.println("informe a base a altura do retangulo: ");
        double base = sc.nextDouble();
        double ALTURA = sc.nextDouble();

        double AREA = base * ALTURA;
        double perimetro = 2.0 * (base + ALTURA);
        double diagonal = Math.sqrt(Math.pow(base, 2.0) +   Math.pow(ALTURA, 2.0));

        System.out.printf("AREA = %.4f%n", AREA);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);
/*-----------------------------------------------------------------------------------------------------------------
        Exercicío 3: Ler o nome e idade de duas pessoas e mostrar uma mensagem com os nomes, e a idade média
         entre essas pessoas, (com uma casa decimal)*/

        System.out.println("Informe nome e idade, pessoa 1: ");
        String nome1 = sc.next();
        int idade1 = sc.nextInt();
        System.out.println("Informe nome e idade, pessoa 2: ");
        String nome2 = sc.next();
        int idade2 = sc.nextInt();

        double media = (double) (idade1 + idade2) /2;

        System.out.printf(" A idade média de %s e %s é de %n %.1f", nome1, nome2, media);

    }
}
