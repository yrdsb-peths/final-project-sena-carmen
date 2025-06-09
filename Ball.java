import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ball class construct the green ball at MyWorld.  
 * 
 * @ author Sena Godek & Carmen Cheung 
 * @ May 2025
 */
public class Ball extends Actor
{
    GreenfootSound gameOverSound = new GreenfootSound("game-over-arcade.mp3");
    int speed = 1; 
    
    /**
     * This create the ball. 
     */
    public Ball()
    {
        GreenfootImage image = new GreenfootImage("ball1.png");
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
            world.increaseScore();
            world.startBall1Timer();
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
