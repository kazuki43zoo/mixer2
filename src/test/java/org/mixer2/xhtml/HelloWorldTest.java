package org.mixer2.xhtml;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang.SystemUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mixer2.Mixer2Engine;
import org.mixer2.jaxb.xhtml.Html;
import org.mixer2.jaxb.xhtml.P;
import org.mixer2.jaxb.xhtml.Span;

//@Ignore("for sample")
public class HelloWorldTest {

    private String templateFileName = "HelloWorld_html5.html";
    private String templateFilePath;
    private static Mixer2Engine m2e = Mixer2EngineSingleton.getInstance();

    @Before
    public void init() throws IOException {
        templateFilePath = getClass().getResource(templateFileName).toString();
        if (SystemUtils.IS_OS_WINDOWS) {
            templateFilePath = templateFilePath.replaceFirst("file:/", "");
        } else {
            templateFilePath = templateFilePath.replaceFirst("file:", "");
        }
    }

    @Test
    public void test() throws Exception {
        File file = new File(templateFilePath);
        //System.out.println(FileUtils.readFileToString(file));
        Html html = m2e.loadHtmlTemplate(file);
        P p = html.getById("hellomsg", P.class);
        p.unsetContent();
        p.getContent().add("Hello World!");
        String result = m2e.saveToString(html);
//        System.out.println(result);
        Span span = TagCreator.span();
        span.getContent().add(p);
        html.getHead().getContent().add(span);
        System.out.println(m2e.saveToString(html));
//        String cloneResult = m2e.saveToString((AbstractJaxb)html.clone());
//        System.out.println(cloneResult);
        Assert.assertTrue(result
                .contains("<p id=\"hellomsg\">Hello World!</p>"));
    }
}
