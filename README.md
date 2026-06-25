# 🔐 API de Usuários

API REST desenvolvida com Java e Spring Boot para cadastro e autenticação de usuários, utilizando Spring Data JPA para persistência, JWT para autenticação e Swagger/OpenAPI para documentação.

O projeto aplica conceitos importantes de desenvolvimento backend, como arquitetura em camadas, DTOs, validações de negócio, criptografia de senha e integração com aplicações frontend.

---

## 🚀 Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* JWT (JSON Web Token)
* Swagger / OpenAPI
* Maven
* MySQL
* Lombok

---

## ✨ Funcionalidades

* Cadastro de usuários
* Autenticação de usuários
* Geração de token JWT
* Criptografia de senha com SHA-256
* Validação de senha forte
* Validação de e-mail único
* Definição de perfil de usuário
* Persistência de dados com Spring Data JPA
* Documentação automática com Swagger
* Configuração de CORS para integração com frontend Angular

---

## 🏗️ Arquitetura do Projeto

O projeto segue uma arquitetura em camadas, separando responsabilidades entre configuração, controle, regras de negócio, persistência e transferência de dados.

```text
src/
├── configurations
├── controllers
├── dtos
├── entities
├── enums
├── repositories
└── services
```

---

## 📌 Endpoints

| Método | Endpoint                     | Descrição                                   |
| ------ | ---------------------------- | ------------------------------------------- |
| POST   | `/api/v1/usuario/criar`      | Cadastra um novo usuário                    |
| POST   | `/api/v1/usuario/autenticar` | Autentica um usuário e retorna um token JWT |

---

## 🔒 Recursos de Segurança

* Geração de token JWT
* Criptografia de senha com SHA-256
* Validação de senha forte com Regex
* Validação de e-mail já cadastrado
* Controle de perfil de usuário
* Configuração de CORS

---

## 🧠 Conceitos Aplicados

* Programação Orientada a Objetos
* Arquitetura em camadas
* DTOs com Records
* Spring Data JPA
* Injeção de dependência
* Mapeamento de entidade com JPA
* Enum para perfil de usuário
* UUID como identificador
* Tratamento de exceções
* Boas práticas para APIs REST
* Integração Backend e Frontend

---

## ▶️ Como Executar

### Pré-requisitos

* Java 21+
* Maven
* MySQL

### Clonar o projeto

```bash
git clone https://github.com/beatrizlima-tech/api-usuarios.git
```

### Configurar o banco de dados

Configure as credenciais no arquivo:

```text
application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/api_usuarios
spring.datasource.username=root
spring.datasource.password=sua_senha
jwt.secret=sua_chave_secreta
```

### Executar a aplicação

```bash
mvn spring-boot:run
```

A API ficará disponível em:

```text
http://localhost:8080
```

A documentação Swagger poderá ser acessada em:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## 📚 Objetivo

Este projeto foi desenvolvido para praticar o desenvolvimento de APIs REST com Spring Boot, aplicando autenticação baseada em JWT, persistência com Spring Data JPA, validações de negócio, documentação com Swagger e integração com aplicações frontend.

---

## 👩‍💻 Autora

**Beatriz Lima de Oliveira**

GitHub:
https://github.com/beatrizlima-tech
