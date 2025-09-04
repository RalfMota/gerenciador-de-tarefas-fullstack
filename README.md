# Gerenciador de Tarefas Full-Stack

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white) ![Angular](https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white)

## 1. Visão Geral do Projeto

Este é um projeto acadêmico e de portfólio que implementa uma aplicação web completa (Full-Stack) para gerenciamento de tarefas. O objetivo principal foi aplicar e demonstrar conhecimentos práticos nas tecnologias Java com Spring Boot para o desenvolvimento do back-end (API RESTful) e Angular para a construção do front-end (Single Page Application).

A aplicação permite que o usuário liste e crie novas tarefas, com o front-end consumindo os dados fornecidos pelo back-end em tempo real.

## 2. Tecnologias e Conceitos Aplicados

A arquitetura do projeto foi dividida em duas partes principais: uma API back-end responsável pelas regras de negócio e persistência, e uma interface front-end para interação com o usuário.

### Back-End (API)

* **Linguagem: Java 17**
    * Utilização dos recursos modernos da linguagem para a construção de uma aplicação robusta e performática.

* **Framework: Spring Boot**
    * **Spring Web:** Utilizado para a criação de controladores RESTful (`@RestController`) e exposição dos endpoints da API, facilitando a comunicação com o front-end através do protocolo HTTP.
    * **Spring Data JPA:** Abstração para persistência de dados. Simplifica a interação com o banco de dados através da interface `JpaRepository`, reduzindo a necessidade de escrever queries SQL manualmente.
    * **Injeção de Dependência:** Conceito central do Spring utilizado para gerenciar os componentes da aplicação (como Services e Repositories), promovendo baixo acoplamento e facilitando os testes.

* **Banco de Dados: H2 Database**
    * Banco de dados relacional em memória, escolhido para agilizar o desenvolvimento e os testes, permitindo que a aplicação funcione de forma autônoma sem a necessidade de configuração de um banco externo.

### Front-End (Interface Web)

* **Framework: Angular**
    * Framework robusto para a criação de Single Page Applications (SPAs). Utilizado para construir uma interface de usuário dinâmica e reativa.

* **Linguagem: TypeScript**
    * Superset do JavaScript que adiciona tipagem estática, ajudando a prevenir erros comuns e melhorando a manutenibilidade do código front-end.

* **Padrões de Arquitetura Angular:**
    * **Componentes Standalone:** Arquitetura moderna do Angular que simplifica a estrutura do projeto, tornando os componentes mais independentes.
    * **Serviços (`Services`):** Utilizados para isolar a lógica de acesso à API. O `TarefaService` centraliza as chamadas `HttpClient`, seguindo o princípio de responsabilidade única.
    * **Binding de Dados e Diretivas (`*ngFor`, `*ngIf`):** Utilizados para renderizar dinamicamente a lista de tarefas e exibir mensagens condicionais, conectando os dados do componente ao template HTML.

### Ferramentas e Ecossistema

* **Git e GitHub:** Sistema de controle de versão para gerenciamento do código-fonte e portfólio.
* **Insomnia/Postman:** Ferramenta utilizada para testes e validação dos endpoints da API back-end.
* **Maven:** Gerenciador de dependências e build do projeto Java.

## 3. Funcionalidades Atuais

* **Listagem de Tarefas:** A interface consome a API back-end e exibe todas as tarefas cadastradas.
* **Tratamento de Lista Vazia:** Exibição de uma mensagem amigável quando nenhuma tarefa está cadastrada.
* **(Em Breve) Criação de Tarefas:** Implementação do formulário no front-end para adicionar novas tarefas.

## 4. Como Executar o Projeto

Instruções para configurar e executar o projeto localmente.

### Pré-requisitos
* Java JDK 17+
* Node.js e npm
* Angular CLI (`npm install -g @angular/cli`)

### Back-end
```bash
# 1. Clone este repositório
git clone [URL_DO_SEU_REPOSITORIO]

# 2. Navegue até a pasta do back-end
cd task-manager-api

# 3. Execute a aplicação
./mvnw spring-boot:run
# A API estará disponível em http://localhost:8080

# 1. Em um novo terminal, navegue até a pasta do front-end
cd task-manager-ui

# 2. Instale as dependências
npm install

# 3. Execute o servidor de desenvolvimento
ng serve
# A aplicação estará disponível em http://localhost:4200
