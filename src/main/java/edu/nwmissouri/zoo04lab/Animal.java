package edu.nwmissouri.zoo04lab;

/**
 * Animal super class for traits shared by all animals. Abstract - don't make a
 * general animal - only specific types.
 *
 * @author Dr. Case
 */
public abstract class Animal {

    /**
     * Every animal has a name. Class variable name is not private, but
     * protected - only subclasses can use it.
     */
    protected String name = "no name";

    /**
     * Animal constructor
     *
     * @param name - the name of this instance of an animal
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * speak() - general method for animal utterance
     */
    public void speak() {
        System.out.println("Generic animal sound");
    }

    /**
     * move() - general method for animal movement
     */
    public void move() {
        System.out.println("Generic animal movement");
    }

    /**
     * Get animal's name.
     * @return name
     */
    public String getName() {
        return name;
    }

}
