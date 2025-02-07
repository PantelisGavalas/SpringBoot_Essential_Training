package pantelisgavalas.lil.sbet.room_web_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pantelisgavalas.lil.sbet.room_web_app.models.StaffMember;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/staff")
public class StaffController {

    // Dummy staff data to pass to staff.html
    private static final List<StaffMember> staff = new ArrayList<>();
    static {
        UUID UUID_1 = java.util.UUID.randomUUID();
        staff.add(new StaffMember(UUID_1.toString(), "John", "Doe", "Front Desk"));
        UUID UUID_2 = java.util.UUID.randomUUID();
        staff.add(new StaffMember(UUID_2.toString(), "Jane", "Doe", "Front Desk"));
        UUID UUID_3 = java.util.UUID.randomUUID();
        staff.add(new StaffMember(UUID_3.toString(), "Liam", "Neeson", "Security"));
        UUID UUID_4 = java.util.UUID.randomUUID();
        staff.add(new StaffMember(UUID_4.toString(), "Jason", "Statham", "Beekeeper"));
    }

    @GetMapping
    public String getAllStaff(Model model) {
        model.addAttribute("staff", staff);
        return "staff";
    }
}
