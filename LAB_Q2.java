//Demonstrate the use of the super keyword in Java, especially in a constructor.

class Animal{  
    Animal()
    {
        System.out.println("animal is created");
        
    }  
    }  
    class Dog extends Animal
    {  
    Dog(){  
    super();  
    System.out.println("dog is created");  
    }  
    }  
    public class LAB_Q2{  
    public static void main(String args[]){  
    Dog d=new Dog();  
    }
    }