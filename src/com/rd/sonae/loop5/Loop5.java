package com.rd.sonae.loop5;

import com.rd.sonae.App;
import com.rd.sonae.loop5.model.MallLoop5;
import com.rd.sonae.utils.Constants;
import com.rd.sonae.utils.Settings;

public class Loop5 extends App {


    @Override
    public void onCreate() {
        super.onCreate();
        Settings.setLocaleDefault(this,Constants.LANG_DE);
        mMall = new MallLoop5();
    }

}
