# Low Level Design

## Fundamentals

### DRY -> [Don't Repeat Yourself]

- Avoid Duplications of code
- Easier maintenance
- Single point of change

### KISS -> [Keep it Simple, Stupid]

- Easier debugging
- Improved readability, maintainability
- Faster development

### YAGNI -> [You Aren't Gonna Need It]

- Implement a feature when you need them
- Simplified codebase, Faster development

---

## SOLID Principles

### [SRP] -> Single Responsibility Principle

- A class should have only one **job** to do, can be applied module/package
- If having more, changes to one might affect other function
- It's asking one person to do only on job, not multiple jobs

### [OCP] -> Open-Close Principle

- Software entities should be **open for extension** and **closed for modifications**
- Consider travel adapter, where we move out of country, the travel adapter is useful for extension not modification
- Consider adding changes to existing method like tax calculator for a country to serval country but this can be done with separating the logic with different class with more clarity
- Create an interface and start working on concrete classes to segregate the tax calculator.

## [LSP] -> Liskov Substitution Principle

- Subtypes must be substitutable for their base types. (whatever is in base class should be used in all implementations)
- Lets take an example having Shape with methods width and height of which is used in rectangle but in future we may need to implement square as well which those 2 methods are not needed. Square properties are different.
- Before careful when using inheritance

## [ISP] -> Interface Segregation Principle

- Client should not depend on method that they don't use
- For example we can take same Shape itself, the Shape interface has 2 methods `area()` and `volume()` area is used on 2D design, where as volume is used in 3D design, this needs to be segregated

## [DIP] -> Dependency Inversion Principle

- Depend on abstractions, not concrete classes.
- Like example of JPA, though the underlying databases change the abstraction will remain without any changes

---
