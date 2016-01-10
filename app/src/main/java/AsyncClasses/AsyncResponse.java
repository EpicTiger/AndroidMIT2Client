package AsyncClasses;

import android.view.View;

import Politics247Generated.LoginResult;
import Politics247Generated.PasswordChangeResult;
import Politics247Generated.RegistrationResult;

/**
 * Created by Rainer on 9-1-2016.
 */
public interface AsyncResponse
{
    void loginProcessFinish(LoginResult result);

    void registrationProcessFinish(RegistrationResult result);

    void passwordChangedProcessFinish(PasswordChangeResult result);
}
