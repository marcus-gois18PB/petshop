
import java.time.LocalDate;
import java.util.Objects;

public abstract class ServicoBase implements ServicoCalculo {
 private LocalDate data = LocalDate.now();
 private Tamanho tamanho;
 private double preco;
 private int codigo;

 public ServicoBase(int codigo,LocalDate data){
   this.codigo;
   this.data;	   
 }
  public LocalDate getData(){
  return data;
  }
  public Tamanho getTamanho(){
  return tamanho;
  }
  public int codigo(){
  return codigo;
  }
  @Override
  public abstract double CalculoPreco(){
   return preco;
  }
  @Override
  public String getDescricao(){
  return descricao;
  }
    public boolean equals(Object o) {
        if (!(object instanceof ServicoBase)) return false;
        if (!super.equals(object)) return false;
        ServicoBase that = (ServicoBase) object;
        return java.lang.Double.compare(preco, that.preco) == 0 && codigo == that.codigo && java.util.Objects.equals(data, that.data) && java.util.Objects.equals(tamanho, that.tamanho);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), data, tamanho, preco, codigo);
    }
}







	
