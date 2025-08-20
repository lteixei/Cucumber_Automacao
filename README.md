# 🧪 Automação de Testes com Cucumber

Este repositório apresenta uma base completa para automação de testes utilizando **Cucumber**, uma ferramenta de **Behavior Driven Development (BDD)** que permite escrever testes legíveis por humanos utilizando a linguagem **Gherkin**.  

O objetivo é fornecer uma referência prática e organizada para criar testes automatizados seguindo boas práticas de BDD.

---

## 🚀 Por que utilizar Cucumber?

- ✅ Permite **testes colaborativos** entre desenvolvedores, testers e stakeholders  
- ✅ Escreve testes em **linguagem natural (Gherkin)**  
- ✅ Suporte a integração com **Selenium, Playwright ou outros frameworks de teste**  
- ✅ Facilita **manutenção e escalabilidade** dos testes  

---

## 🧰 Tecnologias Utilizadas

| Ferramenta           | Descrição                                  |
|---------------------|--------------------------------------------|
| Cucumber             | Framework BDD para testes                  |
| Gherkin              | Linguagem de escrita dos cenários          |
| Selenium / Playwright| Automação de browser                       |
| Java / Python / JS   | Linguagem de implementação                 |
| Maven / Gradle / npm | Gerenciador de dependências e execução     |
| JUnit / TestNG       | Framework de execução de testes (Java)     |

---

## ⚙️ Pré-requisitos

- ✅ Java 11+ (para projetos Java) ou Node.js (para projetos JS)  
- ✅ Maven ou Gradle (Java) / npm (JS)  
- ✅ Git instalado  
- ✅ Navegador Chrome, Edge ou Firefox  

---

## 📦 Instalação (Java + Maven)

```bash
# Clonar repositório
git clone https://github.com/seu-usuario/seu-projeto.git
* Criar dentro da pasta - seu-projeto

# Instalar dependências
mvn clean install

# Executar testes
mvn test
```

## 🏗 Estrutura de Projeto Recomendada
📦 cucumber-automation/  
├── 📁 src/  
│   ├── 📁 main/  
│   │   └── 📁 java/  
│   │       └── pages/           # Page Objects  
│   └── 📁 test/  
│       ├── 📁 java/  
│       │   ├── stepDefinitions/  # Implementação dos steps  
│       │   └── runners/          # Classes para execução  
│       └── 📁 resources/  
│           └── features/         # Arquivos .feature em Gherkin  
├── pom.xml                       # Dependências Maven  
└── README.md  

---

## 📄 Estrutura de um Cenário em Gherkin

```bash
Feature: Login de usuário

  Scenario: Usuário realiza login com sucesso  
    Given que o usuário acessa a página de login  
    When ele preenche o usuário e a senha válidos  
    And clica no botão de login  
    Then ele deve ver a mensagem de boas-vindas  
```

---

## 🔎 Exemplo de Step Definition (Java + Selenium)

```bash
package stepDefinitions;

import io.cucumber.java.en.*;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import static org.junit.Assert.assertTrue;  

public class LoginSteps {  
    WebDriver driver;  

    @Given("que o usuário acessa a página de login")  
    public void acessarPaginaLogin() {  
        driver = new ChromeDriver();  
        driver.get("https://exemplo.com/login");  
    }  

    @When("ele preenche o usuário e a senha válidos")  
    public void preencherCredenciais() {  
        driver.findElement(By.id("username")).sendKeys("usuario_teste");  
        driver.findElement(By.id("password")).sendKeys("senha123");  
    }  

    @And("clica no botão de login")  
    public void clicarLogin() {  
        driver.findElement(By.id("login-button")).click();  
    }  

    @Then("ele deve ver a mensagem de boas-vindas")  
    public void verificarMensagem() {  
        assertTrue(driver.findElement(By.tagName("body")).getText().contains("Bem-vindo"));  
        driver.quit();  
    }  
}  
```

---

## ▶️ Executando os Testes  
### Java + Maven  
- mvn test  

### JS + Node (Cucumber + Playwright)  
npx cucumber-js  

---

## ✅ Boas Práticas 

| Dica                               | Explicação                                                |
|------------------------------------|-----------------------------------------------------------|
| Separar features por módulo        | Organização e manutenção facilitada                       |
| Reutilizar steps                   | Evita duplicação e aumenta consistência                   |
| Page Object Model                  | Facilita manutenção dos seletores de elementos            |
| Evitar lógica complexa no Gherkin  | Cenários devem ser claros e legíveis                      |
| Usar tags                          | Executar testes específicos (@login) ou grupos de testes  |
| Integrar com CI/CD                 | Automação completa e relatórios automáticos               |

---

## 🔮 Funcionalidades Avançadas  

✅ Hooks: @Before e @After para setup e teardown;  
✅ Paralelização de testes com Maven ou Cucumber CLI;  
✅ Gerar relatórios em HTML ou JSON para análise detalhada;  
✅ Integração com Selenium, Playwright ou Appium.  

---

## 🤝 Contribuição  
  
Contribuições são bem-vindas!  
Abra uma Issue ou envie um Pull Request com melhorias, novos cenários ou exemplos de integração.

---

## 🤝 Boas práticas para contribuições:

📌 Escreva código limpo, legível e documentado.  
📌 Teste suas mudanças antes de enviar o Pull Request.  
📌 Mantenha a consistência com o estilo e padrões do projeto.  
📌 Discuta melhorias ou dúvidas antes de implementar grandes mudanças.

---

## 👩‍💻 Contato

- Informações	
- Nome	Leonardo da Motta Teixeira  
- Cargo	QA Engineer / Gestor / Tester-Sênior  
- LinkedIn	www.linkedin.com/in/leonardo-da-motta-teixeira-3584734b  
- E-mail	lteixei@hotmail.com  

---

## 📝 Licença

- Este projeto está licenciado sob a MIT License.
