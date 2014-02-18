/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Administrateur {
    private int id_Admin;
    private String login;
    private String password;

    public Administrateur() {
    }

    public Administrateur(int id_Admin, String login, String password) {
        this.id_Admin = id_Admin;
        this.login = login;
        this.password = password;
    }

    public int getId_Admin() {
        return id_Admin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId_Admin(int id_Admin) {
        this.id_Admin = id_Admin;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "id_Admin=" + id_Admin + ", login=" + login + ", password=" + password + '}';
    }

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrateur other = (Administrateur) obj;
        if (this.id_Admin != other.id_Admin) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }
    
    
}
