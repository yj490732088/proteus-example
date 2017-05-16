package views;

import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;

import io.sinistral.example.models.*;

// import @ [2:1]
import java.util.List;

/*
 * Auto generated code to render template main/java/views/Fortunes.rocker.html
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
public class Fortunes extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.HTML;
    static public final String TEMPLATE_NAME = "Fortunes.rocker.html";
    static public final String TEMPLATE_PACKAGE_NAME = "views";
    static public final String HEADER_HASH = "331039920";
    static public final long MODIFIED_AT = 1493423796000L;
    static public final String[] ARGUMENT_NAMES = { "items" };

    // argument @ [3:2]
    private List<Fortune> items;

    public Fortunes items(List<Fortune> items) {
        this.items = items;
        return this;
    }

    public List<Fortune> items() {
        return this.items;
    }

    static public Fortunes template(List<Fortune> items) {
        return new Fortunes()
            .items(items);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // <!DOCTYPE html>\n<html>\n<head><title>Fortunes</title></head>\n<body><table>\n<tr><th>id</th><th>message</th></tr>\n
        static private final byte[] PLAIN_TEXT_0_0;
        // \t<tr><td>
        static private final byte[] PLAIN_TEXT_1_0;
        // </td><td>
        static private final byte[] PLAIN_TEXT_2_0;
        // </td></tr>\n
        static private final byte[] PLAIN_TEXT_3_0;
        // </table></body>\n</html>
        static private final byte[] PLAIN_TEXT_4_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(Fortunes.class.getClassLoader(), Fortunes.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
            PLAIN_TEXT_4_0 = loader.tryGet("PLAIN_TEXT_4_0");
        }

        // argument @ [3:2]
        protected final List<Fortune> items;

        public Template(Fortunes model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.items = model.items();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [3:28]
            __internal.aboutToExecutePosInTemplate(3, 28);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ForBlockBegin @ [9:1]
            __internal.aboutToExecutePosInTemplate(9, 1);
            try {
                final com.fizzed.rocker.runtime.CollectionForIterator<Fortune> __forIterator0 = new com.fizzed.rocker.runtime.CollectionForIterator<Fortune>(items);
                while (__forIterator0.hasNext()) {
                    final com.fizzed.rocker.ForIterator i = __forIterator0;
                    final Fortune item = __forIterator0.next();
                    try {
                        // PlainText @ [9:47]
                        __internal.aboutToExecutePosInTemplate(9, 47);
                        __internal.writeValue(PLAIN_TEXT_1_0);
                        // ValueExpression @ [10:10]
                        __internal.aboutToExecutePosInTemplate(10, 10);
                        __internal.renderValue(item.id, false);
                        // PlainText @ [10:18]
                        __internal.aboutToExecutePosInTemplate(10, 18);
                        __internal.writeValue(PLAIN_TEXT_2_0);
                        // ValueExpression @ [10:27]
                        __internal.aboutToExecutePosInTemplate(10, 27);
                        __internal.renderValue(item.message, false);
                        // PlainText @ [10:40]
                        __internal.aboutToExecutePosInTemplate(10, 40);
                        __internal.writeValue(PLAIN_TEXT_3_0);
                        // ForBlockEnd @ [9:1]
                        __internal.aboutToExecutePosInTemplate(9, 1);
                    } catch (com.fizzed.rocker.runtime.ContinueException e) {
                        // support for continuing for loops
                    }
                } // for end @ [9:1]
            } catch (com.fizzed.rocker.runtime.BreakException e) {
                // support for breaking for loops
            }
            // PlainText @ [11:2]
            __internal.aboutToExecutePosInTemplate(11, 2);
            __internal.writeValue(PLAIN_TEXT_4_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "<!DOCTYPE html><html><head><title>Fortunes</title></head><body><table><tr><th>id</th><th>message</th></tr>";
        static private final String PLAIN_TEXT_1_0 = "<tr><td>";
        static private final String PLAIN_TEXT_2_0 = "</td><td>";
        static private final String PLAIN_TEXT_3_0 = "</td></tr>";
        static private final String PLAIN_TEXT_4_0 = "</table></body></html>";

    }

}
