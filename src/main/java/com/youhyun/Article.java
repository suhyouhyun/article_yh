package com.youhyun;

/**
 * p.60 [리스트 3.3] Member 클래스 수정<br>
 * 회원정보 도메인 오브젝트. 회원 테이블과 매핑한다.
 * 
 * @author Jacob
 */
public class Article {
	String title;
	String content; 
	String userId; 
	String name; 
	String cdate; 
	String articleId;
	String	udate;

	/**
	 * Default Constructor
	 */
	public Article() {
	}

	/**
	 * email, password, name 으로 초기화하는 컨스트럭터
	 * 
	 * @param email    이메일
	 * @param password 비밀번호
	 * @param name     이름
	 */
	public Article(String title, String content, String name) {
		this.title = title;
		this.content = content;
		this.name = name;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String getcontent() {
		return content;
	}

	public void setcontent(String content) {
		this.content = content;
	}

	public String getuserId() {
		return userId;
	}

	public void setuserId(String password) {
		this.userId = userId;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	
	public String getarticleId() {
		return articleId;
	}

	public void setarticleId(String articleId) {
		this.articleId = articleId;
	}
	
	public String getudate() {
		return udate;
	}

	public void setudate(String udate) {
		this.udate = udate;
	}
	


	
	@Override
	public String toString() {
		return "Title [ title=" + title + ", content=" + content + ", userId="
				+ userId + ", name=" + name + ", cdate=" + cdate + ", articleId=" + articleId + ", udate=" + udate +"]";
	}
}