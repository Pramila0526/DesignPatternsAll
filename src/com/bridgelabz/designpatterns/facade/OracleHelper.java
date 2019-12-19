package com.bridgelabz.designpatterns.facade;
import java.sql.Connection;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Socket For Adapter
 *
 *************************************************************************************************/
public class OracleHelper {
	public static Connection getOracleDBConnection(){
		//get Oracle DB connection using connection parameters
		return null;
	}
	public void generateOraclePDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}
	public void generateOracleHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}
}
