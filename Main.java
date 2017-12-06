/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vivek_siemens;

/**
 *
 * @author Vivek
 */


import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;
public class Main {

    ResultSet rs;


    JFrame field ;
    JLabel pl,sn,tob,rdso_sno,mno,vlc6,ncd,ps,hgm,opao,coi,act,rNRGPdat,rm,type,status,location ,remark,sno_dt,wty;
    JLabel dd,mon,tob1,rdsono,sn1,mn,vlc61,ncdm,srnno,srndt,replace,rmrk,status1;
    JLabel X,X1;
    JTextField SNO;
    JLabel SN;
    JTextField a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,pf,q,r,s,t;
    int n1=10;
    JTextField v,w,x,y,z,aa,ab,ac,ad,ae,af,ag,ah;

    String Sa,Sb,Sc,Sd,Se,Sf,Sg,Sh,Si,Sj,Sk,Sl,Sm,Sn,So,Spf,Sq,Sr,Ss,St;
    String SSNO;
    String Sv,Sw,Sx,Sy,Sz,Saa,Sab,Sac,Sad,Sae,Saf,Sag,Sah;
     JButton b1=new JButton("Next");
      JButton b2=new JButton("Previous");
JButton b4=new JButton("First");
       JButton b3=new JButton("Last");
       JButton ud=new JButton("Update");
       JButton del=new JButton("Delete");
       JButton add=new JButton("Add");
 JButton New=new JButton("New");
 JButton search = new JButton("Search");
   JButton cf=new JButton("Clear search");

