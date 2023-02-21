package datas.operacoes.between;

import java.time.Duration;
import java.time.LocalDateTime;

public class IdadeEmDias {
  public long calcularIdadeEmDias(String nascimento) {

    LocalDateTime hoje = LocalDateTime.now();
    LocalDateTime diaNascimento = LocalDateTime.parse(nascimento);

    Duration duracao = Duration.between(diaNascimento, hoje);
    long quantidadeDias = duracao.toDays();

    return quantidadeDias;
  }

}
