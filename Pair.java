
public class Pair<T, U>
{
    private T _first;
    private U _second;

    public Pair(T first, U second) {
        _first = first;
        _second = second;
    }

    public T getValue0() {
        return _first;
    }

    public U getValue1() {
        return _second;
    }
}
