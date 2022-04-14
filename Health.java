import java.util.Random;
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
        basicHealth = basicHealth -hitPoints;
        return basicHealth;
    }
    public int heals()
    {
        basicHealth = basicHealth + hpIncrease;
        return basicHealth;

    }
}
