import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog extends Actor
{
    /**
     * Act - do whatever the Dog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("dog.png");
    GreenfootImage[] idle = new GreenfootImage[8];
    SimpleTimer animationTimer = new SimpleTimer();
    public Dog()
    {
        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/dog_idle/dog-idle" + i +".png"); 
            idle[i].scale(100,100);
        }
        
        animationTimer.mark(); 
        setImage(idle[0]);
    }
    
    public void act()
    {
        // Add your action code here.
        animateDog(); 
        
    }    
    int imageIndex = 0; 
    public void animateDog()
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
