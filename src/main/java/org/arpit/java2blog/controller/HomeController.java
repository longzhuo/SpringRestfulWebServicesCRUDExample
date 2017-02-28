package org.arpit.java2blog.controller; 


import java.util.ArrayList;
import java.util.List;





import org.arpit.java2blog.bean.Book;
import org.arpit.java2blog.bean.New;
import org.arpit.java2blog.service.NewService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**  
 * @Title HomeController.java  
 * @description TODO  
 * @time 2017年2月28日 下午4:05:11  
 * @author wyz  
 * @version 1.0  
 **/
@Controller
public class HomeController {
	
	NewService newService = new NewService();
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String home(Model model) {
		
		Book book1 = new Book(1L, "9780980839623", "Servlet & JSP: A Tutorial", "Budi Kurniawan");
        Book book2 = new Book(2L, "9780980839630", "C#: A Beginner's Tutorial", "Jayden Ky");
        
		List<Book> lists = new ArrayList<>();
		lists.add(book1);
		lists.add(book2);

		
		System.out.println("\n-----------控制层Lists01: " + lists);
 
		
		List<New> listOfNews = newService.getAllNews();		
		System.out.println("\n-----------控制层Lists02: " + listOfNews);
		
		String date = "66666666666";
		model.addAttribute("date", date);
		model.addAttribute("news", listOfNews);
		model.addAttribute("books", lists);
               
		return "home";
	}

}
 