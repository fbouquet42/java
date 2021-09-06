import java.io.*;

class Input {

    public static String ask() {
        String s = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = br.readLine();
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }
        return s;
    }

    public static int askInt() {
        int i;

        while (true) {
            try {
                i = Integer.parseInt(Input.ask());
                break;
            }
            catch (NumberFormatException nfe) {
                System.out.println("Value Error: Integer expected.");
            }
        }
        return i;
    }

    public static int askRange(int min, int max) {
        int i = Input.askInt();

        while (i < min || i > max) {
            System.out.println("Value Error: Value must be beetween " + min + " and " + max + ".");
            i = Input.askInt();
        }
        return i;
    }
}
