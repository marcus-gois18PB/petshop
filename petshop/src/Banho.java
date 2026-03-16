import java.util.LocalDate;
import java.util.Objects;

public class Banho implements {
public enum TamPelo{
  Curto, Medio, Grande
}

    public Banho(double tampelo) {
        Tampelo = tampelo;
    }

    private double Tampelo;

    @Override
    public String toString() {
        return "Banho{" +
                "pelo=" + pelo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Banho banho = (Banho) o;
        return Objects.equals(Tampelo, banho.Tampelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Tampelo);
    }

    

}

