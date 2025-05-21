import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @ Sena Godek
 * @ May 2025
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 1;
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = new GreenfootImage("coin.png");
        image.scale(50, 50);
        setImage(image);
        
        int x = getX();
        int y = getY();
        setLocation(x, y + speed);
        
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObjects(world.getObjects(Ball.class));
            world.removeObjects(world.getObjects(Coin.class));
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(this);
            world.createCoin();
            world.increaseScore();
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
