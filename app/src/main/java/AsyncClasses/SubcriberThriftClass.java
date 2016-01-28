package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.SubscriptionData;
import Politics247Generated.SubscriptionResult;
import Politics247Generated.SubscriptionUserClientService;
import Util.AppSettings;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class SubcriberThriftClass extends AsyncTask<SubscriptionData, Integer, SubscriptionResult>
{
    public NavigationDrawerAsyncResponse delegate = null;

    @Override
    protected SubscriptionResult doInBackground(SubscriptionData... SubscriptionDatas)
    {
        SubscriptionResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAddress, AppSettings.SubscriptionPort);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            SubscriptionUserClientService.Client client = new SubscriptionUserClientService.Client(protocol);

            result = client.Subscribe(SubscriptionDatas[0]);

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

    protected void onPostExecute(SubscriptionResult result)
    {
        delegate.subcriberProcessFinish(result);
    }
}
