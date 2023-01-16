package orientacaoAObjetos.EncapsulamentoEHerança.thisESuper;

public class SubClasse extends SuperClasse {
  public String nome = "Subclasse";

  public SubClasse() {
    System.out.println(nome);
    System.out.println(this.nome);

  }

}
