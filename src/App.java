import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora:");
        double vlhr = sc.nextDouble();

        System.out.println("Qual número de horas trabalhadas no mês:");
        double meshr = sc.nextDouble();

        double salario = vlhr * meshr;

        System.out.print("Total do seu salário no referido mês: " + salario);
    }
}