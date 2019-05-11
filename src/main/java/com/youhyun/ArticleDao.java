package com.youhyun;

import java.util.List;



public interface ArticleDao {


	Article selectByTitle(String title);

	/**
	 * 제목 저장
	 */
	void insert(Article article);


	void update(Article article);

	
	List<Article> selectAll(int offset, int count);
	
	
	int countAll();
}