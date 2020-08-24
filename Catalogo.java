import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Catalogo {

    public void filtrarCaminhoes() {
        veiculosAVenda.stream().filter(c -> c instanceof Caminhao).forEach(System.out::println);
    }

    public void filtrarCarros() {
        veiculosAVenda.stream().filter(c -> c instanceof Carro).forEach(System.out::println);
    }

    public void filtrarMotos() {
        veiculosAVenda.stream().filter(c -> c instanceof Moto).forEach(System.out::println);
    }

    public void filtrarPopularidade() {
        Collections.sort(veiculosAVenda, new OrdenaPorPopularidade());
        veiculosAVenda.stream().forEach(System.out::println);
    }

    public void filtrarMaiorPreco() {
        Collections.sort(veiculosAVenda, new OrdenaMaiorPreco());
        veiculosAVenda.stream().forEach(System.out::println);
    }

    public void filtrarMenorPreco() {
        Collections.sort(veiculosAVenda, new OrdenaMenorPreco());
        veiculosAVenda.stream().forEach(System.out::println);
    }

}