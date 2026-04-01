# Spring Boot Dependency Injection Demo

This project demonstrates the core concept of **Inversion of Control (IoC)** and **Dependency Injection (DI)** in Spring Boot.

## Features
- **Automatic Object Creation**: Demonstrates how Spring's context automatically creates and manages objects of classes marked with `@Component`.
- **Bean Retrieval**: Shows how to retrieve a bean from the `ApplicationContext` without using the `new` keyword.

## How it Works
1.  **@Component**: The `HELLO` class is annotated with `@Component`, telling Spring to manage its lifecycle.
2.  **ApplicationContext**: In `DemoApplication`, the `SpringApplication.run()` method returns an `ApplicationContext`, which is used to get the `HELLO` bean.
3.  **Decoupling**: Instead of manual instantiation (`new HELLO()`), we let Spring handle the creation.

## Usage
Run the `DemoApplication` class. It will output `Hello World!` to the console.
