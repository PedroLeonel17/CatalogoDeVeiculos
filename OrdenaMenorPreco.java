import java.util.Comparator;

public class OrdenaMenorPreco implements Comparator<Veiculo> {

    @Override
    public int compare(Veiculo o1, Veiculo o2) {
        return (int) (o1.getValor() - o2.getValor());
    }

}