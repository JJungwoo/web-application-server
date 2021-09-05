package webserver;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class HttpResponseTest {
    private String testDirectory = "./src/test/resources/";

    @Test
    public void responseForward() throws Exception {
        // Http_Forward.txt 결과는 응답 body에 index.html이 포함되어 있어야 한다.

    }

    @Test
    public void responseRedirect() throws Exception {
        // Http_Redirect.txt 결과는 응답 header에
        // Location 정보가 /index.html로 포함되어 있어야 한다.

    }

    @Test
    public void responseCookies() throws Exception {
        // Http_Cookie.txt 결과는 응답 header에 Set-Cookie 값으로
        // logined=true 값이 포함되어 있어야 한다.

    }

    private OutputStream createOutputStream(String filename)
            throws FileNotFoundException {
        return new FileOutputStream(new File(testDirectory + filename));
    }
}