package tactics.state.a;

public class OrderedState implements State{
    @Override
    public void handle(){
        System.out.println("房间已被预订");
    }
}
