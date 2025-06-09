# Task Board Manager

Um sistema de gerenciamento de tarefas desenvolvido em Java com persistência em MySQL, inspirado em metodologias ágeis como Kanban.

## 📋 Sobre o Projeto

Este projeto é um organizador de tarefas que permite criar e gerenciar quadros (boards) com diferentes colunas para acompanhamento do fluxo de trabalho. O sistema foi desenvolvido para praticar conceitos de persistência em banco de dados utilizando Java e MySQL, implementando um CRUD completo e gestão de estados das tarefas.

## 🚀 Funcionalidades

- Criação e gerenciamento de quadros (boards)
- Sistema flexível de colunas com estados:
  - Coluna inicial (para novas tarefas)
  - Colunas intermediárias personalizáveis
  - Coluna final (para tarefas concluídas)
  - Coluna de cancelamento
- Gestão completa de tarefas (cards) com:
  - Título e descrição
  - Movimentação entre colunas
  - Sistema de bloqueio de cards
  - Contagem de cards por coluna

## 🛠️ Tecnologias Utilizadas

- Java 17
- MySQL 8.0
- Liquibase (para controle de versão do banco de dados)
- Lombok (para redução de boilerplate)
- Maven (gerenciamento de dependências)
- JDBC para conexão com banco de dados

## 📦 Estrutura do Projeto

O projeto segue uma arquitetura em camadas:

- `dto`: Objetos de transferência de dados
- `entity`: Entidades do domínio
- `service`: Regras de negócio
- `persistence`: Camada de acesso a dados
  - `dao`: Classes de acesso ao banco
  - `config`: Configurações de conexão
- `ui`: Interface com usuário

## 🔧 Configuração e Instalação

1. Clone o repositório

2. Crie um banco de dados MySQL para o projeto:
   ```sql
   CREATE DATABASE board_manager;
   ```

3. Configure as credenciais de acesso ao banco:
   - Localize o arquivo `liquibase.properties` e `ConnectionConfig.java`
   - Atualize as seguintes informações com suas credenciais:
   ```properties
   # Em liquibase.properties
   url=jdbc:mysql://localhost:3306/seu_banco_de_dados
   username=seu_usuario
   password=sua_senha
   ```
   ```java
   // Em ConnectionConfig.java
   String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
   String user = "seu_usuario";
   String password = "sua_senha";
   ```

4. Execute os scripts de migração do Liquibase:
   ```bash
   mvn liquibase:update
   ```

5. Compile o projeto usando Maven:
   ```bash
   mvn clean install
   ```

## 💡 Aprendizados do Projeto

Este projeto foi desenvolvido para praticar:

- Persistência de dados com JDBC
- Padrões de projeto DAO (Data Access Object)
- Gerenciamento de transações
- Mapeamento objeto-relacional
- Controle de versão de banco de dados com Liquibase
- Arquitetura em camadas

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para:

1. Fazer um fork do projeto
2. Criar uma branch para sua feature
3. Commitar suas mudanças
4. Fazer push para a branch
5. Abrir um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

