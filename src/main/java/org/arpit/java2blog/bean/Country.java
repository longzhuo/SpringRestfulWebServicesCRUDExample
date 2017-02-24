package org.arpit.java2blog.bean;

public class Country{
	
	private int id;             // id
	private String countryName;	// 国家名称
	private long population;    // 人口数字
	
	// 无参数的构造器
	public Country() {
		super();
	}
	// 有参数的构造器
	public Country(int i, String countryName,long population) {
		super();
		this.id = i;
		this.countryName = countryName;
		this.population=population;
	}
	// get和set方法名
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	// 转成字符串
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName
				+ ", population=" + population + "]";
	}
	
	
}