/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Abonnement {
    private  int id_Abonnement;
    private int id_Prest;
    private int duree;
    private Date date_Expiration;

    public Abonnement() {
    }

    public Abonnement(int id_Abonnement, int id_Prest, int duree, Date date_Expiration) {
        this.id_Abonnement = id_Abonnement;
        this.id_Prest = id_Prest;
        this.duree = duree;
        this.date_Expiration = date_Expiration;
    }

    public int getId_Abonnement() {
        return id_Abonnement;
    }

    public int getId_Prest() {
        return id_Prest;
    }

    public int getDuree() {
        return duree;
    }

    public Date getDate_Expiration() {
        return date_Expiration;
    }

    public void setId_Abonnement(int id_Abonnement) {
        this.id_Abonnement = id_Abonnement;
    }

    public void setId_Prest(int id_Prest) {
        this.id_Prest = id_Prest;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setDate_Expiration(Date date_Expiration) {
        this.date_Expiration = date_Expiration;
    }

    @Override
    public String toString() {
        return "Abonnement{" + "id_Abonnement=" + id_Abonnement + ", id_Prest=" + id_Prest + ", duree=" + duree + ", date_Expiration=" + date_Expiration + '}';
    }

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Abonnement other = (Abonnement) obj;
        if (this.id_Abonnement != other.id_Abonnement) {
            return false;
        }
        if (this.id_Prest != other.id_Prest) {
            return false;
        }
        if (this.duree != other.duree) {
            return false;
        }
        if (!Objects.equals(this.date_Expiration, other.date_Expiration)) {
            return false;
        }
        return true;
    }
    
    
}
