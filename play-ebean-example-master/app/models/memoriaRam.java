
import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model.Find;

import play.db.ebean.*;
import play.data.validation.*;



/**
 * Company entity managed by Ebean
 */
@Entity 

public class memoriaRam extends com.avaje.ebean.Model {

	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    /**
     * Generic query helper for entity memoriaRam with id Long
     */
    public static Find<Long,memoriaRam> find = new Find<Long,memoriaRam>(){};

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(memoriaRam c: memoriaRam.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }

}


	
