import java.util.Comparator;

public class OrdenaMaiorPreco implements Comparator<Veiculo> {

    @Override
    public int compare(Veiculo o1, Veiculo o2) {
        return (int) (o2.getValor() - o1.getValor());
    }

}