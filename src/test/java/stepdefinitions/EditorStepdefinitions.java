package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditorPage;

public class EditorStepdefinitions {


    EditorPage editorPage=new EditorPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButonu.click();

    }
    @Then("First name kutusuna {string} yazar")
    public void first_name_kutusuna_yazar(String firstName) {
        editorPage.firstName.sendKeys(firstName);
    }
    @Then("Last name kutusuna {string} yazar")
    public void last_name_kutusuna_yazar(String lastName) {
        editorPage.lastName.sendKeys(lastName);

    }
    @Then("position kutusuna {string} yazar")
    public void position_kutusuna_yazar(String position) {
        editorPage.position.sendKeys(position);

    }
    @Then("Office kutusuna {string} yazar")
    public void office_kutusuna_yazar(String string) {

    }
    @Then("Extension kutusuna {string} yazar")
    public void extension_kutusuna_yazar(String string) {

    }
    @Then("Start date kutusuna {string} yazar")
    public void start_date_kutusuna_yazar(String string) {

    }
    @Then("Salary kutusuna {string} yazar")
    public void salary_kutusuna_yazar(String string) {

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {

    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String string) {

    }
    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isim_bolumunde_oldugunu_dogrular(String string) {

    }

}
