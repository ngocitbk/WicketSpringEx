package vn.framgia;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import vn.framgia.user.HelloPage;

public class WicketApplication extends WebApplication {

    @Override
    public Class<HelloPage> getHomePage() {

        // return default page
        return HelloPage.class;
    }

    @Override
    protected void init() {

        super.init();
        addComponentInstantiationListener(new SpringComponentInjector(this));
    }
}
