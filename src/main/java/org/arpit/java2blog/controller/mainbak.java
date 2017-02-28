package org.arpit.java2blog.controller;    

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.arpit.java2blog.bean.Country;

import com.google.gson.Gson;

/**  
 * @Title main.java  
 * @description TODO  
 * @time 2017年2月27日 下午2:23:07  
 * @author wyz  
 * @version 1.0  
 **/
public class mainbak {

	public static void main(String[] args) {
		
		List<Country> countryList = new ArrayList<Country>();
		Country c1=new Country(1, "India",10000);
		Country c2=new Country(4, "China",20000);
		Country c3=new Country(3, "Nepal",8000);
		Country c4=new Country(2, "Bhutan",7000);
		countryList.add(c1);
		countryList.add(c2);
		countryList.add(c3);
		countryList.add(c4);
		System.out.println("\n完整的List：" + countryList);
		
		
		String json = new Gson().toJson(countryList);	
		System.out.println("\n插件json: " + json);
		
		// 初始化赋值
		int count = 30;
		
		
		Map<String, Object> map = new HashMap<String, Object>();
        // map.put("total", count);
        map.put("lists", json);
        
        System.out.println("\n完整的JSON：" + map);
	}

}
 