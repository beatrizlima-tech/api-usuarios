# 🔐 API Usuários

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-green?style=for-the-badge\&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge\&logo=postgresql)
![JWT](https://img.shields.io/badge/JWT-Autenticação-black?style=for-the-badge)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-85EA2D?style=for-the-badge\&logo=swagger)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)

---

# 📌 Sobre o projeto

A **API Usuários** é uma aplicação backend desenvolvida com **Java** e **Spring Boot** para cadastro e autenticação de usuários.

O projeto utiliza **Spring Data JPA** para persistência de dados, **JWT** para geração de tokens de autenticação, criptografia de senhas com **SHA-256** e documentação automática utilizando **Swagger/OpenAPI**, seguindo uma arquitetura organizada em camadas.

---

# 🚀 Funcionalidades

* Cadastro de usuários
* Autenticação de usuários
* Geração de token JWT
* Criptografia de senha com SHA-256
* Validação de senha forte
* Validação de e-mail único
* Controle de perfis de usuário
* Persistência com Spring Data JPA
* Documentação da API com Swagger/OpenAPI
* Configuração de CORS para integração com aplicações frontend

---

# 🔒 Recursos de Segurança

* Geração de Token JWT
* Criptografia de senha utilizando SHA-256
* Validação de senha forte com Regex
* Validação de e-mail já cadastrado
* Perfis de usuário (Usuário Comum e Administrador)
* Configuração de CORS

---

# 🧱 Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Web MVC
* Spring Data JPA
* PostgreSQL
* JWT (JJWT)
* Swagger / OpenAPI
* Lombok
* Maven

---

# 🏗️ Estrutura do Projeto

```text
src/main/java/br/com/cotiinformatica/api_usuarios/

├── configurations
├── controllers
├── dtos
├── entities
├── enums
├── repositories
└── services
```

---

# 🔗 Endpoints

| Método | Endpoint                     | Descrição                     |
| ------ | ---------------------------- | ----------------------------- |
| POST   | `/api/v1/usuario/criar`      | Cadastro de usuário           |
| POST   | `/api/v1/usuario/autenticar` | Autenticação e geração do JWT |

---

# ⚙️ Como Executar

## 1. Clone o repositório

```bash
git clone https://github.com/beatrizlima-tech/api-usuarios.git
```

## 2. Configure o banco de dados

Edite o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=postgres
spring.datasource.password=sua_senha

jwt.secret=sua_chave_secreta
```

---

## 3. Execute a aplicação

```bash
mvn spring-boot:run
```

---

## 4. Acesse a documentação

```text
http://localhost:8080/swagger-ui.html
```

---

# 📊 Arquitetura

```text
Cliente (Frontend)
        │
        ▼
Controller
        │
        ▼
Service
        │
        ▼
Repository (Spring Data JPA)
        │
        ▼
PostgreSQL
```

---

# 📚 Conceitos Aplicados

* Programação Orientada a Objetos
* Arquitetura em Camadas
* Spring Boot
* Spring Data JPA
* API REST
* DTO Pattern
* Injeção de Dependência
* JWT
* SHA-256
* Regex para validação
* PostgreSQL
* Swagger/OpenAPI
* Integração Backend e Frontend

---

# 📌 Melhorias Futuras

* Implementar filtro JWT para proteger endpoints
* Controle de acesso por perfil
* Refresh Token
* Bean Validation
* Tratamento global de exceções
* Testes automatizados
* Dockerização da aplicação

---

# 👩‍💻 Autora

Desenvolvido por **Beatriz Lima**

🔗 GitHub
https://github.com/beatrizlima-tech

💼 LinkedIn
https://www.linkedin.com/in/beatrizlima-tech
