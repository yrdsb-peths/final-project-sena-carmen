import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tube extends Actor
{
    /**
     * Act - do whatever the Tube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("green-tube.png");
    GreenfootImage[] idle = new GreenfootImage[7];
    SimpleTimer animationTimer = new SimpleTimer();
    public Tube()
    {
        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/green_tube/green-tube" + i +".png"); 
            idle[i].scale(100,100);
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

