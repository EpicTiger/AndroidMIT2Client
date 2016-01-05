package com.example.rainer.mit2client;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import Generated.AuthenticationClientService;
import Generated.LoginData;
import Generated.LoginResult;

public class LoginActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ExexuteThrift();

        setContentView(R.layout.login_layout);

        getFragmentManager().addOnBackStackChangedListener(this);

        if (savedInstanceState == null)
        {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentParentViewGroup, new LoginFragment())
                    .commit();
        }
    }

    private void ExexuteThrift()
    {
        try {
            TTransport transport;

            transport = new TSocket("10.77.140.64", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            AuthenticationClientService.Client client = new AuthenticationClientService.Client(protocol);

            LoginData loginData = new LoginData();
            loginData.setEmail("dwahkdwa");
            loginData.setPassword("dawdwa");

            LoginResult result = client.Login(loginData);

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
        } else {
            getFragmentManager().popBackStack();
        }
    }

    @Override
    public void onBackStackChanged() {
        Log.v("FragmentManager", "Changefragment");
    }
}
