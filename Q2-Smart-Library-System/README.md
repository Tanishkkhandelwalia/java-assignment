# Smart Library Resource Management System

A Java application for managing Books and Digital Resources in a university library.

## Features

- Five sample resources
- Books and Digital Resources
- Complete resource details
- Fine calculation
- Resource ID validation
- Overdue-day validation
- Static resource counter
- Total fine calculation

## Fine Rules

| Resource | Fine |
|---|---:|
| Book | Rs. 5/day |
| Digital Resource | Rs. 2/day |

## OOP Concepts

Abstract class, interface, inheritance, encapsulation, polymorphism, method overriding, constructors, static members, packages, utility class, and service class.

## Structure

```text
src/library/
├── model/
│   ├── LibraryResource.java
│   ├── Printable.java
│   ├── Book.java
│   └── DigitalResource.java
├── service/
│   └── LibraryService.java
├── util/
│   └── InputValidator.java
└── main/
    └── Main.java
```

## Compile

```bash
javac -d out src/library/model/*.java src/library/service/*.java src/library/util/*.java src/library/main/*.java
```

## Run

```bash
java -cp out library.main.Main
```

The sample data produces a total fine of **Rs. 74.00**.
