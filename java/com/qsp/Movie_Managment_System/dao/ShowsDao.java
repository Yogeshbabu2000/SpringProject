package com.qsp.Movie_Managment_System.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Movie_Managment_System.dto.Shows;
import com.qsp.Movie_Managment_System.repo.ShowsRepo;

@Repository
public class ShowsDao {
	@Autowired
	ShowsRepo showsRepo;
	public Shows saveShows(Shows shows) {
		return showsRepo.save(shows);
	}
	public Shows fetchShowsById(int id) {
		return showsRepo.findById(id).get();
	}
	public Shows deleteShows(int id) {
		Shows shows=fetchShowsById(id);
		showsRepo.delete(shows);
		return shows;
	}
	public Shows updateShows(int oldId,Shows shows) {
		shows.setShowId(oldId);
		return showsRepo.save(shows);
	}
}
