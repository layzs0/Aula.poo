public class livro {

    String Titulo;
        String autor;
        int Numero;
        double preco;
        Double isbn;
        
        public String getTitulo() {
            return Titulo;
        }public livro(String titulo, String autor, int numero, double preco, Double isbn) {
            Titulo = titulo;
            this.autor = autor;
            Numero = numero;
            this.preco = preco;
            this.isbn = isbn;
        }
    
        public void setTitulo(String titulo) {
            Titulo = titulo;
        }
        public String getAutor() {
            return autor;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }
        public int getNumero() {
            return Numero;
        }
        public void setNumero(int numero) {
            Numero = numero;
        }
        public double getPreco() {
            return preco;
        }
        public void setPreco(double preco) {
            this.preco = preco;
        }
        public Double getIsbn() {
            return isbn;
        }
        public void setIsbn(Double isbn) {
            this.isbn = isbn;
        }

    
        
}
