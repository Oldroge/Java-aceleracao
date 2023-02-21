package datas.operacoes.duration;

import java.time.Duration;

public class Main {

  public static void main(String[] args) {
    Duration diaParaMinutos = Duration.ofDays(1);
    System.out.println(diaParaMinutos.getSeconds());

  }

}
