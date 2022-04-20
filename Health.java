public class Health {

    private int hitPoints;
    protected int damageValue;
    protected int hpIncrease;
    public int basicHealth = 100;

    public void playerHealth(int _hitPoints, int _hpIncrease)
    {
        hitPoints = _hitPoints;
        hpIncrease = _hpIncrease;
        //Determines the overall amount of HP that the player has, starting with a base value and adding any HP increases as necessary
    }
    public int getHit()
    {
        //damaging the player through an enemy attack
        basicHealth = basicHealth - hitPoints;
        return basicHealth;
    }
    public int heals()
    {
        //healing the player, such as through Heal Wounds
        basicHealth = basicHealth + hpIncrease;
        return basicHealth;

    }
    public int getCurrentHealth()
    {
        return basicHealth;
    }
    public void die()
    {
        if(getCurrentHealth()<=0)
        {
            //run death statement
        }
        else{
            System.out.print(getCurrentHealth());
        }
    }
}
