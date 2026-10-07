# Student Result Management

A small Java and Maven application created for the Unit III Cloud DevOps assignment.

## Features

- Add marks for different subjects
- Calculate total marks
- Calculate percentage
- Calculate grade
- Check pass/fail status
- Validate marks between 0 and 100

## Technologies

- Java 17
- Maven
- JUnit 5
- Git
- GitHub
- GitHub Actions

## Run the application

```bash
mvn compile
mvn exec:java
```

If the Maven Exec plugin is not configured, the application can also be run from VS Code by running `Main.java`.

## Run tests

```bash
mvn clean test
```

## Continuous Integration

Every push to GitHub starts the workflow in `.github/workflows/ci.yml`.

The workflow uses an Ubuntu runner, sets up Java 17 and runs:

```bash
mvn clean test
```
