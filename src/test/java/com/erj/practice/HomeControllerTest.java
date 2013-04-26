package com.erj.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTest {

	@Test
	public void testController() {
		HomeController controller = new HomeController();
		
		ModelAndView mav = controller.home();
		
		assertEquals("home", mav.getViewName());
		assertEquals("All systems optimal.", mav.getModel().get("message"));
	}
}
