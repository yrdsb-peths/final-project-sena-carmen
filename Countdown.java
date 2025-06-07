import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Countdown class animates the countdown at TransitionWorld.
 * 
 * @author Carmen Cheung 
 * @June 2025
 */
public class Countdown extends Actor
{
    /**
     * Act - do whatever the Countdown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idle = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * This animate the countdown.
     */
    public Countdown()
    {
        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/countdown/countdown" + i +".png"); 
            idle[i].scale(100,120);
            if (i == 3){
                idle[i].scale(300,120);
            }
        }
        
        animationTimer.mark(); 
        setImage(idle[0]);
    }
    
    /**
     * Constructor for animateCountdown.
     */
    public void act()
    {
        animateCountdown(); 
    }    
    
    /**
     * This set the speed of the countdown.
     */
    int imageIndex = 0; 
    public void animateCountdown()
    { 
        if(animationTimer.millisElapsed() < 700)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
}

