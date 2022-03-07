class singleinheritance{  
void eat(){System.out.println("eating...");}  
}  
class Dog1 extends singleinheritance{  
void bark(){System.out.println("barking...");}  
}  
class TestInheritance1{  
public static void main(String args[]){  
Dog1 d=new Dog1();  
d.bark();  
d.eat();  
}}  