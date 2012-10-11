package nl.knaw.dans.easy.web.authn;

import nl.knaw.dans.easy.web.main.AbstractEasyNavPage;

import org.apache.wicket.protocol.https.RequireHttps;

@RequireHttps
public class ForgottenPasswordPage extends AbstractEasyNavPage
{
    private static final String WI_FORGOTTEN_PASSWORD_PANEL = "forgottenPasswordPanel";
    
    public ForgottenPasswordPage()
    {
        super();
        init();
    }
    
    private void init()
    {
        add(new ForgottenPasswordPanel(WI_FORGOTTEN_PASSWORD_PANEL));
    }

}
