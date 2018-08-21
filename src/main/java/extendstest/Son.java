package extendstest;

public class Son extends Father {
    @Override
    public void aaa() {
        System.out.println("这是Son类的aaa()方法!");
    }

    @Override
    public boolean ddd() {
        super.ddd();
        System.out.println("这是Son类的ddd()方法!");
        return true;
    }

    public void bbb(String s) {
        System.out.println("这是Son类的bbb()方法!");
    }
}
