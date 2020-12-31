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
public class EditQnModel {
    public boolean edit(String nnum, String nqn, String na, String nb, String nc, String nd, String nsub, String nanswer, String num, String sub) throws SQLException
    {
        DB.Connect();
        String qry="update question set question=?, a=?, b=?, c=?, d=?, subject=?, answer=? where number=? and subject=?;";
        PreparedStatement smt=DB.conn.prepareStatement(qry);
        //smt.setString(1, nnum);
        smt.setString(1, nqn);
        smt.setString(2, na);
        smt.setString(3, nb);
        smt.setString(4, nc);
        smt.setString(5, nd);
        smt.setString(6, nsub);
        smt.setString(7, nanswer);
        smt.setString(8, num);
        smt.setString(9, sub);
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
