# Projeto Blog Pessoal
Este é um projeto de blog pessoal desenvolvido com Spring Boot. Ele permite que os usuários se registrem, façam login, criem e gerenciem posts no blog.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Maven
- Spring Data JPA
- Spring Security
- JWT (JSON Web Tokens)
- MySQL (para banco de dados principal/produção)
- PostgreSQL (como alternativa de banco de dados principal/produção)
- H2 Database (para testes)
- SpringDoc OpenAPI (para documentação da API)

## Funcionalidades
- Registro e autenticação de usuário (Login/Logout)
- Segurança baseada em JWT para os endpoints da API
- Operações de Criar, Ler, Atualizar e Deletar (CRUD) para posts do blog
- (Usuário pode adicionar funcionalidades mais específicas aqui)

## Como Começar

### Pré-requisitos
- JDK 17 ou superior (conforme especificado no `pom.xml`)
- Maven 3.6 ou superior
- Git

### Clonando o Repositório

```bash
git clone <repository_url>
cd blogpessoal
```

(Observação: Substitua `<repository_url>` pela URL real deste repositório.)

## Instalação e Execução
Com os pré-requisitos instalados e o repositório clonado, navegue até o diretório do projeto (`blogpessoal`).

### Configuração do Banco de Dados
Antes de executar a aplicação, você precisará configurar a conexão com o banco de dados. Veja a seção 'Configuração' abaixo.

### Executando a Aplicação
Você pode executar a aplicação usando o Maven com o seguinte comando:
```bash
mvn spring-boot:run
```
Este comando iniciará o servidor Tomcat embutido (ou servidor apropriado com base na configuração do Spring Boot), e a aplicação estará acessível, geralmente em `http://localhost:8080`.

Perfis do Spring Boot podem ser usados para diferenciar configurações (ex: `dev`, `prod`). Se for o caso, você pode precisar ativar um perfil específico. Verifique o arquivo `application.properties` e suas variantes (ex: `application-dev.properties`, `application-prod.properties`). Por exemplo, para executar com o perfil 'dev':

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## Configuração
As configurações da aplicação, incluindo detalhes da conexão com o banco de dados, são definidas em `src/main/resources/application.properties`.

Este projeto utiliza arquivos de propriedades específicos por perfil:
- `application-dev.properties`: Para ambiente de desenvolvimento.
- `application-prod.properties`: Para ambiente de produção.
O perfil ativo determina quais propriedades de arquivo sobrescrevem os padrões do `application.properties`.

Por exemplo, para configurar um banco de dados MySQL para o perfil 'dev', você atualizaria o arquivo `src/main/resources/application-dev.properties` com a URL do banco, nome de usuário e senha:
```properties
# Exemplo para application-dev.properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_blog_db_dev?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update # Ou 'create' para configuração inicial, 'validate' para produção

# Para PostgreSQL, a URL seria como:
# spring.datasource.url=jdbc:postgresql://localhost:5432/your_blog_db_dev
```
Certifique-se de que a dependência do driver JDBC apropriado (MySQL ou PostgreSQL) está ativa em seu `pom.xml` se você alternar entre eles, embora ambos estejam incluídos.

## Documentação da API
Este projeto utiliza SpringDoc OpenAPI para gerar a documentação da API. Com a aplicação em execução, você pode acessar a interface do Swagger UI no seu navegador.

Normalmente, a documentação está disponível em uma das seguintes URLs:
 - [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)
 - [`http://localhost:8080/swagger-ui/index.html`](http://localhost:8080/swagger-ui/index.html)

O caminho base para a especificação OpenAPI geralmente é:
 - [`http://localhost:8080/v3/api-docs`](http://localhost:8080/v3/api-docs)

(A porta `8080` é a padrão; se você configurou uma porta de servidor diferente, ajuste a URL de acordo.)

## Credenciais
Para acessar a aplicação, utilize as seguintes credenciais padrão:
```
Usuário: root@root.com
Senha: rootroot
```
**Observação:** Estas são credenciais padrão, presumivelmente para fins de desenvolvimento e teste. É altamente recomendável alterar essas credenciais em um ambiente de produção por motivos de segurança.
