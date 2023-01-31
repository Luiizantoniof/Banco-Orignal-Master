package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By empresas = By.xpath("/html/body/div[1]/div[1]/div/header/section/div/div/div/div/div[2]/div/a[3]/div[1]");
	private By btnCookie = By.id("onetrust-accept-btn-handler");
	private By micrompreendedor = By.xpath("/html/body/div[1]/div[1]/div/header/div[2]/div/div/div/div[2]/div/div[2]/a[2]");
	private By btnAbrirContaMei = By.xpath("/html/body/div[1]/div[1]/div/main/section[1]/div/div/div[2]/div/button");
	private By btnNaoContaPF = By.xpath("/html/body/div[3]/div[2]/div/div[2]/button[2]");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("celular");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By campoDataNasc = By.id("dataNascimento");
	private By btnAutorize = By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[2]/form/div/div[6]/div/label");
	private By btnContinuar = By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[2]/form/div/div[7]/button");
	private By textoProntinho = By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/p");
	//
	public By getEmpresas() {
		return empresas;
	}
	public By getBtnCookie() {
		return btnCookie;
	}

	public By getMicrompreendedor() {
		return micrompreendedor;
	}

	public By getBtnAbrirContaMei() {
		return btnAbrirContaMei;
	}

	public By getBtnNaoContaPF() {
		return btnNaoContaPF;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getCampoDataNasc() {
		return campoDataNasc;
	}
	public By getBtnAutorize() {
		return btnAutorize;
	}
	public By getBtnContinuar() {
		return btnContinuar;
	}
	public By getTextoProntinho() {
		return textoProntinho;
	}

}
