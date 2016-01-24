package AsyncClasses;

import android.os.AsyncTask;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.AuthenticationClientService;
import Politics247Generated.RegistrationData;
import Politics247Generated.RegistrationResult;
import Util.AppSettings;

public class RegistrationThriftClass extends AsyncTask<RegistrationData, Integer, RegistrationResult>
{
    public LoginAsyncResponse delegate = null;

    @Override
    protected RegistrationResult doInBackground(RegistrationData... registrationDatas)
    {
        RegistrationResult result = null;

        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAddress, AppSettings.AuthenticationPort);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            AuthenticationClientService.Client client = new AuthenticationClientService.Client(protocol);

            result = client.Register(registrationDatas[0]);

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

    protected void onPostExecute(RegistrationResult result)
    {
       delegate.registrationProcessFinish(result);
    }
}
