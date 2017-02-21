/*
 * Models character and it's actions.
 */


public abstract class Character {
    
    public static String newline = System.getProperty("line.separator");
    private String name;
    private String weapon;
    private boolean isNPC;
    
    // Constructors \\
    public Character(boolean isNPC) {
        this.isNPC = isNPC;
    }
    
    // Weapon \\
    public void action1() {
        System.out.println("*Character specific action1 is NOT SET YET*");
    }
    
    public void action2() {
        System.out.println("*Character specific action2 is NOT SET YET*");
    }
    
    // Movement \\
    public void move() {
        System.out.println("*Moves*");
    }
    
    public void jump() { 
        System.out.println("*Jumps*");
    }
    
    public void crouch() {
        System.out.println("*Crouches*");
    }    
    
    // Is it AI-controlled? \\
    public void setIsNPC(boolean isNPC) {
        this.isNPC = isNPC;
    }
    
    public boolean getIsNPC() {
        return isNPC;
    }
    
    // To be added: prints to all method -> Good for checking, which features are implemented already.
    @Override
    public String toString() {
        return "This model's name is:." + name + newline + 
               "Is a npc:............." + isNPC + newline;
               
    }
    
       
}
