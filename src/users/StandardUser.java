package users;

import devices.*;

public class StandardUser extends BasicUser{

    public void watchHd(Device device, String movie){
        System.out.println("User " + email + " watches " + movie " in HD.");
    }
}