    Main()
    {
         X1=new JLabel("                                                                                                                                                                                                                                                                                                                                                             RECIEVED FROM SITE (starts from here)                                                                                                                                                                                                                                                                                                                                                                              ");
       pl=new JLabel("Project");
      SN =new JLabel("SNO:");
       sn=new JLabel("station name");
       tob=new JLabel("Type of Board");
       rdso_sno=new JLabel("RDSO slno");
       mno=new JLabel("Module no");
      vlc6=new JLabel("VLC-6/DB");
       ncd=new JLabel("NCD/AB");
       ps=new JLabel("Problem @ site");
      hgm=new JLabel("Hologram");
     opao=new JLabel("Observation/Problem at office");
      coi=new JLabel("Cause of Issue");
      act=new JLabel("Action taken");
rNRGPdat=new JLabel("Received NRGP no & date");
       rm=new JLabel("Received month");
     type=new JLabel("Type");
   status=new JLabel("Status");
   location=new JLabel("Location");
   remark=new JLabel("Remark");

            sno_dt=new JLabel("SRN no & date");
wty=new JLabel("Warrenty");

  X=new JLabel("                                                                                                                                                                                                  ISSUED TO SITE (starts from here)                                                                                                                                                                                                                               ");
        dd=new JLabel("Despatched date");
      mon=new JLabel("Month");
      tob1=new JLabel("Type of board");
   rdsono=new JLabel("RDSO no");
      sn1=new JLabel("Station name");
       mn=new JLabel("Module no");
     vlc61=new JLabel("DB/VLC6");
       ncdm=new JLabel("AB/NCDM");
       srnno=new JLabel("SRN no");
       srndt=new JLabel("SRN Date");
       replace=new JLabel("Replacement");
       rmrk=new JLabel("Remark");
       status1=new JLabel("Status");

       SNO=new JTextField(3);
       a= new JTextField(n1);
        b= new JTextField(n1);
       c= new JTextField(n1);
      d= new JTextField(n1);
       e= new JTextField(n1);
        f= new JTextField(n1);
        g= new JTextField(n1);
       h= new JTextField(n1);


       i= new JTextField(n1);
        j= new JTextField(n1);
       k= new JTextField(n1);
      l= new JTextField(n1);
       m= new JTextField(n1);
        n= new JTextField(n1);
        o= new JTextField(n1);
       pf= new JTextField(n1);



       q= new JTextField(n1);
        r= new JTextField(n1);
       s= new JTextField(n1);
      t= new JTextField(n1);
       v= new JTextField(n1);
        w= new JTextField(n1);
        x= new JTextField(n1);
       y= new JTextField(n1);



       z= new JTextField(n1);
       aa= new JTextField(n1);
      ab= new JTextField(n1+5);
      ac= new JTextField(n1);
       ad= new JTextField(n1);
        ae= new JTextField(n1);
        af= new JTextField(n1);
       ag= new JTextField(n1);
          ah= new JTextField(n1+25);

          b1.setToolTipText("to see the next record");
          b2.setToolTipText("to see the  previous record");
          b3.setToolTipText("for last record");
          b4.setToolTipText("for first record");
          ud.setToolTipText("edit or update any record");
          del.setToolTipText("to delete the current showing record");
          add.setToolTipText("for add new  record(either click on new to enter new record or edit any one and click add)");
          search.setToolTipText("first click on new and type any field to search for the record");
          cf.setToolTipText("to clear the search and go back to normal view");
          New.setToolTipText("to get blank fields");

          field =new JFrame("SIEMENS CARD DATABASE (by Vivek Sanodiya)");

           field.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        field.setSize(1000,1000);




        JPanel p=new JPanel();
        p.add(SN);
        p.add(SNO);
        p.add(X1);

        p.add(pl);
        p.add(a);
        p.add(sn);
         p.add(b);
        p.add(tob);
        p.add(c);
        p.add(rdso_sno);
        p.add(d);
        p.add(mno);
        p.add(e);
        p.add(vlc6);
        p.add(f);
        p.add(ncd);
        p.add(g);
        p.add(ps);
        p.add(h);
       p.add(hgm);
       p.add(i);
       p.add(opao);
       p.add(j);
       p.add(coi);
       p.add(k);

       p.add(act);
       p.add(l);
       p.add(rNRGPdat);
       p.add(m);
       p.add(rm);
       p.add(n);
       p.add(type);
       p.add(o);
       p.add(status);
       p.add(pf);
       p.add(location);
       p.add(q);
       p.add(remark);
       p.add(r);
       p.add(sno_dt);
       p.add(s);
       p.add(wty);
       p.add(t);

        p.add(X);

        p.add(dd);
        p.add(v);
        p.add(mon);
        p.add(w);
        p.add(tob1);
        p.add(x);
        p.add(rdsono);
        p.add(y);
        p.add(sn1);
        p.add(z);
       p.add(mn);
       p.add(aa);
       p.add(vlc61);
       p.add(ab);
       p.add(ncdm);
       p.add(ac);
       p.add(srnno);
       p.add(ad);
       p.add(srndt);
       p.add(ae);
       p.add(replace);
       p.add(af);
       p.add(rmrk);
       p.add(ag);
       p.add(status1);
       p.add(ah);

        p.add(b1);
        p.add(b2);
        p.add(b4);
        p.add(b3);
        p.add(ud);
        p.add(del);
        p.add(New);
        p.add(add);
        p.add(search);
        p.add(cf);


       field.add(p);
       field.setExtendedState(JFrame.MAXIMIZED_BOTH);
       field.setVisible(true);
       connect();
        try
        {

        rs.next();
         SNO.setText(rs.getString("sno"));
         a.setText(rs.getString("Project"));
         b.setText(rs.getString("Station_name"));
         c.setText(rs.getString("TYPE_OF_BOARD"));
         d.setText(rs.getString("RDSO_Slno"));
         e.setText(rs.getString("Module_No"));
         f.setText(rs.getString("VLC6_DB"));
         g.setText(rs.getString("NCD_or_AB"));
         h.setText(rs.getString("Problem_at_site"));
         i.setText(rs.getString("Hologram"));
         j.setText(rs.getString("Observation_or_Problem_at_Office"));
         k.setText(rs.getString("Cause_of_Issue"));
         l.setText(rs.getString("Action_Taken"));
         m.setText(rs.getString("Received_NRGP_or_SRM_No_and_Date"));
         n.setText(rs.getString("Received_Month"));
         o.setText(rs.getString("TYPE"));
        pf.setText(rs.getString("Status"));
        if(!pf.getText().equalsIgnoreCase("Received")){
            //pf.setBackground(Color.red);
            pf.setForeground(Color.red);
        }else{
            pf.setForeground(Color.BLUE);
        }
        pf.repaint();
        q.setText(rs.getString("Location"));
         r.setText(rs.getString("Remarks"));
         s.setText(rs.getString("SRN_No_and_Date"));
         t.setText(rs.getString("Warranty"));



         v.setText(rs.getString("Despatch_Date"));
         w.setText(rs.getString("month_n"));
         x.setText(rs.getString("TYPE_OF_BOARD1"));
         y.setText(rs.getString("RDSO_NO"));
         z.setText(rs.getString("Station_Name1"));
        aa.setText(rs.getString("module_no1"));
        ab.setText(rs.getString("DB_or_VLC6"));
        ac.setText(rs.getString("AB_or_NCDM"));
        ad.setText(rs.getString("SRN_No"));
        ae.setText(rs.getString("SRN_Date"));
        af.setText(rs.getString("Replacement"));
        ag.setText(rs.getString("REMARKS1"));
        ah.setText(rs.getString("status1"));
if(!ah.getText().equalsIgnoreCase("Sent")){
            //pf.setBackground(Color.red);
            ah.setForeground(Color.red);
        }else{
            ah.setForeground(Color.BLUE);
        }
        ah.repaint();

        SSNO=SNO.getText();
         Sa=a.getText();
         Sb=b.getText();
         Sc=c.getText();
         Sd=d.getText();
         Se=e.getText();
         Sf=f.getText();
         Sg=g.getText();
         Sh=h.getText();
         Si=i.getText();
         Sj=j.getText();
         Sk=k.getText();
         Sl=l.getText();
         Sm=m.getText();
         Sn=n.getText();
         So=o.getText();
         Spf=pf.getText();
         Sq=q.getText();
         Sr=r.getText();
         Ss=s.getText();
         St=t.getText();
         Sv=v.getText();
         Sw=w.getText();
         Sx=x.getText();
         Sy=y.getText();
         Sz=z.getText();
         Saa=aa.getText();
         Sab=ab.getText();
         Sac=ac.getText();
         Sad=ad.getText();
         Sae=ae.getText();
         Saf=af.getText();
         Sag=ag.getText();
         Sah=ah.getText();


       }
        catch(Exception ex)
       {

       }


      thehandler h = new thehandler();
       b1.addActionListener(h);
       b2.addActionListener(h);
        b3.addActionListener(h);
       b4.addActionListener(h);
        add.addActionListener(h);
        ud.addActionListener(h);
          del.addActionListener(h);
          New.addActionListener(h);
          search.addActionListener(h);
          cf.addActionListener(h);


    }

