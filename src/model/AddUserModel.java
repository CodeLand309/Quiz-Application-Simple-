/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DB;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class AddUserModel {
    public boolean addUser(String name, String school, String type, String uname, String pass) throws SQLException
    {
        DB.Connect();
        String qry="insert into user(uname, school, type, pass, name)values(?,?,?,?,?);";
        PreparedStatement smt=DB.conn.prepareStatement(qry);
        smt.setString(1, uname);
        smt.setString(2, school);
        smt.setString(3, type);
        smt.setString(4, pass);
        smt.setString(5,name);
        int res;
        //if(type==0||type==1)
            res=smt.executeUpdate();
       // else
         //   JOptionPane.showMessageDialog(null, "Invalid user type","Failed",1);
        //DB.disconnect();
        if(res==0)
            return false;
        else 
            return true;
    }
}
