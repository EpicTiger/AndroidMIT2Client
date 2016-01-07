package AsyncClasses;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Politics247Generated.AuthenticationClientService;
import Politics247Generated.LoginData;
import Politics247Generated.LoginResult;
import Util.AppSettings;

public class LoginThriftClass extends AsyncTask<LoginData, Integer, LoginResult>
{
    @Override
    protected LoginResult doInBackground(LoginData... loginDatas)
    {
        LoginResult result = null;
        try
        {
            TSocket tsocket = new TSocket(AppSettings.IpAdress, AppSettings.Port);
            TTransport transport = tsocket;
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            AuthenticationClientService.Client client = new AuthenticationClientService.Client(protocol);

            result = client.Login(loginDatas[0]);

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

    protected void onPostExecute(LoginResult result)
    {
        if (result != null)
        {
            Log.d("result: ", (Boolean.toString(result.isLoginSuccessful)));
        }
        else
        {
            Log.d("result: ", "Null exception");
        }
    }
}
