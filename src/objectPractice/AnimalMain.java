// 2. Animal Polymorphism
/* Create Animal, Dog, Cat, Horse classes by referring to the code below
Note : Animal - Interface
 *
 Executed result
 Dog is running
 Cat is running
 Horse is running
 */
package objectPractice;

interface Animal {
    public void move();
}

class Dog implements Animal{
    public void move(){
        System.out.println("Dog is running");
    }
}
class Cat implements Animal{
    public void move(){
        System.out.println("Cat is running");
    }
}
class Horse implements Animal{
    public void move(){
        System.out.println("Horse is running");
    }
}

class AnimalMain{
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();

        Animal[] animals = {dog, cat, horse};
        for(int i = 0; i < animals.length; i++){
            move(animals[i]);
        }
    }

    public static void move(Animal animal){
        animal.move();
    }
}
