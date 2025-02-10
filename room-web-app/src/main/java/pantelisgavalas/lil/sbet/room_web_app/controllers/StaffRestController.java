package pantelisgavalas.lil.sbet.room_web_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pantelisgavalas.lil.sbet.room_web_app.models.StaffMember;
import pantelisgavalas.lil.sbet.room_web_app.service.StaffService;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaff() {
        return staffService.getAllStaff();
    }
}
