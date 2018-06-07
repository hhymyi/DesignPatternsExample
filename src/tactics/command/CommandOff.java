package tactics.command;

public class CommandOff implements Command {
        private Tv myTv;  
  
        public CommandOff(Tv tv) {  
           myTv = tv;  
        }  
  
        public void execute() {  
           myTv.turnOff();  
        }
}  