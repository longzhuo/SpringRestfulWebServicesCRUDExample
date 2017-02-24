package org.arpit.java2blog.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.arpit.java2blog.bean.Country;  // 实体

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 * 
 * 
 * -----------------------------------------
 * | 返回值类型    |    方法名         | 形参（形参，实参）|
 * |----------+------------+---------------|
 * | List<实体>| getAll实体s | 无                               |
 * |----------+------------+---------------|
 * | 实体               | get实体ById | int id        |
 * |----------+------------+---------------|
 * | 实体               | add实体            | 实体  对象名               |
 * |----------+------------+---------------|
 * | 实体               | update实体     | 实体 对象名               |
 * |----------+------------+---------------|
 * | void     | delete实体     | int id        |
 * ------------------------+----------------
 */
public class CountryService {

	//     哈希映射<Integer,实体>      哈希映射变量名
	static HashMap<Integer,Country> countryIdMap = getCountryIdMap();

	// 可以仿做MySQL的数据，测试前端 + Controler + Service。
	// 后期做Service + DAO + MyBatis 单元测试
	// 最后Service去掉静态的数据，换取DAO接口，节省时间，效率快。
	public CountryService() {
		super();
		
		if(countryIdMap==null)
		{
			countryIdMap = new HashMap<Integer,Country>();
			System.out.println("\n<<==========业=前 HashMap是否{}: " + countryIdMap);
			// Creating some objects of Country while initializing
			Country indiaCountry=new Country(1, "India",10000);
			Country chinaCountry=new Country(4, "China",20000);
			Country nepalCountry=new Country(3, "Nepal",8000);
			Country bhutanCountry=new Country(2, "Bhutan",7000);
			
			
			countryIdMap.put(1,indiaCountry);
			countryIdMap.put(4,chinaCountry);
			countryIdMap.put(3,nepalCountry);
			countryIdMap.put(2,bhutanCountry);
			
			System.out.println("\n<<==========业=后 HashMap<Integer,实体>: " + countryIdMap);
		}
	}

	// R--List
	public List<Country> getAllCountries()
 	{
	 	List<Country> countries = new ArrayList<Country>(countryIdMap.values());
  		return countries;
 	}
	// R--ID
 	public Country getCountry(int id)
 	{
 		Country country= countryIdMap.get(id);
 		return country;
 	} 	
 	// C
 	public Country addCountry(Country country)
 	{
	 	country.setId(getMaxId()+1);
  		countryIdMap.put(country.getId(), country);
  		return country;
 	}
 	// U
 	public Country updateCountry(Country country)
 	{
 		if(country.getId()<=0)
 			return null;
 		countryIdMap.put(country.getId(), country);
 		return country;

 	} 	
 	// D--ID
 	public void deleteCountry(int id)
 	{
	 	countryIdMap.remove(id);
 	}

 	
 	
 	
 	
 	// 静态的哈希映射<Integer, 实体> 
 	public static HashMap<Integer, Country> getCountryIdMap() {
	 	return countryIdMap;
 	}
 

 	
 	// 有点像MySQL字段名id那个auto increment自动增量一样，简写自增，可以不用写id。
 	// Utility method to get max id
	public static int getMaxId()
	{   
		int max=0;
		for (int id:countryIdMap.keySet()) {  
			if(max<=id)
			max=id;
		
		}  
		return max;
	}
	
}

