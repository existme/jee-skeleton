package com.existme.testee;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Reza on 2/4/2016.
 */
@RunWith(Arquillian.class)
public class CityResourceTest {

    @org.jboss.arquillian.container.test.api.Deployment
    public static org.jboss.shrinkwrap.api.spec.JavaArchive createDeployment() {
        return org.jboss.shrinkwrap.api.ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.JavaArchive.class)
                .addAsManifestResource(org.jboss.shrinkwrap.api.asset.EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void testListCities() throws Exception {

    }
}