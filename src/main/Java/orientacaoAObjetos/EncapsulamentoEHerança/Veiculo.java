package orientacaoAObjetos.EncapsulamentoEHerança;

public class Veiculo {
  private String placa;
  private String motorista;
  private String cor;

  public Veiculo(String atrPlaca, String atrMotorista, String atrCor) {
    this.placa = atrPlaca;
    this.motorista = atrMotorista;
    this.cor = atrCor;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getMotorista() {
    return motorista;
  }

  public void setMotorista(String motorista) {
    this.motorista = motorista;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

}
