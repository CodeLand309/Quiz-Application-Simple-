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
public class RemoveUserModel {
    public boolean removeUser(String uname, String type) throws SQLException
    {
        DB.Connect();
        String qry="delete from user where type=? and uname=?;";
        PreparedStatement smt=DB.conn.prepareStatement(qry);
        smt.setString(1, type);
        smt.setString(2, uname);
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
