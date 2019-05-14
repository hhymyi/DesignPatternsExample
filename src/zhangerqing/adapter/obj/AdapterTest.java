package zhangerqing.adapter.obj;

import zhangerqing.adapter.clazz.Source;
import zhangerqing.adapter.clazz.Targetable;

public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
