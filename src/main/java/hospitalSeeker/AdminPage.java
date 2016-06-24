package hospitalSeeker;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

    @FindBy(id = "allUsers")
    public WebElement allUsersTable;
    
    @FindBy(id = "userPerPage" )
    public WebElement showUsers;

    @FindBy(id = "pref-roleby")
    public WebElement role;

    @FindBy (id = "searchBy")
    public WebElement searchBy;

    @FindBy (id = "search")
    public WebElement search;
    
    @FindBy (id = "searchButton")
    public WebElement searchButton;

    @FindBy (id = "clearButton")
    public WebElement clearButton;

    @FindBy (linkText = "Enabled")
    public WebElement enabled;
    
    @FindBy (linkText = "Disabled")
    public WebElement disabled;
    
    @FindBy (linkText = "All Users")
    public WebElement allUsers;
    
    @FindBy (id = "viewUser")
    public WebElement actionsViewUser;
    
    @FindBy (css = "a.btn.button_user")
    public WebElement actionsEditUser;
    
    @FindBy (id = "deleteUser")
    public WebElement actionsDeleteUser;
    
    @FindBy (id = "email")
    public WebElement sortEmailColumn;

    @FindBy (id = "detail.firstName")
    public WebElement sortFirstNameColumn;
    
    @FindBy (id = "detail.lastName")
    public WebElement sortLastNameColumn;

    @FindBy (id = "roles.type")
    public WebElement sortRoleColumn;
    
    @FindBy (linkText = "Close")
    public WebElement viewUserAlert;
    
//    @FindBy (xpath = "/html/body/section/div[2]/div/div/div[2]/div/table/tbody/tr[3]/td[2]/input")
//    public WebElement viewUserAlertEnabledButton;
    
    @FindBy (xpath = "/html/body/section/div[2]/div/div/div[3]/a")
    public WebElement viewUserAlertClose;

    @FindBy(css = "input.btn.btn-sm.userEnabled")
	public WebElement editEnabledButton;
	
	@FindBy(css = "option[value=ADMIN]")
	public WebElement editRoleAdmin;
	
	@FindBy(css = "option[value=DOCTOR]")
	public WebElement editRoleDoctor;
	
	@FindBy(css = "option[value=MANAGER]")
	public WebElement editRoleManager;
	
	@FindBy(css = "option[value=PATIENT]")
	public WebElement editRolePatient;
	
	@FindBy(css = "input.btn.btn-primary.btn-sm")
	public WebElement editEditUserButton;
	
	@FindBy (xpath = "/html/body/section/div/div/div/div/form/div[3]/div/a")
	public WebElement editCancelButton;
	
    @FindBy (linkText = "Delete User")
    public WebElement deleteUserAlert;

    @FindBy (xpath = "/html/body/section/div[3]/div/div/div[3]/a[1]")
    public WebElement deleteUserAlertCloseButton;
    
    @FindBy (id = "deleteButton")
    public WebElement deleteUserAlertDeleteButton;

    @FindBy (id = "firstPage")
    public WebElement firstPageButton;

    @FindBy (id = "nextPage")
    public WebElement nextPageButton;

    @FindBy (id = "lastPAge")
    public WebElement lastPageButton;

    @FindBy (xpath = "/html/body/section/a")
    public WebElement backToTopButton;

    @FindBy (xpath = "/html/body/footer/div/div/div/p")
    public WebElement footer;

    @FindBy(css = "input.btn.btn-sm")
    public WebElement viewUserAlertEnabledButton;

    @FindBy (xpath = "//td[contains(@class, 'text-left') and text() = '17']")
    public WebElement idViewUser;

    @FindBy (linkText = "Close")
    public WebElement viewUserCancelButton;

    @FindAll(@FindBy(linkText = "Close"))
    public List<WebElement> closeAll;

    @FindAll(@FindBy(className = "center"))
    public List<WebElement> usersAll;

    public static AdminPage init(WebDriver driver) {
        return PageFactory.initElements(driver, AdminPage.class);
    }
}
