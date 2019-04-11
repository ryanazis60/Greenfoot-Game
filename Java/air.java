import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class air here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class air extends World
{

    /**
     * Constructor for objects of class air.
     * 
     */
    public air()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        turtle turtle = new turtle();
        addObject(turtle,59,196);
    }
}
