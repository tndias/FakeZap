package br.com.psoa.fiap.fakezap.fakezap

import android.app.Application
import com.facebook.stetho.Stetho
import com.orhanobut.hawk.Hawk
import com.orhanobut.hawk.NoEncryption



/**
 * Created by logonrm on 19/03/2018.
 */
class MeuApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this);
        Hawk.init(this)
                //.setEncryption(NoEncryption())
                //.setLogInterceptor(MyLogInterceptor())
                //.setConverter(MyConverter())
                //.setParser(MyParser())
                //.setStorage(MyStorage())
                .build()
    }

}