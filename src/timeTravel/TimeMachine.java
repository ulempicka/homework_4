package timeTravel;

public class TimeMachine {
    void backInTime(Person person){
        //person.age = person.age - 1;
        person.age --;
    }

    void timeTravel(Person person, int change){
        person.age += change;
    }
}
