package com.qsp.Movie_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Movie_Managment_System.dao.ViewersDao;
import com.qsp.Movie_Managment_System.dto.Viewers;

@Service
public class ViewersService {
	@Autowired
	ViewersDao viewersDao;
	public Viewers saveViewers(Viewers viewers) {
		return viewersDao.saveViewers(viewers);
	}
	public Viewers fetchViewersById(int id) {
		return viewersDao.fetchViewersById(id);
	}
	public Viewers deleteViewers(int id) {
		return viewersDao.deleteViewers(id);
	}
	public Viewers updateViewers(int oldId,Viewers viewers) {
		return viewersDao.updateViewers(oldId, viewers);
	}
}
