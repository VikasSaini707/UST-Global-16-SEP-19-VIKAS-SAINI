package com.ustglobal.studentapp.qspiders;

import com.ustglobal.studentapp.jspiders.*;

public class TeatA {
	public static void main(String[] args) {
		QTP  q = new QTP();
		q.teachQTP();
		
		Selenium s = new Selenium();
		s.teachSelenium();
		
	//	com.ustglobal.studentapp.jspiders.Angular a1 = new com.ustglobal.studentapp.jspiders.Angular();
	//	a1.teachAngular();
		
		Angular a = new Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();
	}
}
