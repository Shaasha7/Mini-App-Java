public class MiniEvaluationApp { 
    public static void main(String[] args) { 
        Evaluatable e1 = new Student("Shalini", 65); 
        Evaluatable e2 = new Teacher("Shankar", 8); 
 
        System.out.println("---- Evaluation System ----"); 
        e1.evaluate(); 
        System.out.println(); 
        e2.evaluate(); 
    } 
} 
 
interface Evaluatable { 
    void evaluate(); 
} 
 
class User { 
    String name; 
    User(String name) { 
        this.name = name; 
    } 
} 
 
class Student extends User implements Evaluatable { 
    int marks; 
    Student(String name, int marks) { 
        super(name); 
        this.marks = marks; 
    } 
    public void evaluate() { 
        System.out.println("Evaluating Student: " + name); 
        if(marks >= 50) 
            System.out.println("Result: Pass"); 
        else 
            System.out.println("Result: Fail"); 
    } 
} 
 
class Teacher extends User implements Evaluatable { 
    int score; 
    Teacher(String name, int score) { 
        super(name); 
        this.score = score; 
    } 
    public void evaluate() { 
        System.out.println("Evaluating Teacher: " + name); 
        if(score >= 7) 
            System.out.println("Performance: Good"); 
        else 
            System.out.println("Performance: Needs Improvement"); 
    } 
}