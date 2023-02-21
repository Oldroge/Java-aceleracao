package datas.datasComHorario;

import java.time.Clock;
import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {
    Clock relogio = Clock.systemDefaultZone();

    System.out.println("Usando Classe abstrata Clock: ");
    System.out.println(relogio);

    System.out.println(relogio.instant());

    System.out.println("Usando LocalDateTime: ");

    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

    /**
     * A diferença entre LocalDateTime.now() e Clock.instant() é que o instante pega base no fuso
     * originário UTC, enquanto o LocalDateTime.now() pega com base na região onde eu configurei.
     */

    // Para criar uma data específica vinda de uma String, utiliza o método parse()
    LocalDateTime diaSofrimento = LocalDateTime.parse("2014-07-08T17:00:00");
    System.out.println(diaSofrimento);

  }

}
