# Assignment 2 — Web API Design and Testing (Postman)

This folder contains a simple User REST API (in-memory) and notes for Postman testing.

Files added
- src/main/java/com/example/helloapi/User.java — simple POJO model
- src/main/java/com/example/helloapi/UserController.java — CRUD REST controller at `/users`

Quick start
1. From the repository root, switch to the assignment branch:

```bash
git checkout assignment-2
```

2. Run the app:

```bash
./mvnw spring-boot:run
```

3. Base URL: http://localhost:8080/users
  - POST /users   — create user (JSON body)
  - GET /users    — list users
  - GET /users/{id}
  - PUT /users/{id}
  - DELETE /users/{id}

Example create body:

```json
{"id":1,"name":"Eshetu","email":"eshetu@gmail.com"}
```

Notes
- This is a minimal in-memory implementation for testing with Postman.
- Consider adding persistence (JPA) and validation for production use.
