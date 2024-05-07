package wide.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@ResponseBody
	@RequestMapping(value="/")
	public String sample() {
		return "HELLO WORLD";
	}

}
