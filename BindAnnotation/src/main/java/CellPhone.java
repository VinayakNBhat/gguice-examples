import BindAnnotation.AircelBindAnnotation;
import BindAnnotation.AirtelBindAnnotation;
import BindAnnotation.BSNLBindAnnotation;
import base.SIM;

import javax.inject.Inject;

public class CellPhone {
    private SIM serviceProvider;

    @Inject
    public CellPhone(@BSNLBindAnnotation SIM serviceProvider){
        this.serviceProvider = serviceProvider;
    }

    /*

    * Any of the below constructors can be used for dependency injection

    @Inject
    public CellPhone(@AirtelBindAnnotation SIM serviceProvider){
        this.serviceProvider = serviceProvider;
    }

    @Inject
    public CellPhone(@AircelBindAnnotation SIM serviceProvider){
        this.serviceProvider = serviceProvider;
    }

     */

    public void call(){
        this.serviceProvider.call();
    }

    public void sms(){
        this.serviceProvider.sms();
    }
}

