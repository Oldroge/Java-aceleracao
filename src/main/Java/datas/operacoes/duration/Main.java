package datas.operacoes.duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {
    Duration diaParaMinutos = Duration.ofDays(1);
    System.out.println(diaParaMinutos.getSeconds());

    // duration possui o método between, que recebe 2 parâmentros para ver o intervalo dentre dois
    // tempos diferentes.

    LocalDateTime hoje = LocalDateTime.now();
    LocalDateTime diaPassado = LocalDateTime.parse("2021-12-20T17:00:00");

    Duration duracao = Duration.between(hoje, diaPassado);
    System.out.println(duracao.toDays());

  }

}
