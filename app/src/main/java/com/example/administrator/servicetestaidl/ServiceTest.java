package com.example.administrator.servicetestaidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;


public class ServiceTest extends Service {


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("ServiceTest","  ----->  onCreate");
    }


    @Override
    public int onStartCommand(Intent intent,int flags, int startId) {

        Log.d("ServiceTest","  ----->  onStartCommand");

        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d("ServiceTest","  ----->  onDestroy");

    }

    @Override
    public IBinder onBind(Intent intent) {

        return new Mybind();
    }


    class Mybind extends Binder{
        public String getString(){
            Log.d("ServiceTest","  ----->  getString");
            String string = "aidl是跨进程间通信";
            return string;
        }
    }



}
