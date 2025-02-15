import java.util.Scanner;


public class MainVeiculoLivro {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Sobre o que deseja digitar: ");
    System.out.println(" 1 - Veiculo");
    System.out.println("2 - Livro"); 
    String opcao = scanner.nextLine();

    if (opcao.equals("1")) {

        System.out.println("Digite a placa do veiculo: ");
        String placa = scanner.nextLine();

        System.out.println("Digite a Cor do veiculo: ");
        String Cor = scanner.nextLine();

        System.out.println("Digite o numero de passageiros: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite a Capacidade Maxima do tanque: ");
        Double Capacidade = scanner. nextDouble();

        System.out.println("Digite a velocidade maxima do veiculo: ");
        Double Velocidade = scanner. nextDouble();

        System.out.println("Digite o consumo medio: ");
        Double Consumo = scanner. nextDouble();

        Veiculo MainVeiculoLivro = new Veiculo(placa, Cor, null, Capacidade, Velocidade, Consumo, opcao);

        System.out.println("Cor: " + MainVeiculoLivro.getCor());
        System.out.println("Placa: " + MainVeiculoLivro.getPlaca());
        System.out.println("Numero de Passageiros: " + MainVeiculoLivro.getNumero());
        System.out.println("Capacidade de Tanque: " + MainVeiculoLivro.getTanque());
        System.out.println("Velocidade Maxima: " + MainVeiculoLivro.getVelocidade());
        System.out.println("Consumo Medio: " + MainVeiculoLivro.getConsumo());

        
    }   else if (opcao.equals("2")) {

        System.out.println("Qual o titulo de livro: ");
        String Titulo =  scanner.nextLine();

        System.out.println("Qual o autor do livro: ");
        String Autor = scanner.nextLine();

        System.out.println("Qual o numero de paginas: ");
        int Numero = scanner.nextInt(); 

        System.out.println("Qual o preço do livro: ");
        int preco = scanner.nextInt();

        livro livro1 = new livro(Titulo, Autor, Numero, preco, null);

        System.out.println("Titulo do livro: " + livro1.getTitulo());
        System.out.println("Autor do livro: " + livro1.getAutor());
        System.out.println("Numero de paginas: " + livro1.getNumero());
        System.out.println("Preco livro: " + livro1.getPreco());
        System.out.println("ISBN: " + livro1.getIsbn());
    } else {
        System.out.println("Tente Outra Vez");
        


    }

}

}



