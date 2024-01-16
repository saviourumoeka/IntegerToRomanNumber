# Roman Numeral Converter

## Description

This Maven project is a simple Java application that converts an integer to its Roman numeral representation.

## Requirements

- Java Development Kit (JDK) installed (version 21 or higher)
- Maven installed (version 3.0.0 or higher)

## How to Run

1. Clone or download the project:

   ```bash
   git clone https://github.com/yourusername/roman-numeral-converter.git
   ```

2. Navigate to the project directory:

    ```bash
   cd IntegerToRomanNumber
    ```
   
3. Compile and package the project

     ```bash
       mvn clean install
     ```
4. Run the application:

  ```bash
    mvn exec:java -Dexec.mainClass="Main"
   ```

The application will prompt you to enter an integer, and it will then display the corresponding Roman numeral.

   ```bash
   Enter an integer: 42
   Roman numeral for 42 is: XLII