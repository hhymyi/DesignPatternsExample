package tactics.mediator;

public class ColleagueB extends AbstractColleague {
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
