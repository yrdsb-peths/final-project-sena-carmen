import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Coin class construct the coin dropping down at MyWorld. User click the coin to gain two
 * scores. When coin reaches bottom of screen, scores decreases by two. 
 * 
 * @author Sena Godek
 * @ May 2025
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound coinCollectSound = new GreenfootSound("coin-collect-retro-8-bit-sound-effect-145251.mp3");
    int speed = 1;
    
    /**
     * This create the coin.
     */
    public Coin()
    {
        GreenfootImage image = new GreenfootImage("coin.png");
        image.scale(50, 50);
        setImage(image); 
    }
    
    /**
     * The allow the coin to drop down. 
     */
    public void act()
    {
        GreenfootImage image = new GreenfootImage("coin.png");
        image.scale(50, 50);
        setImage(image);
        
        int x = getX();
        int y = getY();
        setLocation(x, y + speed);
        
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObjects(world.getObjects(Coin.class));
            world.decreaseScore(); 
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(this);
            world.createCoin();
            world.increaseScoreCoin();
            coinCollectSound.play();
        }
    }
    
    /**
     * The set the coin's speed. 
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
