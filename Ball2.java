import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ball2 class construct the blue ball at MyWorld.
 * 
 * @ Sena Godek & Carmen Cheung 
 * @ May 2025
 */
public class Ball2 extends Actor
{
    GreenfootSound gameOverSound = new GreenfootSound("game-over-arcade.mp3");
    int speed = 1;
    
    /**
     * This create the ball2. 
     */
    public Ball2()
    {
        GreenfootImage image = new GreenfootImage("ball2.png");
        image.scale(50, 50);
        setImage(image); 
    }
    
    /**
     * This set the ball to fall. 
     */
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
            gameOverSound.play();
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(this);
            world.startBall2Timer();
            world.increaseScore();
        }
    }
    
    /**
     * This set the speed of the ball. 
     */
    public void setSpeed (int spd)
    {
       speed = spd; 
    }
}
