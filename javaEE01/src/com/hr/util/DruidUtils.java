package com.hr.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


/**
 * Druid
 *
 */
public class DruidUtils {

	static DataSource dataSource;
	
	//静态代码块，就在类加载的时候执行一次。
	//静态代码块的作用：初始化静态变量、加载静态资源
	static{
		Properties prop = new Properties();
		try {
			//读取配置文件
			prop.load(DruidUtils.class.getClassLoader().getResourceAsStream("com/hr/util/druid.properties"));
			//利用Druid的工厂类来创建一个连接池
			dataSource = DruidDataSourceFactory.createDataSource(prop);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static Connection getConn(){

		Connection conn = null;
		try {
			//原来的DriverManager.getconn下岗了。换成下面的
			conn = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//关闭传入的连接
	public static void closeConn(Connection conn){
		try {
			//可以选中下面的三行代码：->surround with->try catch block就可以自动生成try catch块了。
			//先判断conn是否为null
			if(conn!=null){
				conn.close();//null.close()会报nullPointerException
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
