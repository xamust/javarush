package com.javarush.test.level08.lesson11.home02;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
    //    printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //Написать тут ваш код
        for(int i = 0; i < 4; i++)
        {
            Cat cat = new Cat();
            result.add(cat);
        }
        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result_dog = new HashSet<Dog>();

        //Написать тут ваш код
        for(int i = 0; i < 3; i++)
        {
            Dog dog = new Dog();
            result_dog.add(dog);
        }
        return result_dog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //Написать тут ваш код
        HashSet<Object> pets = new HashSet<Object>();

        for(Cat c : cats)
        {
            pets.add(c);
        }
        for(Dog d : dogs)
        {
            pets.add(d);
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //Написать тут ваш код
        int count1 = 0;
        int count2 = 0;
        Iterator petsIterator = pets.iterator();
        Iterator catsIterator = cats.iterator();
        while (catsIterator.hasNext())
          {
              Object c = catsIterator.next();
            while (petsIterator.hasNext())
            {
                Object p = petsIterator.next();
                if (c.equals(p))
                {
                    petsIterator.remove();
                    break;
                }
            }
          }

    }

    public static void printPets(Set<Object> pets)
    {
        //Написать тут ваш код
        for (Object o : pets)
        {
            System.out.println(o);
        }
    }

    //Написать тут ваш код
    public static class Cat
    {}
    public static class Dog
    {}
}
