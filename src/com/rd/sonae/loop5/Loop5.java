package com.rd.sonae.loop5;

import com.rd.sonae.App;
import com.rd.sonae.loop5.model.MallLoop5;
import com.rd.sonae.model.Mall;
import com.rd.sonae.model.dao.DatabaseHelper;
import com.rd.sonae.utils.Settings;

public class Loop5 extends App {
    private static final String databaseName = "loop5.db";
    private static final String settingsName = "loop5.settings";
    private static final Mall mall = new MallLoop5();

    @Override
    public void onCreate() {
        super.onCreate();

        helper = new DatabaseHelper(getApplicationContext(), databaseName);
        settings = new Settings(getApplicationContext(), settingsName, "de", mall);
        getString(R.string.information);
    }

    @Override
    public Settings getSettings(){
        return settings;
    }

    @Override
    public DatabaseHelper getHelper(){
        return helper;
    }
}
