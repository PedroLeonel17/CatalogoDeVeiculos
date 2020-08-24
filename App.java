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

}