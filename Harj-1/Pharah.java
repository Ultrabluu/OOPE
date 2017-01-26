/* 
 * Viikkoharjoitus 1, tehtävä 6.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 *  Pharah-hahmon simulointi
 *  Lyhenteitä:
 *  rps = RoundsPerSecond
 *  dps = DamagePerSecond
 */

public class Pharah {
    
    public Pharah()
    {
        setRps(1);
        setWeaponDmg(120);
    }
    
    public Pharah(int rps, int weaponDmg)
    {
        setRps(rps);
        setWeaponDmg(weaponDmg);
    }
    
    public final String characterName = "Pharah";
    private int weaponDmg = 120;
    private int rps = 1;
    
    // Getters + Setters START!
    public void setWeaponDmg(int weaponDmg)
    {
        if ( weaponDmg > 0 )
            this.weaponDmg = weaponDmg;
    }
    
    public int getWeaponDmg()
    {
        return weaponDmg;
    }
    
    public void setRps(int rps)
    {
        if( rps > 0 )
            this.rps = rps;
    }
    
    public int getRps()
    {
        return rps;
    }
    
    public double getDps()
    {
        return ( weaponDmg * rps );
    }
    
    public String getCharacterName()
    {
        return characterName;
    }
    // Getters + setters END!
}
