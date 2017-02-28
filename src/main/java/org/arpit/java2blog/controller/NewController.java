package org.arpit.java2blog.controller;    

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.arpit.java2blog.bean.New;
import org.arpit.java2blog.service.NewService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

/**  
 * @Title NewController.java  
 * @description TODO  
 * @time 2017年2月27日 下午3:29:52  
 * @author wyz  
 * @version 1.0  
 **/

@RestController
public class NewController {
	
	NewService newService = new NewService();
	
	// GET == R--List（get+实体+s或者ies）
	@RequestMapping(value = "/news", method = RequestMethod.GET, headers = "Accept=application/json;charset=UTF-8")
	public String getCountries() 
			throws Exception {
		
		List<New> listOfNews = newService.getAllNews();
				
		Map<String,Object> map = new HashMap<String, Object>();
        map.put("lists", listOfNews);
        
        String json = new Gson().toJson(map);
        // json = URLEncoder.encode(json, "UTF-8"); 
        
        System.out.println("\n控制的   map：" + map);
        System.out.println("\n控制的json：" + json);
		
		return json;
	}

}
 