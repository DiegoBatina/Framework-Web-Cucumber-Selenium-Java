package pages;

import support.Setup;

public class Project {

    private final Setup driver;

    public Project(Setup stepDriver) {
        driver = stepDriver;
    }

    public void queacessosistemaTricentis() {
        driver.openURL("http://sampleapp.tricentis.com/101/app.php");
    }

    public void visualizoOFormularioEnterVehicleData() {
        driver.findElem("idealsteps-step","class");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoAOpcaoAudi() {
        driver.click("//*[@id=\"make\"]/option[2]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoModel() {
        driver.click("model","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoMake() {
        driver.click("make","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNaAbaAutomobile() {
        driver.click("nav_automobile","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void preenchoOCampoEnginePerformanceComOValor(String numero) {
        driver.sendKeys(numero,"engineperformance","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void preenchoOCampoDateOfManufactureComOValor(String numero) {
        driver.sendKeys(numero,"dateofmanufacture","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoNumberOfSeats() {
        driver.click("numberofseats","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void insiroOValorNoCampoNumberOfSeats(String numero) {
        driver.sendKeys(numero,"numberofseats","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoAOpcaoFiveNoCampoNumberOfSeats() {
        driver.click("//*[@id=\"numberofseats\"]/option[6]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoFuelType() {
        driver.click("fuel","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoAOpcaoGas() {
        driver.click("//*[@id=\"fuel\"]/option[5]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoEInsiroNoCampoListPriceOValor(String numero) {
        driver.sendKeys(numero,"listprice","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoEInsiroNoCampoLicensePlateNumberOValor(String numero) {
        driver.sendKeys(numero,"licenseplatenumber","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoEInsiroNoCampoAnnualMileageOValor(String numero) {
        driver.sendKeys(numero,"annualmileage","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pressioneNext() {
        driver.click("nextenterinsurantdata","id");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void preenchoOCampoFirstNameComOValor(String numero) {
        driver.sendKeys(numero,"firstname","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void preenchoOCampoLastNameComOValor(String numero) {
        driver.sendKeys(numero,"lastname","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void preenchoOCampoDateOfBirthComOValor(String numero) {
        driver.sendKeys(numero,"birthdate","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoOGeneroMaleNoCampoGender() {
        driver.click("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void preenchoOCampoStreetAddressComOValor(String numero) {
        driver.sendKeys(numero,"streetaddress","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoCountry() {
        driver.click("country","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoAOpcaoBrazil() {
        driver.click("//*[@id=\"country\"]/option[32]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoEInsiroNoCampoZipCodeOValor(String numero) {
        driver.sendKeys(numero,"zipcode","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoEInsiroNoCampoCityOValor(String numero) {
        driver.sendKeys(numero,"city","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoOccupation() {
        driver.click("occupation","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoAOpcaoSelfEmployed() {
        driver.click("//*[@id=\"occupation\"]/option[6]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoSpeedingNoCampoHobbies() {
        driver.click("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void preenchoOCampoWebsiteComOValor(String numero) {
        driver.sendKeys(numero,"website","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoEmOpenNoCampoPictureParaFazerUploadDeImagem() {
        driver.click("open","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoANaBuscaNoCampoPicture(String numero) {
        driver.sendKeys(numero,"picture","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void visualizoOFormularioEnterDataInsurant() {
        driver.findElem("//*[@id=\"insurance-form\"]/div/section[2]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNaAbaEnterDataInsurant() {
        driver.click("enterinsurantdata","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pressioneNextNaAbaEnterDataInsurant() {
        driver.click("nextenterproductdata","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNaAbaEnterProductData() {
        driver.click("enterproductdata","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void visualizoOFormularioEnterProductData() {
        driver.findElem("//*[@id=\"insurance-form\"]/div/section[3]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void insiroOValorNoCampoStartDate(String numero) {
        driver.sendKeys(numero,"startdate","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoInsuranceSum() {
        driver.click("insurancesum","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoMeritRating() {
        driver.click("meritrating","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoAPrimeiraOpcaoNoCampoMeritRating() {
        driver.click("//*[@id=\"meritrating\"]/option[3]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoASegundaOpcaoDeValorNoCampoInsuranceSum() {
        driver.click("//*[@id=\"insurancesum\"]/option[3]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoDamageInsurance() {
        driver.click("damageinsurance","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoAOpcaoNoCoverageNoCampoDamageInsurance() {
        driver.click("//*[@id=\"damageinsurance\"]/option[2]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoAOpcaoEuroProtectionNoCampoOptionalProducts() {
        driver.click("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicoNoCampoCourtesyCar() {
        driver.click("courtesycar","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionoAOpcaoNoNoCampoCourtesyCar() {
        driver.click("//*[@id=\"courtesycar\"]/option[2]","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pressioneNextNaAbaEnterProductData() {
        driver.click("nextselectpriceoption","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
