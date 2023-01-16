package Repository;


public interface CrudRepo<ID, E> {

    void add(E entity);
    void delete(E entity);
    void update(ID id,E newEntity);
    E findById(ID id);
}
