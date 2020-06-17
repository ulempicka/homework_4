package todo;

public class Task {
    String name;
    String description;
    int priority;
    Person personResponsible;

    Task(String name, String description, int priority, Person personResponsible) {
        this(name, description, priority);
        this.personResponsible = personResponsible;
    }

    Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    boolean highPriority() {
        return priority > 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {
        return priority < 0;
    }

    void show(){
        String show = "Zadanie " + name + " tzn " + description + " ma priorytet: " + priority;
        if (personResponsible != null){
            System.out.println(show + " osoba " + personResponsible.lastName);
        }
        else System.out.println(show);
    }

    void priorityCheck(){
        System.out.println("Czy priorytet wysoki? " + highPriority());
        System.out.println("Czy priorytet normalny? " + mediumPriority());
        System.out.println("Czy priorytet niski? " + lowPriority());
    }
}
