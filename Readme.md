## 🏗️ **Java Generics Framework**
### **Gerenciamento de Entidades Genéricas em Java**

Este projeto é um **framework simples** para gerenciar entidades genéricas em Java, permitindo **operações CRUD (Create, Read, Update, Delete)** utilizando **Generics**. Ele suporta armazenamento **em memória (`InMemoryRepository`)** e **em arquivo (`InFileRepository`)**, garantindo persistência dos dados.

---

## 📌 **1. Tecnologias Utilizadas**
- **Java 21**
- **Maven**
- **Generics**
- **Serialização (para persistência em arquivo)**

---

## 📌 **2. Estrutura do Projeto**
```
java-generics/
│── pom.xml
│── README.md
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── forrestgump/
│   │   │   │   │   ├── javagenerics/
│   │   │   │   │   │   ├── app/
│   │   │   │   │   │   │   ├── Main.java
│   │   │   │   │   │   ├── framework/
│   │   │   │   │   │   │   ├── CrudRepository.java
│   │   │   │   │   │   │   ├── InMemoryRepository.java
│   │   │   │   │   │   │   ├── InFileRepository.java
│   │   │   │   │   │   ├── models/
│   │   │   │   │   │   │   ├── Customer.java
│   │   │   │   │   │   │   ├── Delivery.java
│   │   │   │   │   │   │   ├── InventoryItem.java
│   │   │   │   │   │   │   ├── MenuItem.java
│   │   │   │   │   │   │   ├── Order.java
│   │   │   │   │   │   │   ├── Payment.java
│   │   │   │   │   │   │   ├── Reservation.java
│   │   │   │   │   │   │   ├── Restaurant.java
│   │   │   │   │   │   │   ├── Review.java
│   │   │   │   │   │   │   ├── Supplier.java
│   │   │   │   │   │   │   ├── Table.java
```


### 🔹 **2. Compilar o Projeto**
```sh
mvn clean compile
```

### 🔹 **3. Executar a Aplicação**
```sh
mvn exec:java
```

Ou, se necessário, especifique a classe principal manualmente:
```sh
mvn exec:java -Dexec.mainClass="com.forrestgump.javagenerics.app.Main"
```

### 🔹 **4. Rodar Diretamente com Java**
```sh
java -cp target/classes com.forrestgump.javagenerics.app.Main
```

### 🔹 **4. Rodar Diretamente com Intellij**
```sh
"C:\Program Files\Amazon Corretto\jdk21.0.4_7\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.4\lib\idea_rt.jar=62362:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\chris\java-projects\java-generics\target\classes com.forrestgump.javagenerics.app.Main
```


---

## 📌 **4. Funcionamento do Framework**
### **1️⃣ `InMemoryRepository`**
Repositório que **armazena os dados na memória** usando `List<T>`.

```java
InMemoryRepository<Customer> customerRepo = new InMemoryRepository<>();
Customer customer = new Customer("John Doe", "555-6789", "john@example.com", "456 Elm St");
customerRepo.save(customer);
System.out.println(customerRepo.findAll()); // Exibe todos os clientes
```

### **2️⃣ `InFileRepository`**
Repositório que **salva os dados em arquivo**, garantindo persistência.

```java
InFileRepository<Order> fileOrderRepo = new InFileRepository<>("orders.dat");
Order order = new Order(1, customer, Arrays.asList(pasta, steak), 37.49, new Date(), "Pending");
fileOrderRepo.save(order);
System.out.println(fileOrderRepo.findAll()); // Exibe os pedidos salvos
```

---

## 📌 **5. Logs de Execução**
Após rodar o programa, a saída esperada será:

