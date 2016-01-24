package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.ContentManagementClientService;
import Politics247Generated.RateData;
import Politics247Generated.RateResult;
import Util.AppSettings;

public class RatingThriftClass extends AsyncTask<RateData, Integer, RateResult>
{
    public NavigationDrawerAsyncResponse delegate = null;

    @Override
    protected RateResult doInBackground(RateData... RateDatas)
    {
        RateResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAddress, AppSettings.ContentManagementPort);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            ContentManagementClientService.Client contentManagementClientService = new ContentManagementClientService.Client(protocol);

            result = contentManagementClientService.Rate(RateDatas[0]);

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

    protected void onPostExecute(RateResult result)
    {
        delegate.rateProcessFinish(result);
    }
}
