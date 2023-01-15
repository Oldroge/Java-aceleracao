package orientacaoAObjetos.interfacesEClassesAbstratas;

public abstract class Developer implements SkillFull {
  public String language;
  public int yearsOfExperience = 2;

  public abstract double wage();

}
