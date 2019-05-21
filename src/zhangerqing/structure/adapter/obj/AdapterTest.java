package zhangerqing.structure.adapter.obj;

import zhangerqing.structure.adapter.clazz.Source;
import zhangerqing.structure.adapter.clazz.Targetable;

public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
