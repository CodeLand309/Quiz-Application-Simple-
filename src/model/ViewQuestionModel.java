/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class ViewQuestionModel {
        public static ResultSet getQuestions() throws SQLException 
    {
        java.sql.Statement smt;
        DB.Connect();
        String qry="select * from question";
        smt=DB.conn.createStatement();
        return smt.executeQuery(qry);
    }
}
