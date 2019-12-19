package module;

import BindAnnotation.AircelBindAnnotation;
import BindAnnotation.AirtelBindAnnotation;
import BindAnnotation.BSNLBindAnnotation;
import base.SIM;
import com.google.inject.AbstractModule;
import service.Aircel;
import service.Airtel;
import service.BSNL;

public class CellPhoneModule extends AbstractModule {
    protected void configure() {
        bind(SIM.class).annotatedWith(BSNLBindAnnotation.class).to(BSNL.class);
        bind(SIM.class).annotatedWith(AirtelBindAnnotation.class).to(Airtel.class);
        bind(SIM.class).annotatedWith(AircelBindAnnotation.class).to(Aircel.class);
    }
}
