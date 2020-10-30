package companytrain;

import java.util.Scanner;

public class Worker extends Human {
    private String post;
    private int salary;
    
    Worker(){
        super(null, 0);
    }
    
    Worker(String name, int age, String post, int salary){
        super(name, age);
        this.init(post, salary);
    }
    
    void init(String post, int salary){
        this.post = post;
        this.salary = salary;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        input(sc);
    }
    
    void input(Scanner sc){
        super.input(sc);
        sc.nextLine();
        System.out.println("Enter POST:");
        this.post = sc.nextLine();
        System.out.println("Enter SALARY:");
        this.salary = sc.nextInt();
    }
    
    Worker copy(Worker person){
        this.name = person.name;
        this.age = person.age;
        this.post = person.post;
        this.salary = person.salary;
        return this;
    }
    
    String getPost(){
        return this.post;
    }
    
    int getSalary(){
        return this.salary;
    }
    
    @Override
    public String toString(){
        return "NAME: " + name + "\nAGE: " + age + "\nPOST" + post + "\nSALARY" + salary;
    }
}
