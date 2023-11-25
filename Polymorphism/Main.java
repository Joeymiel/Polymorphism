package polymorphism;

public class Main {
    public static void main(String[] args){
        Polymorphism_Student my_student = new Polymorphism_Student("Si Ankol ");
        Polymorphism_Joey my_Joey = new Polymorphism_Joey ("Joey");
        Polymorphism_Baby my_Baby = new Polymorphism_Baby ("Baby");
        
        my_student.eat();
        my_Joey.sleep();
        my_Baby.coding();
        
        System.out.println("---------------------------------------");
        
        my_student.tae();
        my_Joey.studentCute();
        my_Baby.studentCute();
    }
}
