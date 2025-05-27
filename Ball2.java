import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball2 here.
 * 
 * @ Sena Godek & Carmen Cheung 
 * @ May 2025
 */
public class Ball2 extends Actor
{
    /**
     * Act - do whatever the Ball2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 1;
    public Ball2()
    {
        GreenfootImage image = new GreenfootImage("ball2.png");
        image.scale(50, 50);
        setImage(image); 
    }
    
    public void act()
    {
        //Let the Ball fall.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //Remove Ball and draw the game Over when Ball gets to bottom
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(this);
            world.startBall2Timer();
            world.increaseScore();
        }
    }
    
    public void setSpeed (int spd)
    {
        speed = spd; 
    }
}
