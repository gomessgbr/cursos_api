# Cadastro de Cursos API

## Descrição
A API Cadastro de Cursos é uma aplicação desenvolvida em Java com Spring Boot para o gerenciamento de cursos. Ela permite o cadastro, a listagem, a atualização e a remoção de cursos, facilitando a gestão de informações educacionais.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada no desenvolvimento.
- **Spring Boot**: Framework para facilitar a configuração e o desenvolvimento de aplicações em Java.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados para armazenamento das informações.
- **Docker**: Utilizado para containerizar e gerenciar a imagem do banco de dados PostgreSQL.
- **Lombok**: Biblioteca Java que automatiza a escrita de código boilerplate.

## Como Executar

### Pré-requisitos
- Java JDK 17 ou superior
- Maven para gerenciamento de dependências
- Docker instalado para execução do banco de dados

### Passos

1. Clone o repositório
   
```bash
    git clone https://github.com/gomessgbr/cursos_api.git
```

2. Navegue até o diretório do projeto
```bash
  cd cursos_api
```

3. Utilize o Docker para subir a instância do PostgreSQL
 ```bash
    docker-compose up -d
 ```

4. Execute a aplicação via Maven
```bash
  mvn spring-boot:run
```



## Endpoints da API

### Gestão de Cursos
- `POST /courses/`: Cria um novo curso.
- `GET /courses/`: Lista todos os cursos.
- `PUT /courses/{id}`: Modifica o nome e a categoria do curso. É necessário passar o nome ou a categoria no body da requisição.
- `DELETE /courses/{id}`: Remove um curso do sistema.

