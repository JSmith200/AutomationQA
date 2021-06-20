import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Test2 {
    @org.junit.Test
    public void google() {
        open("https://google.com/");
        $(By.name("q")).setValue("Test Automation").pressEnter();   //вводит в поисковую строку нужное нам значнение
        //$(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).setValue("Test Automation").pressEnter();  //еще один способ метода выше
        Selenide.sleep(500); // таймаут ожидания чтобы страничка прогрузилась, чтобы тест не фейлился
        $(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[7]/div/div/div[1]/a/h3")).click();  // xpath 7 строки выдачи google
        Selenide.sleep(500); // таймаут ожидания чтобы страничка прогрузилась, чтобы тест не фейлился
        $(By.xpath("//title[contains(text(),'Automation')]")).exists(); // верифицирует title на нужное нам значение
        //Selenide.title("Automation"); // еще один вариант верификации

    }
}
