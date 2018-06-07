package tactics.state.a;

public class LivedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已入住");
    }
}
