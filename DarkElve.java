
public class DarkElve extends PoolCard
{
    public DarkElve()
    {
        super();
        this.addCard(new ShadowBlade(), 2);
        this.addCard(new Hate(), 2);
        this.addCard(new PoisonousArrow(), 2);
    }
/*
    public void update()
    {
        this.healed(this.random(0, 3));
        super.update();
    }*/
}
