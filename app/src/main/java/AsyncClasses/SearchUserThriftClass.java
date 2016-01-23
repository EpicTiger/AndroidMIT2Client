package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.UserManagementClientService;
import Politics247Generated.UserSearchResult;
import Util.AppSettings;

public class SearchUserThriftClass extends AsyncTask<String, Integer, UserSearchResult>
{
    public NavigationDrawerAsyncResponse delegate = null;

    @Override
    protected UserSearchResult doInBackground(String... query)
    {
        UserSearchResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAddress, AppSettings.Port);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            UserManagementClientService.Client client = new UserManagementClientService.Client(protocol);

            result = client.SearchUser(query[0]);

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

    protected void onPostExecute(UserSearchResult result)
    {
        delegate.searchProcessFinish(result);
    }
}
