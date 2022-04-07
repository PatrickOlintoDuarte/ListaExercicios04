public class Ex004 {
    public static void main(String[] args) {

        Ex003 v1 = new Ex003("Azul","Fusca");
        Ex003 v2 = new Ex003("Vermelho","Azira");
        v1.ExibirInformacoes();
        v1.ligarVeiculo();
        v2.ExibirInformacoes();
        v2.ligarVeiculo();
        v1.getCor();
        v1.getModelo();
        v2.getCor();
        v2.getModelo();
    }
}
