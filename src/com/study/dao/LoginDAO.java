package com.study.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.study.util.DBConnector;


public class LoginDAO {

	public boolean isExist(String username, String password) {
		boolean res = false;
		Connection con = null;
		try {
			con = DBConnector.getConnection();

			/*
			String sql = "SELECT * FROM login WHERE id = ? AND password = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			*/

			Statement st = con.createStatement();
			String sql = "SELECT * FROM login WHERE id ='"
					+ username  + "' AND password ='" + password + "'";
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				res = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return res;
	}
}
