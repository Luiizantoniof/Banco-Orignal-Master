@aberturaConta
Feature: Abertura de conta pessoa juridica 

@pj
Scenario Outline: Abertura de conta pessoa juridica
Given que o usuario acesse a url "https://www.bancointer.com.br/"
And que o usuario aperte em empresas 
And selecione micro empreendedor (mei) que esta em banco 
And selecionar botao cookie
And que aperte o botao abrir conta mei gratuita
And que aperte o botao que nao tem conta digital pessoa fisica
And preencher seu nome
And preencher seu telefone
And preencher seu email
And preencher seu cpf
And preencher sua data de nascimento
And aperte o botao de autorize
And aperte o botao continuar
Then sera exibido continue a abertura pelo app do Inter
 
Examples:
       |nome                |telefone    |email           |cpf         |data de nascimento |
       |Cesar figueira      |99999999999 |ggg@teste.com   |61841985058 |12041983           |