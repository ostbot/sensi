package de.ostbot.sensi.control;

import de.ostbot.sensi.model.Pflanze;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datenbankoperationen {

    public Datenbankoperationen() {
    }

    public void pflanzeMitTopfInDatenbankAnlegen(Pflanze pflanzeObject) {

        String sqlStringPflanze;
        String sqlStringTopf;
        Connection connectionObject = null;
        PreparedStatement statementPflanze = null;
        PreparedStatement statementTopf = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connectionObject = DriverManager.getConnection("jdbc:mysql://localhost/sensi", "root", "");
            connectionObject.setAutoCommit(false);

            sqlStringPflanze = "INSERT INTO pflanzen (sorte, herkunftsland indica, sativa) VALUES (?, ?, ?, ?)";
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

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
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
}