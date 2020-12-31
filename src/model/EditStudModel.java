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
public class EditStudModel {
    public boolean editUser(String nname, String nschool, String  nuser, String npass, String upass) throws SQLException
    {
        DB.Connect();
        String qry="update user set name=?, school=?, uname=?, pass=? where pass=?;";
        PreparedStatement smt=DB.conn.prepareStatement(qry);
        //smt.setString(1, nnum);
        smt.setString(1, nname);
        smt.setString(2, nschool);
        smt.setString(3, nuser);
        smt.setString(4, npass);
        smt.setString(5, upass);
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
