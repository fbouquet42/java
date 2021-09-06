
class LifeDisplayer {

    private Player _p1;
    private Player _p2;
    private int _l1;
    private int _l2;

    public LifeDisplayer(Player p1, Player p2)
    {
        _l1 = p1.getLife();
        _l2 = p2.getLife();
        _p1 = p1;
        _p2 = p2;
    }

    private void writeLife(int lastLife, int newLife) {
        String repeated;
        int diff;

        diff = lastLife - newLife;

        if (diff > 0) {
            if (newLife > 0) {
                repeated = new String(new char[newLife]).replace("\0", "#");
                System.out.print(repeated);
            }
        }
        else if (lastLife > 0){
            repeated = new String(new char[lastLife]).replace("\0", "#");
            System.out.print(repeated);
        }
        else if (newLife <= 0) {
            System.out.println("-");
            return;
        }

        if (diff > 0)
            System.out.print("\033[0;31m");
        else if (diff < 0) {
            System.out.print("\033[0;32m");
            diff = -diff;
        }
        if (diff != 0 && lastLife < 0)
            diff -= lastLife;

        if (diff > 0) {
            repeated = new String(new char[diff]).replace("\0", "#");
            System.out.print(repeated);
        }
        System.out.println("\033[0m");
    }

    public void display() {
        System.out.print("Player1 life:");
        this.writeLife(_l1, _p1.getLife());
        System.out.print("Player2 life:");
        this.writeLife(_l2, _p2.getLife());

        _l1 = _p1.getLife();
        _l2 = _p2.getLife();
    }

}
