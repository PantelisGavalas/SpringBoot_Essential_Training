package pantelisgavalas.lil.sbet.room_web_app.data;

import org.springframework.data.jpa.repository.JpaRepository;
import pantelisgavalas.lil.sbet.room_web_app.models.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
