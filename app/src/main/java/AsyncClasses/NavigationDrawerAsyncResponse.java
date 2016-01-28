package AsyncClasses;

import Politics247Generated.CommentResult;
import Politics247Generated.CreateContentResult;
import Politics247Generated.HomeScreenContentResult;
import Politics247Generated.RateResult;
import Politics247Generated.SubscriptionResult;
import Politics247Generated.UserProfileResult;
import Politics247Generated.UserProfileUpdateResult;
import Politics247Generated.UserSearchResult;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public interface NavigationDrawerAsyncResponse
{
    void commentProcessFinish(CommentResult result);

    void homeContentProcessFinish(HomeScreenContentResult result);

    void rateProcessFinish(RateResult result);

    void createContentProcessFinish(CreateContentResult result);

    void subcriberProcessFinish(SubscriptionResult result);

    void searchProcessFinish(UserSearchResult result);

    void viewUserProfileProcessFinish(UserProfileResult result);

    void updateUserProfileProcessFinish(UserProfileUpdateResult result);
}
