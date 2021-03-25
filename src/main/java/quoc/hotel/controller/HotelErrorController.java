package quoc.hotel.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class HotelErrorController implements ErrorController {

	 @RequestMapping("/error")
	    public String handleError() {
	        return "redirect:/";
	    }
	
	@Override
	public String getErrorPath() {
		return null;
	}

}
