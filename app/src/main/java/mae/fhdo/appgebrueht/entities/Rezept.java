package mae.fhdo.appgebrueht.entities;

import mae.fhdo.appgebrueht.entities.interfaces.IRezept;

/**
 * Created by Marvin Jakob.
 */

public class Rezept implements IRezept{

    private int _id;
    private String titel;
    private int likes; // Gesamtanzahl der Likes
    private String beschreibung;
    private int foto;

    public Rezept(String titel)
    {
        this.titel = titel;
        this.likes = 0;
        this.beschreibung = "Neues Rezept";
    }

    public Rezept(String titel, String beschreibung)
    {
        this.titel = titel;
        this.likes = 0;
        this.beschreibung = beschreibung;
    }

    public Rezept(String titel, String beschreibung , int foto)
    {
        this.titel = titel;
        this.likes = 0;
        this.beschreibung = beschreibung;
        this.foto = foto;
    }

    public int getId() {
        return _id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
