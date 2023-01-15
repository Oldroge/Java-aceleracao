package orientacaoAObjetos.interfacesEClassesAbstratas;

public class DeveloperJunior extends Developer {

  @Override
  public double wage() {
    return 3000.0 + super.yearsOfExperience * 100;
  }

  @Override
  public String mainSkill() {
    return super.language + " Automated tests";
  }

}
