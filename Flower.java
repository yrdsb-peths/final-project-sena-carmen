import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Flower()
    {
        GreenfootImage image = new GreenfootImage("flower.png");
        image.scale(70, 70);
        setImage(image); 
    }
    public void act()
    {
        // Add your action code here.
    }
}
