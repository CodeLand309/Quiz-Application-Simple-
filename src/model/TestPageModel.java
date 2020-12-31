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
public class TestPageModel {
    public Boolean save(String uuser, String upass,String score) throws SQLException
    {
        DB.Connect();
        String qry="update user set score=? where uname=? and pass=?";
        PreparedStatement smt=DB.conn.prepareStatement(qry);
        smt.setString(1, score);
        smt.setString(2, uuser);
        smt.setString(3, upass);
        int res;
        res=smt.executeUpdate();
        //DB.disconnect();
        if(res==0)
            return false;
        else
            return true;
    }
}
