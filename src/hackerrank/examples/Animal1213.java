package hackerrank.examples;

public abstract class Animal1213 {
    private int age;//we can make this private so it is only accessible inside 
    //this class, but have getters and setters so other classes can have access

    public Animal1213(int age) {//if we only want age to be accessable inside of the 
        //animal class, so we make it private
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();//classes that extend abstract classes must 
    //implement abstract methods or be abstract themselves
    //with abstract classes, a method may not be defined - it isn't 
    //implemented(it's abstract and someone else is handling it later) but with
    //the overriding of methods, there is an implementation at a superclass 
    //level. so if you don't implement it at a lower level, it's jsut going to 
    //go back to  the super class method 
    //implemented method in superclass = may/may not be overriden in subclass
    //abstract method in superclass = has to be overriden in subclass to be defined

    public int getAge() {
        return age;
    }
    
    public void sleep(){
        System.out.println("An animal is sleeping");
    }

    public static void main(String[] args) {
        
        System.out.println("");
        Dog1213 d = new Dog1213();
        Cat1213 c= new Cat1213();
        c.meow();
        d.ruff();
        System.out.println(d.getAge());
        System.out.println(c.getAge());
        c.eat();//because eat is an abstract method, we didn't need to override 
        //it, you just had to put something in the eat method. so it forces you to 
        //write something for eat for each animal. but if the method is alrady 
        //defined and we are not happy with what has been defined in the abstract
        //class, we can @override it by writing the exact name of the method and
        //redefining the body. e.g. for sleep() we only overrode for Cat1213 and not
        //Dog, so when we printed d.sleep(), it said An animal is sleeping, where
        //as c.sleep() printed A cat is sleeping
        d.eat();//you can override classes that are not abstract, both abstract 
        //and nonabstract classes can have override methods
        d.run();
        c.prance();
        d.sleep();//because we didn't override sleep() in Dog1213, it just used the 
        //method in the abstract superclass
        c.sleep();
        
        //what happens if...
        //Animal o = new Dog1213();
        //o.eat();//the dog only has access to the methods available 
        //to the animal and not methods specific to dogs
        //Dog o= new Animal1213(3); //this can't happen because they are 
        //incompatible types. An animal cannot be converted to a dog, but a dog 
        //is an animal so it can be converted down to an animal. A subclass can 
        //be generalised to a superclass, but a superclass cannot become a more 
        //specific subclass
        
        //casting
        Object dog = new Dog1213();
        Dog1213 realDog = (Dog1213) dog;
        realDog.ruff();
        
        Object str = "est";
        String realS = (String) str;
        realS.getBytes();
        
        //what happens when...
        Dog1213 cat = new Dog1213();
        if (cat instanceof Animal1213){
            Animal1213 animal = (Animal1213) cat;
            animal.sleep();//it prints A cat is sleeping even though we casted 
            //it as an animal, we don't lose the essence of the cat. Basically
            //it doesn't matter what cat was before, but it is just now that we 
            //guarantee when we use animal we're going to have all the animal 
            //methods but won't get access to the methods specific to Cat1213 
            //e.g. meow
           
        }
        cat.sleep();//prints A cat is sleeping
                

    }

}
