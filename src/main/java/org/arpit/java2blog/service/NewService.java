package org.arpit.java2blog.service;    

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.arpit.java2blog.bean.New;

/**  
 * @Title NewService.java  
 * @description TODO  
 * @time 2017年2月27日 下午3:23:18  
 * @author wyz  
 * @version 1.0  
 **/
public class NewService {
	
 	public static List<New> getNewIdList() {
	 	return newIdList;
 	}
	
	static List<New> newIdList = getNewIdList();

	// 可以仿做MySQL的数据，测试前端 + Controler + Service。
	// 后期做Service + DAO + MyBatis 单元测试
	// 最后Service去掉静态的数据，换取DAO接口，节省时间，效率快。
	public NewService() {
		super();
		
		if(newIdList == null)
		{
			newIdList = new ArrayList<New>();
			System.out.println("\n<<==========业=前 HashMap是否{}: " + newIdList);
			// Creating some objects of Country while initializing
			
			New new1 = new New("#1","news","财报显示，2016财年，阿里巴巴集团平台成交额达3.092万亿元人民币，同比增速度在阿里巴巴不长27%。拥有3.6万名员工的阿里，收入达到1011亿元人民币，成为人均主能最高的中国互联网公司。", 
					"新华网", "2016/05/25");
			New new2 = new New("#2","news","财报显示，2016财年，阿里巴巴集团平台成交额达3.092万亿元人民币，同比增速度在阿里巴巴不长27%。拥有3.6万名员工的阿里，收入达到1011亿元人民币，成为人均主能最高的中国互联网公司。", 
					"新华网", "2016/05/25");
			New new3 = new New("#3","news","财报显示，2016财年，阿里巴巴集团平台成交额达3.092万亿元人民币，同比增速度在阿里巴巴不长27%。拥有3.6万名员工的阿里，收入达到1011亿元人民币，成为人均主能最高的中国互联网公司。", 
					"新华网", "2016/05/25");
			New new4 = new New("#4","news","财报显示，2016财年，阿里巴巴集团平台成交额达3.092万亿元人民币，同比增速度在阿里巴巴不长27%。拥有3.6万名员工的阿里，收入达到1011亿元人民币，成为人均主能最高的中国互联网公司。", 
					"新华网", "2016/05/25");
			New new5 = new New("#1","news","财报显示，2016财年，阿里巴巴集团平台成交额达3.092万亿元人民币，同比增速度在阿里巴巴不长27%。拥有3.6万名员工的阿里，收入达到1011亿元人民币，成为人均主能最高的中国互联网公司。", 
					"新华网", "2016/05/25");
			New new6 = new New("#2","news","财报显示，2016财年，阿里巴巴集团平台成交额达3.092万亿元人民币，同比增速度在阿里巴巴不长27%。拥有3.6万名员工的阿里，收入达到1011亿元人民币，成为人均主能最高的中国互联网公司。", 
					"新华网", "2016/05/25");
			New new7 = new New("#3","news","财报显示，2016财年，阿里巴巴集团平台成交额达3.092万亿元人民币，同比增速度在阿里巴巴不长27%。拥有3.6万名员工的阿里，收入达到1011亿元人民币，成为人均主能最高的中国互联网公司。", 
					"新华网", "2016/05/25");
			New new8 = new New("#4","news","财报显示，2016财年，阿里巴巴集团平台成交额达3.092万亿元人民币，同比增速度在阿里巴巴不长27%。拥有3.6万名员工的阿里，收入达到1011亿元人民币，成为人均主能最高的中国互联网公司。", 
					"新华网", "2016/05/25");
			
			newIdList.add(new1);
			newIdList.add(new2);
			newIdList.add(new3);
			newIdList.add(new4);
			newIdList.add(new5);
			newIdList.add(new6);
			newIdList.add(new7);
			newIdList.add(new8);
			System.out.println("\n<<==========业=后 HashMap<Integer,　新闻>: " + newIdList);
		}
	}
	
	// R--List
	public List<New> getAllNews()
 	{
	 	List<New> news = new ArrayList<New>(newIdList);
  		return news;
 	}
	// R--ID
 	public New getNew(int id)
 	{
 		New neww= newIdList.get(id);
 		return neww;
 	} 	
 	
}
 