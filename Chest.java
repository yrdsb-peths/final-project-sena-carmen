import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chest extends Actor
{
    /**
     * Act - do whatever the Chest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idle = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Chest()
    {
        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/chest/chest" + i +".png"); 
            idle[i].scale(100,120);
        }
        
        animationTimer.mark(); 
        setImage(idle[0]);
    }
    
    public void act()
    {
        // Add your action code here.
        animateCountdown(); 
    }    
    int imageIndex = 0; 
    public void animateCountdown()
    { 
        if(animationTimer.millisElapsed() < 300)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
}
