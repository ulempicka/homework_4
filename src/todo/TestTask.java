package todo;

public class TestTask {
    public static void main(String[] args) {

        Task task1 = new Task("Email", "odpisz na maila", 0);
        task1.show();
        task1.priorityCheck();

        Person person2 = new Person("Jan", "Kowalski", 32);
        Task task2 = new Task("Spotkanie", "Spotkaj sie z klientem", 5, person2);
        task2.show();
        task2.priorityCheck();

        Task task3 = new Task("Lunch", "Zjedz lunch", -2);
        task3.show();
        task3.priorityCheck();

        Task task4 = new Task("Zamowienie", "Zamow produkt dla klienta");
        task4.show();
        task4.priorityCheck();
    }
}
