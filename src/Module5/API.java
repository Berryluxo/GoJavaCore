package Module5;

/**
 * Created by Lina.Burkalo on 11.03.2017.
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAllRooms();
}
