package Steps;

import static org.junit.Assert.assertEquals;

import Elementos.Elementos;
import Métodos.Métodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {

	Métodos m = new Métodos();
	Elementos e = new Elementos();

	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
    m.abrirNavegador(url);
	}

	@Given("que o usuario aperte em empresas")
	public void que_o_usuario_aperte_em_empresas() throws InterruptedException {
	m.clicar(e.getEmpresas());
	m.pausar(15000);
	}
	@Given("selecione micro empreendedor \\(mei) que esta em banco")
	public void selecione_micro_empreendedor_mei_que_esta_em_banco() {
	m.clicar(e.getMicrompreendedor());
	}


	@Given("selecionar botao cookie")
	public void selecionar_botao_cookie() throws InterruptedException {
	m.clicar(e.getBtnCookie());
	m.pausar(15000);
	}

	@Given("que aperte o botao abrir conta mei gratuita")
	public void que_aperte_o_botao_abrir_conta_mei_gratuita() {
	m.clicar(e.getBtnAbrirContaMei()); 
	}

	@Given("que aperte o botao que nao tem conta digital pessoa fisica")
	public void que_aperte_o_botao_que_nao_tem_conta_digital_pessoa_fisica() {
	m.clicar(e.getBtnNaoContaPF());
	}

	@Given("preencher seu nome")
	public void preencher_seu_nome(String nome) {
	m.preencher(e.getCampoNome(), nome);
	}

	@Given("preencher seu telefone")
	public void preencher_seu_telefone(String telefone) {
    m.preencher(e.getCampoTelefone(), telefone);
	}

	@Given("preencher seu email")
	public void preencher_seu_email(String email) {
    m.preencher(e.getCampoEmail(), email);
	}

	@Given("preencher seu cpf")
	public void preencher_seu_cpf(String cpf) {
    m.preencher(e.getCampoCpf(), cpf);
	}

	@Given("preencher sua data de nascimento")
	public void preencher_sua_data_de_nascimento(String datanasc) {
    m.preencher(e.getCampoDataNasc(), datanasc);
	}

	@Given("aperte o botao de autorize")
	public void aperte_o_botao_de_autorize() {
    m.clicar(e.getBtnAutorize());
	}

	@Given("aperte o botao continuar")
	public void aperte_o_botao_continuar() {
	m.clicar(e.getBtnContinuar());
	}

	@Then("sera exibido continue a abertura pelo app do Inter")
	public void sera_exibido_continue_a_abertura_pelo_app_do_inter(String textoTela) {
		m.validarTexto(e.getTextoProntinho(), textoTela);
		 System.out.println(textoTela);
		assertEquals("Prontinho! Recebemos os seus dados.", textoTela);
	}
}