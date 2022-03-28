import java.util.Scanner;
public class main {
    public static void main (String args []) {
        Scanner scan = new Scanner(System.in);

        int periodo,n1,n2,faltas;
        int media;
        String nome,curso;


        System.out.print("Qual o seu nome: ");
        nome = scan.next();
        System.out.print("Qual o seu curso: ");
        curso = scan.next();
        System.out.print("Qual periodo voce esta: ");
        periodo = scan.nextInt();
        System.out.print("Qual a sua primeira nota: ");
        n1 = scan.nextInt();
        System.out.print("Qual a sua segunda nota: ");
        n2 = scan.nextInt();
        System.out.print("Quantas faltas voce tem: ");
        faltas = scan.nextInt();

        media = (n1 +n2) / 2;

        System.out.println("O seu nome é: " + nome);
        System.out.println("O seu curso é: " + curso);
        System.out.println("A media do aluno é: " + media);
        System.out.println("Vocé está no perido: " + periodo);
        System.out.println("Vocé tem " + faltas + "faltas, cuidado!");


    }
}
