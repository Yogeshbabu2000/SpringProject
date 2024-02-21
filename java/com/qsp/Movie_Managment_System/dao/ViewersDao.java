package com.qsp.Movie_Managment_System.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Movie_Managment_System.dto.Viewers;
import com.qsp.Movie_Managment_System.repo.ViewersRepo;

@Repository
public class ViewersDao {
	@Autowired
	ViewersRepo viewersRepo;
	public Viewers saveViewers(Viewers viewers) {
		return viewersRepo.save(viewers);
	}
	public Viewers fetchViewersById(int id) {
		return viewersRepo.findById(id).get();
	}
	public Viewers deleteViewers(int id) {
		Viewers viewers=fetchViewersById(id);
		viewersRepo.delete(viewers);
		return viewers;
	}
	public Viewers updateViewers(int oldId,Viewers viewers) {
		viewers.setViewerId(oldId);
		return viewersRepo.save(viewers);
	}
}
