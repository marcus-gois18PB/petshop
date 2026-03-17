
import java.time.LocalDate;
import java.util.Objects;
import java.time.LocalDate;
import java.util.Objects;

public abstract class ServicoBase implements ServicoIF {
    protected int cod;
    protected LocalDate data;
    protected Tamanho tamanho;
    protected double preco;

    public ServicoBase(int cod, LocalDate data, Tamanho tamanho) {
        this.cod = cod;
        this.data = data;
        this.tamanho = tamanho;
        // O preço inicializa zerado e é definido pelo cálculo de cada subclasse
        this.preco = calculaPreco(); 
    }

    public int getCod() { return cod; }
    public LocalDate getData() { return data; }
    public Tamanho getTamanho() { return tamanho; }
    public double getPreco() { return calculaPreco(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicoBase that = (ServicoBase) o;
        return cod == that.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }
}
