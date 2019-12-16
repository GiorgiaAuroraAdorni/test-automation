package frequent;

import java.util.HashMap;

/**
 * This class holds a map from String to Integer and performs some arithmetic operation on the values,
 * after receiving the request of a particular key. It does not however check whether the key exists.
 *
 */

public class NaiveMenu {

    HashMap<String, Integer> menu;

    public NaiveMenu(){
        this.menu = new HashMap<>();
        menu.put("A", 1);
        menu.put("B", 2);
    }

    public int dispatchOptions(String option){
      int o = this.menu.get(option);
      return o+1;
    }
}
