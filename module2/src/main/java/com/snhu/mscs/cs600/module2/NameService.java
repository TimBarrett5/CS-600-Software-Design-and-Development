package com.snhu.mscs.cs600.module2;

import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service interfaces between repo and rest of the program
 * Created by Tim Barrett
**/

@Service
public class NameService {
    private final NameRepo nameRepo;

    /**@param nameRepo holds repo for names table */

    public NameService(NameRepo nameRepo){
        this.nameRepo = nameRepo;
    }

    /**@return list of all Name records */

    public List<Name> findNames(){
        return nameRepo.findNames();
    }

    /**@param last holds last name to search for
     * @return list of matching records
     */
    
    public List<Name> findByLast(String last) {
        return nameRepo.findByLast(last);
    }
}
