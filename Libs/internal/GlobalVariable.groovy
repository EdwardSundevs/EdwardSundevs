package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile CafeRio_Dev : com.punchh.caferio</p>
     */
    public static Object cafeRio_dev
     
    /**
     * <p></p>
     */
    public static Object User_Email_Dev
     
    /**
     * <p></p>
     */
    public static Object Password_Dev
     
    /**
     * <p>Profile CafeRio_Prod : com.punchh.caferio</p>
     */
    public static Object cafeRio_Prod
     
    /**
     * <p></p>
     */
    public static Object UserEmail_Prod
     
    /**
     * <p></p>
     */
    public static Object Password_Prod
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object caferio_dev
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            cafeRio_dev = selectedVariables['cafeRio_dev']
            User_Email_Dev = selectedVariables['User_Email_Dev']
            Password_Dev = selectedVariables['Password_Dev']
            cafeRio_Prod = selectedVariables['cafeRio_Prod']
            UserEmail_Prod = selectedVariables['UserEmail_Prod']
            Password_Prod = selectedVariables['Password_Prod']
            G_Timeout = selectedVariables['G_Timeout']
            G_NotificationMessage = selectedVariables['G_NotificationMessage']
            G_AndroidApp = selectedVariables['G_AndroidApp']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            caferio_dev = selectedVariables['caferio_dev']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
