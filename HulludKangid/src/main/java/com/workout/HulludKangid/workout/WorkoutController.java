package com.workout.HulludKangid.workout;



import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WorkoutController {
	
	@RequestMapping(value = "/workout", method = RequestMethod.GET)
	public String index(Principal principal) {
		return principal != null ? "workout/workout" : "home/homeNotSignedIn";
		
	}
}
