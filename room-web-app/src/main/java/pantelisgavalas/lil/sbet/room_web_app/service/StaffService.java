package pantelisgavalas.lil.sbet.room_web_app.service;

import org.springframework.stereotype.Service;
import pantelisgavalas.lil.sbet.room_web_app.models.StaffMember;
import pantelisgavalas.lil.sbet.room_web_app.models.Position;
import pantelisgavalas.lil.sbet.room_web_app.data.StaffRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff() {
        return staffRepository.findAll();
    }
}
