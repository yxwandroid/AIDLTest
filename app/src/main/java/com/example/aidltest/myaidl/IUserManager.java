package com.example.aidltest.myaidl;

import android.os.IInterface;
import android.os.RemoteException;

import com.example.aidltest.User;

/**
 * 暴露服务端方法的接口
 */
public interface IUserManager extends IInterface {

    User getUser(String name) throws RemoteException;

}
