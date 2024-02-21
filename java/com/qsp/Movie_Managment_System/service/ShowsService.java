package com.qsp.Movie_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Movie_Managment_System.dao.ShowsDao;
import com.qsp.Movie_Managment_System.dto.Shows;

@Service
public class ShowsService {
	@Autowired
	ShowsDao showsDao;
	public Shows saveShows(Shows shows) {
		return showsDao.saveShows(shows);
	}
	public Shows fetchShowsById(int id) {
		return showsDao.fetchShowsById(id);
	}
	public Shows deleteShows(int id) {
		return showsDao.deleteShows(id);
	}
	public Shows updateShows(int oldId,Shows shows) {
		return showsDao.updateShows(oldId, shows);
	}
}
