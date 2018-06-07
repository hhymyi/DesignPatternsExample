package tactics.state.a;

public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        context.setState(new FreeState());
        context.setState(new OrderedState());
        context.setState(new LivedState());
    }
}
