package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_CYC = Target.the("Cursos y Certificaciones").located(By.id("certificaciones"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso ").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located(By.partialLinkText("Analista Bancolombia"));
    //public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located(By.xpath("//h4[contains(text(), 'Analista Bancolombia')]"));

    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//div[@class='page-header-headings']//h1"));


}
