public class Caminhao implements Veiculo {

    private String nome;
    private int popularidade;
    private String marca;
    private float valor;

    Caminhao(final String nome, final int popularidade, final String marca, final float valor) {
        this.nome = nome;
        this.popularidade = popularidade;
        this.marca = marca;
        this.valor = valor;
    }

    @Override
    public void setNome(final String nome) {
        this.nome = nome;
    }

    @Override
    public void setPopularidade(final int popularidade) {
        this.popularidade = popularidade;
    }

    @Override
    public void setValor(final float valor) {
        this.valor = valor;
    }

    @Override
    public void setMarca(final String marca) {
        this.marca = marca;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getPopularidade() {
        return this.popularidade;
    }

    @Override
    public float getValor() {
        return this.valor;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Marca: " + getMarca() + " Popularidae: " + getPopularidade() + " Valor: R$ "
                + getValor() + "\n";
    }
}