import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bluetube class create the animation of the blue tube in MyWorld. 
 * 
 * @author Carmen Cheung and Sena Godek 
 * @June 2025
 */
public class Bluetube extends Actor
{
    
    GreenfootImage image = new GreenfootImage("blue-tube.png");
    GreenfootImage[] idle = new GreenfootImage[7];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /** 
     * This create the blue tube. 
     */
    public Bluetube()
    {
        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/blue_tube/blue-tube" + i +".png"); 
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
     * This animate the blue tube. 
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

