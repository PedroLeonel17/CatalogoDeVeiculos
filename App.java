import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Catalogo cat = new Catalogo();

        Scanner sc = new Scanner(System.in);

        System.out.println("\n============================================================");
        System.out.println("\nCatalogo de vendas: \n");

        cat.filtrarMaiorPreco();

        System.out.println("============================================================");

        MainMenu(sc, cat);
    }

    public static String menuOpcoes() {
        String tit = "\nFiltrar por: \n";
        String op1 = "1- Motos\n";
        String op2 = "2- Carros\n";
        String op3 = "3- Caminhoes\n";
        String op4 = "4- Maiores valores\n";
        String op5 = "5- Menores valores\n";
        String op6 = "6- Popularidade\n";
        String op7 = "7- Sair\n";

        return tit + op1 + op2 + op3 + op4 + op5 + op6 + op7;
    }

    public static void MainMenu(Scanner sc, Catalogo cat) {
        int opcao;
        boolean rodando = true;
        while (rodando) {
            System.out.println(menuOpcoes());
            opcao = sc.nextInt();
            while (opcao <= 0 || opcao >= 8) {
                opcao = sc.nextInt();
            }
            switch (opcao) {
                case 1:
                    System.out.println("\n============================================================");
                    System.out.println("Motos Filtradas: \n");
                    cat.filtrarMotos();
                    System.out.println("============================================================");
                    break;
                case 2:
                    System.out.println("\n============================================================");
                    System.out.println("Carros Filtrados: \n");
                    cat.filtrarCarros();
                    System.out.println("============================================================");
                    break;
                case 3:
                    System.out.println("\n============================================================");
                    System.out.println("Caminhoes Filtrados: \n");
                    cat.filtrarCaminhoes();
                    System.out.println("============================================================");
                    break;
                case 4:
                    System.out.println("\n============================================================");
                    System.out.println("Maiores Precos: \n");
                    cat.filtrarMaiorPreco();
                    System.out.println("============================================================");
                    break;
                case 5:
                    System.out.println("\n============================================================");
                    System.out.println("Menores Precos: \n");
                    cat.filtrarMenorPreco();
                    System.out.println("============================================================");
                    break;
                case 6:
                    System.out.println("\n============================================================");
                    System.out.println("Popularidade: \n");
                    cat.filtrarPopularidade();
                    System.out.println("============================================================");
                    break;
                case 7:
                    rodando = false;
                    break;
            }
        }
    }
}