package AsyncClasses;

import Politics247Generated.CommentResult;
import Politics247Generated.CreateContentResult;
import Politics247Generated.RateResult;

public interface NavigationDrawerAsyncResponse
{
    void commentProcessFinish(CommentResult result);

    void rateProcessFinish(RateResult result);

    void createContentProcessFinish(CreateContentResult result);
}
