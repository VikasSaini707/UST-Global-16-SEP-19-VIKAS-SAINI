package com.ust_global.retailermaintenancesystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust_global.retailermaintenancesystem.dao.RetailerDao;
import com.ust_global.retailermaintenancesystem.dto.ProductBean;
import com.ust_global.retailermaintenancesystem.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService{

	@Autowired
	private RetailerDao dao;
	
	@Override
	public int createProfile(RetailerBean bean) {
		
		return dao.createProfile(bean);
	}

	@Override
	public RetailerBean login(int rId, String password) {
		
		return dao.login(rId, password);
	}

	@Override
	public RetailerBean search(int rId) {
		
		return dao.search(rId);
	}

	@Override
	public boolean changePassword(int rId, String password) {
		
		return dao.changePassword(rId, password);
	}

	@Override
	public int amountPayable(int rId) {
		
		return dao.amountPayable(rId);
	}

	@Override
	public ProductBean orders(int rId) {
		
		return dao.orders(rId);
	}

}
