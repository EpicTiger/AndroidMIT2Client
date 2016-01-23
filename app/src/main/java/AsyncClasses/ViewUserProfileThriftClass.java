package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.UserManagementClientService;
import Politics247Generated.UserProfileResult;
import Politics247Generated.UserSearchResult;
import Util.AppSettings;

public class ViewUserProfileThriftClass extends AsyncTask<Integer, Integer, UserProfileResult>
{
    public NavigationDrawerAsyncResponse delegate = null;

    @Override
    protected UserProfileResult doInBackground(Integer... userId)
    {
        UserProfileResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAddress, AppSettings.Port);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            UserManagementClientService.Client client = new UserManagementClientService.Client(protocol);

            result = client.ViewUserProfile(userId[0]);

            transport.close();
        } catch (Exception x)
        {
            x.printStackTrace();
        }
        return result;
    }

    protected void onProgressUpdate(Integer... progress)
    {

    }

    protected void onPostExecute(UserProfileResult result)
    {
        delegate.viewUserProfileProcessFinish(result);
    }
}
