import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do seu pet: ");
        String Nome = scanner. next();
        
        System.out.println("Digite a idade: ");
        int Idade = scanner. nextInt();
        
        System.out.println("Digite o porte do seu pet: ");
        String Porte = scanner. next();

        System.out.println("Digite a alimentação do seu Pet: ");
        String Alimentacao = scanner. next();

        
        Pet Pets = new Pet(Nome, Idade, Nome, Porte, Alimentacao);

        System.out.println("Nome do Pet: " + Pets.getNome());
        System.out.println("Porte do Pet: " + Pets.getPorte());
        System.out.println("Sobre a Alimentação do Pet: " + Pets.getAlimentacao());
        System.out.println("Idade do Pet: " + Pets.getIdade());

    }
}
