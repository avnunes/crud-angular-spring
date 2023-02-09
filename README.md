# REST API com Spring Boot e Angular


CRUD Angular + Spring.

## 💻 Tecnologias

   - Java 17
   - Spring Boot 3 (Spring 6)
   - JPA + Hibernate
   - JUnit 5 + Mockito (back-end tests)
   - Maven
   - Angular v15
   - Angular Material
   - Karma + Jasmine (front-end tests)

## ⌨️ Editor / IDE

   - Visual Studio Code
   - Java Extensions [link](https://marketplace.visualstudio.com/items?itemName=loiane.java-spring-extension-pack)
   - Angular Extensions [link](https://marketplace.visualstudio.com/items?itemName=loiane.angular-extension-pack)

## Algumas funcionalidades disponíveis na API:

   - ✅ Java model class with validation
   - ✅ JPA repository
   - ✅ JPA Pagination
   - ✅ Controller, Service and Repository layers
   - ✅ Has-Many relationship (Course-Lessons)
   - ✅ Java 17 Records as DTO (Data Transfer Object)
   - ✅ Hibernate / Jakarta Validation
   - ✅ Unit tests for all layers (repository, service, controller)
   - ✅ Test coverage for tests
   - ✅ Spring Docs - Swagger (https://springdoc.org/v2/)


## Algumas funcionalidades disponíveis no Front-end:

   - ✅ Angular Material components
   - ✅ List of all courses
   - ✅ Form to update/create courses with lessons (has-many - FormArray)
  - - [ ] Form async validation for duplicated courses and lessons
  - - [ ] View only screen
   - ✅ TypedForms (Angular v14+)
   - ✅ Presentational x Smart Components
    [In Progress] Unit and Integration tests for components, services, pipes, guards

## ❗️Executando o código localmente
### Executando o back-end:

Java e o Maven instalados e configurados localmente.

Abra o projeto crud-spring em seu IDE com um projeto Maven e execute-o com Spring Boot.

### Executando o front-end:

Precisa ter o Node.js/NPM instalado localmente.

   ## Instale todas as dependências necessárias:

npm install

   ## Executar o projeto:

npm run start

Este comando executará o projeto Angular com um proxy para o servidor Java, sem a necessidade de CORS.

Abra o navegador e acesse http://localhost:4200 (Porta padrão angular).
