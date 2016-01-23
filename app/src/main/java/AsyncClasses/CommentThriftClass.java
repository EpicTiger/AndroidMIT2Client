package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.CommentData;
import Politics247Generated.CommentResult;
import Politics247Generated.ContentManagementClientService;
import Util.AppSettings;

public class CommentThriftClass extends AsyncTask<CommentData, Integer, CommentResult>
{
    public NavigationDrawerAsyncResponse delegate = null;

    @Override
    protected CommentResult doInBackground(CommentData... CommentDatas)
    {
        CommentResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAddress, AppSettings.Port);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            ContentManagementClientService.Client contentManagementClientService = new ContentManagementClientService.Client(protocol);

            result = contentManagementClientService.Comment(CommentDatas[0]);

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

    protected void onPostExecute(CommentResult result)
    {
        delegate.commentProcessFinish(result);
    }
}
