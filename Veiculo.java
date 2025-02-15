public class Veiculo {

    String Placa;
    String Cor;
    Int Numero;
    Double tanque;
    Double Velocidade;
    Double Consumo;
    String opcao;




    public Veiculo(String placa, String cor, Int numero, Double tanque, Double velocidade, Double consumo,
            String opcao) {
        Placa = placa;
        Cor = cor;
        Numero = numero;
        this.tanque = tanque;
        Velocidade = velocidade;
        Consumo = consumo;
        this.opcao = opcao;
    }
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        Cor = cor;
    }
    public Int getNumero() {
        return Numero;
    }
    public void setNumero(Int numero) {
        Numero = numero;
    }
    public Double getVelocidade() {
        return Velocidade;
    }
    public void setVelocidade(Double velocidade) {
        Velocidade = velocidade;
    }
    public Double getConsumo() {
        return Consumo;
    }
    public void setConsumo(Double consumo) {
        Consumo = consumo;
    }
    public String getOpcao() {
        return opcao;
    }
    public void setOpcao(String opcao) {
        this.opcao = opcao;
    

    }
public Double getTanque() {
    return tanque;
}


public void setTanque(Double tanque) {
    this.tanque = tanque;

}
    
    
    
}
