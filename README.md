# RESTful API - Conta Bancária | DIO
SpringBoot3 | MySql | Railway

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
- `application-dev.yaml`
- `application-prod.yaml`

## Deploy
- Hospedado com Railway
- Banco de Dados MySql
- Documentado com OpenApi (Swagger)