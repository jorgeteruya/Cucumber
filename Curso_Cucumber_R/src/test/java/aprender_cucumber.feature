#language: pt
Funcionalidade: 
  Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critério de aceitação

  Cenário: Deve executar especificação
    Dado que eu crie o arquivo corretamente
    Quando executá-lo
    Então a especificação deve finalizar com sucesso

  Cenário: Deve incrementar contador
    Dado que o valor do contador é 15
    Quando eu incrementar em 4
    Então o valor do contador será 20
