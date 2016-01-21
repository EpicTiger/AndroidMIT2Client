package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.AuthenticationClientService;
import Politics247Generated.PasswordChangeData;
import Politics247Generated.PasswordChangeResult;
import Util.AppSettings;

public class PasswordChangeThriftClass extends AsyncTask<PasswordChangeData, Integer, PasswordChangeResult>
{
    public LoginAsyncResponse delegate = null;

    @Override
    protected PasswordChangeResult doInBackground(PasswordChangeData... passwordChangeDatas)
    {
        PasswordChangeResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAdress, AppSettings.Port);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            AuthenticationClientService.Client client = new AuthenticationClientService.Client(protocol);

            result = client.ChangePassword(passwordChangeDatas[0]);

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

    protected void onPostExecute(PasswordChangeResult result)
    {
        delegate.passwordChangedProcessFinish(result);
    }
}
