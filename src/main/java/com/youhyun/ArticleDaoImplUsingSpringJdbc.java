package com.youhyun;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


@Repository("articleDao")
public class ArticleDaoImplUsingSpringJdbc implements ArticleDao {
	static final String INSERT = "INSERT article(title, content, name) VALUES(?, ?, ?)";

	static final String SELECT_ALL = "SELECT title, email, name, left(cdate,19) cdate FROM article ORDER BY articleId desc LIMIT ?,?";

	static final String COUNT_ALL = "SELECT count(articleId) count FROM article";

	@Autowired
	JdbcTemplate jdbcTemplate;

	final RowMapper<Article> articleRowMapper = new BeanPropertyRowMapper<>(
										Article.class);
	@Override
	public Article selectByTitle(String title) {
		return null;
	}

	/**
	 * p.201 [리스트 8.12]의 insert() 메서드 수정
	 */
	@Override
	public void insert(Article article) {
		jdbcTemplate.update(INSERT, article.gettitle(), article.getcontent(),
											article.getname());
	}

	@Override
	public void update(Article article) {
		// TODO update() 메서드 구현
	}

	/**
	 * p.195 [리스트 8.9] selectAll() 메서드 수정
	 */
	@Override
	public List<Article> selectAll(int offset, int count) {
		return jdbcTemplate.query(SELECT_ALL, articleRowMapper, offset, count);
	}

	@Override
	public int countAll() {
		return jdbcTemplate.queryForObject(COUNT_ALL, Integer.class);
	}
}



