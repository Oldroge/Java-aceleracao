package orientacaoAObjetos.interfacesEClassesAbstratas;

public class DeveloperSenior extends Developer {

  @Override
  public double wage() {
    return 5000.0 + super.yearsOfExperience * 500;
  }

  @Override
  public String mainSkill() {
    return super.language + " Debug";
  }

}
