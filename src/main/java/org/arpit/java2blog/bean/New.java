package org.arpit.java2blog.bean;    
/**  
 * @Title New.java  
 * @description TODO  
 * @time 2017年2月27日 下午3:21:26  
 * @author wyz  
 * @version 1.0  
 **/
public class New {
	
	private int id;
    private String link;
    private String title;
    private String detail;
    private String laiyuan;
    private String date;
    
	public New() {
	}
	public New(String link, String title, String detail, String laiyuan,
			String date) {
		super();
		this.link = link;
		this.title = title;
		this.detail = detail;
		this.laiyuan = laiyuan;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getLaiyuan() {
		return laiyuan;
	}
	public void setLaiyuan(String laiyuan) {
		this.laiyuan = laiyuan;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "New [id=" + id + ", link=" + link + ", title=" + title
				+ ", detail=" + detail + ", laiyuan=" + laiyuan + ", date="
				+ date + "]";
	}
	

}
 