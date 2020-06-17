package timeTravel;

public class TestTimeMachine {

    public static void main(String[] args) {
        Person person1 = new Person("Adam", "Nowak", 32);
        TimeMachine timeMachine1 = new TimeMachine();
        System.out.println(person1.toString());

        timeMachine1.backInTime(person1);
        System.out.println(person1.toString());

        timeMachine1.backInTime(person1);
        System.out.println(person1.toString());

        timeMachine1.timeTravel(person1, -5);
        System.out.println(person1.toString());

        timeMachine1.timeTravel(person1,15);
        System.out.println(person1.toString());

    }
}
