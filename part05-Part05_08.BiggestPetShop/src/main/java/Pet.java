/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justadev
 */
public class Pet {
    private String name;
    private String breed;
    
    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getBreed() {
        return this.breed;
    }
}
