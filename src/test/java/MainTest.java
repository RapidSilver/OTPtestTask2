
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;


//не совсем понимаю что тут можно тестировать. В целом есть некие проблеммы с применением тестов. я понимаю как. но не понимаю куда :)

public class MainTest {

    @Test
    public  void positeve() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("Иванов И.И.".getBytes());
        System.setIn(in);
        Main.main(null);

    }

    @Test
    public void negative() {
        ByteArrayInputStream in = new ByteArrayInputStream("что-то там".getBytes());
        System.setIn(in);
        Main.main(null);
    }
}