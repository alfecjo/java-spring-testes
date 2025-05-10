# 🧪 Java Spring & Testes

🔗 [![Status](https://img.shields.io/badge/Bootcamp-Santander-yellow?style=for-the-badge)](./bootcamp-santander-soulCode-universia)

<p>
  🚀 Explore o Bootcamp Santander com foco em <strong>Java</strong>, <strong>HTML</strong>, <strong>CSS</strong> e <strong>JavaScript</strong>. Uma jornada completa com fundamentos de back-end e front-end, ideal para quem busca uma formação básica e prática em desenvolvimento web.
</p>

---

🔗 [![Framework](https://img.shields.io/badge/UTFPR-Avaliação-brightgreen?style=for-the-badge)](./avaliacao_UTFPR)

<p>
🚀 Explore avaliação prática do curso de Pós-graduação em Tecnologia Java da <strong>UTFPR - Universidade Tecnológica Federal do Paraná</strong>, disciplina <strong> Banco de Dados</strong>, abordando desenvolvimento com <strong>Java</strong> e <strong>Spring Framework</strong>. O projeto consolida conhecimentos introdutório da stack Java com foco em aplicações robustas e profissionais.
</p>

---

🔗 [![Linguagem](https://img.shields.io/badge/Linguagem-Java_I-blue?style=for-the-badge)](./java_I)

<p>
🎓 Explore avaliação prática da disciplina <strong>Java I</strong> do curso de Pós-graduação em Tecnologia Java da <strong>UTFPR - Universidade Tecnológica Federal do Paraná</strong>. Esta etapa introdutória explora os fundamentos essenciais da linguagem <strong>Java</strong>, como sintaxe, estruturas de controle, orientação a objetos, tratamento de exceções e manipulação básica de dados. Ideal para consolidar a base do desenvolvimento profissional com Java puro.
</p>

🔗 [![Linguagem](https://img.shields.io/badge/Linguagem-Java_II-blue?style=for-the-badge)](./java_II)

<p>
🎓 Explore avaliação prática da disciplina <strong>Java II</strong> do curso de Pós-graduação em Tecnologia Java da <strong>UTFPR - Universidade Tecnológica Federal do Paraná</strong>. Esta fase aprofunda os conceitos de programação com <strong>Java</strong>, incluindo coleções, tratamento avançado de exceções, entrada/saída de dados (I/O), programação orientada a eventos e uso de bibliotecas utilitárias. Um passo essencial para avançar no desenvolvimento de aplicações robustas.
</p>

🔗 [![Linguagem](https://img.shields.io/badge/Java-Redes_de_Computadores-blue?style=for-the-badge)](./redes)

<p>
🎓 Explore avaliação prática da disciplina <strong>Programação Java para Redes de Computadores</strong> do curso de Pós-graduação em Tecnologia Java da <strong>UTFPR - Universidade Tecnológica Federal do Paraná</strong>. Esta etapa explora a criação de aplicações cliente-servidor usando <strong>sockets TCP/UDP</strong>, manipulação de <strong>streams de dados</strong>, <strong>protocolos de comunicação</strong> e fundamentos de <strong>programação distribuída</strong> com Java. Ideal para quem busca aplicar a linguagem na área de redes e sistemas conectados.
</p>

---

🔗 [![Testes](https://img.shields.io/badge/Redes-UTFPR-orange?style=for-the-badge)](./redes)

---

🔗 [![Licença](https://img.shields.io/badge/Licença-MIT-green?style=for-the-badge)](LICENSE)

---

## 📌 Descrição

Este repositório contém exemplos práticos de **testes automatizados em aplicações Java Spring**, utilizando os frameworks **JUnit 5**, **Mockito**, **Spring Test**, e outras ferramentas modernas. O foco está em demonstrar boas práticas de **testes unitários, de integração, mock e testes de camada web (MockMvc)**, incluindo cobertura de código e organização modular dos testes.

> ⚠️ **Este projeto está em desenvolvimento.** Algumas funcionalidades podem estar incompletas ou sujeitas a mudanças.

---

## 🚀 Tecnologias Utilizadas

- ☕ **Java 17+**
- 🌱 **Spring Boot 3.x**
- ✅ **JUnit 5 (Jupiter)**
- 🧪 **Mockito**
- 🌐 **Spring Web & Spring Test**
- 🧬 **Testcontainers (para testes com bancos reais em Docker)**
- 📊 **JaCoCo (cobertura de testes)**

---

## 📁 Estrutura do Projeto

```bash
java-spring-testes/
├── src/
│   ├── main/
│   │   └── java/com/exemplo/app/
│   └── test/
│       └── java/com/exemplo/app/
│           ├── service/
│           │   └── UserServiceTest.java
│           ├── controller/
│           │   └── UserControllerTest.java
│           └── integration/
│               └── UserRepositoryIT.java
├── .gitignore
├── pom.xml
└── README.md
```
---

### 🧪 Exemplos de Testes
- ✅ Testes Unitários com JUnit 5
- ✅ Mocks e Spies com Mockito
- ✅ Testes de API com MockMvc e WebMvcTest
- ✅ Testes de Integração com SpringBootTest
- ✅ Testes com banco real via Testcontainers
- ✅ Análise de cobertura com JaCoCo

### 🛠️ Execução dos Testes

```bash
# Executar todos os testes com Maven
mvn clean test

# Gerar relatório de cobertura com JaCoCo
mvn jacoco:report

```
---

### ✅ Requisitos
- Java JDK 17+
- Maven 3.8+
- H2 
- Docker (para testes com Testcontainers, roda PostGres ou MariaDB, MySQL, MongoDB, Redis )

---

### 📌 Em Desenvolvimento
- 🔄 Testes com autenticação (JWT + Spring Security)
- 📦 Integração com Testcontainers e PostgreSQL
- 🧪 Mock de serviços externos via WireMock
- 📈 Dashboard de cobertura integrado com GitHub Actions
- ♻️ Refatoração de testes para uso com RestAssured

---

### 🤝 Contribuindo
- Contribuições são muito bem-vindas! Se você deseja propor melhorias, abrir issues ou enviar pull requests, fique à vontade. 🚀

---

### 📄 Licença
- Este projeto está licenciado sob a licença MIT.

---

- ## Return
  [![Main Page](https://img.shields.io/badge/Main-Page?style=for-the-badge&logo=github&logoColor=white)](https://github.com/alfecjo)
