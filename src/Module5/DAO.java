package Module5;

/**
 * Created by Lina.Burkalo on 11.03.2017.
 */
public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

}
