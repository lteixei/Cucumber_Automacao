#language: pt
#encoding: utf-8

Funcionalidade: Pesquisa

  Contexto:
    Dado que acesso o ecommerce

  @run
  Cenário: Pesquisar produto
    Quando pesquiso o produto "t-shirt"
    Então a pesquisa deve retornar resultados

  Esquema do Cenário: Pesquisar produtos
    Quando pesquiso o produto "<nome_produto>"
    Então a pesquisa deve retornar resultados
    Exemplos:
      | nome_produto |
      | t-shirt      |
      | short        |
      | shoes        |
