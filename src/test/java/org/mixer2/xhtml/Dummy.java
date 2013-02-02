package org.mixer2.xhtml;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.mixer2.jaxb.xhtml.Meta;

import static org.mixer2.xhtml.TagCreator.*;

@SuppressWarnings("unused")
public class Dummy {

    @AfterClass
    public static void afterClass() {
    }

    @Before
    public void init() throws IOException {
    }

    @Test
    public void test() throws Exception {
        Meta meta = new Meta();
        meta.setContent("foo");
        meta.setProperty("prop");
    }

}