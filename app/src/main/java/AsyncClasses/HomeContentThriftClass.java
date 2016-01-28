package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.CommentData;
import Politics247Generated.CommentResult;
import Politics247Generated.ContentManagementClientService;
import Politics247Generated.HomeScreenContentResult;
import Util.AppSettings;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class HomeContentThriftClass extends AsyncTask<Integer, Integer, HomeScreenContentResult>
{
    public NavigationDrawerAsyncResponse delegate = null;

    @Override
    protected HomeScreenContentResult doInBackground(Integer... Userids)
    {
        HomeScreenContentResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAddress, AppSettings.ContentManagementPort);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            ContentManagementClientService.Client contentManagementClientService = new ContentManagementClientService.Client(protocol);

            result = contentManagementClientService.HomeScreenContent(Userids[0]);

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

    protected void onPostExecute(HomeScreenContentResult result)
    {
        delegate.homeContentProcessFinish(result);
    }
}
