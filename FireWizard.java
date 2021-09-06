
public class FireWizard extends Player
{
    public FireWizard(String name)
    {
        super(name);
        _life = 100;
    }

    public void execute(int command, Player foe)
    {
        if(command == 1) {
            foe.damaged(this.random(5, 12));
            foe.addState(new FireState(foe));
        }
        else if(command == 2) {
            foe.damaged(this.random(4, 8));
            this.healed(this.random(6, 12));
        }
        else if(command == 3) {
            foe.damaged(this.random(9, 24));
            this.damaged(this.random(0, 4));
        }
    }

    public String getActionList()
    {
        return "1)DragonBreathe 2)HolyLight 3)BleedingBlade";
    }
}
