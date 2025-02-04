import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "personTable")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPerson;

    @Column(name = "name")
    private String name;
    
    @Column(name = "sex")
    private String sex;
    
    @Column(name = "jobTitle")
    private String jobTitle;
    
    
    public Person() {
    }

    public Person(String name, String sex, String jobTitle) {
        this.name = name;
        this.sex = sex;
        this.jobTitle = jobTitle;
    }



    //region Getters an Setters
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getJobTitle() {
        return jobTitle;
    }


    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    //endregion
    

    
}
