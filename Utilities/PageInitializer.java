package Utilities;

import Pages.AdminPage;
import Pages.CommonPage;
import Pages.DashboardPage;
import Pages.LoginPage;

public class PageInitializer extends BaseClass {
	
	public static LoginPage lp;
	public static DashboardPage dp;
	public static CommonPage cp;
	public static AdminPage ap;
	
	
	
	public static void initialize() {
		lp = new LoginPage();
		dp = new DashboardPage();
		cp = new CommonPage();
		ap = new AdminPage();
		
	}

} 
