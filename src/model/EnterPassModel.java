/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class EnterPassModel {
     public boolean validate(String pass) throws SQLException
    {
        DB.Connect();
        String qry="select * from user where pass=?";
        PreparedStatement smt=DB.conn.prepareStatement(qry);
        smt.setString(1, pass);
        ResultSet rs=smt.executeQuery();
        //DB.disconnect();
        if(rs.next())
            return true;
        else
            return false;
    }
}
