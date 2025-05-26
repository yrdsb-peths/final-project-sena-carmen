import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Rock()
    {
        GreenfootImage image = new GreenfootImage("rock.png");
        image.scale(50, 50);
        setImage(image); 
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
