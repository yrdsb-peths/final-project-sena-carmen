import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TransitionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransitionWorld extends World
{

    SimpleTimer delayTimer = new SimpleTimer();
    int level = 1;
    
    /**
     * Constructor for objects of class TransitionWorld.
     * 
     */
    public TransitionWorld(int level)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        this.level = level;
        Label label = new Label("Get Ready for level: " + level, 25);
        
        addObject(label, 100, 100);
        delayTimer.mark();
    }
    
    public void act() {
        if(delayTimer.millisElapsed() > 3000) {
            Greenfoot.setWorld(new MyWorld(level));
        }
     }
}
