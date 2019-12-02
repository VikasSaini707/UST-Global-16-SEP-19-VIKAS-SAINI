package com.ust_global.retailermaintenancesystem.service;

import com.ust_global.retailermaintenancesystem.dto.ProductBean;
import com.ust_global.retailermaintenancesystem.dto.RetailerBean;

public interface RetailerService {

	public int createProfile(RetailerBean bean);
	public RetailerBean login(int rId, String password);
	public RetailerBean search(int rId);
	public boolean changePassword(int rId,String password);
	public int amountPayable(int rId);
	public ProductBean orders(int rId);
}
