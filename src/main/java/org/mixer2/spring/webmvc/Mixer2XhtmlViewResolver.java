package org.mixer2.spring.webmvc;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mixer2.Mixer2Engine;
import org.springframework.beans.BeanUtils;
import org.springframework.core.io.Resource;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * View Resolver for SpringMVC . <br>
 * your should add dependency for your application .
 * 
 * <pre>
 * {@code
 * <dependency>
 *     <groupId>org.springframework</groupId>
 *     <artifactId>spring-webmvc</artifactId>
 *     <version>3.1.2.RELEASE (or higher)</version>
 * </dependency>
 * }
 * </pre>
 * 
 * <b>Spring MVC configuration Sample</b><br>
 * 
 * <pre>
 * {@code
 * <bean id="mixer2Engine" class="org.mixer2.Mixer2Engine" scope="singleton" />
 * <bean class="org.mixer2.spring.webmvc.Mixer2XhtmlViewResolver">
 *     <property name="order" value="1" />
 *     <property name="prefix" value="classpath:m2mockup/m2template/" />
 *     <!-- Also, you can use file system path like "file:/var/foo/"  -->
 *     <property name="suffix" value=".html" />
 *     <property name="basePackage" value="com.example.yourproject.web.view" />
 *     <property name="mixer2Engine" ref="mixer2Engine" />
 *     
 *     <!-- Default value is true that means this resolver returns null -->
 *     <!-- if template file not found and continue to resolve view name -->
 *     <!-- by another subsequent view resolver. -->
 *     <!-- Set "false" if you expect FileNotFoundException for unknown view name -->
 *     <property name="returnNullIfTemplateFileNotFound" value="true" />
 *     
 *     <!-- If this resolver can not find the view class, -->
 *     <!-- returns html template "as is" with defaultView. -->
 *     <!-- But if use this property, raise ClassNotFoundException .  -->
 *     <!-- Default value is false. -->
 *     <property name="raiseErrorIfViewClassNotFound" value="true" />
 * </bean>
 * }
 * </pre>
 * 
 * <p>
 * Using this ViewResolver, Your controller method can returns <strong>template
 * html file path and name without file extension</strong>.<br>
 * See sample below.
 * </p>
 * 
 * <pre>
 * <code>
 * {@literal @}Controller
 * public class HelloWorldController {
 * 
 *    {@literal @}Autowired
 *    protected helloMessageService helloMessageService;
 * 
 *    {@literal @}RequestMapping(value = "/hello", method = RequestMethod.GET)
 *    public String showHello(Model model) {
 *        String helloMessage = helloMessageService.getMessage();
 *        model.addAttribute("helloMessage", helloMessage);
 *        return "foo/bar/helloWorld"; 
 *    }
 * }
 * </code>
 * </pre>
 * 
 * <p>
 * In this case, "foo/bar/helloWorld" will be attached to
 * "com.example.yourproject.web.view.foo.bar.HelloWorldView" class .
 * </p>
 * 
 * <p>
 * AbstractMixer2XhtmlView which is the base class of HelloWorldView loads the
 * file "m2mockup/m2template/foo/bar/helloWorld.html" as a html template and
 * convert it to the instance of org.mixer2.jaxb.xhtml.Html . You can change the
 * html object in HelloWorldView class.
 * </p>
 * 
 * <p>
 * The template file is "prefix" + viewName + "suffix" . See "prefix" and
 * "suffix" property of Mixer2XhtmlViewResolver bean configuration sample above.
 * </p>
 * 
 * <p>
 * If there were no "com.example.yourproject.web.view.foo.bar.HelloWorldView"
 * class in classpath,default view will be created automatically that load the
 * template file. You can not change the the html object. That means the view
 * resolver returns html on template file as is.
 * </p>
 * 
 * @see <a href="http://mixer2.org/site/springmvcsample.html">spring mvc sample</a>
 * @see <a href="http://github.com/nabedge/mixer2-sample/tree/master/mixer2-fruitshop-springboot">spring mvc sample code</a>
 * @author kazuki43zoo
 * @author nabedge
 */
public class Mixer2XhtmlViewResolver extends UrlBasedViewResolver {

    private static final String PATH_SEPARATOR = "/";

    private static final String PACKAGE_SEPARATOR = ".";

    private static final Pattern PATH_SEPARATOR_PATTERN = Pattern
            .compile(PATH_SEPARATOR);

