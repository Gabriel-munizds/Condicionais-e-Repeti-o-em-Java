// importando biblioteca para leitura de dados
import java.util.Scanner;
// criando classe
public class ImprimindoVariaveis {
    public static void main(String[] args) {
        //renomeando função de leitura
        Scanner input = new Scanner(System.in);
        // inserindo dados
        System.out.printf("Digite o nome do Aluno: ");
        String aluno = input.nextLine();
        System.out.println("Digite sua primeira nota: ");
        float notaUm = input.nextFloat();
        //tratamento de erro
        if (notaUm >10){
            while (notaUm>10){
                System.out.println("Por favor, Digite uma nota entre 0 e 10");
                System.out.println("Digite sua primeira nota: ");
                notaUm = input.nextFloat();
            }
        }
        System.out.println("Digite sua segunda nota: ");
        float notaDois = input.nextFloat();
        //tratamento de erro
        if (notaDois >10) {
            while (notaDois > 10) {
                System.out.println("Por favor, Digite uma nota entre 0 e 10");
                System.out.println("Digite sua segunda nota: ");
                notaDois = input.nextFloat();
            }
        }
        System.out.println("Digite sua terceira nota: ");
        float notaTres = input.nextFloat();
        //tratamento de erro
        if (notaTres >10) {
            while (notaTres > 10) {
                System.out.println("Por favor, Digite uma nota entre 0 e 10");
                System.out.println("Digite sua terceira nota: ");
                notaTres= input.nextFloat();
            }
        }
        // calculando e imprimindo a média
        float media = (notaUm+notaDois+notaTres)/3;
        System.out.println("A média do aluno foi: "+ media);
        //verificando em qual grupo o aluno se encaixa: aprovados, reposição ou reprovados
        if (media>7){
            System.out.printf("O aluno "+aluno+" foi aprovado!");
        }
        else if (media>4){
            System.out.printf("O aluno "+aluno+" irá para reposição");
        }
        else{
            System.out.printf("O aluno "+aluno+" foi reprovado");
        }
    }
}
