public class PlayerFactory {

    public void display(){
        System.out.println("1)DarkElve");
    }

    public Player getPlayer(String name) {

        System.out.println(name + " please choose your class:");
        this.display();
        int i = Input.askRange(1, 1);

        if (i == 1)
            return (new Player(name, new DarkElve()));
        return (new Player(name, new DarkElve()));
    }
}
