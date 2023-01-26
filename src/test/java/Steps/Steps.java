package Steps;

import Elementos.Elementos;
import Métodos.Métodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Métodos m = new Métodos();
	Elementos e = new Elementos();
	
	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
    m.abrirNavegador(url);
}

	@Given("selecionar o botao abrir conta")
	public void selecionar_o_botao_abrir_conta() {
    e.getBtnAbrirConta();
}

	@Given("selecionar o botao abrir conta para voce")
	public void selecionar_o_botao_abrir_conta_para_voce() {
    e.getBtnAbrirContaParaVoce();
}

	@Given("preencher o campo com o nome {string}")
	public void preencher_o_campo_com_o_nome(String nome) {
	m.preencher(e.getCampoNome(), nome);
}

	@Given("preencher o campo com o telefone {string}")
	public void preencher_o_campo_com_o_telefone(String telefone) {
	m.preencher(e.getCampoTelefone(), telefone);
}

	@Given("preencher o campo com o email {string}")
	public void preencher_o_campo_com_o_email(String email) {
	m.preencher(e.getCampoEmail(), email);    	
}

	@Given("preencher o campo com o cpf {string}")
	public void preencher_o_campo_com_o_cpf(String cpf) {
	m.preencher(e.getCampoCPF(), cpf);
}

	@Given("selecionar o botao quero ser cliente")
	public void selecionar_o_botao_quero_ser_cliente() {
	e.getBtnQueroSerCliente();
}

	@Then("sera exibido o texto falta pouco")
	public void sera_exibido_o_texto_falta_pouco() {
	m.validarTexto(e.getFaltaPouco(), "Falta pouco!");
}	
	@Given("selecionar o botao abrir conta para pessoa unica")
	public void selecionar_o_botao_abrir_conta_para_pessoa_unica() {
    e.getBtnAbrirContaPessoaUnica();
}

	@Given("selecionar o botao enviar")
	public void selecionar_o_botao_enviar() {

}
}
