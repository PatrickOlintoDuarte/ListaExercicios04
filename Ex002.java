import java.util.Scanner;
public class Ex002 {
    public static void main(String[] args) {
        Ex001 v1 = new Ex001();
        Ex001 v2 = new Ex001();
        Scanner scn = new Scanner(System.in);

        System.out.printf("Cor do 1º veiculo: ");
        String cor = scn.nextLine();
        System.out.printf("\nModelo do 1º veiculo: ");
        String modelo =scn.nextLine();
        v1.setCor(cor);
        v1.setModelo(modelo);
 
        System.out.printf("Cor do 2º veiculo: ");
        String cor2 = scn.nextLine();
        System.out.printf("\nModelo do 2º veiculo: ");
        String modelo2 =scn.nextLine();
        v2.setCor(cor2);
        v2.setModelo(modelo2);
        v1.ExibirInformacoes();
        v1.ligarVeiculo();
        System.out.println();
        v2.ExibirInformacoes();
        v2.ligarVeiculo();
        v1.getCor();
        v1.getModelo();
        v2.getCor();
        v2.getModelo();
        scn.close();
    }
}
