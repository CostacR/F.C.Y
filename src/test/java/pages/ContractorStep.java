package pages;

import com.ibm.icu.impl.UResource;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractorStep extends PageObject {

    //слайдеры
    @FindBy(xpath = "//div//mat-step-header[@aria-posinset='1']")
    private WebElement clientSelectSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='2']")
    private WebElement mainInformationSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='3']")
    private WebElement contractorSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='4']")
    private WebElement orderPreviewSlider;

    //****************************************************************************************************************** нижние навигационные кнопки
    @FindBy (xpath = "//button//span[contains(text(), 'Зберегти як чернетку')]/ancestor::button")
    private WebElement draftOrderSaveButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Попередній крок ')]")
    private WebElement previousStepButton;

    @FindBy (xpath = "//span[contains(text(), 'Наступний крок')]/ancestor::button")
    private WebElement nextStepButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Зберегти')]/ancestor::button")
    private WebElement saveOrderButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Вийти')]/ancestor::button")
    private WebElement exitButton;

    //****************************************************************************************************************** поля степа Контрагент

    @FindBy (xpath = "//div[@id='cdk-step-content-0-2']//button[@class='mat-stroked-button mat-primary']")
    private WebElement addContractorButton;

    //Детали реквизитов

    @FindBy (xpath = "//input[@placeholder='Найменування']")
    private WebElement contractorNameField;

    @FindBy (xpath = "//input[@placeholder='Реєстраційний номер']")
    private WebElement contractorCodeField;

    @FindBy (xpath = "//div[@id='counterpartySearch']//div//div/*[@role='listbox']")
    private WebElement contractorCountryDropMenu;

    //выбор стран контрагента

    @FindBy (xpath = "//div/div/mat-option//span[contains(text(), '004')]")//004-Афганистан
    private WebElement contractorAfganistanCountrySelect;

    @FindBy (xpath = "//div/div/mat-option//span[contains(text(), '008')]")//008 - Албания
    private WebElement contractorAlbanyCountrySelect;

    @FindBy (xpath = "//div/div/mat-option//span[contains(text(), '124')]")//124-Canada
    private WebElement contractorCanadaCountrySelect;

    //    @FindBy (xpath = "//*[@id='button_search']")
    @FindBy(xpath = "//div[@class='mat-expansion-panel-body']//span/button")
    private WebElement contractorSearchButton;

    //!!!!!!!! xpath!!!!!
    @FindBy (xpath = "//div[2]/div[2]/div/mat-dialog-container/app-counterparty-details-stepper/mat-horizontal-stepper/div[2]/div[1]/app-counter-party-form-dialog/form/mat-accordion/mat-expansion-panel[1]/div/div/div/app-search-by-several-columns/div/span[3]/div/app-smart-search/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
    private WebElement contractorSearchDropMenu;

    @FindBy (xpath = "(//span/span[contains(text(), 'KATEX Warenhandel GmbH')])[1]")//Контрагент   KATEX Warenhandel GmbH
    private WebElement contractorSearchContractorFirstDropMenu;


    @FindBy (xpath = "//*[@class='mat-stroked-button mat-primary']//a[contains(text(), 'Створити контрагента')]")
    private WebElement newContractorButton;

    //кнопки меню контрагента
    @FindBy (xpath = "//button[@class='mat-raised-button mat-accent ng-star-inserted']//*[contains(text(), 'Наступний крок')]")
    private WebElement nextStepContractorButton;

    @FindBy (xpath = "//button//*[contains(text(), 'Наступний крок')]")
    private WebElement nextStepContractorLastButton;


    @FindBy (xpath = "//button[@class='mat-raised-button mat-accent ng-star-inserted']//*[contains(text(), 'Попередній крок')]")
    private WebElement previousStepContractorButton;

    @FindBy (xpath = "//button[@class='mat-raised-button mat-warn']//*[contains(text(), 'Скасувати')]")
    private WebElement cancelContractorButton;

    //Детали контрагента
    @FindBy (xpath = "//input[@formcontrolname='thirdCtrlCounterpartyName']")
    private WebElement contractorNameInputForm;

    @FindBy (xpath = "//input[@formcontrolname='thirdCtrlCounterpartyTaxCode']")
    private WebElement contractorCodeForm;

    @FindBy (xpath = "//input[@formcontrolname='thirdCtrlCounterpartyAddress']")
    private WebElement contractorAdressInputForm;

    @FindBy (xpath = "//*[@formcontrolname='thirdCtrlCounterpartyCountry']")
    private WebElement newContractorCountryDropMenu;

    @FindBy (xpath = "//div/*[@formcontrolname='thirdCtrlCounterpartyResidence']")
    private WebElement contractorResidentDropMenu;

    @FindBy (xpath = "//div/div/mat-option/*[contains(text(), 'Резидент')]")
    private WebElement contractorResidentYesDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'Нерезидент')]")
    private WebElement contractorResidentNoDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'розріз відсутній')]")
    private WebElement contractorResidentUnknownDropMenu;


    @FindBy (xpath = "//*/div/mat-card-content/div/button/span/a[contains(text(), 'Додати реквізити')]/ancestor::button")
    private WebElement addContractorBankDetailsButton;

    @FindBy (xpath = "//div/input[@placeholder='Swift код']")
    private WebElement contractorSwiftCodeInputForm;

    @FindBy (xpath = "//input[@placeholder='Найменування банку']")
    private WebElement contractorBankNameInputForm;

    @FindBy (xpath = "//input[@placeholder='Кліринговий код банку']")
    private WebElement contractorCliringCodeForm;

    @FindBy (xpath = "/html/body/div[3]/div[4]/div/mat-dialog-container/app-requisite-form/form/mat-accordion/mat-expansion-panel[1]/div/div/div/app-search-by-several-columns/div/span[4]/button")
    private WebElement contractorSearchBankDetailsButton;


    @FindBy (xpath = "//div/button/span/a[contains(text(), 'Створити реквізити')]")
    private WebElement newContractorBankDetailsButton;

    @FindBy (xpath = "//input[@formcontrolname='']")
    private WebElement searchContractorField;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-counterparty-details-stepper/mat-horizontal-stepper/div[2]/div[1]/app-counter-party-form-dialog/form/mat-accordion/mat-expansion-panel[1]/div/div/div/app-search-by-several-columns/div/span[3]/button")
    private WebElement searchContractorButton;


    @FindBy (xpath = "//input[@placeholder='Пошук']")
    private WebElement contractorDetailsSelectInputDropMenu;

    @FindBy (xpath = "(//div/div//div[@class='around_line']//span/button/span[contains(text(), 'Пошук')])[2]")//некрасивый хардкод!!!!! добавить id кнопке!!
    private WebElement searchContractorBankButton;

    @FindBy (xpath = "//div/*[@role='dialog']//button/span[contains(text(), 'Зберегти')]/ancestor::button")
    private WebElement saveDetailsButton;

    @FindBy (xpath = "//app-requisite-form/mat-card-actions[@class='mat-card-actions']/button/span[contains(text(), 'Скасувати')]")
    private WebElement cancelDetailsButton;

    @FindBy (xpath = "/html/body/div[2]/div[4]/div/mat-dialog-container/app-requisite-form/form/mat-accordion/mat-expansion-panel[1]/div/div/div/app-search-by-several-columns/div/span[4]/div/app-smart-search/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
    private WebElement contractorSearchBankDetailDropMemu;

    @FindBy (xpath = "(//*[contains(text(), 'DE89370400440532013000')])[1]")
    private WebElement contractorSearchBankDetailDE8937DropMemu;

    @FindBy (xpath = "//input[@formcontrolname='']")
    private WebElement contractorBankCountryDropMenu;

    @FindBy (xpath = "//input[@placeholder='Країна']")
    private WebElement contractorBankCountryInputDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '004')]")
    private WebElement contractorBankCountryAfganystanDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '008')]")
    private WebElement contractorBankCountryAlbanyDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '156')]")
    private WebElement contractorBankCountryChinaDropMenu;

    @FindBy (xpath = "//input[@formcontrolname='']")
    private WebElement contractorIbanInputForm;

    @FindBy (xpath = "//input[@formcontrolname='']")
    private WebElement contractorCorrespondingAccountRuInputForm;

    @FindBy (xpath = "//button/span[contains(text(), 'Вийти')]")
    private WebElement exitOrderButton;


    public ContractorStep(WebDriver driver){
        super(driver);
    }

    public void searchContractor() throws InterruptedException {


    }

    public void createNewContractor() throws InterruptedException {

        newContractorButton.click();
        Thread.sleep(50);
        System.out.println("111");

        contractorNameField.click();
        contractorNameField.sendKeys("Contractor Name");

        contractorCodeField.click();
        contractorCodeField.sendKeys("100000001");

        contractorCountryDropMenu.click();
        contractorAlbanyCountrySelect.click();
        contractorBankCountryInputDropMenu.sendKeys(Keys.ENTER);
        contractorBankCountryInputDropMenu.sendKeys(Keys.TAB);

        contractorAdressInputForm.click();
        contractorAdressInputForm.sendKeys("Contractor adress line");

        contractorResidentDropMenu.click();
        contractorResidentNoDropMenu.click();


}

    public void addContractorBankDetailsButtonClick (){
        addContractorBankDetailsButton.click();
    }

    public void searchContractroBankDetail(){
        searchContractorBankButton.click();


    }


    public void addContractorNewBankDetails(){

    }



    public void contractorNewFillForm() throws InterruptedException {
        Thread.sleep(50);
        System.out.println("Enter Add contractor method");
        addContractorButton.click();
        createNewContractor();//create new Contractor
        nextStepContractorButton.click();
    }

    public void contractorSearchFillForm() throws InterruptedException{

        Thread.sleep(50);
        addContractorButton.click();

        Thread.sleep(200);

        System.out.println("444");
        searchContractorButton.click();

        Thread.sleep(100);
        contractorSearchDropMenu.click();
        contractorSearchContractorFirstDropMenu.click();
        nextStepContractorButton.click();
        Thread.sleep(300);
        contractorResidentDropMenu.click();
        Thread.sleep(50);
        contractorResidentYesDropMenu.click();

        Thread.sleep(50);
        nextStepContractorButton.click();
        Thread.sleep(250);
        addContractorBankDetailsButton.click();

        Thread.sleep(200);
        searchContractorBankButton.click();
        Thread.sleep(150);
        contractorSearchBankDetailDropMemu.click();
        Thread.sleep(50);

        contractorSearchBankDetailDE8937DropMemu.click();

        Thread.sleep(250);
        saveDetailsButton.click();
        Thread.sleep(250);
        saveDetailsButton.click();
        Thread.sleep(200);

        nextStepContractorLastButton.click();

    }
}