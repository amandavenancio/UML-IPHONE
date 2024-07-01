package Telefone;

public class Telefone {

    public void ligar(String numeroTelefone){
      verificarConexaoRede();
      System.out.println("Realiza ligação.");
    };

    public void atender() {
      System.out.println("Atende ligação.");
    }

    public void iniciarCorreioDeVoz(){
      System.out.println("Inicia correio de voz.");
    }

    private void verificarConexaoRede(){
      System.out.println("Verifica conexão da rede");
    }
  
}
