# Student Management System

This is a Java-based Student Management System developed for managing student information such as ID, name, score, and rank. The system allows users to add, delete, update, view, and search students. It also supports sorting students by their score.

## Features
- **Add Student**: Adds a new student to the system with validation on score range (0-10).
- **Delete Student**: Deletes a student based on the student ID.
- **Update Student**: Updates a student's name and score, with validation for the score range.
- **View All Students**: Displays all students in the system.
- **Sort Students by Score**: Sorts students in descending order by score and displays the result.
- **Search Student by ID**: Searches for a student based on the student ID and displays the details.

## How to Use

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   ```

2. **Compile and run the program**:
   - Ensure that you have JDK installed (version 8 or higher).
   - Navigate to the project directory and compile the Java files:
     ```bash
     javac Com/btec/assignment/lucnt/*.java
     ```
   - Run the `ManagementStudent` class:
     ```bash
     java Com.btec.assignment.lucnt.ManagementStudent
     ```

3. **Interact with the system**:
   - The program will prompt you to select an option from the following menu:
     1. Add Student
     2. Delete Student
     3. Update Student
     4. View All Students
     5. Sort by Score
     6. Search by ID
     0. Exit

## Class Structure

- **ManagementStudent**: The main class responsible for managing the list of students, including adding, deleting, updating, displaying, sorting, and searching students.
- **Students**: A class representing a student, containing fields for student ID, name, marks, and rank. It also includes methods to compute and retrieve the student's rank based on their marks.

## Example Output

### Menu
```
1. Add Student
2. Delete Student
3. Update Student
4. View All Students
5. Sort by Score
6. Search by ID
0. Exit
Choose: 1
```

### Adding a Student
```
ID: 12345
Name: John Doe
Score: 8.5
Student added successfully.
```

### Viewing All Students
```
ID: 12345, Name: John Doe, Marks: 8.5, Rank: Very Good
```

### Sorting by Score
```
Students sorted by score:
ID: 12345, Name: John Doe, Marks: 8.5, Rank: Very Good
```

### Searching for a Student
```
ID to search: 12345
Student found: ID: 12345, Name: John Doe, Marks: 8.5, Rank: Very Good
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- The project was created as part of an assignment for the Pearson BTEC Level 5 HND in Computing.
- Thanks to the contributors and mentors who provided guidance and feedback during the development of this system.
```
