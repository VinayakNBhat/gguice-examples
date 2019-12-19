import com.google.inject.Guice;
import com.google.inject.Injector;
import module.CellPhoneModule;

public class CellPhoneApp {
    public static void main(String[] args){
        Injector injector = Guice.createInjector(new CellPhoneModule());
        CellPhone cellPhone = injector.getInstance(CellPhone.class);

        cellPhone.call();
        cellPhone.sms();
    }
}
