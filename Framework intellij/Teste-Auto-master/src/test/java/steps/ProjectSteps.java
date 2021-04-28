package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.Project;
import support.BaseSteps;

public class ProjectSteps extends BaseSteps {


    private static final Project project = new Project(driver);

    @Dado("^que acesso sistema Tricentis$")
    public void queacessosistemaTricentis() {
        project.queacessosistemaTricentis();
    }

    @E("visualizo o formulario “Enter Vehicle Data”")
    public void visualizoOFormularioEnterVehicleData() {
        project.visualizoOFormularioEnterVehicleData();
    }

    @E("clico no campo ”Make”")
    public void clicoNoCampoMake() {
        project.clicoNoCampoMake();
    }

    @E("seleciono a opcao ”Audi”")
    public void selecionoAOpcaoAudi() {
        project.selecionoAOpcaoAudi();
    }

    @E("clico no campo ”model”")
    public void clicoNoCampoModel() {
        project.clicoNoCampoModel();
    }

    @E("clico na aba ”Automobile”")
    public void clicoNaAbaAutomobile() {
        project.clicoNaAbaAutomobile();
    }

    @E("preencho o campo ”Engine Performance” com o valor {string}")
    public void preenchoOCampoEnginePerformanceComOValor(String numero) {
        project.preenchoOCampoEnginePerformanceComOValor(numero);
    }

    @E("preencho o campo ”Date of Manufacture” com o valor {string}")
    public void preenchoOCampoDateOfManufactureComOValor(String numero) {
        project.preenchoOCampoDateOfManufactureComOValor(numero);
    }

    @E("clico no campo ”Number of Seats”")
    public void clicoNoCampoNumberOfSeats() {
        project.clicoNoCampoNumberOfSeats();
    }

    @E("insiro o valor {string} no campo ”Number of Seats”")
    public void insiroOValorNoCampoNumberOfSeats(String numero) {
        project.insiroOValorNoCampoNumberOfSeats(numero);

    }

    @E("seleciono a opcao ”five” no campo ”Number of Seats”")
    public void selecionoAOpcaoFiveNoCampoNumberOfSeats() {
        project.selecionoAOpcaoFiveNoCampoNumberOfSeats();
    }

    @E("clico no campo ”Fuel Type”")
    public void clicoNoCampoFuelType() {
        project.clicoNoCampoFuelType();
    }

    @E("seleciono a opcao ”Gas”")
    public void selecionoAOpcaoGas() {
        project.selecionoAOpcaoGas();
    }

    @E("clico e insiro no campo ”List Price” o valor {string}")
    public void clicoEInsiroNoCampoListPriceOValor(String numero) {
        project.clicoEInsiroNoCampoListPriceOValor(numero);
    }

    @E("clico e insiro no campo ”License Plate Number” o valor {string}")
    public void clicoEInsiroNoCampoLicensePlateNumberOValor(String numero) {
        project.clicoEInsiroNoCampoLicensePlateNumberOValor(numero);
    }

    @E("clico e insiro no campo ”Annual Mileage” o valor {string}")
    public void clicoEInsiroNoCampoAnnualMileageOValor(String numero) {
        project.clicoEInsiroNoCampoAnnualMileageOValor(numero);
    }

    @E("pressione next")
    public void pressioneNext() {
        project.pressioneNext();
    }

    @E("preencho o campo ”First Name” com o valor {string}")
    public void preenchoOCampoFirstNameComOValor(String numero) {
        project.preenchoOCampoFirstNameComOValor(numero);

    }

    @E("preencho o campo ”Last Name” com o valor {string}")
    public void preenchoOCampoLastNameComOValor(String numero) {
        project.preenchoOCampoLastNameComOValor(numero);
    }

    @E("preencho o campo ”Date of Birth” com o valor {string}")
    public void preenchoOCampoDateOfBirthComOValor(String numero) {
        project.preenchoOCampoDateOfBirthComOValor(numero
        );
    }

    @E("seleciono o genero ”Male” no campo ”Gender”")
    public void selecionoOGeneroMaleNoCampoGender() {
        project.selecionoOGeneroMaleNoCampoGender();

    }

    @E("preencho o campo ”Street Address” com o valor {string}")
    public void preenchoOCampoStreetAddressComOValor(String numero) {
        project.preenchoOCampoStreetAddressComOValor(numero);
    }

    @E("clico no campo ”Country”")
    public void clicoNoCampoCountry() {
        project. clicoNoCampoCountry();
    }

    @E("seleciono a opcao ”Brazil”")
    public void selecionoAOpcaoBrazil() {
        project.selecionoAOpcaoBrazil();
    }

