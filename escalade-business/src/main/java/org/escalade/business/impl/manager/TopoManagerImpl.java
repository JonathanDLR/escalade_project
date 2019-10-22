package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.TopoManager;
import org.escalade.model.beans.Topo;

public class TopoManagerImpl extends AbstractManager implements TopoManager {

	@Override
	public void createTopo(Topo pTopo) {
		getDaoFactory().getTopoDao().createTopo(pTopo);
	}
	
	@Override
	public Topo getTopoByName(String pName) {
		Topo topo = getDaoFactory().getTopoDao().getTopoByName(pName);
		
		return topo;
	}

}
