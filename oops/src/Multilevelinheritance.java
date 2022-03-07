class Multilevelinheritance{  
void eat(){System.out.println("eating...");}  
}  
class cat extends Multilevelinheritance{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends cat{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  