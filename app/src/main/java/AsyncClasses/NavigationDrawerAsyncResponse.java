package AsyncClasses;

import Politics247Generated.CommentResult;
import Politics247Generated.CreateContentResult;
import Politics247Generated.RateResult;
import Politics247Generated.SubscriptionResult;
import Politics247Generated.UserManagementClientService;
import Politics247Generated.UserProfileResult;
import Politics247Generated.UserSearchResult;

public interface NavigationDrawerAsyncResponse
{
    void commentProcessFinish(CommentResult result);

    void rateProcessFinish(RateResult result);

    void createContentProcessFinish(CreateContentResult result);

   void subcriberProcessFinish(SubscriptionResult result);

    void searchProcessFinish(UserSearchResult result);

    void viewUserProfileProcessFinish(UserProfileResult result);
}
