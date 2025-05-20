import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 10; 
    public void act()
    { 
        //Let the coin fall.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //Remove coin and draw the game Over when coin gets to bottom
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this); 
        }
    }
    
    public void setSpeed (int spd)
    {
        speed = spd; 
    }
}
