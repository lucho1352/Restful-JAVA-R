/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luisao
 */
@Entity
@Table(name = "CLIENTEDB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientedb.findAll", query = "SELECT c FROM Clientedb c")
    , @NamedQuery(name = "Clientedb.findByTipoid", query = "SELECT c FROM Clientedb c WHERE c.tipoid = :tipoid")
    , @NamedQuery(name = "Clientedb.findByNroid", query = "SELECT c FROM Clientedb c WHERE c.nroid = :nroid")
    , @NamedQuery(name = "Clientedb.findByLastname", query = "SELECT c FROM Clientedb c WHERE c.lastname = :lastname")
    , @NamedQuery(name = "Clientedb.findByFirstname", query = "SELECT c FROM Clientedb c WHERE c.firstname = :firstname")})
public class Clientedb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 15)
    @Column(name = "TIPOID")
    private String tipoid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NROID")
    private Integer nroid;
    @Size(max = 15)
    @Column(name = "LASTNAME")
    private String lastname;
    @Size(max = 255)
    @Column(name = "FIRSTNAME")
    private String firstname;

    public Clientedb() {
    }

    public Clientedb(Integer nroid) {
        this.nroid = nroid;
    }

    public String getTipoid() {
        return tipoid;
    }

    public void setTipoid(String tipoid) {
        this.tipoid = tipoid;
    }

    public Integer getNroid() {
        return nroid;
    }

    public void setNroid(Integer nroid) {
        this.nroid = nroid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroid != null ? nroid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientedb)) {
            return false;
        }
        Clientedb other = (Clientedb) object;
        if ((this.nroid == null && other.nroid != null) || (this.nroid != null && !this.nroid.equals(other.nroid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConexionDB.Clientedb[ nroid=" + nroid + " ]";
    }
    
}
