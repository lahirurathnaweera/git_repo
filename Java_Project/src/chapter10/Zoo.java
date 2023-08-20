package chapter10;

public class Zoo {

    public static void main(String args[])
    {
        Dog rocky = new Dog();
        rocky.fatch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();

        ((Cat) sasha).scratch();
        feed(sasha);

    }

    public static void feed(Animal animal)
    {
         if (animal instanceof Dog)
         {
             System.out.println("here is your dog food");
         }

         else if (animal instanceof Cat)
         {
             System.out.println("here is your cat food");
         }
    }

}
