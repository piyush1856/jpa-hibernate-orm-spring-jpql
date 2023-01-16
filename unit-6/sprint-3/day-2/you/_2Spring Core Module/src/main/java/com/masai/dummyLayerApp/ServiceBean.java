package com.masai.dummyLayerApp;

public class ServiceBean {
	
	private DaoBean dao;

//	public DaoBean getDao() {
//		return dao;
//	}
//
//	public void setDao(DaoBean dao) {
//		this.dao = dao;
//	}
	
	
	public void calculateInterest() {
		
		dao.findAccount();
		System.out.println("Interest calculated in Service Layer..");
	
	}

public ServiceBean(DaoBean dao) {
	super();
	this.dao = dao;
}

	
	
	

}
