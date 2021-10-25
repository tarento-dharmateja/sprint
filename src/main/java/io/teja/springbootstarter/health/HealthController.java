package io.teja.springbootstarter.health;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

//    private Boolean status=true;
//    private String message="health";
    
//    public Boolean getStatus() {
//        return status;
//    }
//    public void setStatus(Boolean status) {
//        this.status = status;
//    }
//    public String getMessage() {
//        return message;
//    }
//    public void setMessage(String message) {
//        this.message = message;
//    }
    @GetMapping
	@RequestMapping("/health-check")
	public Map<String, Boolean> Health() {
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("health", true);
        return map;
	}

}
