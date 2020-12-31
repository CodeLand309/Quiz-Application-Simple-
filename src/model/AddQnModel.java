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
public class AddQnModel {
    public boolean add(String nnum, String nqn, String na, String nb, String nc, String nd, String nsub, String nanswer) throws SQLException
    {
        DB.Connect();
        String qry="insert into question(number, question, a, b, c, d, subject, answer) values(?,?,?,?,?,?,?,?);";
        PreparedStatement smt=DB.conn.prepareStatement(qry);
        smt.setString(1, nnum);
        smt.setString(2, nqn);
        smt.setString(3, na);
        smt.setString(4, nb);
        smt.setString(5, nc);
        smt.setString(6, nd);
        smt.setString(7, nsub);
        smt.setString(8, nanswer);
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
