package NavegadorInternet;

public class NavegadorInternet {

  public void acessarURL(String enderecoURL) {
    verificarConexaoInternet();
    System.out.println("Acessa URL: " + enderecoURL);
  }

  public void adicionarNovaAba() {
    System.out.println("Adiciona nova aba");
  }

  private void verificarConexaoInternet() {
    System.out.println("Verifica conexão com Internet");
  }
}

