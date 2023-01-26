
@tagaberturadeconta
Feature: Abertura de conta

Background:
 Given que o usuario acesse a url "https://www.original.com.br/"
 And selecionar o botao abrir conta

   @pf
  Scenario Outline: Abertura de conta pessoa fisica
  And selecionar o botao abrir conta para voce
  #When preencher formulario de abertura de conta
  And preencher o campo com o nome "<nome>"
  And preencher o campo com o telefone "<telefone>"
  And preencher o campo com o email "<email>"
  And preencher o campo com o cpf "<cpf>"
  And selecionar o botao quero ser cliente
  Then sera exibido o texto falta pouco

  Examples:
 |nome      |telefone      |email              |cpf         |
 |Luiz      |77991330303   |teste@test.com.br  |85368643039 |
 |Samuel    |71223456666   |tes2@tesk.com.br   |59940968060 |
 
  @pj
  Scenario Outline: Abertura de conta pessoa juridica
  And selecionar o botao abrir conta para pessoa unica
  And preencher o campo com o nome "<nome>"
  And preencher o campo com o telefone "<telefone>"
  And preencher o campo com o email "<email>"
  And preencher o campo com o cpf "<cpf>"
  And selecionar o botao enviar
  Then sera exibido o texto falta pouco