package ie.atu.membershipdemo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Period;

@RequestMapping("/membership")
@RestController
public class MembershipController {
    private String addMembership(@RequestBody Person person){
        return "New MemberShip" + person;
    }
}
