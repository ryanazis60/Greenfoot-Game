import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Java here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Java extends Actor
{
    /**
     * Act - do whatever the Java wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }  
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-3);
        }
        Actor banana=getOneObjectAtOffset(0,0, banana.class);
        if(banana !=null){
        getWorld().removeObject(banana);
    }
    
       
    }    
}