```
=== Testing InMemoryRepository for All Entities ===
Saved Restaurant: [Restaurant{name='Gourmet Place', address='123 Main St', phone='555-1234', category='French', rating=4.8}]
Saved Customer: [Customer{name='John Doe', phone='555-6789', email='john@example.com', address='456 Elm St'}]
Saved Menu Items: [MenuItem{name='Pasta Carbonara', description='Creamy sauce with bacon', price=12.99}, MenuItem{name='Grilled Steak', description='Served with vegetables and mashed potatoes', price=24.5}]
Saved Order: [Order{id=1, customer=Customer{name='John Doe', phone='555-6789', email='john@example.com', address='456 Elm St'}, items=[MenuItem{name='Pasta Carbonara', description='Creamy sauce with bacon', price=12.99}, MenuItem{name='Grilled Steak', description='Served with vegetables and mashed potatoes', price=24.5}], totalAmount=37.49, orderDate=Mon Feb 10 23:22:03 BRT 2025, status='Pending'}]
Saved Employee: [Employee{name='Alice Brown', position='Manager', salary=5000.0, department='HR', email='alice@example.com'}]
Saved Table: [Table{tableNumber=5, capacity=4, isOccupied=false}]
Saved Reservation: [Reservation{id=1, customer=Customer{name='John Doe', phone='555-6789', email='john@example.com', address='456 Elm St'}, table=Table{tableNumber=5, capacity=4, isOccupied=false}, reservationDate=Mon Feb 10 23:22:03 BRT 2025, numberOfGuests=2}]
Saved Payment: [Payment{id=1, order=Order{id=1, customer=Customer{name='John Doe', phone='555-6789', email='john@example.com', address='456 Elm St'}, items=[MenuItem{name='Pasta Carbonara', description='Creamy sauce with bacon', price=12.99}, MenuItem{name='Grilled Steak', description='Served with vegetables and mashed potatoes', price=24.5}], totalAmount=37.49, orderDate=Mon Feb 10 23:22:03 BRT 2025, status='Pending'}, amount=37.49, method='Credit Card', date=Mon Feb 10 23:22:03 BRT 2025}]
Saved Supplier: [Supplier{id=1, name='Food Supplies Inc.', contact='555-7890', address='Warehouse St.'}]
Saved Inventory Item: [InventoryItem{id=1, name='Tomatoes', quantity=50, supplier=Supplier{id=1, name='Food Supplies Inc.', contact='555-7890', address='Warehouse St.'}}]
Saved Delivery: [Delivery{id=1, order=Order{id=1, customer=Customer{name='John Doe', phone='555-6789', email='john@example.com', address='456 Elm St'}, items=[MenuItem{name='Pasta Carbonara', description='Creamy sauce with bacon', price=12.99}, MenuItem{name='Grilled Steak', description='Served with vegetables and mashed potatoes', price=24.5}], totalAmount=37.49, orderDate=Mon Feb 10 23:22:03 BRT 2025, status='Pending'}, address='123 Elm St.', estimatedDeliveryTime=Mon Feb 10 23:22:03 BRT 2025}]
Saved Review: [Review{id=1, customer=Customer{name='John Doe', phone='555-6789', email='john@example.com', address='456 Elm St'}, restaurant=Restaurant{name='Gourmet Place', address='123 Main St', phone='555-1234', category='French', rating=4.8}, comment='Amazing experience!', rating=5}]

=== Testing InFileRepository ===
Saved to file: [Order{id=1, customer=Customer{name='John Doe', phone='555-6789', email='john@example.com', address='456 Elm St'}, items=[MenuItem{name='Pasta Carbonara', description='Creamy sauce with bacon', price=12.99}, MenuItem{name='Grilled Steak', description='Served with vegetables and mashed potatoes', price=24.5}], totalAmount=37.49, orderDate=Mon Feb 10 23:22:03 BRT 2025, status='Pending'}]
Found in file: Order{id=1, customer=Customer{name='John Doe', phone='555-6789', email='john@example.com', address='456 Elm St'}, items=[MenuItem{name='Pasta Carbonara', description='Creamy sauce with bacon', price=12.99}, MenuItem{name='Grilled Steak', description='Served with vegetables and mashed potatoes', price=24.5}], totalAmount=37.49, orderDate=Mon Feb 10 23:22:03 BRT 2025, status='Pending'}
Updated in file: Order{id=1, customer=Customer{name='John Doe', phone='555-6789', email='john@example.com', address='456 Elm St'}, items=[MenuItem{name='Grilled Steak', description='Served with vegetables and mashed potatoes', price=24.5}], totalAmount=24.5, orderDate=Mon Feb 10 23:22:03 BRT 2025, status='Completed'}
After deletion in file: []

Process finished with exit code 0
```

---

## 📌 **6. Estrutura das Classes**
O framework implementa a interface `CrudRepository<T>` para padronizar operações CRUD:

```java
public interface CrudRepository<T> {
    void save(T entity);
    T findById(int id);
    void update(T entity);
    void delete(int id);
    List<T> findAll();
}
```

### **Repositórios**
- `InMemoryRepository<T>` → Usa `List<T>` para armazenar temporariamente os dados.
- `InFileRepository<T>` → Usa **serialização de objetos** para salvar os dados em arquivos `.dat`.

### **Entidades**
O projeto inclui diversas entidades do domínio de **restaurantes**, como:
- `Customer`, `Order`, `MenuItem`, `Restaurant`, `Reservation`, `Payment`, `Supplier`, `Table`, `Review`, `Delivery`, `InventoryItem`.

---
