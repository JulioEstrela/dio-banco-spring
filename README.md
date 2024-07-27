# RESTful API - Conta Bancária | DIO
Spring Boot 3 | MySql | Railway

## Diagrama de Classes UML:
```mermaid
classDiagram
    class User {
        -name: String
        -account: Account
        -featureList: Feature[]
        -card: Card
        -newsList: News[]
    }

    class Account {
        -number: String
        -agency: String
        -balance: BigDecimal
        -limit: BigDecimal
    }

    class Feature {
        -icon: String
        -description: String
    }

    class Card {
        -number: String
        -limit: BigDecimal
    }

    class News {
        -icon: String
        -description: String
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```

## Perfis de usuário
Dois perfis de usuário:
- `application-dev.yaml`:  
  Banco de Dados em memória (H2 Database)
- `application-prd.yaml`:  
  Banco de Dados no docker do Railway (MySql)

## Deploy
- Hospedado com Railway: (removido 💸)
  ![image](https://github.com/user-attachments/assets/1ef95ac3-d9c4-4297-81cb-6f45d3a5aa5e)
- Documentado com OpenApi (Swagger):
  ![image](https://github.com/user-attachments/assets/8871bb76-23c5-4279-bf61-68892cae61e4)

