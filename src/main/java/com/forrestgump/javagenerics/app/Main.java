package com.forrestgump.javagenerics.app;

import com.forrestgump.javagenerics.app.framework.InMemoryRepository;
import com.forrestgump.javagenerics.app.framework.InFileRepository;
import com.forrestgump.javagenerics.app.models.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing InMemoryRepository for All Entities ===");

        // --------------------- RESTAURANT ---------------------
        InMemoryRepository<Restaurant> restaurantRepo = new InMemoryRepository<>();
        Restaurant restaurant = new Restaurant("Gourmet Place", "123 Main St", "555-1234", "French", 4.8);
        restaurantRepo.save(restaurant);
        System.out.println("Saved Restaurant: " + restaurantRepo.findAll());

        // --------------------- CUSTOMER ---------------------
        InMemoryRepository<Customer> customerRepo = new InMemoryRepository<>();
        Customer customer = new Customer("John Doe", "555-6789", "john@example.com", "456 Elm St");
        customerRepo.save(customer);
        System.out.println("Saved Customer: " + customerRepo.findAll());

        // --------------------- MENU ITEM ---------------------
        InMemoryRepository<MenuItem> menuRepo = new InMemoryRepository<>();
        MenuItem pasta = new MenuItem("Pasta Carbonara", "Creamy sauce with bacon", 12.99);
        MenuItem steak = new MenuItem("Grilled Steak", "Served with vegetables and mashed potatoes", 24.50);
        menuRepo.save(pasta);
        menuRepo.save(steak);
        System.out.println("Saved Menu Items: " + menuRepo.findAll());

        // --------------------- ORDER ---------------------
        InMemoryRepository<Order> orderRepo = new InMemoryRepository<>();
        Order order = new Order(1, customer, Arrays.asList(pasta, steak), 37.49, new Date(), "Pending");
        orderRepo.save(order);
        System.out.println("Saved Order: " + orderRepo.findAll());

        // --------------------- EMPLOYEE ---------------------
        InMemoryRepository<Employee> employeeRepo = new InMemoryRepository<>();
        Employee employee = new Employee("Alice Brown", "Manager", 5000.00, "HR", "alice@example.com");
        employeeRepo.save(employee);
        System.out.println("Saved Employee: " + employeeRepo.findAll());

        // --------------------- TABLE ---------------------
        InMemoryRepository<Table> tableRepo = new InMemoryRepository<>();
        Table table = new Table(5, 4, false);
        tableRepo.save(table);
        System.out.println("Saved Table: " + tableRepo.findAll());

        // --------------------- RESERVATION ---------------------
        InMemoryRepository<Reservation> reservationRepo = new InMemoryRepository<>();
        Reservation reservation = new Reservation(1, customer, table, new Date(), 2);
        reservationRepo.save(reservation);
        System.out.println("Saved Reservation: " + reservationRepo.findAll());

        // --------------------- PAYMENT ---------------------
        InMemoryRepository<Payment> paymentRepo = new InMemoryRepository<>();
        Payment payment = new Payment(1, order, 37.49, "Credit Card", new Date());
        paymentRepo.save(payment);
        System.out.println("Saved Payment: " + paymentRepo.findAll());

        // --------------------- SUPPLIER ---------------------
        InMemoryRepository<Supplier> supplierRepo = new InMemoryRepository<>();
        Supplier supplier = new Supplier(1, "Food Supplies Inc.", "555-7890", "Warehouse St.");
        supplierRepo.save(supplier);
        System.out.println("Saved Supplier: " + supplierRepo.findAll());

        // --------------------- INVENTORY ITEM ---------------------
        InMemoryRepository<InventoryItem> inventoryRepo = new InMemoryRepository<>();
        InventoryItem inventoryItem = new InventoryItem(1, "Tomatoes", 50, supplier);
        inventoryRepo.save(inventoryItem);
        System.out.println("Saved Inventory Item: " + inventoryRepo.findAll());

        // --------------------- DELIVERY ---------------------
        InMemoryRepository<Delivery> deliveryRepo = new InMemoryRepository<>();
        Delivery delivery = new Delivery(1, order, "123 Elm St.", new Date());
        deliveryRepo.save(delivery);
        System.out.println("Saved Delivery: " + deliveryRepo.findAll());

        // --------------------- REVIEW ---------------------
        InMemoryRepository<Review> reviewRepo = new InMemoryRepository<>();
        Review review = new Review(1, customer, restaurant, "Amazing experience!", 5);
        reviewRepo.save(review);
        System.out.println("Saved Review: " + reviewRepo.findAll());

        // --------------------- TESTING InFileRepository ---------------------
        System.out.println("\n=== Testing InFileRepository ===");
        String filePath = "test_data.dat";
        InFileRepository<Order> fileOrderRepo = new InFileRepository<>(filePath);

        // Create
        fileOrderRepo.save(order);
        System.out.println("Saved to file: " + fileOrderRepo.findAll());

        // Read
        Optional<Order> foundOrder = fileOrderRepo.findById(0);
        foundOrder.ifPresent(o -> System.out.println("Found in file: " + o));

        // Update
        Order updatedOrder = new Order(1, customer, Arrays.asList(steak), 24.50, new Date(), "Completed");
        fileOrderRepo.update(0, updatedOrder);
        System.out.println("Updated in file: " + fileOrderRepo.findById(0).orElse(null));

        // Delete
        fileOrderRepo.delete(0);
        System.out.println("After deletion in file: " + fileOrderRepo.findAll());
    }
}
