import java.time.LocalDate;

public abstract class ServicoBase{
 private LocalDate data = LocalDate.now()
 private Tamanho tamanho;
 private double preco;
 private int codigo;

 public ServicoBase(int codigo,String data){	 
   this.codigo;
   this.data;	   
 }
  public String getData(){
  return data;
  }
  public Tamanho getTamanho(){
  return tamanho;
  }
  public int codigo(){
  return codigo;
  }
  public abstract double calcularPreco(){
   return 
  }
  public String getDescricao(){
  return descricao;
  }
  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Servico servico = (Servico) o;

        return codigo == servico.codigo &&
               Objects.equals(data, servico.data);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(codigo, data);
    }
}






	
