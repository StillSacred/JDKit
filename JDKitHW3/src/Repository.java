public interface Repository<T> {
    void add(T item);

    void update(T oldItem, T newItem);

    void delete(T item);

    T getById(int id);
}