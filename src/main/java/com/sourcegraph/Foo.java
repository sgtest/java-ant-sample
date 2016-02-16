package sourcegraph;


import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.net.URL;

public class Foo {

    private String bar = StringUtils.EMPTY;

    public String foo() throws Exception {
        URL url = new URL("http://google.com");
        return IOUtils.toString(url.openStream());
    }
}
