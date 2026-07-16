# ⚙️ Gerenciador de Tarefas — API REST (Backend)

Este repositório abriga o ecossistema de Backend e inteligência de negócios do Gerenciador de Tarefas. Uma API RESTful robusta estruturada sob o padrão de arquitetura de software **MVC (Model-View-Controller)**, focada na separação de responsabilidades e escalabilidade.

---

## 🚀 Tecnologias e Conceitos Utilizados

A arquitetura foi desenhada utilizando as ferramentas mais consolidadas do mercado corporativo:

* **Java 21** (Explorando os novos recursos de performance da versão LTS mais recente da linguagem)
* **Spring Boot 3+** (Agilidade de configuração, inversão de controle e injeção de dependências)
* **Spring Data JPA / Hibernate** (Abstração eficiente da camada de persistência e mapeamento objeto-relacional)
* **Banco de Dados H2** (Persistência em memória estruturada para ciclos ágeis de desenvolvimento)
* **Maven** (Gerenciamento preciso de dependências e automação de compilação)
* **GitHub Actions** (Automação completa do ecossistema de Integração Contínua — CI)

## 📌 Arquitetura de Endpoints (API REST)

A API trafega dados puramente em formato **JSON**, disponibilizando os seguintes serviços sob o endereço `http://localhost:8080`:

* `GET /api/tarefas` — Consulta e retorna a listagem completa de dados persistidos.
* `POST /api/tarefas` — Recebe e valida novas estruturas de dados no corpo da requisição para armazenamento.

## 🤖 Pipeline de Integração Contínua (CI/CD)

Para garantir a confiabilidade do código em nível corporativo, este repositório conta com uma esteira automatizada de **GitHub Actions** (`Java CI with Maven`). 

A cada modificação disparada na branch `main`, o robô executa de forma automática em um servidor na nuvem:
1. Instalação e isolamento do ambiente com o **JDK 21**.
2. Resolução de cache das dependências do Maven (otimização de performance do pipeline).
3. Compilação e empacotamento completo do software (`mvn package`), garantindo que nenhuma nova alteração de código introduza regressões ou quebras no sistema atual.

## 🛠️ Como Executar a API Localmente

### Pré-requisitos
Você precisará do **JDK 21** configurado localmente.

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/TatianaHonda58/gerenciador-tarefas-backend.git](https://github.com/TatianaHonda58/gerenciador-tarefas-backend.git)
