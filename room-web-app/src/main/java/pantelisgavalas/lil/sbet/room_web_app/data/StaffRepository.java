package pantelisgavalas.lil.sbet.room_web_app.data;

import org.springframework.data.jpa.repository.JpaRepository;
import pantelisgavalas.lil.sbet.room_web_app.models.StaffMember;

public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
