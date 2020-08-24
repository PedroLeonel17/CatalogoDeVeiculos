import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Catalogo {

    public List<Veiculo> veiculosAVenda;

    Catalogo() {
        veiculosAVenda = new LinkedList<>();
        veiculosAVenda.add(new Moto("GSX-R1000", 3, "Suzuki", 54880.00f));
        veiculosAVenda.add(new Moto("CBR1000 RR - fireblade", 2, "Honda", 49750.00f));
        veiculosAVenda.add(new Moto("YZF-R1", 4, "Yamaha", 62330.00f));
        veiculosAVenda.add(new Moto("ZZR 1400 Ninja", 1, "Kawasaki", 74100.00f));
        veiculosAVenda.add(new Carro("Fusca", 5, "Volkswagen", 10000.00f));
        veiculosAVenda.add(new Carro("Uno Attractive", 5, "Fiat", 45890.00f));
        veiculosAVenda.add(new Carro("HB20", 3, "Hyundai", 47990.00f));
        veiculosAVenda.add(new Carro("Ka S", 3, "Ford", 49890.00f));
        veiculosAVenda.add(new Carro("Gol", 3, "Volkswagen", 51090.00f));
        veiculosAVenda.add(new Caminhao("HD80", 4, "Hyundai", 116100.00f));
        veiculosAVenda.add(new Caminhao("Delivery Express 2p", 2, "Volkswagen", 123571.00f));
        veiculosAVenda.add(new Caminhao("F-4000 4x2 2p", 3, "Ford", 136438.00f));
    }

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