⚠️ **Este projeto está em desenvolvimento.** Algumas funcionalidades podem estar incompletas ou sujeitas a mudanças.
---

# 🧪 Java Spring — Testes Automatizados com JUnit & Mockito

🔗 [![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-yellow?style=for-the-badge)]()

🔗 [![Framework](https://img.shields.io/badge/Spring-Boot-brightgreen?style=for-the-badge)](https://spring.io/projects/spring-boot)

🔗 [![Linguagem](https://img.shields.io/badge/Linguagem-Java-blue?style=for-the-badge)](https://www.oracle.com/java/)

🔗 [![Testes](https://img.shields.io/badge/Testes-JUnit_5_&_Mockito-orange?style=for-the-badge)](https://junit.org/junit5/)

🔗 [![Licença](https://img.shields.io/badge/Licença-MIT-green?style=for-the-badge)](LICENSE)

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
- Docker (para testes com Testcontainers, opcional)

---

### 📌 Em Desenvolvimento
- 🔄 Testes com autenticação (JWT + Spring Security)
- 📦 Integração com Testcontainers e PostgreSQL
- 🧪 Mock de serviços externos via WireMock
- 📈 Dashboard de cobertura integrado com GitHub Actions
- ♻️ Refatoração de testes para uso com RestAssured

---

###🤝 Contribuindo
- Contribuições são muito bem-vindas! Se você deseja propor melhorias, abrir issues ou enviar pull requests, fique à vontade. 🚀

---

### 📄 Licença
- Este projeto está licenciado sob a licença MIT.
