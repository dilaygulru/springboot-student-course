```markdown
# 🏫 Student Course Registration API

A Spring Boot based RESTful web application for managing students, courses, and course registrations. Built with Java, PostgreSQL, and exposed via a clean Swagger UI for API testing and integration.

---

## 🚀 Features

- 📚 Course management (add, update, delete, list)
- 👨‍🎓 Student management (add, update, delete, list)
- 📝 Student-course registration system
- 🧾 Full RESTful API endpoints
- 🔍 Swagger UI support for live API documentation and testing
- 🗃️ PostgreSQL database with JPA and Hibernate ORM

---

## ⚙️ Tech Stack

- Java 17
- Spring Boot 2.6.2
- Spring Data JPA
- PostgreSQL
- Swagger (springdoc-openapi)
- Maven
- Postman (for manual API testing)

---

## 📦 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/student-course-api.git
cd student-course-api
```

### 2. Configure the Database

Make sure PostgreSQL is running and create a database named `School`.

Update your `src/main/resources/application.properties` if needed:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/School
spring.datasource.username=postgres
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Application

You can run the application via IntelliJ, Eclipse, or CLI:

```bash
./mvnw spring-boot:run
```

The app will be available at:  
📍 `http://localhost:8080`

---

## 📑 API Endpoints

### 🧍 Students
| Method | Endpoint                | Description               |
|--------|-------------------------|---------------------------|
| GET    | `/api/students`         | List all students         |
| POST   | `/api/students`         | Create a new student      |
| GET    | `/api/students/{id}`    | Get student by ID         |
| PUT    | `/api/students/{id}`    | Update student info       |
| DELETE | `/api/students/{id}`    | Delete a student          |

### 📘 Courses
| Method | Endpoint               | Description              |
|--------|------------------------|--------------------------|
| GET    | `/api/courses`         | List all courses         |
| POST   | `/api/courses`         | Add a new course         |
| PUT    | `/api/courses/{id}`    | Update course            |
| DELETE | `/api/courses/{id}`    | Delete course            |

### 📝 Registrations
| Method | Endpoint                     | Description                        |
|--------|------------------------------|------------------------------------|
| GET    | `/api/registrations`         | List all registrations             |
| POST   | `/api/registrations`         | Register student to a course       |
| PUT    | `/api/registrations/{id}`    | Update a registration              |
| DELETE | `/api/registrations/{id}`    | Delete a registration              |

---

## 🧪 API Testing

### Swagger UI
Interactive API documentation available at:  
🌐 `http://localhost:8080/swagger-ui.html`

### Postman Example (Create Student)
- Method: `POST`
- URL: `http://localhost:8080/api/students`
- Body:
```json
{
  "name": "Ali",
  "surname": "Yılmaz"
}
```

---

## 📂 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.boostmytool.WebHomework
│   │       ├── Controllers
│   │       ├── DTOs
│   │       ├── Models
│   │       ├── Repositories
│   │       └── Application.java
│   └── resources/
│       └── application.properties
```

---

## 🧠 Future Improvements

- Authentication & Authorization (Spring Security)
- Pagination and filtering
- Docker containerization
- Frontend integration (React/Vue)

