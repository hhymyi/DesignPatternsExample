package zhangerqing.action.visitor;

public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
