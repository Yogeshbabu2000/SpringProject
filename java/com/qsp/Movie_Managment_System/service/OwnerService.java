package com.qsp.Movie_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Movie_Managment_System.dao.OwnerDao;
import com.qsp.Movie_Managment_System.dto.Owner;
import com.qsp.Movie_Managment_System.dto.Theatre;

@Service
public class OwnerService {
	@Autowired
	OwnerDao ownerDao;
	public Owner saveOwner(Owner owner) {
		return ownerDao.saveOwner(owner);
	}
	public Owner fetchOwnerById(int id) {
		return ownerDao.fetchOwnerById(id);
	}
	public Owner deleteOwner(int id) {
		return ownerDao.deleteOwner(id);
	}
	public Owner updateOwner(int oldId,Owner owner) {
		return ownerDao.updateOwner(oldId, owner);
	}
	public Owner addingExistingTheatreToExistingOwner(int theatreId,int ownerId) {
		return ownerDao.addingExistingTheatreToExistingOwner(theatreId, ownerId);
	}
}
