package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HepsiburadaPage;
import util.DriverFactory;
public class HepsiburadaSteps {
    HepsiburadaPage hepsiburadaPage = new HepsiburadaPage(DriverFactory.initializeTheN11Driver());
    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        hepsiburadaPage.kategoriTiklama();
    }

    @And("{string} için sayfa taranir ve kategori var ise tiklanir")
    public void içinSayfaTaranirVeKategoriVarIseTiklanir(String kategori) {
        hepsiburadaPage.istenenKategoriAramaVeTiklama(kategori);
    }

    @Then("Outdoor giyim ayakkabi kategorisi tiklanir")
    public void outdoorGiyimAyakkabiKategorisiTiklanir() {
        hepsiburadaPage.setOurdoorGiyimAyakkabi();
    }


    @Then("{string} tiklanir")
    public void tiklanir(String kategori) {
        hepsiburadaPage.clickingOnElement(kategori);
    }

    @And("{string} yazilir")
    public void yazilir(String input) {
        hepsiburadaPage.enteringInputIntoTextBox(input);
    }

    @And("uygulamayi kapat")
    public void uygulamayiKapat() {
        DriverFactory.closeDriver();
    }
}