    @E("clico e insiro no campo ”Zip Code” o valor {string}")
    public void clicoEInsiroNoCampoZipCodeOValor(String numero) {
        project.clicoEInsiroNoCampoZipCodeOValor(numero);
    }

    @E("clico e insiro no campo ”City” o valor {string}")
    public void clicoEInsiroNoCampoCityOValor(String numero) {
        project.clicoEInsiroNoCampoCityOValor(numero);
    }

    @E("clico no campo ”Occupation”")
    public void clicoNoCampoOccupation() {
        project.clicoNoCampoOccupation();
    }

    @E("seleciono a opcao ”self employed”")
    public void selecionoAOpcaoSelfEmployed() {
        project.selecionoAOpcaoSelfEmployed();
    }

    @E("seleciono ”Speeding” no campo ”Hobbies”")
    public void selecionoSpeedingNoCampoHobbies() {
        project.selecionoSpeedingNoCampoHobbies();
    }

    @E("preencho o campo ”Website” com o valor {string}")
    public void preenchoOCampoWebsiteComOValor(String numero) {
        project. preenchoOCampoWebsiteComOValor(numero);
    }

    @E("clico em ”Open” no campo ”Picture” para fazer upload de imagem")
    public void clicoEmOpenNoCampoPictureParaFazerUploadDeImagem() {
        project.clicoEmOpenNoCampoPictureParaFazerUploadDeImagem();
    }

    @E("seleciono a {string} na busca no campo ”Picture”")
    public void selecionoANaBuscaNoCampoPicture(String numero) {
        project.selecionoANaBuscaNoCampoPicture(numero);
    }

    @E("visualizo o formulario “Enter Data Insurant”")
    public void visualizoOFormularioEnterDataInsurant() {
        project.visualizoOFormularioEnterDataInsurant();
    }

    @Então("clico na aba “Enter Data Insurant”")
    public void clicoNaAbaEnterDataInsurant() {
        project.clicoNaAbaEnterDataInsurant();
    }

    @E("pressione ”Next” na aba ”Enter Data Insurant”")
    public void pressioneNextNaAbaEnterDataInsurant() {
        project.pressioneNextNaAbaEnterDataInsurant();
    }

    @Então("clico na aba ”Enter Product Data”")
    public void clicoNaAbaEnterProductData() {
        project.clicoNaAbaEnterProductData();
    }

    @E("visualizo o formulario “Enter Product Data”")
    public void visualizoOFormularioEnterProductData() {
        project. visualizoOFormularioEnterProductData();
    }

    @E("insiro o valor {string} no campo ”Start Date”")
    public void insiroOValorNoCampoStartDate(String numero) {
        project.insiroOValorNoCampoStartDate(numero);
    }

    @E("clico no campo ”Insurance Sum”")
    public void clicoNoCampoInsuranceSum() {
        project.clicoNoCampoInsuranceSum();
    }

    @E("clico no campo ”Merit Rating”")
    public void clicoNoCampoMeritRating() {
        project.clicoNoCampoMeritRating();
    }

    @E("seleciono a segunda opcao de valor no campo ”Insurance Sum”")
    public void selecionoASegundaOpcaoDeValorNoCampoInsuranceSum() {
        project.selecionoASegundaOpcaoDeValorNoCampoInsuranceSum();
    }

    @E("clico no campo ”Damage Insurance”")
    public void clicoNoCampoDamageInsurance() {
        project.clicoNoCampoDamageInsurance();
    }

    @E("seleciono a opcao ”No Coverage” no campo ”Damage Insurance”")
    public void selecionoAOpcaoNoCoverageNoCampoDamageInsurance() {
        project.selecionoAOpcaoNoCoverageNoCampoDamageInsurance();
    }

    @E("seleciono a opcao ”Euro Protection” no campo ”Optional Products”")
    public void selecionoAOpcaoEuroProtectionNoCampoOptionalProducts() {
        project.selecionoAOpcaoEuroProtectionNoCampoOptionalProducts();
    }

    @E("clico no campo ”Courtesy Car”")
    public void clicoNoCampoCourtesyCar() {
        project.clicoNoCampoCourtesyCar();
    }

    @E("seleciono a opcao ”No” no campo ”Courtesy Car”")
    public void selecionoAOpcaoNoNoCampoCourtesyCar() {
        project.selecionoAOpcaoNoNoCampoCourtesyCar();
    }

    @E("pressione ”Next” na aba ”Enter Product Data”")
    public void pressioneNextNaAbaEnterProductData() {
        project.pressioneNextNaAbaEnterProductData();
    }

    @E("seleciono a primeira opcao no campo ”Merit Rating”")
    public void selecionoAPrimeiraOpcaoNoCampoMeritRating() {
        project.selecionoAPrimeiraOpcaoNoCampoMeritRating();
    }
}

