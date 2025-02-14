import java.util.Scanner;

public class livro2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o titulo de livro: ");
        String Titulo =  scanner.nextLine();

        System.out.println("Qual o autor do livro: ");
        String Autor = scanner.nextLine();

        System.out.println("Qual o numero de paginas: ");
        int Numero = scanner.nextInt(); 

        System.out.println("Qual o preço do livro: ");
        int preco = scanner.nextInt();

        livro livro1 = new livro(Titulo, Autor, Numero, preco);

        System.out.println("Titulo do livro: " + livro1.getTitulo());
        System.out.println("Autor do livro: " + livro1.getAutor());
        System.out.println("Numero de paginas: " + livro1.getNumero());
        System.out.println("Preco livro: " + livro1.getPreco());
    }
}
