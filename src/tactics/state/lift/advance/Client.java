package tactics.state.lift.advance;

//https://blog.csdn.net/u012401711/article/details/52675873
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
