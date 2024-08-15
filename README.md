# `Localizador de Museus`

Boas-vindas ao repositório do projeto `Localizador de Museus`!

<details>
  <summary>👨‍💻 O que foi desenvolvido</summary><br />

Neste projeto foi implementado uma API cuja principal funcionalidade é facilitar a busca por museus baseada em sua localização. Os dados foram retirados [desta](http://dados.cultura.gov.br/dataset/series-historicas-cadastro-nacional-de-museus) série histórica.

</details>

<details>
  <summary><strong>📝 Habilidades trabalhadas</strong></summary>

Neste projeto, fui capaz de:

- Criar classes de controle e suas rotas
- Criar classes de serviço
- Utilizar injeção de dependências
- Trabalhar com exceções customizadas
- Tratar exceções da API através de gerenciadores de erros
- Implementar testes unitários para cobertura de código
- Criar uma configuração Docker para sua aplicação

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar</strong></summary>

1. Clone o repositório

- Copie o endereço SSH do repositório e use-o para cloná-lo na sua máquina:
  - Por exemplo: `git clone <Link SSH do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
  - `cd <nome do repositório>`

2. Instale as dependências

- Para instalar todas as denpendências utilize o comando:
  - `mvn dependency:resolve`
- Para fazer todo o processo de instalação de dependências, compilação, testes, empacotamento e instalação no repositório local, utilize o comando:
  - `mvn install`

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>
