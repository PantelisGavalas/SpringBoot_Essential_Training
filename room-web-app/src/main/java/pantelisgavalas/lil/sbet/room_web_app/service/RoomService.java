package pantelisgavalas.lil.sbet.room_web_app.service;

import pantelisgavalas.lil.sbet.room_web_app.data.RoomRepository;
import pantelisgavalas.lil.sbet.room_web_app.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
