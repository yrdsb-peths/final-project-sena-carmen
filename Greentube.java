import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Greentube class animates the green tube at MyWorld. 
 * 
 * @author Carmen Cheung and Sena godek
 * @June 2025
 */
public class Greentube extends Actor
{
    GreenfootImage image = new GreenfootImage("green-tube.png");
    GreenfootImage[] idle = new GreenfootImage[7];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * This animate the green tube. 
     */
    public Greentube()
    {
        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/green_tube/green-tube" + i +".png"); 
            idle[i].scale(100,120);
        }
        
        animationTimer.mark(); 
        setImage(idle[0]);
    }
    
    /**
     * Constructor for animateTube().
     */
    public void act()
    {
        animateTube(); 
    }    
    
    /**
     * This set the speed of the green tube. 
     */
    int imageIndex = 0; 
    public void animateTube()
    { 
        if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
}

