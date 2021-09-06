
public class Orc extends Player
{
    private int _rage;
    private int _endurance;
    private int _damaged;

    public Orc(String name)
    {
        super(name);
        _life = 108;
        _rage = 0;
        _endurance = 0;
        _damaged = 0;
    }

    public void execute(int command, Player foe)
    {
        if(command == 1) {
            foe.damaged(this.random(6, 25) + _rage);
            _rage = 0;
        }
        else if(command == 2) {
            foe.damaged(this.random(0, 12) + _rage);
            _rage = this.random(4, 8);
            this.healed(this.random(2, 6));
        }
        else if(command == 3)
            this.setEndurance(3);
    }

    private void setEndurance(int newValue) {
        if (_endurance > 0)
            return;
        _endurance = newValue;
    }

    public void damaged(int dmg) {
        if (_endurance > 0)
            _damaged += dmg + 2;
        else
            super.damaged(dmg);
    }

    public void update() {
        if (_endurance > 0) {
            _endurance -= 1;
            if (_endurance == 0) {
                this.damaged(_damaged);
                _damaged = 0;
            }
        }
        super.update();
    }

    public String getActionList()
    {
        return "1)ButchersAxes 2)Rage 3)Endurance";
    }
}
