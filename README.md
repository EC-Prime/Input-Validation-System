# Data Validation System (Java Swing)

A desktop application built with Java Swing that captures personal information through a form and validates every field in real time, giving the user clear, immediate feedback when input is invalid.

Built for the Advanced Programming II module at Gauteng City College.

## Features

- Captures: name and surname, ID/student number, date of birth (or age), gender, contact number, email address
- Real-time validation feedback shown next to each field (no waiting until submit)
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
├── Main.java                       # entry point
├── ui/
│   ├── MainFrame.java               # top-level window
│   ├── PersonalInfoPanel.java       # the form: labels, inputs, feedback labels
│   └── ButtonPanel.java             # Save / Clear / Exit
├── validation/
│   ├── Validator.java               # interface: validate(String) -> ValidationResult
│   ├── ValidationResult.java        # holds isValid + message
│   ├── PresenceValidator.java
│   ├── TypeValidator.java
│   ├── LengthValidator.java
│   ├── FormatValidator.java
│   └── RangeValidator.java
├── model/
│   └── Person.java                  # data holder, built only on full validation success
└── util/
    ├── UiConstants.java             # colours, fonts, spacing
    └── Patterns.java                # regex patterns (email, phone, etc.)
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

## Validation rules

| Field | Presence | Type | Length | Format | Range |
|---|---|---|---|---|---|
| Name & Surname | ✔ | letters only | 2–50 chars | — | — |
| ID / Student number | ✔ | digits only | fixed length | — | — |
| Date of birth / Age | ✔ | numeric (age) | — | valid date | 0–120 |
| Gender | ✔ | radio selection | — | — | — |
| Contact number | ✔ | digits only | 10 digits | starts with 0 | — |
| Email address | ✔ | — | — | `name@domain.tld` | — |

## Author

EC — [GitHub: EC-Prime](https://github.com/EC-Prime)

## License

Academic project — Gauteng City College, Advanced Programming II.
