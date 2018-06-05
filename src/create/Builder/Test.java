package create.Builder;

public class Test {

    public static void main(String[] args) {
        PersonDirector pd=new PersonDirector();
        Person manPerson = pd.constructPerson(new ManBuilder());
        Person womanPerson = pd.constructPerson(new WomanBuilder());

    }
}
