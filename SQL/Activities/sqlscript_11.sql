REM   Script: SQLScript_11
REM   SQLScript_11

Drop TABLE salesman;

Drop TABLE customers;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

DESCRIBE salesman  


INSERT ALL     
    INTO salesman VALUES(5001,'James Hoog','New York',15)    
    INTO salesman VALUES(5002,'Nail Knite','Paris',13)    
    INTO salesman VALUES(5005,'Pit Alex','London',11)    
    INTO salesman VALUES(5006,'McLyon','Paris',14)    
    INTO salesman VALUES(5007,'Paul Adam','Rome',13)    
    INTO salesman VALUES(5003,'Lauson Hen','San Jose',12)    
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

Drop TABLE salesman;

Drop TABLE customers;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

DESCRIBE salesman  


INSERT ALL     
    INTO salesman VALUES(5001,'James Hoog','New York',15)    
    INTO salesman VALUES(5002,'Nail Knite','Paris',13)    
    INTO salesman VALUES(5005,'Pit Alex','London',11)    
    INTO salesman VALUES(5006,'McLyon','Paris',14)    
    INTO salesman VALUES(5007,'Paul Adam','Rome',13)    
    INTO salesman VALUES(5003,'Lauson Hen','San Jose',12)    
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

CREATE TABLE customers (  
    customer_id int primary key, customer_name varchar(32),  
    city varchar(20), grade int, salesman_id int);

DESCRIBE customers  


INSERT ALL  
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)  
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)  
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)  
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)  
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)  
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)  
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)  
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)  
SELECT 1 FROM DUAL;

SELECT * FROM customers;

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, a.salesman_name, b.order_no, 'lowest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

CREATE TABLE customers (  
    customer_id int primary key, customer_name varchar(32),  
    city varchar(20), grade int, salesman_id int);

DESCRIBE customers  


INSERT ALL  
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)  
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)  
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)  
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)  
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)  
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)  
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)  
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)  
SELECT 1 FROM DUAL;

SELECT * FROM customers;

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, a.salesman_name, b.order_no, 'lowest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

