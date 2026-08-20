\# Order \& Inventory Management System (OMS)



Backend REST API for managing products, inventory, orders,

billing, and role-based access for retail businesses.



\## Project Info

\- \*\*Jira Project\*\* : Backend-Genius (OIMS)

\- \*\*Architecture\*\* : Modular Monolith + Notification Microservice

\- \*\*Status\*\*       : In Development



\## Tech Stack

| Technology              | Version  | Purpose                    |

|-------------------------|----------|----------------------------|

| Java                    | 21.0.12  | Programming Language       |

| Spring Boot             | 4.0.7    | Backend Framework          |

| Spring Security         | 4.0.7    | Authentication             |

| Spring Data JPA         | 4.0.7    | ORM / Database Layer       |

| Hibernate               | 6.x      | JPA Implementation         |

| MySQL                   | 9.6.0    | Relational Database        |

| Maven                   | 3.9.16   | Build Tool                 |

| Swagger / OpenAPI       | 3.1.0    | API Documentation          |

| Redis                   | -        | Caching (UC8)              |

| Apache Kafka            | -        | Async Messaging (UC9)      |

| Docker                  | -        | Containerization (UC12)    |



\## Architecture



Controller Layer → Receives HTTP requests

↓

Service Layer → Business logic

↓

Repository Layer → Database operations

↓

MySQL Database → Data persistence



\[Async] Kafka → Notification Microservice





\## Module Plan

| Module         | Story   | Status      |

|----------------|---------|-------------|

| User Auth      | OIMS-1  | In Progress |

| Login JWT      | OIMS-2  | To Do       |

| Product CRUD   | OIMS-3  | To Do       |

| Inventory      | OIMS-4  | To Do       |

| Order Flow     | OIMS-5  | To Do       |

| Billing        | OIMS-6  | To Do       |

| Redis Cache    | OIMS-7  | To Do       |

| Kafka Notify   | OIMS-8  | To Do       |

| Reports        | OIMS-9  | To Do       |

| Testing        | OIMS-10 | To Do       |

| Docker Deploy  | OIMS-11 | To Do       |



\## Package Structure



com.oms.orderinventory

├── config/

├── controller/

├── service/

│ └── impl/

├── repository/

├── entity/

├── dto/

│ ├── request/

│ └── response/

├── exception/

├── filter/

└── util/





\## Environment Setup

| Tool       | Version  | Purpose          |

|------------|----------|------------------|

| Java       | 21.0.12  | Runtime          |

| Maven      | 3.9.16   | Build            |

| MySQL      | 9.6.0    | Database         |

| STS        | Latest   | IDE              |

| Git        | Latest   | Version Control  |

| Postman    | Latest   | API Testing      |



\## Database

\- \*\*Host\*\*     : localhost

\- \*\*Port\*\*     : 3306

\- \*\*Database\*\* : oms\_db

\- \*\*User\*\*     : root



\## Getting Started



\### Prerequisites

\- Java 21+

\- MySQL 9.6.0+

\- Maven 3.9.16+



\### Clone Repository

```bash

git clone https://github.com/rudy007225/order-inventory-system.git

cd order-inventory-system

```



\### Configure Database

```bash

mysql -u root -p

CREATE DATABASE oms\_db;

```



\### Run Application

```bash

mvn spring-boot:run

```



\### Access Swagger UI



http://localhost:8080/swagger-ui.html





\## Git Branching Strategy



main → Production ready code

develop → Integration branch

feature/\* → Feature development

bugfix/\* → Bug fixes

hotfix/\* → Production fixes



\## Commit Convention



feat → New feature

fix → Bug fix

chore → Setup / config changes

refactor → Code restructure

test → Test cases

docs → Documentation





\## API Endpoints (UC1)

| Method | Endpoint                    | Description       | Auth |

|--------|-----------------------------|-------------------|------|

| POST   | /api/v1/users/register      | Register new user | No   |



\## Developer

\- \*\*Name\*\*   : Rudresh Sharma

\- \*\*GitHub\*\* : github.com/rudy007225

\- \*\*Jira\*\*   : Backend-Genius (OIMS)





