package by.bsu.btn.func;

public abstract class IntFunction implements IFunction {

    public abstract int intFunc(int a, int b, int c);

    @Override
    public String func(String a, String b, String c) {
        return Integer.toString(intFunc(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c)));
    }
}
