package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.bean.Country;
import org.arpit.java2blog.service.CountryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

	CountryService countryService = new CountryService(); // 业务层仿做数据列表

/*
 * 控，控制层
 * 业，业务层
 * 持，持久层
 * 	 
 * --------------------------------------------------------------------------------------------------------------------------------------------
 * | RESTful | controller| service    | CRUD    | MyBatis |         MySQL         * 为 任何字段名                                                                                                                         |
 * |---------+-----------+------------+---------+---------+-----------------------------------------------------------------------------------|
 * | GET     | get实体          | find实体          | Read    | SELECT  | SELECT * FROM 表名  WHERE 字段名id=值                                                                                                                          |
 * |---------+-----------+------------+---------+---------+-----------------------------------------------------------------------------------|
 * | GET     | get实体ies | find实体ies | Read    | SELECT  | SELECT * FROM 表名                                                                                                                                                                  |
 * |---------+-----------+------------+---------+---------+-----------------------------------------------------------------------------------|
 * | POST    | add实体          | save实体          | Create  | INSERT  | INSERT INTO 表名(字段名1，字段名2，字段名3，字段名4) VALUE('值1','值2','值3','值4');        |
 * |---------+-----------+------------+---------+---------+-----------------------------------------------------------------------------------|
 * | PUT     | update实体  | update实体      | Update  | UPDATE  | UPDATE 表名  SET 字段名1='值1',字段名2='值2',字段名3='值3',字段名4='值4' WHERE 字段名id=值;   |
 * |---------+-----------+------------+---------+---------+-----------------------------------------------------------------------------------|
 * | DELETE  | del实体          | del实体             | Delete  | DELETE  | DELETE FROM 表名  WHERE 字段名id=值;                                                  |
 * --------------------------------------------------------------------------------------------------------------------------------------------
 * 
 * System.out.println("\n<<----------GET--All==List<实体>: " + listOfCountries);
 * System.out.println("\n<<----------GET--ID =======实体  : " + id);
 * System.out.println("\n>>----------POST===========实体  : " + country);
 * System.out.println("\n>>----------PUT============实体  : " + country);
 * System.out.println("\n>>----------DELETE========void : " + id);
 * 
 * -----------------------------------------
 * | 返回值类型    |    方法名         | 形参（形参，实参）|
 * |----------+------------+---------------|
 * | List<实体>| get实体s    | 无                               |
 * |----------+------------+---------------|
 * | 实体               | get实体ById | int id        |
 * |----------+------------+---------------|
 * | 实体               | add实体            | 实体  对象名               |
 * |----------+------------+---------------|
 * | 实体               | update实体     | 实体 对象名               |
 * |----------+------------+---------------|
 * | void     | del实体             | int id        |
 * ------------------------+----------------
 * 
 * */
	
	// GET == R--List（get + 实体 + s或者ies）（query）（read）
	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Country> getCountries() {
		List<Country> listOfCountries = countryService.getAllCountries();
		System.out.println("\n<<----------GET--All==List<实体>: " + listOfCountries);
		return listOfCountries;
	}

	// GET == R--ID（get+实体+by+字段名id）（query）（read）
	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Country getCountryById(@PathVariable int id) {
		System.out.println("\n<<----------GET--ID =======实体  : " + id);
		
		return countryService.getCountry(id);
	}

	// POST == C（add + 实体）（create）（save）
	@RequestMapping(value = "/countries", method = RequestMethod.POST, headers = "Accept=application/json")
	public Country addCountry(@RequestBody Country country) {
		System.out.println("\n>>----------POST===========实体  : " + country);
		return countryService.addCountry(country);
	}

	// PUT == U（update + 实体）（modify）（edit）
	@RequestMapping(value = "/countries", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Country updateCountry(@RequestBody Country country) {
		System.out.println("\n>>----------PUT============实体  : " + country);
		return countryService.updateCountry(country);

	}

	// DELETE == D--ID（delete + 实体, 或者del + 实体）（remove）
	@RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable("id") int id) {
		System.out.println("\n>>----------DELETE========void : " + id);
		countryService.deleteCountry(id);

	}	
}
