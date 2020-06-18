# CRUD em Spring Boot

## Introdução

**Projeto**: Restaurante do Seu Zé

**Entidades**:

- Dish - (id, name, description, price, isDessert)

**Endpoints**:

- GET - `"/{id}"` (Buscar um prato específico)
- GET - `"/"` (Buscar todos os pratos)
- POST - `"/"` (Criar um novo prato)
- PUT - `"/{id}"` (Editar um prato)
- DELETE - `"/{id}"` (Deletar um prato)

**Tecnologias**:

- Spring Boot + JPA + Lombok;
- MySQL;

Spring Boot + JPA é uma forma muito simples de construir aplicações de forma rápida, organizada e eficiente, tornando-o um candidato perfeito para um CRUD simples.

MySQL é um banco de dados relacional que consegue consegue atender à modelagem básica de um CRUD simples, também deixa uma oportunidade de escalabilidade com relacionamentos mais complexos.

## Setup

Na pasta raiz temos um dump para mais fácil acesso, para restaurá-lo use `mysql -u {seu_usuario} -p restaurante_doze < dump.sql`

Na `application.properties`, se conecte com o banco de dados substituindo esses dados pelos seus reais

```
spring.datasource.username = {insert_username}
spring.datasource.password = {insert_pass}
```

Para executar o projeto o abra na IDE da sua escolha ou se preferir: `mvn spring-boot:run`

Após isso, execute um: maven run a aplicação vai estar _up and running_ na porta 8080.
