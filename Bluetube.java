import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bluetube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bluetube extends Actor
{
    /**
     * Act - do whatever the Bluetube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("blue-tube.png");
    GreenfootImage[] idle = new GreenfootImage[7];
    SimpleTimer animationTimer = new SimpleTimer();
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
    
    public void act()
    {
        // Add your action code here.
        animateTube(); 
        
    }    
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

