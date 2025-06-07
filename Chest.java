import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Chest class animates the chest animation at YouWonWorld. 
 * 
 * @author Carmen Cheung
 * @June 2025
 */
public class Chest extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * This create the chest. 
     */
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
    
    /**
     * COnstructor for animateChest().
     */
    public void act()
    {
        animateChest(); 
    }    
    
    /**
     * This animate the chest.
     */
    int imageIndex = 0; 
    public void animateChest()
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
