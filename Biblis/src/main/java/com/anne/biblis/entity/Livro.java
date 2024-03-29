package com.anne.biblis.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author anne
 */
@Entity
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 60, nullable = false)
    private String titulo;
    
    @Column(length = 60, nullable = false)
    private String autor;
    
    @Column(length = 25)
    private String genero;
    
    @Column(length = 500)
    private String sinopse;
    
    @OneToOne(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "emprestimo_id")
    private Emprestimo emprestimo;

    // <editor-fold defaultstate="collapsed" desc="Getters/setters">
    public Emprestimo getEmprestimo(){
        return this.emprestimo;
    }
    
    public void setEmprestimo(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getSinopse(){
        return this.sinopse;
    }
    
    public void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    // </editor-fold>
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livro)) {
            return false;
        }
        Livro other = (Livro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.anne.biblis.entity.Livro[ id=" + id + " ]";
    }
    
}
