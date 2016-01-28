package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.ContentManagementClientService;
import Politics247Generated.CreateContentData;
import Politics247Generated.CreateContentResult;
import Util.AppSettings;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class CreateContentThriftClass extends AsyncTask<CreateContentData, Integer, CreateContentResult>
{
    public NavigationDrawerAsyncResponse delegate = null;

    @Override
    protected CreateContentResult doInBackground(CreateContentData... CreateContentDatas)
    {
        CreateContentResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAddress, AppSettings.ContentManagementPort);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            ContentManagementClientService.Client contentManagementClientService = new ContentManagementClientService.Client(protocol);

            result = contentManagementClientService.CreateContent(CreateContentDatas[0]);

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

    protected void onPostExecute(CreateContentResult result)
    {
        delegate.createContentProcessFinish(result);
    }
}
