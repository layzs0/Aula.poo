public class Pet {
 
    String Nome;
    int Idade;
    String Raça;
    String porte;
    String Alimentacao;
    
    public Pet(String nome, int idade, String raça, String porte, String alimentacao) {
        Nome = nome;
        Idade = idade;
        Raça = raça;
        this.porte = porte;
        Alimentacao = alimentacao;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    public String getRaça() {
        return Raça;
    }
    public void setRaça(String raça) {
        Raça = raça;
    }
    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public String getAlimentacao() {
        return Alimentacao;
    }
    public void setAlimentacao(String alimentacao) {
        Alimentacao = alimentacao;
    }

    


 }

