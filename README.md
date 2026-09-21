# Data Validation System (Java Swing)

A desktop application built with Java Swing that captures personal information through a form and validates every field, giving the user clear feedback when input is invalid.

Built for the Advanced Programming II module at Gauteng City College.

## Features

- Captures: name and surname, ID/student number, date of birth (or age), gender, contact number, email address
- Five validation check types applied where appropriate per field:
  - **Presence** — field is not left empty
  - **Type** — numeric fields reject letters and vice versa
  - **Length** — minimum/maximum character counts (e.g. ID number)
  - **Format** — pattern matching (e.g. valid email structure)
  - **Range** — numeric values fall within a sensible bound (e.g. age 0–120)
- Save / Clear / Exit workflow
- Custom colour scheme, spacing, and typography (not default Swing styling)

## Tech stack

- Java (JDK 17+)
- Swing (JFrame / JPanel)
- No external dependencies — pure Java

## Project structure

```
src/
└── validationsystem/
    ├── MainFrame.form        # Swing GUI layout design
    ├── MainFrame.java        # Top-level window implementation
    ├── ValidationSystem.java # Application entry point
    └── Validator.java        # Core validation logic
```

## How to run

1. Clone the repository:
   ```
   git clone https://github.com/EC-Prime/<repo-name>.git
   cd <repo-name>
   ```
2. Compile:
   ```
   javac -d bin src/**/*.java
   ```
3. Run:
   ```
   java -cp bin Main
   ```

Alternatively, open the project folder in IntelliJ IDEA / Eclipse / VS Code (with the Java extension pack) and run `Main.java` directly.
Or Run the pre-built executable (fastest): clone the repository (`git clone https://github.com/EC-Prime/Input-Validation-System.git`), navigate to the `dist` folder, and double-click `ValidationSystem.jar` (or run `java -jar ValidationSystem.jar` from a terminal in that folder). This runs the application as a standalone desktop program without needing to open or build the project in an IDE.

## Validation rules

| Field | Presence | Type | Length | Format | Range |
|---|---|---|---|---|---|
| Name & Surname | ✔ | letters only | 2–50 chars | — | — |
| ID / Student number | ✔ | digits only | fixed length | — | — |
| Date of birth / Age | ✔ | numeric (age) | — | valid date | 16–100 |
| Gender | ✔ | radio selection | — | — | — |
| Contact number | ✔ | digits only | 10 digits |  | — |
| Email address | ✔ | — | — | `name@domain.tld` | — |

