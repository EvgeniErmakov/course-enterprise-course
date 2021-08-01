package by.newsportal.news.dao.impl;

import java.util.ArrayList;
import java.util.List;


import by.newsportal.news.bean.News;
import by.newsportal.news.dao.NewsDAO;
import by.newsportal.news.dao.exception.DAOException;

public class SQLNewsDAO implements NewsDAO {
	@Override
	public List<News> addNewses() throws DAOException {
		try {
		List<News> requestedNews = new ArrayList<News>();
		requestedNews.add(new News("Italy's Lamont Marcell Jacobs wins gold in the men's 100 meter final", "Italy's Lamont Marcell Jacobs has won gold in the men's 100 meter finals with a time of 9.80.\n"
				+ "\n"
				+ "American Fred Kerley won silver with 9.84 and Canadian Andre De Grasse took home the bronze with 9.89."));
		requestedNews.add(new News("How much do I need to sleep? It depends on your age", "If it feels like babies are sleeping all day, they pretty much are. In the first year of life, babies can sleep"
				+ " 17 to 20 hours a day, Dasgupta said. Infants 4 months to 12 months need their 12 to 16 hours of sleep, including naps, according to Chick..."));

		return requestedNews;
		
		}catch (Exception e) {
			throw new DAOException();
		}
	}
}
