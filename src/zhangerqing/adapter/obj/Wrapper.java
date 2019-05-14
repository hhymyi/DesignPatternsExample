package zhangerqing.adapter.obj;

import zhangerqing.adapter.clazz.Source;
import zhangerqing.adapter.clazz.Targetable;

public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
