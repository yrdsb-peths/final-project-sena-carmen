import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Item to click on. 
 * 
 * @author Carmen Cheung 
 * @version May 20, 2025
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1; 
    public void act()
    {
        GreenfootImage image = new GreenfootImage("Ball2.png");
        image.scale(50, 50);
        setImage(image); 
        //Let the Ball fall.
        int x = 100;
        int y = 100 + speed;
        setLocation(x, y);
        
        //Remove Ball and draw the game Over when Ball gets to bottom
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this); 
        }
    }
    
    public void setSpeed (int spd)
    {
        speed = spd; 
    }
}
