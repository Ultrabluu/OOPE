
/* 
 * Viikkoharjoitus 1, tehtävä 6.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 *  Pharah-hahmon simulodoublei
 *  Lyhenteitä:
 *  rps = RoundsPerSecond
 *  dps = DamagePerSecond
 */

public class Pharah extends Character implements Controllable {
    
    // Constructors \\
    public Pharah(boolean isNPC)
    {
        super(isNPC);
        setRps(1);
        setWeaponDmg(120);
    }
    
    public Pharah(boolean isNPC, double rps, double weaponDmg)
    {
        super(isNPC);
        setRps(rps);
        setWeaponDmg(weaponDmg);
    }
    // END-Constructors \\
    
    // Variables \\ 
    private String name = "Pharah";
    private double weaponDmg = 120;
    private double rps = 1;
    private boolean isNPC;
    // END-Variables \\
    
    // Getters + Setters \\
    public void setWeaponDmg(double weaponDmg)
    {
        if ( weaponDmg > 0 )
            this.weaponDmg = weaponDmg;
    }
    
    public double getWeaponDmg()
    {
        return weaponDmg;
    }
    
    public void setRps(double rps)
    {
        if( rps > 0 )
            this.rps = rps;
    }
    
    public double getRps()
    {
        return rps;
    }
    
    public double getDps()
    {
        return ( weaponDmg * rps );
    }
    
    public String getName()
    {
        return name;
    }
    // END-Getters + setters \\
    
    // Actions \\    
    public void action1() {
        System.out.println("Using action 1 - *Shoots rocket launcher* ");
    }
    
    public void action2() {
        System.out.println("Using action 1 - *Activates thrusters* ");
    }
    
    // END-Actions \\
}
