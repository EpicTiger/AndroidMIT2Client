package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.UserManagementClientService;
import Politics247Generated.UserProfileUpdateData;
import Politics247Generated.UserProfileUpdateResult;
import Util.AppSettings;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class UpdateUserProfileThriftClass extends AsyncTask<UserProfileUpdateData, Integer, UserProfileUpdateResult>
{
    public NavigationDrawerAsyncResponse delegate = null;

    @Override
    protected UserProfileUpdateResult doInBackground(UserProfileUpdateData... UserProfileUpdateDatas)
    {
        UserProfileUpdateResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAddress, AppSettings.UsermanagementPort);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            UserManagementClientService.Client client = new UserManagementClientService.Client(protocol);

            result = client.UpdateUserProfile(UserProfileUpdateDatas[0]);

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

    protected void onPostExecute(UserProfileUpdateResult result)
    {
        delegate.updateUserProfileProcessFinish(result);
    }
}
