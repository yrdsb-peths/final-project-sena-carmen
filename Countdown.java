import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Countdown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Countdown extends Actor
{
    /**
     * Act - do whatever the Countdown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idle = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
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
    
    public void act()
    {
        // Add your action code here.
        animateCountdown(); 
    }    
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

