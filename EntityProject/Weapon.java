/* Models weapons generally.
 * 
 * Rps = RoundsPerSecond
 */

public abstract class Weapon {
    private double rps;
    private double weaponDmg;
    private double reloadTime;
    
 // Getters + Setters START!
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
    
    public void setReloadTime(double reloadTime)
    {
        if( reloadTime > 0 )
            this.reloadTime = reloadTime;
    }
    
    public double getReloadTime()
    {
        return reloadTime;
    }
    
    // Getters + setters END!

}
