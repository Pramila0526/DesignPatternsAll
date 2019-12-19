package com.bridgelabz.designpatterns.facade;
import java.sql.Connection;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Socket For Adapter
 *
 *************************************************************************************************/
public class MySqlHelper {
	public static Connection getMySqlDBConnection(){
		//get MySql DB connection using connection parameters
		return null;
	}
	public void generateMySqlPDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}
	public void generateMySqlHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}
}
