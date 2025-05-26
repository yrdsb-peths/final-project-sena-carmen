import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grass extends Actor
{
    /**
     * Act - do whatever the Grass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Grass()
    {
        GreenfootImage image = new GreenfootImage("grass.png");
        image.scale(100, 60);
        setImage(image); 
    }
    public void act()
    {
        // Add your action code here.
    }
}
