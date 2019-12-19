package com.bridgelabz.designpatterns.main;
import java.sql.Connection;

import com.bridgelabz.designpatterns.facade.HelperFacade;
import com.bridgelabz.designpatterns.facade.MySqlHelper;
import com.bridgelabz.designpatterns.facade.OracleHelper;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Main Of Facade
 *
 *************************************************************************************************/
public class FacadePatternTest {
	public static void main(String[] args) {
		String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);
		
		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}

}
