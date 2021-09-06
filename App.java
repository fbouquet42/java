class App {

    public static void main(String[] args) {
        Output.clear();
        System.out.println("Welcome in the marvellous land of SoBorang...\n");

        Player p1;
        Player p2;
        PlayerFactory factory = new PlayerFactory();

        p1 = factory.getPlayer("Player1");
        System.out.println("");
        p2 = factory.getPlayer("Player2");

        LifeDisplayer lifeDisplayer = new LifeDisplayer(p1, p2);
        while (p1.getLife() > 0 && p2.getLife() > 0)
        {
            Output.clear();
            lifeDisplayer.display();
            System.out.println("\nPlayer1 to play...\n" + p1.getActionList());
            p1.execute(Input.askRange(1, 3), p2);
            //p1.play();

            Output.clear();
            lifeDisplayer.display();
            //p2.play();

            System.out.println("\nPlayer2 to play...\n" + p2.getActionList());
            p2.execute(Input.askRange(1, 3), p1);

            p1.update();
            p2.update();
        }

        System.out.println("\nTHE END!\nPlayer1 life:" + p1.getLife() + "\nPlayer2 life:" + p2.getLife());
        if (p1.getLife() > 0)
            System.out.println("Player1 has won...\nBravo!");
        else if(p2.getLife() > 0)
            System.out.println("Player2 has won...\nBravo!");
        else
            System.out.println("Everyone dies...what a game...");
    }
}
//System.out.println("Enter a second number:");
//secondNum = Integer.parseInt(br.readLine());
