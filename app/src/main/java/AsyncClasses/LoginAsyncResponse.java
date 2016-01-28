package AsyncClasses;

import Politics247Generated.LoginResult;
import Politics247Generated.PasswordChangeResult;
import Politics247Generated.RegistrationResult;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public interface LoginAsyncResponse
{
    void loginProcessFinish(LoginResult result);

    void registrationProcessFinish(RegistrationResult result);

    void passwordChangedProcessFinish(PasswordChangeResult result);
}