     public void connect()
	{
		try
		{

                  // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

                   // String db="jdbc:odbc:md1";
			String db= "jdbc:ucanaccess://C:\\db\\siemens1.accdb";
			String sql ="Select * from st1";
			Connection con = DriverManager.getConnection(db);

	Statement st =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);


			rs=st.executeQuery(sql);



		}
		catch(Exception ex)
		{

		}
	}

       private class thehandler implements ActionListener
    {
    public void actionPerformed(ActionEvent evt) {



        String action = evt.getActionCommand();

        if(action.equals("Add"))

        {

            addOperation();

        }else if(action.equals("Update"))
        {

            updateOperation();

        }else if(action.equals("Delete"))

        {

            deleteOperation();

        }
        else if(action.equals("Previous"))

        {

            preNavigation();

        }else if(action.equals("Next"))

      {

            nextNavigation();

        }
        else if(action.equals("First"))
        {
            foperation();
        }
            else if(action.equals("Last"))
        {
            loperation();
        }
            else if(action.equals("New"))
            {
                newoperation();
            }
        else if(action.equals("Search"))
            {
                searchoperation();
            }

        else if(action.equals("Clear search"))
            {
                clearsearchoperation();
            }
         }
       }



       private void foperation()
       {

            try
                        {
                              rs.first();
                              SNO.setText(rs.getString("sno"));
         a.setText(rs.getString("Project"));
         b.setText(rs.getString("Station_name"));
         c.setText(rs.getString("TYPE_OF_BOARD"));
         d.setText(rs.getString("RDSO_Slno"));
         e.setText(rs.getString("Module_No"));
         f.setText(rs.getString("VLC6_DB"));
         g.setText(rs.getString("NCD_or_AB"));
         h.setText(rs.getString("Problem_at_site"));
         i.setText(rs.getString("Hologram"));
         j.setText(rs.getString("Observation_or_Problem_at_Office"));
         k.setText(rs.getString("Cause_of_Issue"));
         l.setText(rs.getString("Action_Taken"));
         m.setText(rs.getString("Received_NRGP_or_SRM_No_and_Date"));
         n.setText(rs.getString("Received_Month"));
         o.setText(rs.getString("TYPE"));
        pf.setText(rs.getString("Status"));
        if(!pf.getText().equalsIgnoreCase("Received")){
            //pf.setBackground(Color.red);
            pf.setForeground(Color.red);
        }else{
            pf.setForeground(Color.BLUE);
        }
        pf.repaint();
        q.setText(rs.getString("Location"));
         r.setText(rs.getString("Remarks"));
         s.setText(rs.getString("SRN_No_and_Date"));
         t.setText(rs.getString("Warranty"));



         v.setText(rs.getString("Despatch_Date"));
         w.setText(rs.getString("month_n"));
         x.setText(rs.getString("TYPE_OF_BOARD1"));
         y.setText(rs.getString("RDSO_NO"));
         z.setText(rs.getString("Station_Name1"));
        aa.setText(rs.getString("module_no1"));
        ab.setText(rs.getString("DB_or_VLC6"));
        ac.setText(rs.getString("AB_or_NCDM"));
        ad.setText(rs.getString("SRN_No"));
        ae.setText(rs.getString("SRN_Date"));
        af.setText(rs.getString("Replacement"));
        ag.setText(rs.getString("REMARKS1"));
        ah.setText(rs.getString("status1"));
        if(!ah.getText().equalsIgnoreCase("Sent")){
            //pf.setBackground(Color.red);
            ah.setForeground(Color.red);
        }else{
            ah.setForeground(Color.BLUE);
        }
        ah.repaint();
        SSNO=SNO.getText();
         Sa=a.getText();
         Sb=b.getText();
         Sc=c.getText();
         Sd=d.getText();
         Se=e.getText();
         Sf=f.getText();
         Sg=g.getText();
         Sh=h.getText();
         Si=i.getText();
         Sj=j.getText();
         Sk=k.getText();
         Sl=l.getText();
         Sm=m.getText();
         Sn=n.getText();
         So=o.getText();
         Spf=pf.getText();
         Sq=q.getText();
         Sr=r.getText();
         Ss=s.getText();
         St=t.getText();
         Sv=v.getText();
         Sw=w.getText();
         Sx=x.getText();
         Sy=y.getText();
         Sz=z.getText();
         Saa=aa.getText();
         Sab=ab.getText();
         Sac=ac.getText();
         Sad=ad.getText();
         Sae=ae.getText();
         Saf=af.getText();
         Sag=ag.getText();
         Sah=ah.getText();


                        }
                        catch(Exception ex)
                        {

                        }
       }
       private void loperation()
       {
            try
                        {
                              rs.last();
                              SNO.setText(rs.getString("sno"));
         a.setText(rs.getString("Project"));
         b.setText(rs.getString("Station_name"));
         c.setText(rs.getString("TYPE_OF_BOARD"));
         d.setText(rs.getString("RDSO_Slno"));
         e.setText(rs.getString("Module_No"));
         f.setText(rs.getString("VLC6_DB"));
         g.setText(rs.getString("NCD_or_AB"));
         h.setText(rs.getString("Problem_at_site"));
         i.setText(rs.getString("Hologram"));
         j.setText(rs.getString("Observation_or_Problem_at_Office"));
         k.setText(rs.getString("Cause_of_Issue"));
         l.setText(rs.getString("Action_Taken"));
         m.setText(rs.getString("Received_NRGP_or_SRM_No_and_Date"));
         n.setText(rs.getString("Received_Month"));
         o.setText(rs.getString("TYPE"));
        pf.setText(rs.getString("Status"));
        if(!pf.getText().equalsIgnoreCase("Received")){
            //pf.setBackground(Color.red);
            pf.setForeground(Color.red);
        }else{
            pf.setForeground(Color.BLUE);
        }
        pf.repaint();
        q.setText(rs.getString("Location"));
         r.setText(rs.getString("Remarks"));
         s.setText(rs.getString("SRN_No_and_Date"));
         t.setText(rs.getString("Warranty"));



         v.setText(rs.getString("Despatch_Date"));
         w.setText(rs.getString("month_n"));
         x.setText(rs.getString("TYPE_OF_BOARD1"));
         y.setText(rs.getString("RDSO_NO"));
         z.setText(rs.getString("Station_Name1"));
        aa.setText(rs.getString("module_no1"));
        ab.setText(rs.getString("DB_or_VLC6"));
        ac.setText(rs.getString("AB_or_NCDM"));
        ad.setText(rs.getString("SRN_No"));
        ae.setText(rs.getString("SRN_Date"));
        af.setText(rs.getString("Replacement"));
        ag.setText(rs.getString("REMARKS1"));
        ah.setText(rs.getString("status1"));
        if(!ah.getText().equalsIgnoreCase("Sent")){
            //pf.setBackground(Color.red);
            ah.setForeground(Color.red);
        }else{
            ah.setForeground(Color.BLUE);
        }
        ah.repaint();
        SSNO=SNO.getText();
         Sa=a.getText();
         Sb=b.getText();
         Sc=c.getText();
         Sd=d.getText();
         Se=e.getText();
         Sf=f.getText();
         Sg=g.getText();
         Sh=h.getText();
         Si=i.getText();
         Sj=j.getText();
         Sk=k.getText();
         Sl=l.getText();
         Sm=m.getText();
         Sn=n.getText();
         So=o.getText();
         Spf=pf.getText();
         Sq=q.getText();
         Sr=r.getText();
         Ss=s.getText();
         St=t.getText();
         Sv=v.getText();
         Sw=w.getText();
         Sx=x.getText();
         Sy=y.getText();
         Sz=z.getText();
         Saa=aa.getText();
         Sab=ab.getText();
         Sac=ac.getText();
         Sad=ad.getText();
         Sae=ae.getText();
         Saf=af.getText();
         Sag=ag.getText();
         Sah=ah.getText();


                        }
                        catch(Exception ex)
                        {

                        }
       }
       private void nextNavigation()
       {
            try
                        {
                         if(rs.next())
                         {
                              SNO.setText(rs.getString("sno"));
         a.setText(rs.getString("Project"));
         b.setText(rs.getString("Station_name"));
         c.setText(rs.getString("TYPE_OF_BOARD"));
         d.setText(rs.getString("RDSO_Slno"));
         e.setText(rs.getString("Module_No"));
         f.setText(rs.getString("VLC6_DB"));
         g.setText(rs.getString("NCD_or_AB"));
         h.setText(rs.getString("Problem_at_site"));
         i.setText(rs.getString("Hologram"));
         j.setText(rs.getString("Observation_or_Problem_at_Office"));
         k.setText(rs.getString("Cause_of_Issue"));
         l.setText(rs.getString("Action_Taken"));
         m.setText(rs.getString("Received_NRGP_or_SRM_No_and_Date"));
         n.setText(rs.getString("Received_Month"));
         o.setText(rs.getString("TYPE"));
        pf.setText(rs.getString("Status"));
        if(!pf.getText().equalsIgnoreCase("Received")){
            //pf.setBackground(Color.red);
            pf.setForeground(Color.red);
        }else{
            pf.setForeground(Color.BLUE);
        }
        pf.repaint();
            q.setText(rs.getString("Location"));
         r.setText(rs.getString("Remarks"));
         s.setText(rs.getString("SRN_No_and_Date"));
         t.setText(rs.getString("Warranty"));



         v.setText(rs.getString("Despatch_Date"));
         w.setText(rs.getString("month_n"));
         x.setText(rs.getString("TYPE_OF_BOARD1"));
         y.setText(rs.getString("RDSO_NO"));
         z.setText(rs.getString("Station_Name1"));
        aa.setText(rs.getString("module_no1"));
        ab.setText(rs.getString("DB_or_VLC6"));
        ac.setText(rs.getString("AB_or_NCDM"));
        ad.setText(rs.getString("SRN_No"));
        ae.setText(rs.getString("SRN_Date"));
        af.setText(rs.getString("Replacement"));
        ag.setText(rs.getString("REMARKS1"));
        ah.setText(rs.getString("status1"));
        if(!ah.getText().equalsIgnoreCase("Sent")){
            //pf.setBackground(Color.red);
            ah.setForeground(Color.red);
        }else{
            ah.setForeground(Color.BLUE);
        }
        ah.repaint();

        SSNO=SNO.getText();
         Sa=a.getText();
         Sb=b.getText();
         Sc=c.getText();
         Sd=d.getText();
         Se=e.getText();
         Sf=f.getText();
         Sg=g.getText();
         Sh=h.getText();
         Si=i.getText();
         Sj=j.getText();
         Sk=k.getText();
         Sl=l.getText();
         Sm=m.getText();
         Sn=n.getText();
         So=o.getText();
         Spf=pf.getText();
         Sq=q.getText();
         Sr=r.getText();
         Ss=s.getText();
         St=t.getText();
         Sv=v.getText();
         Sw=w.getText();
         Sx=x.getText();
         Sy=y.getText();
         Sz=z.getText();
         Saa=aa.getText();
         Sab=ab.getText();
         Sac=ac.getText();
         Sad=ad.getText();
         Sae=ae.getText();
         Saf=af.getText();
         Sag=ag.getText();
         Sah=ah.getText();




                         }
                         else
                         {
                             rs.previous();
                             JOptionPane.showMessageDialog(null,"no more next records ");
                         }
                        }
                        catch(Exception ex)
                        {

                        }

       }
       private void preNavigation()
       {
           try
                        {
                         if(rs.previous())
                         {
                              SNO.setText(rs.getString("sno"));
         a.setText(rs.getString("Project"));
         b.setText(rs.getString("Station_name"));
         c.setText(rs.getString("TYPE_OF_BOARD"));
         d.setText(rs.getString("RDSO_Slno"));
         e.setText(rs.getString("Module_No"));
         f.setText(rs.getString("VLC6_DB"));
         g.setText(rs.getString("NCD_or_AB"));
         h.setText(rs.getString("Problem_at_site"));
         i.setText(rs.getString("Hologram"));
         j.setText(rs.getString("Observation_or_Problem_at_Office"));
         k.setText(rs.getString("Cause_of_Issue"));
         l.setText(rs.getString("Action_Taken"));
         m.setText(rs.getString("Received_NRGP_or_SRM_No_and_Date"));
         n.setText(rs.getString("Received_Month"));
         o.setText(rs.getString("TYPE"));
        pf.setText(rs.getString("Status"));
        if(!pf.getText().equalsIgnoreCase("Received")){
            //pf.setBackground(Color.red);
            pf.setForeground(Color.red);
        }else{
            pf.setForeground(Color.BLUE);
        }
        pf.repaint();
        q.setText(rs.getString("Location"));
         r.setText(rs.getString("Remarks"));
         s.setText(rs.getString("SRN_No_and_Date"));
         t.setText(rs.getString("Warranty"));



         v.setText(rs.getString("Despatch_Date"));
         w.setText(rs.getString("month_n"));
         x.setText(rs.getString("TYPE_OF_BOARD1"));
         y.setText(rs.getString("RDSO_NO"));
         z.setText(rs.getString("Station_Name1"));
        aa.setText(rs.getString("module_no1"));
        ab.setText(rs.getString("DB_or_VLC6"));
        ac.setText(rs.getString("AB_or_NCDM"));
        ad.setText(rs.getString("SRN_No"));
        ae.setText(rs.getString("SRN_Date"));
        af.setText(rs.getString("Replacement"));
        ag.setText(rs.getString("REMARKS1"));
        ah.setText(rs.getString("status1"));
        if(!ah.getText().equalsIgnoreCase("Sent")){
            //pf.setBackground(Color.red);
            ah.setForeground(Color.red);
        }else{
            ah.setForeground(Color.BLUE);
        }
        ah.repaint();

        SSNO=SNO.getText();
         Sa=a.getText();
         Sb=b.getText();
         Sc=c.getText();
         Sd=d.getText();
         Se=e.getText();
         Sf=f.getText();
         Sg=g.getText();
         Sh=h.getText();
         Si=i.getText();
         Sj=j.getText();
         Sk=k.getText();
         Sl=l.getText();
         Sm=m.getText();
         Sn=n.getText();
         So=o.getText();
         Spf=pf.getText();
         Sq=q.getText();
         Sr=r.getText();
         Ss=s.getText();
         St=t.getText();
         Sv=v.getText();
         Sw=w.getText();
         Sx=x.getText();
         Sy=y.getText();
         Sz=z.getText();
         Saa=aa.getText();
         Sab=ab.getText();
         Sac=ac.getText();
         Sad=ad.getText();
         Sae=ae.getText();
         Saf=af.getText();
         Sag=ag.getText();
         Sah=ah.getText();




                         }
                         else
                         {
                             rs.next();
                             JOptionPane.showMessageDialog(null,"no more previous records");
                         }
                        }
                        catch(Exception ex)
                        {

                        }
       }
       private void addOperation()
       {
           try

        {



           String db= "jdbc:ucanaccess://C:\\db\\siemens1.accdb";
           Connection con = DriverManager.getConnection(db);



            String sql = "INSERT INTO st1 (sno,Project,Station_name,TYPE_OF_BOARD,RDSO_Slno,"
                    + "Module_No,VLC6_DB,NCD_or_AB,Problem_at_site,Hologram,Observation_or_Problem_at_Office"
                    + ",Cause_of_Issue,Action_Taken,Received_NRGP_or_SRM_No_and_Date,Received_Month,"
                    + "TYPE,Status,Location,Remarks,SRN_No_and_Date,Warranty,"
                    + "Despatch_Date,month_n,TYPE_OF_BOARD1,RDSO_NO,Station_Name1,module_no1,DB_or_VLC6,"
                    + "AB_or_NCDM,SRN_No,SRN_Date,Replacement,REMARKS1,status1) " +

                    "Values ('"+SNO.getText()+"'," +

                     "'"+a.getText()+"',"+
                     "'"+b.getText()+"',"+
                     "'"+c.getText()+"',"+
                     "'"+d.getText()+"',"+
                     "'"+e.getText()+"',"+
                     "'"+f.getText()+"',"+
                     "'"+g.getText()+"',"+
                     "'"+h.getText()+"',"+
                     "'"+i.getText()+"',"+
                     "'"+j.getText()+"',"+
                     "'"+k.getText()+"',"+
                     "'"+l.getText()+"',"+
                     "'"+m.getText()+"',"+
                     "'"+n.getText()+"',"+
                     "'"+o.getText()+"',"+
                     "'"+pf.getText()+"',"+
                     "'"+q.getText()+"',"+
                     "'"+r.getText()+"',"+
                     "'"+s.getText()+"',"+
                     "'"+t.getText()+"',"+
                     "'"+v.getText()+"',"+
                     "'"+w.getText()+"',"+
                     "'"+x.getText()+"',"+
                     "'"+y.getText()+"',"+
                     "'"+z.getText()+"',"+
                     "'"+aa.getText()+"',"+
                     "'"+ab.getText()+"',"+
                     "'"+ac.getText()+"',"+
                     "'"+ad.getText()+"',"+
                     "'"+ae.getText()+"',"+
                     "'"+af.getText()+"',"+
                     "'"+ag.getText()+"',"+
                    "'"+ah.getText()+"')";



            Statement st = con.createStatement();

            st.executeUpdate(sql);



            JOptionPane.showMessageDialog(null, "Record Added Succesfully.","Record Added",

                        JOptionPane.INFORMATION_MESSAGE);

            connect();

        }catch(Exception e)

        {

            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",

                        JOptionPane.ERROR_MESSAGE);

        }

       }
       private void updateOperation()
       {
            try

        {

            String db= "jdbc:ucanaccess://C:\\db\\siemens1.accdb";
            Connection con = DriverManager.getConnection(db);



            String sql = "Update st1 " +

                         "SET sno = '"+SNO.getText()+"'," +

                            "Project = '"+a.getText()+"'," +

                           "Station_name = '"+b.getText()+"',"+

                   "TYPE_OF_BOARD = '"+c.getText()+"'," +
                    "RDSO_Slno = '"+d.getText()+"'," +
                    "Module_No = '"+e.getText()+"'," +
                 "VLC6_DB = '"+f.getText()+"'," +
                    "NCD_or_AB = '"+g.getText()+"'," +
                    "Problem_at_site = '"+h.getText()+"'," +
                    "Hologram = '"+i.getText()+"'," +
                    "Observation_or_Problem_at_Office = '"+j.getText()+"'," +
                    "Cause_of_Issue = '"+k.getText()+"'," +
                    "Action_Taken = '"+l.getText()+"'," +
                    "Received_NRGP_or_SRM_No_and_Date = '"+m.getText()+"'," +
                    "Received_Month = '"+n.getText()+"'," +
                    "TYPE = '"+o.getText()+"'," +
                    "Status = '"+pf.getText()+"'," +
                    "Location = '"+q.getText()+"'," +
                    "Remarks = '"+r.getText()+"'," +
                    "SRN_No_and_Date = '"+s.getText()+"'," +
                    "Warranty = '"+t.getText()+"'," +


                    "Despatch_Date= '"+v.getText()+"'," +
                    "month_n = '"+w.getText()+"'," +
                    "TYPE_OF_BOARD1 = '"+x.getText()+"'," +
                    "RDSO_NO = '"+y.getText()+"'," +
                    "Station_Name1 = '"+z.getText()+"'," +
                    "module_no1 = '"+aa.getText()+"'," +
                    "DB_or_VLC6 = '"+ab.getText()+"'," +
                    "AB_or_NCDM = '"+ac.getText()+"'," +
                   "SRN_No = '"+ad.getText()+"'," +
                    "SRN_Date = '"+ae.getText()+"'," +
                    "Replacement = '"+af.getText()+"'," +
                    "REMARKS1 = '"+ag.getText()+"'," +
                    "status1 = '"+ah.getText()+"'" +


                    " where sno='"+SSNO+"' and Station_name='"+Sb+"' and RDSO_Slno='"+Sd+
                    "' and Received_NRGP_or_SRM_No_and_Date='"+Sm+"'" ;





        /*    JOptionPane.showMessageDialog(null, sql,"Record Updated",

                        JOptionPane.INFORMATION_MESSAGE);*/

            Statement st = con.createStatement();

            st.executeUpdate(sql);



            JOptionPane.showMessageDialog(null, "Record Update Succesfully.Please click CLEAR SEARCH and then CONTINUE",

                        "Record Updated",JOptionPane.INFORMATION_MESSAGE);


            connect();


        }catch(Exception e)

        {

            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",

                        JOptionPane.ERROR_MESSAGE);

        }
       }
       private void deleteOperation()
       {
            int ans = JOptionPane.showConfirmDialog(null,

                "Are you sure to delete the Record ?", "Delete Record",

                           JOptionPane.YES_NO_OPTION);

        if(ans == JOptionPane.YES_OPTION)

        {

            try{



               String db= "jdbc:ucanaccess://C:\\db\\siemens1.accdb";
            Connection con = DriverManager.getConnection(db);



            String sql = "Delete FROM st1 where sno = '"+SNO.getText()+
                    "' and RDSO_Slno='"+d.getText()+"' and Station_name='"+b.getText()+"'";



            Statement st = con.createStatement();

            st.executeUpdate(sql);

              connect();
            }catch(Exception e)

            {

                JOptionPane.showMessageDialog(null, e.getMessage(),"Error",

                                JOptionPane.ERROR_MESSAGE);

            }

            JOptionPane.showMessageDialog(null, "Record Deleted","Success",

                        JOptionPane.INFORMATION_MESSAGE);

        }

        else

        {

            JOptionPane.showMessageDialog(null, "Operation Canceled","Cancel",

                        JOptionPane.INFORMATION_MESSAGE);

        }
       }
       private void newoperation()
       {
           connect();
           SNO.setText("");
           a.setText("");
           b.setText("");
           c.setText("");
           d.setText("");
           e.setText("");
           f.setText("");
           g.setText("");
            h.setText("");
           i.setText("");
           j.setText("");
           k.setText("");
           l.setText("");
           m.setText("");
           n.setText("");
            o.setText("");
          pf.setText("");
           q.setText("");
           r.setText("");
           s.setText("");
           t.setText("");
           v.setText("");
            w.setText("");
           x.setText("");
           y.setText("");
           z.setText("");
           aa.setText("");
           ab.setText("");
           ac.setText("");
            ad.setText("");
           ae.setText("");
           af.setText("");
           ag.setText("");
           ah.setText("");


       }
       private void searchoperation()
       {
            try
          {

              String db= "jdbc:ucanaccess://C:\\db\\siemens1.accdb";
           Connection con = DriverManager.getConnection(db);

            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);

            String sql = "Select * from st1 " +

                         " where sno='"+SNO.getText()+"' or "+


                    "Project = '"+a.getText()+"' or " +

                      "Station_name = '"+b.getText()+"' or "+

                   "TYPE_OF_BOARD = '"+c.getText()+"' or " +
                    "RDSO_Slno = '"+d.getText()+"' or " +
                    "Module_No = '"+e.getText()+"' or " +
                 "VLC6_DB = '"+f.getText()+"' or " +
                    "NCD_or_AB = '"+g.getText()+"' or " +

                    "Hologram = '"+i.getText()+"' or " +



                    "Received_NRGP_or_SRM_No_and_Date = '"+m.getText()+"' or " +
                    "Received_Month = '"+n.getText()+"' or " +
                    "TYPE = '"+o.getText()+"' or " +
                    "Status = '"+pf.getText()+"' or " +
                    "Location = '"+q.getText()+"' or " +



                    "Despatch_Date= '"+v.getText()+"' or " +
                    "month_n = '"+w.getText()+"' or " +
                    "TYPE_OF_BOARD1 = '"+x.getText()+"' or " +
                    "RDSO_NO = '"+y.getText()+"' or " +
                    "Station_Name1 = '"+z.getText()+"' or " +

                   "SRN_No = '"+ad.getText()+"' or " +
                    "SRN_Date = '"+ae.getText()+"'";



           // JOptionPane.showMessageDialog(null,"good");


            rs= st.executeQuery(sql);
           if(rs.next())
           {
                    SNO.setText(rs.getString("sno"));
         a.setText(rs.getString("Project"));
         b.setText(rs.getString("Station_name"));
         c.setText(rs.getString("TYPE_OF_BOARD"));
         d.setText(rs.getString("RDSO_Slno"));
         e.setText(rs.getString("Module_No"));
         f.setText(rs.getString("VLC6_DB"));
         g.setText(rs.getString("NCD_or_AB"));
         h.setText(rs.getString("Problem_at_site"));
         i.setText(rs.getString("Hologram"));
         j.setText(rs.getString("Observation_or_Problem_at_Office"));
         k.setText(rs.getString("Cause_of_Issue"));
         l.setText(rs.getString("Action_Taken"));
         m.setText(rs.getString("Received_NRGP_or_SRM_No_and_Date"));
         n.setText(rs.getString("Received_Month"));
         o.setText(rs.getString("TYPE"));
        pf.setText(rs.getString("Status"));
         q.setText(rs.getString("Location"));
         r.setText(rs.getString("Remarks"));
         s.setText(rs.getString("SRN_No_and_Date"));
         t.setText(rs.getString("Warranty"));



         v.setText(rs.getString("Despatch_Date"));
         w.setText(rs.getString("month_n"));
         x.setText(rs.getString("TYPE_OF_BOARD1"));
         y.setText(rs.getString("RDSO_NO"));
         z.setText(rs.getString("Station_Name1"));
        aa.setText(rs.getString("module_no1"));
        ab.setText(rs.getString("DB_or_VLC6"));
        ac.setText(rs.getString("AB_or_NCDM"));
        ad.setText(rs.getString("SRN_No"));
        ae.setText(rs.getString("SRN_Date"));
        af.setText(rs.getString("Replacement"));
        ag.setText(rs.getString("REMARKS1"));
        ah.setText(rs.getString("status1"));

        SSNO=SNO.getText();
         Sa=a.getText();
         Sb=b.getText();
         Sc=c.getText();
         Sd=d.getText();
         Se=e.getText();
         Sf=f.getText();
         Sg=g.getText();
         Sh=h.getText();
         Si=i.getText();
         Sj=j.getText();
         Sk=k.getText();
         Sl=l.getText();
         Sm=m.getText();
         Sn=n.getText();
         So=o.getText();
         Spf=pf.getText();
         Sq=q.getText();
         Sr=r.getText();
         Ss=s.getText();
         St=t.getText();
         Sv=v.getText();
         Sw=w.getText();
         Sx=x.getText();
         Sy=y.getText();
         Sz=z.getText();
         Saa=aa.getText();
         Sab=ab.getText();
         Sac=ac.getText();
         Sad=ad.getText();
         Sae=ae.getText();
         Saf=af.getText();
         Sag=ag.getText();
         Sah=ah.getText();

           }
                      //connect();

          }

          catch(Exception e)
          {

          }

       }
       private void clearsearchoperation()
       {
           connect();
           newoperation();
       }


    public static void main(String [] args)
    {
        new Main();
    }



}

