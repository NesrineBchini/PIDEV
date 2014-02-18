/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author user
 */
public class Commentaire {
    private int id_Comm;
    private int id_Client;
    private int id_Prest;
    private String textDuComm;

    public Commentaire() {
    }

    public Commentaire(int id_Comm, int id_Client, int id_Prest, String textDuComm) {
        this.id_Comm = id_Comm;
        this.id_Client = id_Client;
        this.id_Prest = id_Prest;
        this.textDuComm = textDuComm;
    }

    public int getId_Comm() {
        return id_Comm;
    }

    public int getId_Client() {
        return id_Client;
    }

    public int getId_Prest() {
        return id_Prest;
    }

    public String getTextDuComm() {
        return textDuComm;
    }

    public void setId_Comm(int id_Comm) {
        this.id_Comm = id_Comm;
    }

    public void setId_Client(int id_Client) {
        this.id_Client = id_Client;
    }

    public void setId_Prest(int id_Prest) {
        this.id_Prest = id_Prest;
    }

    public void setTextDuComm(String textDuComm) {
        this.textDuComm = textDuComm;
    }
    
    
}
