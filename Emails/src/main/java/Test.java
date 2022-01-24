import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Test {

    public static void main(String[] args) {
        SimpleEmail email = new SimpleEmail();
        email.setSslSmtpPort("465");
        email.setHostName("smtp.qq.com");
        email.setAuthentication("1817811642@qq.com", "qjkynjgjrkxpcfeg");
        email.setCharset("UTF-8");
        try {
            email.addTo("2910590698@qq.com");
            email.setFrom("1817811642@qq.com");
            email.setSubject("震惊!一男子学会java，居然对暗恋女生……");
            email.setMsg("测试代码，仅供娱乐❀");
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
