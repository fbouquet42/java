import java.util.Random;

public class Rand
{
    private static Random _rand = new Random();

    public static int get(int min, int max) {
        return _rand.nextInt((max - min) + 1) + min;
    }
}
