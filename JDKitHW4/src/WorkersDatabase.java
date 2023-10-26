import java.util.ArrayList;
import java.util.Collection;

public class WorkersDatabase implements Database<Worker> {

    private Collection<Worker> workers = new ArrayList<>();

    @Override
    public void addNew(String phoneNumber, String name, int experience) {
        Worker worker = new Worker(phoneNumber, name, experience);
        workers.add(worker);
    }

    @Override
    public Worker findById(int id) {
        for (Worker worker : workers) {
            if (worker.getId() == id) {
                return worker;
            }
        }
        return null;
    }

    @Override
    public Collection<String> findPhoneByName(String name) {
        Collection<String> result = new ArrayList<>();
        for (Worker worker : workers) {
            if (worker.getName().contains(name)) {
                result.add(worker.getPhoneNumber());
            }
        }
        return result;
    }

    @Override
    public Collection<Worker> findByExperience(int experience) {
        Collection<Worker> result = new ArrayList<>();
        for (Worker worker : workers) {
            if (worker.getExperience() == experience) {
                result.add(worker);
            }
        }
        return result;
    }
}