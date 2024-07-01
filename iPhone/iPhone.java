package iPhone;
import  NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.Telefone;

public class iPhone {
  public static void main(String[] args) {
    NavegadorInternet navegador = new NavegadorInternet();
    navegador.acessarURL("www.teste.com");
    navegador.adicionarNovaAba();
    navegador.atualizarPagina();

    ReprodutorMusical musica = new ReprodutorMusical(); 
    musica.tocarMusica("Ipanema");
    musica.pausar();
    musica.selecionarMusica("Aquarela");

    Telefone telefone = new Telefone();
    telefone.ligar("12345678");
    telefone.atender();
    telefone.iniciarCorreioDeVoz();
  }
}
