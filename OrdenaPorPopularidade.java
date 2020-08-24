import java.util.Comparator;

public class OrdenaPorPopularidade implements Comparator<Veiculo> {
    @Override
    public int compare(Veiculo o1, Veiculo o2) {
        return (int) o2.getPopularidade() - o1.getPopularidade();
    }
}