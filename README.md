![image](https://github.com/user-attachments/assets/450fa558-5a4c-472d-9963-a57cd115d01b)# API de Pedidos

Este repositório contém uma API RESTful para gerenciamento de pedidos de uma loja. A API permite criar, buscar, atualizar e deletar pedidos.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Banco de Dados H2 (em memória)

## Endpoints

### 1. Criar um Pedido
- **Método**: `POST`
- **URL**: `/pedidos`
- **Descrição**: Cria um novo pedido.
- **Corpo da Requisição**:

```json
{
  "clienteNome": "João Silva",
  "valorTotal": 150.75
}
````
Resposta de Sucesso
```
{
  "id": 1,
  "clienteNome": "João Silva",
  "dataPedido": "2025-03-25",
  "valorTotal": 150.75
}
```
Resposta de Erro
````
{
  "timestamp": "2025-03-25T09:10:00",
  "status": 400,
  "error": "Bad Request",
  "message": "O nome do cliente é obrigatório."
}

````
### 2. Criar um Pedido
- **Método**: `GET`
- **URL**: `/pedidos`
- **Descrição**: Retorna todos os pedidos cadastrados.

### 3. Buscar um Pedido pelo ID
- **Método**: `GET`
- **URL**: `/pedidos/{id}`
- **Descrição**: Retorna um pedido específico pelo ID.

- ### 4. Atualizar um Pedido
- **Método**: `PUT`
- **URL**: `/pedidos/{id}`
- **Descrição**: Atualiza as informações de um pedido existente.
 
- ### 5. Deletar um Pedido
- **Método**: `DELETE`
- **URL**: `/pedidos/{id}`
- **Descrição**: Deleta um pedido existente.
- Resposta de Sucesso (204 No Content): Não há corpo de resposta, apenas o status de sucesso.
- Resposta de Erro (404 Not Found):

### Configuração do Banco de Dados H2
O banco de dados H2 é utilizado por padrão e é configurado para ser utilizado em memória. Para acessar o H2 Console, vá para:

http://localhost:8080/h2-console

Use as seguintes configurações:
- JDBC URL: jdbc:h2:mem:testdb
- User: sa


### Como Rodar a Aplicação
- Clone o repositório para sua máquina local.
- Navegue até o diretório do projeto.
- Execute o comando mvn clean install para compilar a aplicação.
- Execute a aplicação com mvn spring-boot:run.
- A API estará disponível em http://localhost:8080.

- ### Explicação do README:

1. **Informações iniciais**: O projeto e as tecnologias utilizadas são descritas.
2. **Endpoints**: Cada endpoint tem um título, método HTTP, URL, descrição e exemplos de requisições e respostas (sucesso e erro).
3. **Testando a API**: Há exemplos de como realizar as requisições usando Postman ou Insomnia.
4. **Configuração do Banco de Dados**: O README descreve como acessar o console H2 e como configurar o banco de dados para persistência.
5. **Como rodar o projeto**: Passo a passo para rodar a aplicação localmente.
6. **Licença**: Informação sobre a licença do projeto.

Esse modelo de **README.md** torna seu repositório bem documentado, facilitando a compreensão e o uso da API.


