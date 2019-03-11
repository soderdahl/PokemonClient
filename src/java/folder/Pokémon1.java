
package folder;

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
 * @author Nutcha
 */
@Entity
@Table(name = "POKEMON1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pokemon1.findAll", query = "SELECT p FROM Pokemon1 p")
    , @NamedQuery(name = "Pokemon1.findById", query = "SELECT p FROM Pokemon1 p WHERE p.id = :id")
    , @NamedQuery(name = "Pokemon1.findByName", query = "SELECT p FROM Pokemon1 p WHERE p.name = :name")
    , @NamedQuery(name = "Pokemon1.findByBaseExperience", query = "SELECT p FROM Pokemon1 p WHERE p.baseExperience = :baseExperience")
    , @NamedQuery(name = "Pokemon1.findByHieght", query = "SELECT p FROM Pokemon1 p WHERE p.hieght = :hieght")
    , @NamedQuery(name = "Pokemon1.findByWeight", query = "SELECT p FROM Pokemon1 p WHERE p.weight = :weight")})

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokémon1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NAME")
    private String name;
    @Column(name = "BASE_EXPERIENCE")
    private Integer base_Experience;
    @Column(name = "HIEGHT")
    private Integer height;
    @Column(name = "WEIGHT")
    private Integer weight;

    public Pokémon1() {
    }

    public Pokémon1(Integer id) {
        this.id = id;
    }

    public Pokémon1(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Pokémon1(Integer id, String name, Integer base_Experience, Integer height, Integer weight) {
        this.id = id;
        this.name = name;
        this.base_Experience = base_Experience;
        this.height = height;
        this.weight = weight;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBase_Experience() {
        return base_Experience;
    }

    public void setBaseExperience(Integer base_Experience) {
        this.base_Experience = base_Experience;
    }

    public Integer getHieght() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pokémon1)) {
            return false;
        }
        Pokémon1 other = (Pokémon1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Pokemon" + "\nid: " + id + "\nname: " + name + "\nbase_experience: " + base_Experience
                + "\nheight: " + height + "\nweight: " + weight + "\n\n";
    }

    
}
