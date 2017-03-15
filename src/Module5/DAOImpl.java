package Module5;

/**
 * Created by Lina.Burkalo on 11.03.2017.
 */
public class DAOImpl implements DAO {

    public Room save(Room room) {
        System.out.println("Save room: " + room.getId());
        return room;
    }

    public boolean delete(Room room) {
        System.out.println("Delete room: " + room.getId());
        return true;
    }

    public Room update(Room room) {
        System.out.println("Save room: " + room.getId());
        return room;
    }

    public Room findById(long id) {
        System.out.println("Find by id room: " + id);
        return null;
    }
}
