/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DB;

/**
 *
 * @author user
 */
public class StudDashModel {
    public void SelectSub()
    {
        String qry;
        DB.Connect();
        qry="select * from user where uname=? and pass=? and type=?";
        //if(type==1)
    }
}

