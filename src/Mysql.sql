use classicmodels;

SELECT customerName,customerNumber from customers;
select * from customers;
select phone from customers;
select  customerName,phone,creditLimit from customers;
select customerName,addressLine1,city,postalCode from customers;
select customerName,salesRepEmployeeNumber from customers;
select  customerName,phone from customers order by customerName;
select customerName,creditLimit from customers order by customerName;
select customerName,city,state,country from customers order by customerName;
select customerName,creditLimit from customers order by creditLimit;
select customerName,phone,creditLimit from customers where creditLimit>40000;
select  firstName,jobTitle from employees;
select productName