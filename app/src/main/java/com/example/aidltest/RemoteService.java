package com.example.aidltest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;


public class RemoteService extends Service {

    private IUserManager.Stub mBinder = new IUserManager.Stub() {
        @Override
        public User getUser(String name) throws RemoteException {
            return new User(name, "123456");
        }
    };

    public RemoteService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
