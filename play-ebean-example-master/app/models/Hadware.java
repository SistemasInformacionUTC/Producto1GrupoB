package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;



/**
 * Company entity managed by Ebean
 */
@Entity 
public class Hadware extends com.avaje.ebean.Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    /**
     * Generic query helper for entity Company with id Long
     */
    public static Find<Long,Hadware> find = new Find<Long,Hadware>(){};

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Hadware c: Hadware.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }

}

