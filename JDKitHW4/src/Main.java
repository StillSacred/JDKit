import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        WorkersDatabase workersDatabase = new WorkersDatabase();
        workersDatabase.addNew("1234567", "Ivan Ivanov", 15);
        workersDatabase.addNew("456789", "Ivan Petrov", 15);
        workersDatabase.addNew("1258743", "Petr Ivanov", 10);
        workersDatabase.addNew("126987456", "Ivan Ivanov", 5);

        System.out.println("\nFind by experience");
        showResult(workersDatabase.findByExperience(15));

        System.out.println("\nFind by id");
        showResult(workersDatabase.findById(101));

        System.out.println("\nFind phone number by name");
        showResult(workersDatabase.findPhoneByName("Ivan"));
    }

    private static <T> void showResult(Collection<T> result) {
        if (result.isEmpty()) {
            System.out.println("Nothing was found\n");
        } else {
            for (T item : result) {
                System.out.println(item);
            }
        }
    }

    private static <T> void showResult(T result) {
        if (result == null) {
            System.out.println("Nothing was found\n");
        } else {
            System.out.println(result);
        }
    }
}