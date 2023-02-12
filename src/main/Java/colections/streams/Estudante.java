package colections.streams;

public class Estudante {
  private String matricula;

  private String nome;

  private String curso;

  public Estudante() {}

  public Estudante(String matricula, String nome, String curso) {
    this.matricula = matricula;
    this.nome = nome;
    this.curso = curso;
  }

  public String getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public String getCurso() {
    return curso;
  }

}
