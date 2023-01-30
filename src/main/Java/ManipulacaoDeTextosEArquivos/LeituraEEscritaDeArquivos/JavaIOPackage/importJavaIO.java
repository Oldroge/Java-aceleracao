package ManipulacaoDeTextosEArquivos.LeituraEEscritaDeArquivos.JavaIOPackage;
import java.io.File; // Importação da classe que representa um arquivo.
import java.io.FileReader; // Importação da classe auxilar para leitura de arquivo.
import java.io.FileWriter; // Importação da classe auxilar para escrita de arquivo

public class importJavaIO {
  File meuFile = new File("/path/to/some/file.txt");
  
  boolean arquivoExiste = meuFile.exists(); // VERIFICA SE O ARQUIVO OU DIRETÓRIO EXISTE
  boolean podeExecutar = meuFile.canExecute(); // VERIFICA SE O PROGRAMA PODE EXECUTAR O ARQUIVO OU DIRETÓRIO
  boolean podeLer = meuFile.canRead(); //  VERIFICA SE O PROGRAMA PODE LER O ARQUIVO OU DIRETÓRIO
  boolean podeEscrever = meuFile.canWrite(); //  VERIFICA SE O PROGRAMA PODE ESCREVER O ARQUIVO OU DIRETÓRIO
  boolean deletou = meuFile.delete(); // DELETA O ARQUIVO
}
