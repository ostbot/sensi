package de.ostbot.sensi.control;

import de.ostbot.sensi.model.PflanzeMitTopf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datenbankoperationen {
    
    Connection connectionObject;

    public Datenbankoperationen() {
           
    }
    
    private void verbindenZurDB() {
        
        this.connectionObject = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connectionObject = DriverManager.getConnection("jdbc:mysql://localhost/sensi", "root", "");
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void pflanzeMitTopfInDatenbankAnlegen(PflanzeMitTopf pflanzeObject) {

        String sqlStringPflanze;
        String sqlStringTopf;
        PreparedStatement statementPflanze = null;
        PreparedStatement statementTopf = null;
        
        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringPflanze = "INSERT INTO pflanzen (sorte, herkunftsland, indica, sativa) VALUES (?, ?, ?, ?)";
            sqlStringTopf = "INSERT INTO medien (topfgroesse, substrat) VALUES (?, ?)";
            statementPflanze = connectionObject.prepareStatement(sqlStringPflanze);
            statementTopf = connectionObject.prepareCall(sqlStringTopf);

            statementPflanze.setString(1, pflanzeObject.getSorte());
            statementPflanze.setString(2, pflanzeObject.getHerkunftsland());
            statementPflanze.setInt(3, pflanzeObject.getIndica());
            statementPflanze.setInt(4, pflanzeObject.getSativa());
            /**/
            statementTopf.setDouble(1, pflanzeObject.getTopfgroesse());
            statementTopf.setString(2, pflanzeObject.getSubstrat());

            statementPflanze.executeUpdate();
            statementTopf.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statementPflanze.close();
                statementTopf.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public List<String> getHerkunftslaender() {
        
        String sqlStringLaender, land;
        PreparedStatement statement = null;
        ResultSet resultset = null;
        List laenderliste = new ArrayList();
        
        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            
            sqlStringLaender = "SELECT * FROM herkunftslaender";
            statement = connectionObject.prepareStatement(sqlStringLaender);
            
            resultset = statement.executeQuery();
            connectionObject.commit();
            
            while(resultset.next()) {
                land = resultset.getString("herkunftsland");
                laenderliste.add(land);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            
            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return laenderliste;
    }
}