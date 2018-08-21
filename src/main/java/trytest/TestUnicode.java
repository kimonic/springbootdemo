package trytest;

import org.apache.catalina.connector.CoyoteAdapter;
import org.omg.CORBA.TRANSIENT;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.context.EnvironmentAware;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HttpServletBean;
import sun.misc.ProxyGenerator;
import sun.reflect.misc.ReflectUtil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;

public class TestUnicode {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String s="土豆金服";
//        char[] charArray=s.toCharArray();
////        for (char c:charArray){
////            System.out.println("----"+(int)c);
////            System.out.println("----"+(char)35910);
////        }13311-171965
//        for (int i = 19968; i < 40869; i++) {
//            System.out.println("----"+(char)i);
//
//        }
//        MaoTaiJiu maoTaiJiu=new MaoTaiJiu();
//        InvocationHandler jingXiao1=new GuiTaiA(maoTaiJiu);
//        SellWine dynamicProxy= (SellWine) Proxy.newProxyInstance(maoTaiJiu.getClass().getClassLoader(),
//                maoTaiJiu.getClass().getInterfaces(),jingXiao1);
//        dynamicProxy.sellWine();
//
//        TaiShan taiShan=new TaiShan();
//        InvocationHandler jingxiao2=new GuiTaiA(taiShan);
//        SellCigeratte dynamicProxy1= (SellCigeratte) Proxy.newProxyInstance(taiShan.getClass().getClassLoader(),
//                taiShan.getClass().getInterfaces(),jingxiao2);
//        dynamicProxy1.sellCigeratte("平台a");
//        String s = System.getProperty("sun.boot.class.path");
//        String[] s1 = s.split(";");
//        for (String s2 : s1) {
//            System.out.println(s2);
//        }
//        System.out.println("hhhhh----" + System.getProperty("java.class.path"));
//        OutputStream output = null;
//        try {
//            // read bmp
////            File file=new File("E:/123.bmp");
////            System.out.println("-----"+file);
//            BufferedImage img = new BufferedImage(500,500,BufferedImage.TYPE_INT_RGB);
//            System.out.println("-----"+img);
//            int imageType = img.getType();
//            int w = img.getWidth();
//            int h = img.getHeight();
//            int startX = 0;
//            int startY = 0;
//            int offset = 0;
//            int scansize = w;
//            // rgb的数组
//            int[] rgbArray = new int[offset + (h - startY) * scansize
//                    + (w - startX)];
//            img.getRGB(startX, startY, w, h, rgbArray, offset, scansize);
//
//            int x0 = w / 2;
//            int y0 = h / 2;
//            int rgb = rgbArray[offset + (y0 - startY) * scansize
//                    + (x0 - startX)];
//
//            byte[] bytes="你好的回复你空间首付款撒".getBytes();
//            int[] rgbArray=new int[bytes.length*100];
//            for (int i = 0; i < 2500; i++) {
//                if (i%50<30&&i%50>20){
//                    rgbArray[i]=12345678;
//                }else {
//                    rgbArray[i]=0xffffffff;
//                }
//                if (i>=20*50&&i<30*50){
//                    rgbArray[i]=12345678;
//                }
//            }
//            System.out.println("0xffffffff="+0xffffffff);
//            System.out.println("0xffffffff="+(0xffffff+2));
//            System.out.println("0xffffffff="+Integer.MAX_VALUE);
//            System.out.println("??"+bytes[0]);
//            System.out.println("???"+bytes[1]);
//            System.out.println("???"+bytes[2]);
////            Color c = new Color(28,67,96);
////            System.out.println("中间像素点的rgb：" + c);
//            // create and save to bmp
//            File out = new File("E:/3.jpg");
//            if (!out.exists())
//                out.createNewFile();
//            output = new FileOutputStream(out);
//            BufferedImage imgOut = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
//            imgOut.setRGB(0, 0, 50, 50, rgbArray, 0, 50);
//            ImageIO.write(imgOut, "bmp", output);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (output != null)
//                try {
//                    output.close();
//                } catch (IOException e) {
//                }
//        }
        aaa();
    }

    /**
     * 写作是门手艺，笑对需要勇气。
     * <p>
     * 写下这个题目的时候，我压力比较大，怕的是费力不讨好。因为反射这一块，
     * 对于大多数人员而言太熟悉了，稍微不注意就容易把方向写偏，把知识点写漏。
     * 但是，我已经写了注解和动态代理这两个知识点的博客，阅读量还可以，
     * <p>
     * 这两个知识点是属于反射机制中的，现在对于注解和动态代理息息相关的反射知识基础我倒是退缩了，
     * 所以说看起来很普通的东西，其实真的要一五一十地把它的门道说才方显功力。我们经常说一个人
     * <p>
     * 半吊子二把刀，说起来头头是道，做起来却不是那么一回事。
     * 王阳明说知行合一，很多人只让自己停留在知的阶段，没有行，或者说行的能力薄弱，因为没有行
     * <p>
     * 来“事上练”，所以就没有办法不停检测自己的“知”是否正确，也就无法“致良知”,这就是王阳
     * 明心学，有兴趣的同学可以自行去阅读相关的书籍。听不懂的也没有关系，大体意思就是实践出真理
     * ，理论和实践相结合。对于 Java 反射这类基础知识，很多同学看了一遍就觉得懂了，其实很多时候还是没有懂，
     * 只是跟着书本被动阅读，你会产生一种错觉，这种错觉就是你以为你懂了，其实，你没有。如何检测呢？很简单，
     * <p>
     * 你在阅读某本书，某个章节之后，你合上书本，闭上眼睛，你试着回想一下，你刚才看过的内容，你能记住多少？
     * 别不信，你现在就可以找一本书试一试。
     * 讲了这么多，我的观点其实很简单，就是认真对待你的一技之长，尽可能把每个知识点真正弄懂，带着自己的思
     * 考去学习新的概念，然后适时做一些练习来检测和巩固。
     * <p>
     * 下面，让我们一起认真对待之前可能没有多在意的基础知识之一—— Java 反射。
     * <p>
     * 注意，这篇文章因为内容太多，所以篇幅非常长。中途受不了的同学可以回到目录跳转到感兴趣的小节进行学习。
     * <p>
     * <p>
     * 向一个门外汉介绍反射
     * 反射是什么？
     * <p>
     * 官方文档上有这么一段介绍：
     * <p>
     * Reflection is commonly used by programs which require the ability to
     * examine or modify the runtime behavior of applications
     * running in the Java virtual machine. This is a relatively
     * advanced feature and should be used only by developers
     * who have a strong grasp of the fundamentals of the language.
     * With that caveat in mind, reflection is a powerful technique and
     * can enable applications to perform operations which would otherwise be impossible.
     * <p>
     * 我来翻译一下：反射技术通常被用来检测和改变应用程序在 Java 虚拟机中的行为表现。
     * 它是一个相对而言比较高级的技术，通常它应用的前提是开发者本身对于 Java
     * 语言特性有很强的理解的基础上。值得说明的是，反射是一种强有力的技术特性，
     * 因此可以使得应用程序突破一些藩篱，执行一些常规手段无法企及的目的。
     * <p>
     * 我再通俗概括一下：反射是个很牛逼的功能，能够在程序运行时修改程序的行为。但反射是非常规手段，反射有风险，应用需谨慎。
     * <p>
     * 相信，大部分同学会有稍微清晰一点的概念了。但这还不是我的目的所在。
     * <p>
     * 我的目的是想，我如何向一个刚有一点点 Java 基础的初学者，或者是说毫无 Java 基础的门外汉解释清楚反射这样一种东西？
     * <p>
     * 直接翻译官方文档，显然是不太行。因为那仍然是抽象的，所以，最好的方法仍然是通过类比或者是拟人，
     * 用生活场景中具体的事物与抽象的概念建立相关性。
     * <p>
     * 把程序代码比作一辆车，因为 Java 是面向对象的语言，所以这样很容易理解，
     * 正常流程中，车子有自己的颜色、车型号、品牌这些属性，也有正常行驶、倒车、停泊这些功能操作。
     * <p>
     * 正常情况下，我们需要为车子配备一个司机，然后按照行为准则规范行驶。
     * <p>
     * 那么反射是什么呢？反射是非常规手段，正常行驶的时候，车子需要司机的驾驶，
     * 但是，反射却不需要，因为它就是车子的——自动驾驶。
     * <p>
     * 因为，反射牛逼，又因为反射非常规，所以，它风险未知，需要开发者极强的把控力。
     * 而汽车中的自动驾驶技术现在是热门，但是特斯拉都出过故障，所以同样在汽车领域，
     * 自动驾驶技术也需要车厂家有极牛逼的风险把控能力，这个基础就是要遵从汽车本身的结构与交通规则，
     * 不能因为运用了自动驾驶技术的汽车就不叫做汽车了，应用了反射技术的代码就不叫做代码了。
     * <p>
     * 自动驾驶需要遵守基础规则，同样反射也需要，下面的文章就是介绍反射技术应该遵守的规格与限制。
     * <p>
     * 反射入口
     * 我们试想一下，如果自动驾驶要运用到一辆汽车之上，研发人员首先要拿到的是什么？
     * <p>
     * 肯定是汽车的规格说明书。
     * <p>
     * <p>
     * <p>
     * <p>
     * <p>
     * 同样，反射如果要作用于一段 Java 代码上，那么它也需要拿到一本规格说明书，那么对于反射而言，这本规格说明书是什么呢？
     * <p>
     * Class
     * 因为 Java 是面向对象的语言，基本上是以类为基础构造了整个程序系统，反射中要求提供的规格说明书其实就是一
     * 个类的规格说明书，它就是 Class。
     * <p>
     * 注意的是 Class 是首字母大写，不同于 class 小写，class 是定义类的关键字，
     * 而 Class 的本质也是一个类，因为在 Java 中一切都是对象。
     * <p>
     * public final class Class<T> implements java.io.Serializable,
     * GenericDeclaration,
     * Type,
     * AnnotatedElement {}
     * Class 就是一个对象，它用来代表运行在 Java 虚拟机中的类和接口。
     * <p>
     * 把 Java 虚拟机类似于高速公路，那么 Class 就是用来描述公路上飞驰的汽车，也就是我前面提到的规格说明书。
     * <p>
     * Class 的获取
     * 反射的入口是 Class，但是反射中 Class 是没有公开的构造方法的，所以就没有办法像
     * <p>
     * 创建一个类一样通过 new 关键字来获取一个 Class 对象。
     * <p>
     * 不过，不用担心，Java 反射中 Class 的获取可以通过下面 3 种方式。
     * <p>
     * 1. 通过 Object.getClass()
     * 对于一个对象而言，如果这个对象可以访问，那么调用 getClass() 方法就可以获取到了它的相应的 Class 对象。
     * <p>
     * public class Car {}
     * <p>
     * public class Test {
     * <p>
     * public static void main(String[] args) {
     * <p>
     * Car car = new Car();
     * <p>
     * Class clazz = car.getClass();
     * }
     * <p>
     * }
     * 值得注意的是，这种方法不适合基本类型如 int、float 等等。
     * <p>
     * 2. 通过 .class 标识
     * 上面的例子中，Car 是一个类，car 是它的对象，通过 car.getClass() 就获取到了
     * Car 这个类的 Class 对象，也就是说通过一个类的实例的 getClass() 方法就能获取到它的
     * Class。如果不想创建这个类的实例的话，就需要通过 `.class 这个标识。
     * <p>
     * public class Test {
     * <p>
     * public static void main(String[] args) {
     * <p>
     * Class clazz = Car.class;
     * Class cls1 = int.class;
     * Class cls2 = String.class;
     * <p>
     * }
     * }
     * 3. 通过 Class.forName() 方法
     * 有时候，我们没有办法创建一个类的实例，甚至没有办法用 Car.class 这样的方式去获取一个类的 Class 对象。
     * <p>
     * 这在 Android 开发领域很常见，因为某种目的，Android 工程师把一些类加上了 @hide 注解，
     * 所示这些类就没有出现在 SDK 当中，那么，我们要获取这个并不存在于当前开发环境中的类的
     * Class 对象时就没有辙了吗？答案是否定的，Java 给我们提供了 Class.forName() 这个方法。
     * <p>
     * 只要给这个方法中传入一个类的全限定名称就好了，那么它就会到 Java 虚拟机中去寻找这个类有没有被加载。
     * <p>
     * try {
     * Class clz = Class.forName("com.frank.test.Car");
     * } catch (ClassNotFoundException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * “com.frank.test.Car” 就是 Car 这个类的全限定名称，它包括包名+类名。
     * <p>
     * 如果找不到时，它会抛出 ClassNotFoundException 这个异常，这个很好理解，
     * 因为如果查找的类没有在 JVM 中加载的话，自然要告诉开发者。
     * <p>
     * 所以，上面 3 节讲述了如何拿到一个类的 Class 对象。
     * <p>
     * <p>
     * Class 内容清单
     * 仅仅拿到 Class 对象还不够，我们感兴趣的是它的内容。
     * <p>
     * 在正常的代码编写中，我们如果要编写一个类，一般会定义它的属性和方法，如：
     * <p>
     * public class Car {
     * <p>
     * private String mBand;
     * <p>
     * private Color mColor;
     * <p>
     * public enum Color {
     * RED,
     * WHITE,
     * BLACK,
     * BLUE,
     * YELLOR
     * }
     * <p>
     * <p>
     * <p>
     * public Car() {
     * super();
     * // TODO Auto-generated constructor stub
     * }
     * <p>
     * <p>
     * public Car(String mBand) {
     * this.mBand = mBand;
     * }
     * <p>
     * <p>
     * public void drive() {
     * System.out.println("di di di,开车了！");
     * }
     *
     * @Override public String toString() {
     * return "Car [mBand=" + mBand + ", mColor=" + mColor + "]";
     * }
     * <p>
     * <p>
     * }
     * 现在我们来一一分解它。
     * <p>
     * <p>
     * Class 的名字
     * Class 对象也有名字，涉及到的 API 有：
     * <p>
     * Class.getName();
     * <p>
     * Class.getSimpleName();
     * <p>
     * Class.getCanonicalName();
     * 现在，说说它们的区别。
     * <p>
     * 因为 Class 是一个入口，它代表引用、基本数据类型甚至是数组对象，所以获取它们的方式又有一点不同。
     * <p>
     * 先从 getName() 说起。
     * <p>
     * 当 Class 代表一个引用时
     * getName() 方法返回的是一个二进制形式的字符串，比如“com.frank.test.Car”。
     * <p>
     * 当 Class 代表一个基本数据类型，比如 int.class 的时候
     * getName() 方法返回的是它们的关键字，比如 int.class 的名字是 int。
     * <p>
     * 当 Class 代表的是基础数据类型的数组时 比如 int[][][] 这样的 3 维数组时
     * getName() 返回 [[[I 这样的字符串。
     * <p>
     * 为什么会这样呢？这是因为，Java 本身对于这一块制定了相应规则，在元素的类型前面添加相应数量的
     * [ 符号，用 [ 的个数来提示数组的维度，并且值得注意的是，对于基本类型或者是类，都有相应的编码，
     * 所谓的编码大多数是用一个大写字母来指示某种类型，规则如下：
     * <p>
     * 这里写图片描述
     * <p>
     * <p>
     * <p>
     * 需要注意的是类或者是接口的类型编码是 L类名; 的形式,后面有一个分号。
     * <p>
     * 比如 String[].getClass().getName() 结果是 [Ljava.lang.String;。
     * <p>
     * 我们来测试一下代码：
     * <p>
     * public class Test {
     * <p>
     * public static void main(String[] args) {
     * <p>
     * try {
     * Class clz = Class.forName("com.frank.test.Car");
     * <p>
     * Class clz1 = float.class;
     * <p>
     * Class clz2 = Void.class;
     * <p>
     * Class clz3 = new int[]{}.getClass();
     * <p>
     * Class clz4 = new Car[]{}.getClass();
     * <p>
     * System.out.println(clz.getName());
     * System.out.println(clz1.getName());
     * System.out.println(clz2.getName());
     * System.out.println(clz3.getName());
     * System.out.println(clz4.getName());
     * <p>
     * <p>
     * } catch (ClassNotFoundException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * <p>
     * }
     * <p>
     * }
     * 上面代码的打印结果如下：
     * <p>
     * com.frank.test.Car
     * float
     * java.lang.Void
     * [I
     * [Lcom.frank.test.Car;
     * <p>
     * <p>
     * 刚刚介绍的都是 getName() 的情况，那么 getSimpleName() 和 getCaninolName() 呢？
     * <p>
     * getSimpleName() 自然是要去获取 simplename 的，那么对于一个 Class 而言什么是 SimpleName 呢？我们先要从嵌套类说起
     * <p>
     * public class Outter {
     * <p>
     * static class Inner {}
     * <p>
     * }
     * Outter 这个类中有一个静态的内部类。
     * <p>
     * Class clz = Outter.Inner.class;
     * <p>
     * System.out.println(" Inner Class name:"+clz.getName());
     * System.out.println(" Inner Class simple name:"+clz.getSimpleName());
     * 我们分别打印 Inner 这个类的 Class 对象的 name 和 simplename。
     * <p>
     * Inner Class name:com.frank.test.Outter$Inner
     * Inner Class simple name:Inner
     * 可以看到，因为是内部类，所以通过 getName() 方法获取到的是二进制形式的全限定类名，并且类名前面还有个 $ 符号。
     * getSimpleName() 则直接返回了 Inner，去掉了包名限定。
     * <p>
     * 打个比方，我的全名叫做 Frank Zhao，而我的 simplename 就叫做 frank，simplename 之于 name 也是如此。
     * <p>
     * simplename 的不同
     * 需要注意的是，当获取一个数组的 Class 中的 simplename 时，不同于 getName() 方法，simplename
     * 不是在前面加 [，而是在后面添加对应数量的 [] 。
     * <p>
     * Class clz = new Outter.Inner[][][]{}.getClass();
     * <p>
     * System.out.println(" Inner Class name:"+clz.getName());
     * System.out.println(" Inner Class simple name:"+clz.getSimpleName());
     * 上面代码打印结果是：
     * <p>
     * Inner Class name:[[[Lcom.frank.test.Outter$Inner;
     * Inner Class simple name:Inner[][][]
     * <p>
     * 还需要注意的是，对于匿名内部类，getSimpleName() 返回的是一个空的字符串。
     * <p>
     * Runnable run = new Runnable() {
     * @Override public void run() {
     * // TODO Auto-generated method stub
     * <p>
     * }
     * };
     * <p>
     * System.out.println(" Inner Class name:"+run.getClass().getName());
     * System.out.println(" Inner Class simple name:"+run.getClass().getSimpleName());
     * 打印结果是：
     * <p>
     * anonymous Class name:com.frank.test.Test$1
     * anonymous Class simple name:
     * 最后再来看 getCanonicalName()。
     * <p>
     * Canonical 是官方、标准的意思，那么 getCanonicalName() 自然就是返回一个 Class 对象的官方名字，
     * 这个官方名字 canonicalName 是 Java 语言规范制定的，如果 Class 对象没有 canonicalName 的话就返回 null。
     * <p>
     * getCanonicalName() 是 getName() 和 getSimpleName() 的结合。
     * <p>
     * getCanonicalName() 返回的也是全限定类名，但是对于内部类，不用 $ 开头，而用 .。
     * getCanonicalName() 对于数组类型的 Class，同 simplename 一样直接在后面添加 [] 。
     * getCanonicalName() 不同于 simplename 的地方是，不存在 canonicalName 的时候返回 null 而不是空字符串。
     * 局部类和匿名内部类不存在 canonicalName。
     * <p>
     * <p>
     * Class clz = new Outter.Inner[][][]{}.getClass();
     * <p>
     * System.out.println(" Inner Class name:"+clz.getName());
     * System.out.println(" Inner Class simple name:"+clz.getSimpleName());
     * System.out.println(" Inner Class canonical name:"+clz.getCanonicalName());
     * <p>
     * <p>
     * //run 是匿名类
     * Runnable run = new Runnable() {
     * @Override public void run() {
     * // TODO Auto-generated method stub
     * <p>
     * }
     * };
     * <p>
     * System.out.println(" anonymous Class name:"+run.getClass().getName());
     * System.out.println(" anonymous Class simple name:"+run.getClass().getSimpleName());
     * System.out.println(" anonymous Class canonical name:"+run.getClass().getCanonicalName());
     * <p>
     * // local 是局部类
     * class local{};
     * <p>
     * <p>
     * System.out.println("Local a name:"+local.class.getName());
     * System.out.println("Local a simplename:"+local.class.getSimpleName());
     * System.out.println("Local a canonicalname:"+local.class.getCanonicalName());
     * 打印结果如下：
     * Inner Class name:[[[Lcom.frank.test.Outter$Inner;
     * Inner Class simple name:Inner[][][]
     * Inner Class canonical name:com.frank.test.Outter.Inner[][][]
     * <p>
     * anonymous Class name:com.frank.test.Test$1
     * anonymous Class simple name:
     * anonymous Class canonical name:null
     * <p>
     * Local a name:com.frank.test.Test$1local
     * Local a simplename:local
     * Local a canonicalname:null
     * <p>
     * Class 去获取相应名字的知识内容就讲完了，仔细想一下，小小的一个细节，其实蛮有学问的。
     * <p>
     * 好了，我们继续往下。
     * <p>
     * Class 获取修饰符
     * 通常，Java 开发中定义一个类，往往是要通过许多修饰符来配合使用的。它们大致分为 4 类。
     * <p>
     * 用来限制作用域，如 public、protected、priviate。
     * 用来提示子类复写，abstract。
     * 用来标记为静态类 static。
     * 注解。
     * Java 反射提供了 API 去获取这些修饰符。
     * <p>
     * package com.frank.test;
     * <p>
     * public abstract class TestModifier {
     * <p>
     * }
     * 我们定义了一个类，名字为 TestModifier，被 public 和 abstract 修饰，
     * 现在我们要提取这些修饰符。我们只需要调用 Class.getModifiers() 方法就是了，它返回的是一个 int 数值。
     * <p>
     * System.out.println("modifiers value:"+TestModifier.class.getModifiers());
     * System.out.println("modifiers :"+Modifier.toString(TestModifier.class.getModifiers()));
     * 打印结果是：
     * <p>
     * modifiers value:1025
     * modifiers :public abstract
     * 3
     * 大家肯定会有疑问，为什么会返回一个整型数值呢？
     * <p>
     * 这是因为一个类定义的时候可能会被多个修饰符修饰，为了一并获取，
     * 所以 Java 工程师考虑到了位运算，用一个 int 数值来记录所有的修饰符，
     * 然后不同的位对应不同的修饰符，这些修饰符对应的位都定义在 Modifier 这个类当中。
     * <p>
     * public class Modifier {
     * <p>
     * public static final int PUBLIC           = 0x00000001;
     * <p>
     * <p>
     * public static final int PRIVATE          = 0x00000002;
     * <p>
     * <p>
     * public static final int PROTECTED        = 0x00000004;
     * <p>
     * <p>
     * public static final int STATIC           = 0x00000008;
     * <p>
     * <p>
     * public static final int FINAL            = 0x00000010;
     * <p>
     * <p>
     * public static final int SYNCHRONIZED     = 0x00000020;
     * <p>
     * <p>
     * public static final int VOLATILE         = 0x00000040;
     * <p>
     * <p>
     * public static final int TRANSIENT        = 0x00000080;
     * <p>
     * <p>
     * public static final int NATIVE           = 0x00000100;
     * <p>
     * <p>
     * public static final int INTERFACE        = 0x00000200;
     * <p>
     * <p>
     * public static final int ABSTRACT         = 0x00000400;
     * <p>
     * <p>
     * public static final int STRICT           = 0x00000800;
     * <p>
     * public static String toString(int mod) {
     * StringBuilder sb = new StringBuilder();
     * int len;
     * <p>
     * if ((mod & PUBLIC) != 0)        sb.append("public ");
     * if ((mod & PROTECTED) != 0)     sb.append("protected ");
     * if ((mod & PRIVATE) != 0)       sb.append("private ");
     * <p>
     * Canonical order
     * if((mod &ABSTRACT)!=0)sb.append("abstract ");
     * if((mod &STATIC)!=0)sb.append("static ");
     * if((mod &FINAL)!=0)sb.append("final ");
     * if((mod &TRANSIENT)!=0)sb.append("transient ");
     * if((mod &VOLATILE)!=0)sb.append("volatile ");
     * if((mod &SYNCHRONIZED)!=0)sb.append("synchronized ");
     * if((mod &NATIVE)!=0)sb.append("native ");
     * if((mod &STRICT)!=0)sb.append("strictfp ");
     * if((mod &INTERFACE)!=0)sb.append("interface ");
     * <p>
     * if((len =sb.length())>0)    trim trailing space
     * return sb.toString().
     * <p>
     * substring(0,len-1);
     * return"";
     * <p>
     * }
     * <p>
     * }
     * <p>
     * 调用 Modifier.toString() 方法就可以打印出一个类的所有修饰符。
     * <p>
     * 当然，Modifier 还提供了一系列的静态工具方法用来对修饰符进行操作。
     * <p>
     * public static boolean isPublic(int mod) {
     * return (mod & PUBLIC) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isPrivate(int mod) {
     * return (mod & PRIVATE) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isProtected(int mod) {
     * return (mod & PROTECTED) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isStatic(int mod) {
     * return (mod & STATIC) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isFinal(int mod) {
     * return (mod & FINAL) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isSynchronized(int mod) {
     * return (mod & SYNCHRONIZED) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isVolatile(int mod) {
     * return (mod & VOLATILE) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isTransient(int mod) {
     * return (mod & TRANSIENT) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isNative(int mod) {
     * return (mod & NATIVE) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isInterface(int mod) {
     * return (mod & INTERFACE) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isAbstract(int mod) {
     * return (mod & ABSTRACT) != 0;
     * }
     * <p>
     * <p>
     * public static boolean isStrict(int mod) {
     * return (mod & STRICT) != 0;
     * }
     * <p>
     * <p>
     * 这些代码的作用，一看就懂，所以不再多说。
     * <p>
     * 获取 Class 的成员
     * 一个类的成员包括属性（有人翻译为字段或者域）、方法。对应到 Class 中就是 Field、Method、Constructor。
     * <p>
     * 获取 Filed
     * 获取指定名字的属性有 2 个 API
     * public Field getDeclaredField(String name)
     * throws NoSuchFieldException,
     * SecurityException;
     * <p>
     * public Field getField(String name)
     * throws NoSuchFieldException,
     * SecurityException
     * <p>
     * <p>
     * 两者的区别就是 getDeclaredField() 获取的是 Class 中被 private 修饰的属性。
     * getField() 方法获取的是非私有属性，并且 getField() 在当前 Class 获取不到时会向祖先类获取。
     * <p>
     * 获取所有的属性。
     * <p>
     * //获取所有的属性，但不包括从父类继承下来的属性
     * public Field[] getDeclaredFields() throws SecurityException {}
     * <p>
     * //获取自身的所有的 public 属性，包括从父类继承下来的。
     * public Field[] getFields() throws SecurityException {
     * 可以用一个例子，给大家加深一下理解。
     * <p>
     * public class Farther {
     * <p>
     * public int a;
     * <p>
     * private int b;
     * <p>
     * }
     * <p>
     * public class Son extends Farther {
     * int c;
     * <p>
     * private String d;
     * <p>
     * protected float e;
     * }
     * <p>
     * <p>
     * package com.frank.test;
     * <p>
     * import java.lang.reflect.Field;
     * <p>
     * public class FieldTest {
     * <p>
     * public static void main(String[] args) {
     * // TODO Auto-generated method stub
     * <p>
     * Class cls = Son.class;
     * <p>
     * try {
     * Field field = cls.getDeclaredField("b");
     * <p>
     * } catch (NoSuchFieldException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * System.out.println("getDeclaredField "+e.getMessage());
     * } catch (SecurityException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * System.out.println("getDeclaredField "+e.getMessage());
     * }
     * <p>
     * try {
     * Field field = cls.getField("b");
     * <p>
     * } catch (NoSuchFieldException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * System.out.println("getField "+e.getMessage());
     * } catch (SecurityException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * System.out.println("getField "+e.getMessage());
     * }
     * <p>
     * <p>
     * <p>
     * <p>
     * <p>
     * Field[] filed1 = cls.getDeclaredFields();
     * <p>
     * for ( Field f : filed1 ) {
     * System.out.println("Declared Field :"+f.getName());
     * }
     * <p>
     * Field[] filed2 = cls.getFields();
     * <p>
     * for ( Field f : filed2 ) {
     * System.out.println("Field :"+f.getName());
     * }
     * <p>
     * }
     * <p>
     * }
     * <p>
     * <p>
     * java.lang.NoSuchFieldException: b
     * at java.lang.Class.getDeclaredField(Unknown Source)
     * at com.frank.test.FieldTest.main(FieldTest.java:13)
     * java.lang.NoSuchFieldException: bgetDeclaredField b
     * <p>
     * at java.lang.Class.getField(Unknown Source)
     * at com.frank.test.FieldTest.main(FieldTest.java:26)
     * getField b
     * <p>
     * Declared Field :c
     * Declared Field :d
     * Declared Field :e
     * <p>
     * Field :a
     * <p>
     * 大家细细体会一下，不过需要注意的是 getDeclaredFileds() 方法可以获取 private、protected、public
     * 和 default 属性，但是它获取不到从父类继承下来的属性。
     * <p>
     * 获取 Method
     * 类或者接口中的方法对应到 Class 就是 Method。
     * 相应的 API 如下：
     * <p>
     * <p>
     * public Method getDeclaredMethod(String name, Class<?>... parameterTypes)
     * <p>
     * public Method getMethod(String name, Class<?>... parameterTypes)
     * <p>
     * public Method[] getDeclaredMethods() throws SecurityException
     * <p>
     * <p>
     * public Method getMethod(String name, Class<?>... parameterTypes)
     * <p>
     * <p>
     * 因为跟 Field 类似，所以不做过多的讲解。parameterTypes 是方法对应的参数。
     * <p>
     * 获取 Constructor
     * Java 反射把构造器从方法中单独拎出来了，用 Constructor 表示。
     * <p>
     * <p>
     * public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
     * <p>
     * public Constructor<T> getConstructor(Class<?>... parameterTypes)
     * <p>
     * public Constructor<?>[] getDeclaredConstructors() throws SecurityException
     * <p>
     * public Constructor<?>[] getConstructors() throws SecurityException
     * <p>
     * <p>
     * 仍然以前面的 Father 和 Son 两个类为例。
     * public class Farther {
     * <p>
     * public int a;
     * <p>
     * private int b;
     * <p>
     * public Farther() {
     * super();
     * // TODO Auto-generated constructor stub
     * }
     * <p>
     * <p>
     * }
     * <p>
     * public class Son extends Farther {
     * int c;
     * <p>
     * private String d;
     * <p>
     * protected float e;
     * <p>
     * <p>
     * <p>
     * private Son() {
     * super();
     * // TODO Auto-generated constructor stub
     * }
     * <p>
     * <p>
     * <p>
     * public Son(int c, String d) {
     * super();
     * this.c = c;
     * this.d = d;
     * }
     * <p>
     * }
     * <p>
     * public class ConstructorTest {
     * <p>
     * public static void main(String[] args) {
     * // TODO Auto-generated method stub
     * <p>
     * Class clz = Son.class;
     * <p>
     * Constructor[] constructors = clz.getConstructors();
     * <p>
     * for ( Constructor c : constructors ) {
     * System.out.println("getConstructor:"+c.toString());
     * }
     * <p>
     * constructors = clz.getDeclaredConstructors();
     * <p>
     * for ( Constructor c : constructors ) {
     * System.out.println("getDeclaredConstructors:"+c.toString());
     * }
     * <p>
     * }
     * <p>
     * }
     * <p>
     * 测试程序代码的打印结果如下：
     * <p>
     * getConstructor:public com.frank.test.Son(int,java.lang.String)
     * <p>
     * getDeclaredConstructors:private com.frank.test.Son()
     * getDeclaredConstructors:public com.frank.test.Son(int,java.lang.String)
     * 因为，Constructor 不能从父类继承，所以就没有办法通过 getConstructor() 获取到父类的 Constructor。
     * <p>
     * 我们获取到了 Field、Method、Constructor,但这一是终点，相反，这正是反射机制中开始的地方，
     * 我们运用反射的目的就是为了获取和操控 Class 对象中的这些成员。
     * <p>
     * Field 的操控
     * 我们在一个类中定义字段时，通常是这样。
     * <p>
     * <p>
     * public class Son extends Farther {
     * int c;
     * <p>
     * private String d;
     * <p>
     * protected float e;
     * <p>
     * Car car;
     * <p>
     * }
     * <p>
     * 像 c、d、e、car 这些变量都是属性，在反射机制中映射到 Class 对象中都是 Field，很显然，它们也有对应的类别。
     * <p>
     * 它们要么是 8 种基础类型 int、long、float、double、boolean、char、byte 和 short。
     * 或者是引用，所有的引用都是 Object 的后代。
     * <p>
     * Field 类型的获取
     * 获取 Field 的类型，通过 2 个方法：
     * <p>
     * public Type getGenericType() {}
     * <p>
     * public Class<?> getType() {}
     * 注意，两者返回的类型不一样，getGenericType() 方法能够获取到泛型类型。大家可以看下面的代码进行理解：
     * <p>
     * <p>
     * public class Son extends Farther {
     * int c;
     * <p>
     * private String d;
     * <p>
     * protected float e;
     * <p>
     * public List<Car> cars;
     * <p>
     * public HashMap<Integer,String> map;
     * <p>
     * private Son() {
     * super();
     * // TODO Auto-generated constructor stub
     * }
     * <p>
     * <p>
     * <p>
     * public Son(int c, String d) {
     * super();
     * this.c = c;
     * this.d = d;
     * }
     * <p>
     * }
     * <p>
     * public class FieldTest {
     * <p>
     * public static void main(String[] args) {
     * // TODO Auto-generated method stub
     * <p>
     * Class cls = Son.class;
     * <p>
     * <p>
     * Field[] filed2 = cls.getFields();
     * <p>
     * for ( Field f : filed2 ) {
     * System.out.println("Field :"+f.getName());
     * System.out.println("Field type:"+f.getType());
     * System.out.println("Field generic type:"+f.getGenericType());
     * System.out.println("-------------------");
     * }
     * <p>
     * }
     * <p>
     * }
     * <p>
     * <p>
     * Field :cars
     * Field type:interface java.util.List
     * Field generic type:java.util.List<com.frank.test.Car>
     * -------------------
     * Field :map
     * Field type:class java.util.HashMap
     * Field generic type:java.util.HashMap<java.lang.Integer, java.lang.String>
     * -------------------
     * Field :a
     * Field type:int
     * Field generic type:int
     * -------------------
     * <p>
     * 可以看到 getGenericType() 确实把泛型都打印出来了，它比 getType() 返回的内容更详细。
     * <p>
     * Field 修饰符的获取
     * 同 Class 一样，Field 也有很多修饰符。通过 getModifiers() 方法就可以轻松获取。
     * <p>
     * public int getModifiers() {}
     * 1
     * 2
     * 这个与前面 Class 获取修饰符一致，所以不需要再讲，不清楚的同学翻看前面的内容就好了。
     * <p>
     * Field 内容的读取与赋值
     * 这个应该是反射机制中对于 Field 最主要的目的了。
     * <p>
     * Field 这个类定义了一系列的 get 方法来获取不同类型的值。
     * <p>
     * <p>
     * public Object get(Object obj);
     * <p>
     * public int getInt(Object obj);
     * <p>
     * public long getLong(Object obj)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public float getFloat(Object obj)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public short getShort(Object obj)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public double getDouble(Object obj)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public char getChar(Object obj)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public byte getByte(Object obj)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public boolean getBoolean(Object obj)
     * throws IllegalArgumentException, IllegalAccessException
     * <p>
     * Field 又定义了一系列的 set 方法用来对其自身进行赋值。
     * <p>
     * public void set(Object obj, Object value);
     * <p>
     * public void getInt(Object obj,int value);
     * <p>
     * public void getLong(Object obj,long value)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public void getFloat(Object obj,float value)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public void getShort(Object obj,short value)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public void getDouble(Object obj,double value)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public void getChar(Object obj,char value)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public void getByte(Object obj,byte b)
     * throws IllegalArgumentException, IllegalAccessException;
     * <p>
     * public void getBoolean(Object obj,boolean b)
     * throws IllegalArgumentException, IllegalAccessException
     * <p>
     * 可能有同学会对方法中出现的 Object 参数有疑问，它其实是类的实例引用，这里涉及一个细节。
     * <p>
     * Class 本身不对成员进行储存，它只提供检索，所以需要用 Field、Method、Constructor 对象来承载这些成员，
     * 所以，针对成员的操作时，一般需要为成员指定类的实例引用。如果难于理解的话，可以这样理解，
     * 班级这个概念是一个类，一个班级有几十名学生，现在有A、B、C 3 个班级，将所有班级的学生
     * 抽出来集合到一个场地来考试，但是学生在试卷上写上自己名字的时候，还要指定自己的班级
     * ，这里涉及到的 Object 其实就是类似的作用，表示这个成员是具体属于哪个 Object。这个是为了精确定位。
     * <p>
     * 下面用代码来说明：
     * <p>
     * A testa = new A();
     * testa.a = 10;
     * <p>
     * System.out.println("testa.a = "+testa.a);
     * <p>
     * Class c = A.class;
     * <p>
     * try {
     * Field fielda = c.getField("a");
     * <p>
     * int ra = fielda.getInt(testa);
     * <p>
     * System.out.println("reflection testa.a = "+ra);
     * <p>
     * fielda.setInt(testa, 15);
     * <p>
     * System.out.println("testa.a = "+testa.a);
     * <p>
     * } catch (NoSuchFieldException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (SecurityException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalArgumentException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalAccessException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * 打印结果如下：
     * <p>
     * testa.a = 10
     * reflection testa.a = 10
     * testa.a = 15
     * 我们再来看看 Field 被 private 修饰的情况
     * <p>
     * public class A {
     * <p>
     * public int a;
     * <p>
     * private int b;
     * <p>
     * public int getB() {
     * return b;
     * }
     * <p>
     * public void setB(int b) {
     * this.b = b;
     * }
     * <p>
     * }
     * <p>
     * A testa = new A();
     * testa.setB(3);
     * <p>
     * System.out.println("testa.b = "+testa.getB());
     * <p>
     * Class c = A.class;
     * <p>
     * try {
     * Field fieldb = c.getDeclaredField("b");
     * int rb = fieldb.getInt(testa);
     * <p>
     * System.out.println("reflection testa.b = "+rb);
     * <p>
     * fieldb.setInt(testa, 20);
     * <p>
     * System.out.println("testa.b = "+testa.getB());
     * <p>
     * } catch (NoSuchFieldException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (SecurityException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalArgumentException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalAccessException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * <p>
     * testa.b = 3
     * java.lang.IllegalAccessException: Class com.frank.test.FieldTest can not access a member of class com.frank.test.A with modifiers "private"
     * at sun.reflect.Reflection.ensureMemberAccess(Unknown Source)
     * at java.lang.reflect.AccessibleObject.slowCheckMemberAccess(Unknown Source)
     * at java.lang.reflect.AccessibleObject.checkAccess(Unknown Source)
     * at java.lang.reflect.Field.getInt(Unknown Source)
     * at com.frank.test.FieldTest.main(FieldTest.java:20)
     * 抛异常了。这是因为在反射中访问了 private 修饰的成员，如果要消除异常的话，需要添加一句代码。
     * <p>
     * fieldb.setAccessible(true);
     * 1
     * 再看打印结果
     * <p>
     * testa.b = 3
     * reflection testa.b = 3
     * testa.b = 20
     * <p>
     * Method 的操控
     * Method 对应普通类的方法。
     * 我们看看一般普通类的方法的构成。
     * <p>
     * <p>
     * public int add(int a,int b);
     * 1
     * 2
     * 3
     * 方法由下面几个要素构成：
     * - 方法名
     * - 方法参数
     * - 方法返回值
     * - 方法的修饰符
     * - 方法可能会抛出的异常
     * <p>
     * 很显然，反射中 Method 提供了相应的 API 来提取这些元素。
     * <p>
     * Method 获取方法名
     * 通过 getName() 这个方法就好了。
     * <p>
     * 以前面的 Car 类作为测试对象。
     * <p>
     * public class MethodTest {
     * <p>
     * public static void main(String[] args) {
     * // TODO Auto-generated method stub
     * Car car = new Car();
     * <p>
     * Class clz = car.getClass();
     * <p>
     * Method methods[] = clz.getDeclaredMethods();
     * <p>
     * for ( Method m : methods ) {
     * System.out.println("method name:"+m.getName());
     * }
     * }
     * <p>
     * }
     * 打印结果如下：
     * <p>
     * method name:toString
     * method name:drive
     * Method 获取方法参数
     * 涉及到的 API 如下：
     * <p>
     * public Parameter[] getParameters() {}
     * Parameter.java
     * <p>
     * // 获取参数名字
     * public String getName() {}
     * <p>
     * // 获取参数类型
     * public Class<?> getType() {}
     * <p>
     * // 获取参数的修饰符
     * public int getModifiers() {}
     * <p>
     * 当然，有时候我们不需要参数的名字，只要参数的类型就好了，通过 Method 中下面的方法获取。
     * Method.java
     * <p>
     * // 获取所有的参数类型
     * public Class<?>[] getParameterTypes() {}
     * <p>
     * // 获取所有的参数类型，包括泛型
     * public Type[] getGenericParameterTypes() {}
     * <p>
     * <p>
     * <p>
     * 下面，同样进行测试。
     * <p>
     * public class Car {
     * <p>
     * private String mBand;
     * <p>
     * private Color mColor;
     * <p>
     * public enum Color {
     * RED,
     * WHITE,
     * BLACK,
     * BLUE,
     * YELLOR
     * }
     * <p>
     * <p>
     * <p>
     * public Car() {
     * super();
     * // TODO Auto-generated constructor stub
     * }
     * <p>
     * <p>
     * public Car(String mBand) {
     * this.mBand = mBand;
     * }
     * <p>
     * <p>
     * public void drive() {
     * System.out.println("di di di,开车了！");
     * }
     * @Override public String toString() {
     * return "Car [mBand=" + mBand + ", mColor=" + mColor + "]";
     * }
     * <p>
     * public void test(String[] paraa,List<String> b,HashMap<Integer,Son> maps) {}
     * <p>
     * <p>
     * }
     * <p>
     * public class MethodTest {
     * <p>
     * public static void main(String[] args) {
     * // TODO Auto-generated method stub
     * Car car = new Car();
     * <p>
     * Class clz = car.getClass();
     * <p>
     * Method methods[] = clz.getDeclaredMethods();
     * <p>
     * <p>
     * <p>
     * for ( Method m : methods ) {
     * System.out.println("method name:"+m.getName());
     * <p>
     * Parameter[] paras = m.getParameters();
     * <p>
     * for ( Parameter p : paras ) {
     * System.out.println(" parameter :"+p.getName()+" "+p.getType().getName());
     * }
     * <p>
     * Class[] pTypes = m.getParameterTypes();
     * <p>
     * System.out.println("method para types:");
     * for ( Class type : pTypes ) {
     * System.out.print(" "+ type.getName());
     * }
     * System.out.println();
     * <p>
     * Type[] gTypes = m.getGenericParameterTypes();
     * System.out.println("method para generic types:");
     * for ( Type type : gTypes ) {
     * System.out.print(" "+ type.getTypeName());
     * }
     * System.out.println();
     * System.out.println("==========================================");
     * <p>
     * }
     * }
     * <p>
     * }
     * <p>
     * <p>
     * 印结果如下：
     * <p>
     * method name:toString
     * method para types:
     * <p>
     * method para generic types:
     * <p>
     * ==========================================
     * method name:test
     * parameter :arg0 [Ljava.lang.String;
     * parameter :arg1 java.util.List
     * parameter :arg2 java.util.HashMap
     * method para types:
     * [Ljava.lang.String; java.util.List java.util.HashMap
     * method para generic types:
     * java.lang.String[] java.util.List<java.lang.String> java.util.HashMap<java.lang.Integer, com.frank.test.Son>
     * ==========================================
     * method name:drive
     * method para types:
     * <p>
     * method para generic types:
     * <p>
     * ==========================================
     * ethod 获取返回值类型
     * // 获取返回值类型
     * public Class<?> getReturnType() {}
     * <p>
     * <p>
     * // 获取返回值类型包括泛型
     * public Type getGenericReturnType() {}
     * <p>
     * Method 获取修饰符
     * public int getModifiers() {}
     * 1
     * 2
     * 这部分内容前面已经讲过。
     * <p>
     * Method 获取异常类型
     * public Class<?>[] getExceptionTypes() {}
     * <p>
     * public Type[] getGenericExceptionTypes() {}
     * 1
     * 2
     * 3
     * 4
     * Method 方法的执行
     * 这个应该是整个反射机制的核心内容了，很多时候运用反射目的其实就是为了以常规手段执行 Method。
     * <p>
     * public Object invoke(Object obj, Object... args) {}
     * 1
     * 2
     * Method 调用 invoke() 的时候，存在许多细节：
     * <p>
     * invoke() 方法中第一个参数 Object 实质上是 Method 所依附的 Class 对应的类的实例，
     * 如果这个方法是一个静态方法，那么 ojb 为 null，后面的可变参数 Object 对应的自然就是参数。
     * <p>
     * invoke() 返回的对象是 Object，所以实际上执行的时候要进行强制转换。
     * <p>
     * 在对 Method 调用 invoke() 的时候，如果方法本身会抛出异常，那么这个异常就会经过包装，
     * 由 Method 统一抛出 InvocationTargetException。而通过 InvocationTargetException.getCause() 可以获取真正的异常。
     * <p>
     * 下面同样通过例子来说明,我们新建立一个类，要添加一个 static 修饰的静态方法，一个普通的方法和一个会抛出异常的方法。
     * <p>
     * public class TestMethod {
     * <p>
     * public static void testStatic () {
     * System.out.println("test static");
     * }
     * <p>
     * private  int add (int a,int b ) {
     * return a + b;
     * }
     * <p>
     * public void testException () throws IllegalAccessException {
     * throw new IllegalAccessException("You have some problem.");
     * }
     * <p>
     * }
     * <p>
     * 我们编写测试代码：
     * <p>
     * public class InvokeTest {
     * <p>
     * public static void main(String[] args) {
     * // TODO Auto-generated method stub
     * Class testCls = TestMethod.class;
     * <p>
     * try {
     * Method mStatic = testCls.getMethod("testStatic",null);
     * // 测试静态方法
     * mStatic.invoke(null, null);
     * } catch (NoSuchMethodException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (SecurityException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalAccessException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalArgumentException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (InvocationTargetException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * <p>
     * TestMethod t = new TestMethod();
     * <p>
     * try {
     * Method mAdd = testCls.getDeclaredMethod("add",int.class,int.class);
     * // 通过这句代码才能访问 private 修饰的 Method
     * mAdd.setAccessible(true);
     * int result = (int) mAdd.invoke(t, 1,2);
     * System.out.println("add method result:"+result);
     * } catch (NoSuchMethodException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (SecurityException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalAccessException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalArgumentException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (InvocationTargetException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * <p>
     * try {
     * Method testExcep = testCls.getMethod("testException",null);
     * <p>
     * try {
     * testExcep.invoke(t, null);
     * } catch (IllegalAccessException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalArgumentException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (InvocationTargetException e) {
     * // TODO Auto-generated catch block
     * //e.printStackTrace();
     * <p>
     * // 通过 InvocationTargetException.getCause() 获取被包装的异常
     * System.out.println("testException occur some error,Error type is :"+e.getCause().getClass().getName());
     * System.out.println("Error message is :"+e.getCause().getMessage());
     * }
     * <p>
     * <p>
     * } catch (NoSuchMethodException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (SecurityException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * }
     * <p>
     * }
     * 打印结果如下：
     * <p>
     * test static
     * add method result:3
     * testException occur some error,Error type is :java.lang.IllegalAccessException
     * Error message is :You have some problem.
     * 1
     * 2
     * 3
     * 4
     * 5
     * Constructor 的操控
     * 在平常开发的时候，构造器也称构造方法，但是在反射机制中却把它与 Method 分离开来，单独用 Constructor 这个类表示。
     * <p>
     * Constructor 同 Method 差不多，但是它特别的地方在于，它能够创建一个对象。
     * <p>
     * 在 Java 反射机制中有两种方法可以用来创建类的对象实例：Class.newInstance() 和 Constructor.newInstance()。
     * 官方文档建议开发者使用后面这种方法，下面是原因。
     * <p>
     * Class.newInstance() 只能调用无参的构造方法，而 Constructor.newInstance() 则可以调用任意的构造方法。
     * Class.newInstance() 通过构造方法直接抛出异常，而 Constructor.newInstance() 会把抛出来的异常包装到
     * <p>
     * InvocationTargetException 里面去，这个和 Method 行为一致。
     * Class.newInstance() 要求构造方法能够被访问，而 Constructor.newInstance() 却能够访问 private 修饰的构造器。
     * 还是通过代码来验证。
     * <p>
     * public class TestConstructor {
     * <p>
     * private String self;
     * <p>
     * public TestConstructor() {
     * self = " Frank ";
     * }
     * <p>
     * public TestConstructor(String self) {
     * this.self = self;
     * }
     * @Override public String toString() {
     * return "TestConstructor [self=" + self + "]";
     * }
     * <p>
     * <p>
     * }
     * <p>
     * 上面的类中有 2 个构造方法，一个无参，一个有参数。编写测试代码：
     * <p>
     * public class NewInstanceTest {
     * <p>
     * public static void main(String[] args) {
     * // TODO Auto-generated method stub
     * <p>
     * Class clz = TestConstructor.class;
     * <p>
     * try {
     * TestConstructor test1 = (TestConstructor) clz.newInstance();
     * <p>
     * System.out.println(test1.toString());
     * } catch (InstantiationException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalAccessException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * <p>
     * try {
     * Constructor con = clz.getConstructor(String.class);
     * <p>
     * TestConstructor test2 = (TestConstructor) con.newInstance("Zhao");
     * <p>
     * System.out.println(test2.toString());
     * <p>
     * } catch (NoSuchMethodException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (SecurityException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (InstantiationException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalAccessException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalArgumentException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (InvocationTargetException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * <p>
     * }
     * <p>
     * }
     * <p>
     * <p>
     * 分别用 Class.newInstance() 和 Constructor.newInstance() 方法来创建类的实例，打印结果如下：
     * <p>
     * TestConstructor [self= Frank ]
     * TestConstructor [self=Zhao]
     * 1
     * 2
     * 3
     * 可以看到通过 Class.newInstance() 方法调用的构造方法确实是无参的那个。
     * <p>
     * 现在，我们学习了 Class 对象的获取，也能够获取它内部成员 Filed、Method 和 Constructor
     * 并且能够操作它们。在这个基础上，我们已经能够应付普通的反射开发了。
     * <p>
     * 但是，Java 反射机制还另外细分了两个概念：数组和枚举。
     * <p>
     * 反射中的数组
     * 数组本质上是一个 Class，而在 Class 中存在一个方法用来识别它是否为一个数组。
     * Class.java
     * <p>
     * public native boolean isArray();
     * 1
     * 2
     * 为了便于测试，我们创建一个新的类
     * <p>
     * public class Shuzu {
     * <p>
     * private int[] array;
     * <p>
     * private Car[] cars;
     * }
     * 其中有一个 int 型的数组属性，它的名字叫做 array。还有一个 cars 数组，它的类型是 Car，
     * 是之前定义好的类。 当然，array 和 cars 是 Shuzu 这个类的 Field，对于 Field 的角度来说，
     * 它是数组类型，我们可以这样理解数组可以同 int、char 这些基本类型一样成为一个 Field 的类别。
     * <p>
     * 我们可能通过一系列的 API 来获取它的具体信息,刚刚有提到它本质上还是一个 Class 而已。
     * <p>
     * getName();
     * <p>
     * getComponentType();
     * 1
     * 2
     * 3
     * 4
     * 第二个方法是获取数组的里面的元素的类型，比如 int[] 数组的 componentType 自然就是 int。
     * <p>
     * 按照惯例，写代码验证。
     * <p>
     * public class ArraysTest {
     * <p>
     * public static void main(String[] args) {
     * Class clz = Shuzu.class;
     * <p>
     * Field[] fields = clz.getDeclaredFields();
     * <p>
     * for ( Field f : fields ) {
     * // 获取 Field 的类型
     * Class c = f.getType();
     * // 判断这个类型是不是数组类型
     * if ( c.isArray()) {
     * System.out.println("Type is "+c.getName());
     * System.out.println("ComponentType type is :"+c.getComponentType());
     * }
     * }
     * }
     * <p>
     * }
     * 打印结果如下：
     * <p>
     * Type is [I
     * ComponentType type is :int
     * Type is [Lcom.frank.test.Car;
     * ComponentType type is :class com.frank.test.Car
     * <p>
     * 反射中动态创建数组
     * 反射创建数组是通过 Array.newInstance() 这个方法。
     * Array.java
     * <p>
     * public static Object newInstance(Class<?> componentType, int... dimensions)
     * throws IllegalArgumentException, NegativeArraySizeException {}
     * 1
     * 2
     * 3
     * 第一个参数指定的是数组内的元素类型，后面的是可变参数，表示的是相应维度的数组长度限制。
     * <p>
     * 比如，我要创建一个 int[2][3] 的数组。
     * <p>
     * Array.newInstance(int.class,2,3);
     * 1
     * 2
     * Array 的读取与赋值
     * 首先，对于 Array 整体的读取与赋值，把它作为一个普通的 Field，根据 Class 中
     * 相应获取和设置就好了。调用的是 Field 中对应的方法。
     * <p>
     * public void set(Object obj,
     * Object value)
     * throws IllegalArgumentException,
     * IllegalAccessException;
     * <p>
     * <p>
     * public Object get(Object obj)
     * throws IllegalArgumentException,
     * IllegalAccessException;
     * <p>
     * <p>
     * 还需要处理的情况是对于数组中指定位置的元素进行读取与赋值，这要涉及到 Array 提供的一系列 setXXX()
     * 和 getXXX() 方法。因为和之前 Field 相应的 set 、get 方法类似，所以我在下面只摘抄典型的几种，
     * 大家很容易知晓其它类型的怎么操作。
     * <p>
     * public static void set(Object array,
     * int index,
     * Object value)
     * throws IllegalArgumentException,
     * ArrayIndexOutOfBoundsException;
     * <p>
     * <p>
     * public static void setBoolean(Object array,
     * int index,
     * boolean z)
     * throws IllegalArgumentException,
     * ArrayIndexOutOfBoundsException;
     * <p>
     * <p>
     * <p>
     * public static Object get(Object array,
     * int index)
     * throws IllegalArgumentException,
     * ArrayIndexOutOfBoundsException;
     * <p>
     * <p>
     * public static short getShort(Object array,
     * int index)
     * throws IllegalArgumentException,
     * ArrayIndexOutOfBoundsException;
     * <p>
     * 进行代码测试：
     * <p>
     * public class ArraysTest {
     * <p>
     * public static void main(String[] args) {
     * Class clz = Shuzu.class;
     * <p>
     * try {
     * Shuzu shu = (Shuzu) clz.newInstance();
     * <p>
     * Field arrayF = clz.getDeclaredField("array");
     * arrayF.setAccessible(true);
     * <p>
     * Object o = Array.newInstance(int.class, 3);
     * Array.set(o, 0, 1);
     * Array.set(o, 1, 3);
     * Array.set(o, 2, 3);
     * <p>
     * arrayF.set(shu, o);
     * <p>
     * int[] array = shu.getArray();
     * <p>
     * for ( int i = 0;i < array.length;i++) {
     * System.out.println("array index "+i+" value:"+array[i]);
     * }
     * <p>
     * } catch (InstantiationException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (IllegalAccessException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (NoSuchFieldException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * } catch (SecurityException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * <p>
     * <p>
     * }
     * <p>
     * }
     */
    private static void aaa() {
//        int a=-1;
//////        int b=2;
//////        int c=~a;//取反
//////        int d=a^b;//异或
//////        int e=a&b;//与
//////        int f=a>>1;//右移(有符号)  空位补0
//////        int g=a<<1;//左移 空位补0
//////        int h=a>>>1;//无符号右移
//////        System.out.println("a--"+Integer.toBinaryString(a));
//////        System.out.println("b--"+Integer.toBinaryString(b));
//////        System.out.println("c--"+Integer.toBinaryString(c));
//////        System.out.println("c--"+Integer.toBinaryString(-100));
//////        System.out.println("c--"+Integer.toBinaryString(100));
//////        System.out.println("d--"+Integer.toBinaryString(d));
//////        System.out.println("e--"+Integer.toBinaryString(e));
//////        System.out.println("f--"+Integer.toBinaryString(f));
//////        System.out.println("g--"+Integer.toBinaryString(g));
//////        System.out.println("h--"+Integer.toBinaryString(h));
//////
//////        System.out.println("a--"+a);
//////        System.out.println("b--"+b);
//////        System.out.println("c--"+c);
//////        System.out.println("d--"+d);
//////        System.out.println("e--"+e);
//////        System.out.println("f--"+f);
//////        System.out.println("g--"+g);
//////        System.out.println("h--"+h);
//        System.out.println(""+Integer.toBinaryString(0<<30));
//        System.out.println(""+Integer.toBinaryString(1<<30));
//        System.out.println(""+Integer.toBinaryString(2<<30));
//        System.out.println(""+Integer.toBinaryString(3<<30));
//        System.out.println(""+Integer.toBinaryString(~(3<<30)));
//        System.out.println(""+Integer.toBinaryString(1000& (~(3<<30))));
//        System.out.println(""+(1000& ~(3<<30)));
//        System.out.println(""+Integer.toBinaryString(1000));
        int MODE_SHIFT = 30;
        int MODE_MASK  = 0x3 << MODE_SHIFT;
        System.out.println(""+MODE_SHIFT);
        System.out.println(""+MODE_MASK);
    }
}
