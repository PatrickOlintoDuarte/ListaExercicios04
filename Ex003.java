public class Ex003 {
    private String cor;
    private String modelo;

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Ex003(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    public void ExibirInformacoes(){
        System.out.println("Informações do veículo");
        System.out.printf("\nCor: %s\nModelo: %s", this.cor, this.modelo);
    }
    public void ligarVeiculo(){
        System.out.println("\nO veículo está ligado");
    }

}
