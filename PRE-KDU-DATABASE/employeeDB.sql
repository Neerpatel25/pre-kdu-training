CREATE DATABASE IF NOT EXISTS employee;
USE employee;

CREATE TABLE department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(255)
);

CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(255),
    salary DECIMAL(10, 2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(department_id)
);

INSERT INTO department VALUES (1, 'HR');
INSERT INTO department VALUES (2, 'IT');
INSERT INTO department VALUES (3, 'Finance');

INSERT INTO employee VALUES (1, 'Amit Patel', 50000.00, 1);
INSERT INTO employee VALUES (2, 'Priya Sharma', 60000.00, 2);
INSERT INTO employee VALUES (3, 'Rahul Singh', 75000.00, 1);
INSERT INTO employee VALUES (4, 'Neha Gupta', 55000.00, 3);
INSERT INTO employee VALUES (5, 'Sandeep Kumar', 80000.00, 2);


SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id;

SELECT employee_id, employee_name, salary
FROM employee
ORDER BY salary DESC;

SELECT d.department_name, AVG(e.salary) AS average_salary
FROM department d
JOIN employee e ON d.department_id = e.department_id
GROUP BY d.department_name;