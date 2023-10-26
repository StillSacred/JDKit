import java.util.Collection;

public interface Database<T> {

    void addNew(String phoneNumber, String name, int experience);

    T findById(int id);

    Collection<String> findPhoneByName(String name);

    Collection<T> findByExperience(int experience);
}