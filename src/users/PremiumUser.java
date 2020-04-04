package users;

import devices.*;

public class PremiumUser extends StandardUser{
    public void watchUltraHd(Device device, String movie){
        System.out.println("User " + email + " watches " + movie " in UltraHD.");
    }
}
