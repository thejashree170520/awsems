
# Return Order Management System

Project Overview
----------------
Automation of Return orders.Authenticated users can make a request to return Orders.Orders are classified as Repair or Replacement and based on that cost and date of delivery are calculated.Then the Total charge will be deducted from the person's credit Limit and status of payment is returned as response.

## Installation

Install Visual Studio Code in your Local Machine

Install Node.js and Angular Client Softwares

Install Intellij/Spring Tool Suite to run Microservices Locally

Install PostMan to test API Endpoints

Install jdk 16


## Steps To Install Project Files

- Download the zip file of Return Order Management
- Extract the zip file.
- Import the spring boot microservices into Intellij/Spring Tool Suite/Eclipse IDE
- Run all the microservices as spring boot application
- Open the user interface files in Visual Studio Code/ Command Prompt
    
## Run Angular Application Locally

Import the project in your local machine

Go to the project directory

```bash
  cd ReturnOrderManagement
```

Install dependencies

```bash
  npm install
```

Start the server and Open the Application in your default Browser

```bash
  ng serve --o
```

## Run Microservices Locally

Import the project in your local machine IDE

Run  the Microservices from the IDE (or)

To Run from Command Prompt

Go to the project directory

```bash
  cd MicroserviceName
```

Install dependencies

```bash
  mvn install
```

Build a Jar File

```bash
  mvn clean package
```
Run the File

```bash
  java -jar filename.jar
```

## MICROSERVICES

1.Component Processing Microservice
2.Packaging And Delivery Microservice
3.Payment Microservice
4.Authentication Microservice
5.Cloud Gateway

## Functionalities

### COMPONENT PROCESSING MICROSERVICE

  This microservice determines if the request is for repair or replacement and calculates the cost based on that request.This microservice invokes packaging and delivery microservice and payment microservice
  - Port Number   : 8081
  - RestEndpoints : 
     
    => http://localhost:8081/componentProcess/processDetails(Method:Post)
     
     Input:Name,ContactNumber,CreditCardNumber,ComponentType,ComponentType,IsPriorityRequest,Quantity
     Output:RequestId,ProcessingCharge,PackagingAndDeliveryCharge,DateOfDelivery
     
    => http://localhost:8081/componentProcess/completeProcessing(Method:Post)

     Input:RequestId,CreditCardNumber,CreditLimit,ProcessingCharge
     Output:Payment Status and Balance in Credit Card

    Swagger   : http://localhost:8081/swagger-ui.html
    H2 CONSOLE: http://localhost:8081/h2-console

### PACKAGING AND DELIVERY MICROSERVICE

This microservice calculates the Charges required for packaging and delivery .

-Port Number :8080
-RestEndpoints:
  http://localhost:8080/getPackagingDeliveryCharge/{componentType}/{count}(Method:Get)

 Input: ComponentType,count
 Output: PackagingAndDeliveryCharge

 Swagger   : http://localhost:8080/swagger-ui.html

 H2 CONSOLE: http://localhost:8080/h2-console

### PAYMENT MICROSERVICE

This microservice calculates the Balance by deducting ProcessingCharge from Credit Card Limit
 
-Port Number: 8083
-RestEndPoints:
 http://localhost:8083/processPayment/{creditCardNumber}/{creditLimit}/{processingCharge}(Method:Get)

Input: CreditCardNumber,CreditLimit,ProcessingCharge
Output: Balance Amount

Swagger   : http://localhost:8083/swagger-ui.html

H2 CONSOLE: http://localhost:8083/h2-console

### AUTHENTICATION MICROSERVICE

This microservice authenticates the User and returns the Jwt Token

-Port Number: 8085
-RestEndpoints:
 http://localhost:8085/auth(Method:Post)

 Input :Username,Password
 Output: Jwt Token


H2 CONSOLE: http://localhost:8085/h2-console

### CLOUD GATEWAY

This microservice routes client requests to requested microservices.It allows requests only from authenticated Users.

-Port Number: 9191

## User Interface-Return Order Portal

The angular User Interface loads the Application.The user gives valid credentials to login and return the orders and makes payment.

## Configuration

### Built-in UserName And Password


  USERNAME|PASSWORD
  ----|----
  Kharan|kharan
  LinDan|lindan
   
## Authors

- KharanRhogith
- Thejashree Duraisamy
- Geetha V
- Saiteja Rayapudi
- Veena Kakani
- Karthikeyan C