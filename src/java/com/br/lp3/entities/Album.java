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
@Table(name = "ALBUM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Album.findAll", query = "SELECT a FROM Album a"),
    @NamedQuery(name = "Album.findByIdAlbum", query = "SELECT a FROM Album a WHERE a.idAlbum = :idAlbum"),
    @NamedQuery(name = "Album.findByTituloAlbum", query = "SELECT a FROM Album a WHERE a.tituloAlbum = :tituloAlbum"),
    @NamedQuery(name = "Album.findByIdAlbumLastfm", query = "SELECT a FROM Album a WHERE a.idAlbumLastfm = :idAlbumLastfm")})
public class Album implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ALBUM")
    private Integer idAlbum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TITULO_ALBUM")
    private String tituloAlbum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ALBUM_LASTFM")
    private int idAlbumLastfm;
    @OneToMany(mappedBy = "idAlbum")
    private List<Relacao> relacaoList;

    public Album() {
    }

    public Album(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }

    public Album(Integer idAlbum, String tituloAlbum, int idAlbumLastfm) {
        this.idAlbum = idAlbum;
        this.tituloAlbum = tituloAlbum;
        this.idAlbumLastfm = idAlbumLastfm;
    }

    public Integer getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public int getIdAlbumLastfm() {
        return idAlbumLastfm;
    }

    public void setIdAlbumLastfm(int idAlbumLastfm) {
        this.idAlbumLastfm = idAlbumLastfm;
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
        hash += (idAlbum != null ? idAlbum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.idAlbum == null && other.idAlbum != null) || (this.idAlbum != null && !this.idAlbum.equals(other.idAlbum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.lp3.entities.Album[ idAlbum=" + idAlbum + " ]";
    }
    
}
