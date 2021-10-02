/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justadev
 */
public class Person {
 
    private String name;
    private Pet pet;
 
    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }
 
    public Person(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }
 
    public Person() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }
 
    @Override
    public String toString() {
        return this.name + ", has a friend called " + this.pet.getName() + "(" + this.pet.getBreed() + ")" ;
    }
 
}
