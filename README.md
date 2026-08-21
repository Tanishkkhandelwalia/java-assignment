# Food Delivery Management System

A Java application for an online food delivery company that manages Regular and Premium food orders.

## Features

- Six sample orders
- Regular and Premium order types
- 10% Regular discount
- 15% Premium discount
- Rs. 80 Regular delivery charge
- Rs. 50 Premium delivery charge
- Amount and customer-name validation
- Order summary and final bill
- Static object counter

## OOP Concepts

Abstract class, interface, inheritance, encapsulation, polymorphism, method overriding, constructors, static members, packages, utility class, and service class.

## Structure

```text
src/food/
├── model/
│   ├── FoodOrder.java
│   ├── Discountable.java
│   ├── RegularOrder.java
│   └── PremiumOrder.java
├── service/
│   └── OrderService.java
├── utility/
│   └── OrderUtility.java
└── main/
    └── Main.java
```

## Compile

```bash
javac -d out src/food/model/*.java src/food/service/*.java src/food/utility/*.java src/food/main/*.java
```

## Run

```bash
java -cp out food.main.Main
```
