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
public class Article {
    private int id_Article;
    private int id_Prest;
    private String nom;
    private boolean etat;
    private int evaluation;

    public Article() {
    }

    public Article(int id_Article, int id_Prest, String nom, boolean etat, int evaluation) {
        this.id_Article = id_Article;
        this.id_Prest = id_Prest;
        this.nom = nom;
        this.etat = etat;
        this.evaluation = evaluation;
    }

    public int getId_Article() {
        return id_Article;
    }

    public int getId_Prest() {
        return id_Prest;
    }

    public String getNom() {
        return nom;
    }

    public boolean isEtat() {
        return etat;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setId_Article(int id_Article) {
        this.id_Article = id_Article;
    }

    public void setId_Prest(int id_Prest) {
        this.id_Prest = id_Prest;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "Article{" + "id_Article=" + id_Article + ", id_Prest=" + id_Prest + ", nom=" + nom + ", etat=" + etat + ", evaluation=" + evaluation + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (this.id_Article != other.id_Article) {
            return false;
        }
        if (this.id_Prest != other.id_Prest) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (this.etat != other.etat) {
            return false;
        }
        if (this.evaluation != other.evaluation) {
            return false;
        }
        return true;
    }
    
    
}