    private static Log log = LogFactory.getLog(Mixer2XhtmlViewResolver.class);

    private Mixer2Engine mixer2Engine;

    private String basePackage = "";

    private String classNameSuffix = "View";

    private String docType;

    private boolean returnNullIfTemplateFileNotFound = true;

    private boolean raiseErrorIfViewClassNotFound = false;

    public Mixer2XhtmlViewResolver() {
        setViewClass(AbstractMixer2XhtmlView.class);
    }

    public void setMixer2Engine(Mixer2Engine mixer2Engine) {
        this.mixer2Engine = mixer2Engine;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public void setClassNameSuffix(String classNameSuffix) {
        this.classNameSuffix = classNameSuffix;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public boolean isReturnNullIfTemplateFileNotFound() {
        return returnNullIfTemplateFileNotFound;
    }

    public void setReturnNullIfTemplateFileNotFound(
            boolean returnNullIfTemplateFileNotFound) {
        this.returnNullIfTemplateFileNotFound = returnNullIfTemplateFileNotFound;
    }

    public boolean isRaiseErrorIfViewClassNotFound() {
        return raiseErrorIfViewClassNotFound;
    }

    public void setRaiseErrorIfViewClassNotFound(
            boolean raiseErrorIfViewClassNotFound) {
        this.raiseErrorIfViewClassNotFound = raiseErrorIfViewClassNotFound;
    }

    @Override
    protected boolean canHandle(String viewName, Locale locale) {
        if (isReturnNullIfTemplateFileNotFound()) {
            String url = createUrl(viewName);
            if (log.isDebugEnabled()) {
                log.debug("template url: " + url);
            }
            Resource resource = getApplicationContext().getResource(url);
            return resource.exists();
        } else {
            return true;
        }
    }

    protected AbstractUrlBasedView buildView(String viewName) throws Exception {

        // create view object.
        AbstractMixer2XhtmlView view = null;
        String fqcnOfView = (StringUtils.hasLength(basePackage) ? basePackage
                + PACKAGE_SEPARATOR : "")
                + toViewClassNamePrefix(viewName)
                + (StringUtils.hasLength(classNameSuffix) ? classNameSuffix
                        : "");
        try {
            Class<?> viewClass = ClassUtils.forName(fqcnOfView,
                    ClassUtils.getDefaultClassLoader());
            view = BeanUtils.instantiateClass(viewClass,
                    AbstractMixer2XhtmlView.class);
            getApplicationContext().getAutowireCapableBeanFactory()
                    .autowireBean(view);
        } catch (ClassNotFoundException e) {
            if (isRaiseErrorIfViewClassNotFound()) {
                throw e;
            } else {
                view = createDefaultView();
                log.debug("Applied default view. viewName is '" + viewName
                        + "'. fqcnOfView is '" + fqcnOfView + "'.");
            }
        }

        // inject properties of AbstractMixer2XhtmlView.
        view.setMixer2Engine(mixer2Engine);
        view.setResourceLoader(getApplicationContext());
        if (docType != null) {
            view.setDocType(docType);
        }
        // inject properties of parent class.
        view.setUrl(createUrl(viewName));
        String contentType = getContentType();
        if (contentType != null) {
            view.setContentType(contentType);
        }
        view.setRequestContextAttribute(getRequestContextAttribute());
        view.setAttributesMap(getAttributesMap());
        return view;
    }

    protected String createUrl(String viewName) {
        return getPrefix() + viewName + getSuffix();
    }

    protected String toViewClassNamePrefix(String viewName) {
        if (viewName.contains(PATH_SEPARATOR)) {
            int lastIndexOfPathSeparator = viewName.lastIndexOf(PATH_SEPARATOR);
            Matcher pathSeparatorMatcher = PATH_SEPARATOR_PATTERN
                    .matcher(viewName.substring(0, lastIndexOfPathSeparator));
            String packageName = pathSeparatorMatcher
                    .replaceAll(PACKAGE_SEPARATOR);
            String lastElement = viewName
                    .substring(lastIndexOfPathSeparator + 1);
            return packageName + PACKAGE_SEPARATOR
                    + StringUtils.capitalize(lastElement);
        } else {
            return StringUtils.capitalize(viewName);
        }
    }

    protected AbstractMixer2XhtmlView createDefaultView() {
        return AbstractMixer2XhtmlView.createDefaultView();
    }

}
