# Cafe Management System (CMS)

## Overview
The Cafe Management System is a comprehensive Java-based desktop application designed to streamline cafe operations. This application enables efficient management of inventory, order processing, billing, and user management for cafe businesses.

## Technology Stack
- **Language**: Java
- **UI Framework**: Java Swing
- **Database**: MySQL
- **Architecture**: MVC (Model-View-Controller)

## Key Features

### User Management
- **Login System**: Secure authentication with roles (admin/regular user)
- **User Registration**: New user signup with email verification
- **Password Recovery**: Forgot password functionality
- **User Verification**: Admin can verify and manage users

### Product Management
- **Category Management**: Create, edit, and delete product categories
- **Product Operations**: 
  - Add new products
  - Update existing products
  - Delete products
  - Associate products with categories

### Order Processing
- **Order Creation**: User-friendly interface for creating new orders
- **Product Selection**: Filter and select products by category
- **Real-time Calculation**: Automatic calculation of order totals
- **Customer Information**: Capture customer details for orders

### Billing
- **Bill Generation**: Create detailed bills for customers
- **Bill History**: View past bills and order details
- **Bill Management**: Search and filter bills by various parameters

## Project Structure

### Core Components
- **Function Classes**: Database connectivity and utility methods
- **UI Forms**: Java Swing forms for user interface
- **Business Logic**: Implementation of cafe management operations

### Key Files
- **CafeManagementSystem.java**: Main application entry point
- **function.java**: Core database connectivity and utility functions
- **dbmethods.java**: Database operations for reporting and data retrieval
- **Login.java**: User authentication system
- **Signup.java**: User registration functionality
- **homePage.java**: Main dashboard for navigation
- **PlaceOrder.java**: Order processing interface
- **viewBill.java**: Bill viewing and management
- **manageCategory.java**: Category management interface
- **Newproduct.java**: Add new products to the system
- **editProduct.java**: Edit or delete existing products
- **verifyUsers.java**: Admin functionality for user verification

## Database Structure
The system connects to a MySQL database named 'cms' with tables for:
- Users/Accounts
- Products
- Categories
- Orders
- Bills

## Security Features
- Password encryption
- Role-based access control
- Admin verification for new users

## Installation Instructions
1. Install MySQL and create a database named 'cms'
2. Configure the database connection in function.java
3. Run the application using the provided JAR file or from an IDE
4. Log in with the default admin credentials (admin@gmail.com)

## Usage Notes
- Admin users have full access to all features
- Regular users can place orders and view bills but cannot access management features
- The system is designed for single-location cafe operations