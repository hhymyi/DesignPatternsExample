package tactics.state.a;

public class Context {
    private State state;

    public void setState(State  s ){
        System.out.println("房间状态已被修改");
        state = s;
        state.handle();

    }
}
