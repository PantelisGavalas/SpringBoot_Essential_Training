package pantelisgavalas.lil.sbet.room_web_app.service;

import org.springframework.stereotype.Service;
import pantelisgavalas.lil.sbet.room_web_app.models.StaffMember;
import pantelisgavalas.lil.sbet.room_web_app.models.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Jane", "Doe", Position.HOUSEKEEPING));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Liam", "Neeson", Position.SECURITY));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Jason", "Statham", Position.SECURITY));
    }

    public List<StaffMember> getAllStaff() {
        return staff;
    }
}
