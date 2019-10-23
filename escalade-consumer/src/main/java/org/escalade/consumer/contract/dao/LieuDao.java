package org.escalade.consumer.contract.dao;

import java.util.List;

import org.escalade.model.beans.Lieu;

public interface LieuDao {
	Lieu getLieuById(int pId);
	List<Lieu> getAllLieu();
	void createLieu(Lieu pLieu);
}
