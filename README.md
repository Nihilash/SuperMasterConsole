#  SuperMasterConsole
### A Role-Based Student Academic Management System (Console-Based, Core Java)

Hi there !  
I'm **Nihilash L V**, and this is one of the most exciting projects I’ve built using **Core Java** — a **console-based role-driven student marks management system** that simulates real-world academic data handling in a university environment.

---

##  Why I Built This Project

As someone passionate about **Java development and software testing**, I wanted to create something more than a typical CRUD app.  
So I imagined a system inspired by how real **engineering colleges** like Anna University manage marks, grades, and revaluation. The result is **SuperMasterConsole** — a project where I applied concepts of **Object-Oriented Programming**, **role-based access**, **modular architecture**, and clean code practices.

---

##  What is SuperMasterConsole?

It’s a **console-based application** with different dashboards and access controls for:

- **Students** – who can view their semester marksheet and apply for revaluation  
- **Staff Members** – who can add new students, add subjects, update marks, and view revaluation requests

This project is modular, scalable, and built from scratch using only **Core Java (JDK 17)** — no external libraries or databases (yet!).

---

##  Tech Stack & Skills Used

-  **Language**: Java 17  
-  **Architecture**: Modular & layered  
-  **Concepts**: OOP (Encapsulation, Inheritance, Abstraction, Polymorphism, Interface)  
-  **Design Style**: Role-based dashboards with clean class separation  
- **Storage**: In-memory (using collections)

---

<pre lang="text"> ## 📁 Project Structure ``` SuperMasterConsole/ │ ├── Main/ │ └── MainConsole.java # Entry point, handles login menu & flow │ ├── Auth/ │ └── LoginService.java # Handles login validation for roles │ ├── Student/ │ ├── Student.java # Student data, semesters, ID, name │ ├── Subject.java # Subject code, name, marks, grade logic │ ├── Semester.java # Semester number, subjects list, total, average, grade │ └── StudentDashboard.java # Student menu: view marksheet, apply reval │ ├── Staff/ │ ├── Staff.java # Staff details (ID, name, role) │ └── StaffDashboard.java # Staff menu: add student, add subject, update marks │ ├── Data/ │ ├── Database.java # In-memory store for all users & requests │ └── RevaluationRequest.java # Revaluation model class │ └── Test/ └── TestStudentModule.java # Dummy test data for quick development/testing ``` </pre>

---

##  Key Features

###  Student Role
- Secure login with ID & password  
- View detailed marksheet (semester-wise)  
- Total, average, grade, and percentage displayed  
- Revaluation request option for failed or low marks  

###  Staff Role
- Add new students and credentials  
- Add new subjects to student semesters  
- Enter/update subject marks  
- View all student revaluation requests  

---

##  Learning Outcomes

By working on SuperMasterConsole, I strengthened my grip on:
- Structuring real-world Java applications  
- Implementing encapsulation and clean method separation  
- Designing user role access in a console-based project  
- Debugging large-scale console programs  
- Preparing for Java backend and software testing interviews  

---

##  How to Run

1. Clone the repo:**

git clone https://github.com/Nihilash/SuperMasterConsole.git
cd SuperMasterConsole

2. Compile and Run in your IDE or Terminal:
   - Use any Java IDE (e.g., Eclipse, IntelliJ) or CLI
   - Ensure you're using JDK 17+
   - Start from `Main/MainConsole.java`

---

Feel free to ⭐ star the repository if you found it helpful!
