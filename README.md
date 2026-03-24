# Mini-App-Java
To design and implement an Object-Oriented Evaluation System using Java.  The system allows evaluation of different users such as Student and Teacher based on  their performance.  This project demonstrates core Object-Oriented Programming concepts such as:  • Inheritance  • Polymorphism  • Interface  • Class and Object  • Method Overriding
🧾 Billing Management System using Java

A menu-driven Billing Management System developed using Java, demonstrating important concepts like Generics, Exception Handling, and Object-Oriented Programming (OOP).

🚀 Features
🛒 Add product details (ID, Name, Price, Quantity)
⚠️ Custom exception for invalid price input
🧮 Automatic total calculation for each product
📊 Display full bill with grand total
🔁 Menu-driven interface
📦 Generic Store class for reusable data handling
🛠️ Technologies Used
Java
OOP Concepts (Classes & Objects)
Generics
Exception Handling
Collections (ArrayList)
Scanner (User Input)
📌 How It Works
User selects an option from the menu
Inputs product details
System validates price using custom exception
Products are stored in a generic store
Bill is generated with total amount
Program continues until user exits
📂 Project Structure
📁 Project Folder
 ┗ 📄 BillingManagement.java
▶️ How to Run
javac BillingManagement.java
java BillingManagement
💻 Source Code
import java.util.*; 

// Custom Exception 
class InvalidPriceException extends Exception { 
    public InvalidPriceException(String msg) { 
        super(msg); 
    } 
} 

// Product Class 
class Product { 
    int id; 
    String name; 
    double price; 
    int quantity; 

    Product(int id, String name, double price, int quantity) throws InvalidPriceException { 
        if (price < 0) { 
            throw new InvalidPriceException("Price cannot be negative!"); 
        } 
        this.id = id; 
        this.name = name; 
        this.price = price; 
        this.quantity = quantity; 
    } 

    double getTotal() { 
        return price * quantity; 
    } 

    void display() { 
        System.out.println(id + " | " + name + " | Price: " + price + 
        " | Qty: " + quantity + " | Total: " + getTotal()); 
    } 
} 

// Generic Store Class 
class Store<T> { 
    private List<T> items = new ArrayList<>(); 

    void addItem(T item) { 
        items.add(item); 
    } 

    List<T> getItems() { 
        return items; 
    } 
} 

public class BillingManagement { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 
        Store<Product> store = new Store<>(); 

        while (true) { 

            System.out.println("\n===== Billing Management ====="); 
            System.out.println("1. Add Product"); 
            System.out.println("2. View Bill"); 
            System.out.println("3. Exit"); 

            System.out.print("Enter choice: "); 
            int ch = sc.nextInt(); 

            switch (ch) { 

                case 1: 
                    try { 
                        System.out.print("Enter Product ID: "); 
                        int id = sc.nextInt(); 

                        System.out.print("Enter Product Name: "); 
                        String name = sc.next(); 

                        System.out.print("Enter Price: "); 
                        double price = sc.nextDouble(); 

                        System.out.print("Enter Quantity: "); 
                        int qty = sc.nextInt(); 

                        Product p = new Product(id, name, price, qty); 
                        store.addItem(p); 

                        System.out.println("Product added to bill."); 

                    } catch (InvalidPriceException e) { 
                        System.out.println("Error: " + e.getMessage()); 
                    } catch (Exception e) { 
                        System.out.println("Invalid input!"); 
                        sc.nextLine(); 
                    } 
                    break; 

                case 2: 
                    double grandTotal = 0; 

                    System.out.println("\n------ Bill Details ------"); 

                    for (Product p : store.getItems()) { 
                        p.display(); 
                        grandTotal += p.getTotal(); 
                    } 

                    System.out.println("--------------------------"); 
                    System.out.println("Grand Total: " + grandTotal); 
                    break; 

                case 3: 
                    System.out.println("Exiting Billing System..."); 
                    sc.close(); 
                    return; 

                default: 
                    System.out.println("Invalid Choice!"); 
            } 
        } 
    } 
}
<img width="1918" height="735" alt="Mini app 2" src="https://github.com/user-attachments/assets/0f251e62-729c-48ab-87c9-96d3e447873b" />
<img width="1918" height="736" alt="Mini app 1" src="https://github.com/user-attachments/assets/ab668109-d19c-498b-a885-83d3cd0fedcc" />

📊 Sample Output
===== Billing Management =====
1. Add Product
2. View Bill
3. Exit

Enter choice: 1
Enter Product ID: 101
Enter Product Name: Pen
Enter Price: 10
Enter Quantity: 5

------ Bill Details ------
101 | Pen | Price: 10.0 | Qty: 5 | Total: 50.0
--------------------------
Grand Total: 50.0
🎯 Learning Outcomes
Understanding Generics in Java
Implementing Custom Exception Handling
Using ArrayList for dynamic storage
Building menu-driven applications
Applying OOP concepts in real-world problems
🙌 Conclusion

This project demonstrates how Java can be used to build a structured and efficient billing system with proper validation, reusable components, and real-time calculations.
