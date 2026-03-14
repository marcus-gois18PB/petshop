import java.util.LocalDate;

public class Banho extends ServicoBase{
public enum TamPelo{
  Curto, Medio, Grande
}

private Tampelo pelo;

public Banho(LocalDate data, Tamanho tamanho, double preco, int cod, TamPelo pelo){super(data, tamanho, preco, codigo);
   this.pelo = pelo;	



}
}
