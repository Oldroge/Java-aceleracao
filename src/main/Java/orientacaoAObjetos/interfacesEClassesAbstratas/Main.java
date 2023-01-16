package orientacaoAObjetos.interfacesEClassesAbstratas;

public class Main {

  public static void main(String[] args) {
    DeveloperJunior devJunior = new DeveloperJunior();
    System.out.println(devJunior.wage());

    CompanyWages companyWages = new CompanyWages();
    System.out.println(companyWages.totalWages(null));

  }

}
