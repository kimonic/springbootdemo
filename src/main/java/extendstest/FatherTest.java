package extendstest;

public class FatherTest {
    public static void main(String[] args){
        Father father=new Son();
        ((Son) father).bbb("");
//        Other other=new Other();
//        other.sss(father);
    }
}
