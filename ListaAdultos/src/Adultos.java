import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adultos {
    public static void main(String[] args) throws Exception {
        boolean sair = false;
        Scanner scanner = new Scanner(System.in);
        List<Usuarios> adultos = new ArrayList<>();
        do {
            System.out.print("Digite o nome do Usuário: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade do Usuário: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            if (idade >= 18) {
                adultos.add(new Usuarios(nome, idade));
            } else {
                System.out.println("Usuário não é adulto.");
            }
            System.out.print("Deseja sair? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                sair = true;
            }

        } while (sair == false);
        scanner.close();
        for (Usuarios adulto : adultos) {
            System.out.println("Nome: " + adulto.getNome());
        }

    }
}
