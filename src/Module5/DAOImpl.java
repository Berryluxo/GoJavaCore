package Module5;

/**
 * Created by Vadym on 20.03.2017.
 */
public class DAOImpl implements DAO {
    Room rooms[] = new Room[10];

    @Override
    public Room save(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null)
                rooms[i] = room;
            break;


        }

        System.out.println("save " + room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                rooms[i] = null;
                break;
            }

        }

        System.out.println("delete " + room);
        return true;
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getId() == room.getId()) {
                rooms[i] = room;
                break;
            }

        }
        System.out.println("update " + room);
        return room;
    }

    @Override
    public Room findById(long id) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getId() == id) {
                return rooms[i];

            }

        }

        System.out.println("find " + id);
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
