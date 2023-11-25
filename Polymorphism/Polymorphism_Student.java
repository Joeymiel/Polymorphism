package polymorphism;

public class Polymorphism_Student { //parent class
    String name;    
    Polymorphism_Student(String name){
        this.name = name;
    }    
    void eat(){
        System.out.println(name + " kay nag kaon ug balot ");
    }    
    void sleep(){
        System.out.println(name + " kay galisod ug tulog");
    }    
    void tae(){
        System.out.println(name + " kay nalibang sa daplin ");
    }
    void coding(){
        System.out.println(name + " kay programmer HelloWorld(Print)");
    }       
    public void studentCute(){
        System.out.println("Ang cute mo talaga " + name);
    }
}