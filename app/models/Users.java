package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by garming on 2016/10/18.
 */
@Entity
public class Users extends Model {
    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String name;

    public static Finder<Long, Users> find = new Finder<Long,Users>(Users.class);
}
