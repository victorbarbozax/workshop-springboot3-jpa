# Workshop Spring Boot

Este projeto é uma aplicação Java desenvolvida com **Spring Boot**, criada durante um workshop para estudo de conceitos básicos de **desenvolvimento web** e **modelagem de domínio**.

## 🧩 Sobre o projeto

O sistema simula um **e-commerce simples**, onde é possível gerenciar **usuários, pedidos, produtos, categorias** e **pagamentos**.

### Domínio principal
- **User:** representa o cliente que faz os pedidos.  
- **Order:** representa o pedido realizado pelo cliente.  
- **OrderItem:** associa produtos a pedidos.  
- **Product:** representa os produtos disponíveis.  
- **Category:** classifica os produtos por categoria.  
- **Payment:** representa o pagamento de um pedido.  

Cada pedido possui um **status**, definido pelo enum `OrderStatus`:
- WAITING_PAYMENT  
- PAID  
- SHIPPED  
- DELIVERED  
- CANCELED  

## 🛠️ Tecnologias utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database  
- Maven  
