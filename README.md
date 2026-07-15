# 📋 TaskFlow Agile

## 📖 Descrição

O TaskFlow Agile é um sistema simples de gerenciamento de tarefas desenvolvido em Java com o objetivo de aplicar conceitos de Engenharia de Software, Programação Orientada a Objetos e Metodologias Ágeis.

O projeto foi desenvolvido como atividade prática da disciplina de Engenharia de Software, simulando o desenvolvimento de um software real utilizando GitHub para gerenciamento de código, controle de versões e integração contínua.

---

# Objetivos

O sistema permite:

- Criar tarefas
- Listar tarefas
- Buscar tarefas por ID
- Atualizar tarefas
- Excluir tarefas

---

# Escopo Inicial

O escopo inicial previa o desenvolvimento de um CRUD simples para gerenciamento de tarefas contendo:

- ID
- Título
- Descrição

Durante o desenvolvimento foi realizada uma mudança de escopo adicionando os campos:

- Prioridade
- Status

Essa alteração permitiu um gerenciamento mais eficiente das tarefas.

---

# Metodologia Ágil

Foi utilizada a metodologia Kanban para organizar o desenvolvimento.

As tarefas foram distribuídas nas colunas:

- To Do
- In Progress
- Done

Cada funcionalidade foi implementada individualmente utilizando commits semânticos.

---

# Tecnologias

- Java 21
- Maven
- Git
- GitHub
- GitHub Actions
- JUnit 5

---

# Estrutura do Projeto

```
taskflow-agile

src
 ├── main
 │     ├── model
 │     ├── repository
 │     ├── service
 │     └── Main.java
 │
 └── test
       └── TaskServiceTest.java

docs

.github
     workflows

README.md
pom.xml
```

---

# Como executar

Compilar

```
mvn clean compile
```

Executar

```
mvn exec:java
```

Executar testes

```
mvn test
```

---

# Testes Automatizados

O projeto utiliza JUnit 5.

Foram implementados testes para:

- Cadastro
- Busca
- Atualização
- Exclusão
- Listagem

Os testes são executados automaticamente através do GitHub Actions.

---

# Integração Contínua

Sempre que um commit é enviado para a branch principal, o GitHub Actions:

- Compila o projeto
- Executa todos os testes
- Informa se o build foi aprovado

---

# Mudança de Escopo

Durante o desenvolvimento foi identificada a necessidade de incluir um sistema de prioridade e status das tarefas.

Essa alteração foi registrada no quadro Kanban e implementada posteriormente, demonstrando a flexibilidade proporcionada pelas metodologias ágeis.

---

# Autor

Lucas Forini
