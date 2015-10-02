/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 31506976
 */
@Entity
@Table(name = "MUSICA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musica.findAll", query = "SELECT m FROM Musica m"),
    @NamedQuery(name = "Musica.findByIdMusica", query = "SELECT m FROM Musica m WHERE m.idMusica = :idMusica"),
    @NamedQuery(name = "Musica.findByTituloMusica", query = "SELECT m FROM Musica m WHERE m.tituloMusica = :tituloMusica"),
    @NamedQuery(name = "Musica.findByIdMusicaLastfm", query = "SELECT m FROM Musica m WHERE m.idMusicaLastfm = :idMusicaLastfm")})
public class Musica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MUSICA")
    private Integer idMusica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TITULO_MUSICA")
    private String tituloMusica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MUSICA_LASTFM")
    private int idMusicaLastfm;
    @OneToMany(mappedBy = "idMusica")
    private List<Relacao> relacaoList;

    public Musica() {
    }

    public Musica(Integer idMusica) {
        this.idMusica = idMusica;
    }

    public Musica(Integer idMusica, String tituloMusica, int idMusicaLastfm) {
        this.idMusica = idMusica;
        this.tituloMusica = tituloMusica;
        this.idMusicaLastfm = idMusicaLastfm;
    }

    public Integer getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Integer idMusica) {
        this.idMusica = idMusica;
    }

    public String getTituloMusica() {
        return tituloMusica;
    }

    public void setTituloMusica(String tituloMusica) {
        this.tituloMusica = tituloMusica;
    }

    public int getIdMusicaLastfm() {
        return idMusicaLastfm;
    }

    public void setIdMusicaLastfm(int idMusicaLastfm) {
        this.idMusicaLastfm = idMusicaLastfm;
    }

    @XmlTransient
    public List<Relacao> getRelacaoList() {
        return relacaoList;
    }

    public void setRelacaoList(List<Relacao> relacaoList) {
        this.relacaoList = relacaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMusica != null ? idMusica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musica)) {
            return false;
        }
        Musica other = (Musica) object;
        if ((this.idMusica == null && other.idMusica != null) || (this.idMusica != null && !this.idMusica.equals(other.idMusica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.lp3.entities.Musica[ idMusica=" + idMusica + " ]";
    }
    
}
