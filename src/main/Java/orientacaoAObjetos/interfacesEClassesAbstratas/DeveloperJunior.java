package orientacaoAObjetos.interfacesEClassesAbstratas;

public class DeveloperJunior extends Developer {

  @Override
  public double wage() {
    return 3000.0 + super.yearsOfExperience * 100;
  }

  // Quando o método da interface é default
  // não há obrigatoriedade de implementar o método na classe na qual a inteface foi implementada

  // @Override
  // public String mainSkill() {
  // return super.language + " Automated tests";
  // }

}
