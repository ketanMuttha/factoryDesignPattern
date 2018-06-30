package com.design.factoryPattern.model;

import android.util.Log;

public class FullYearMemberShipUser implements User {


    @Override
    public void register(String name) {

        Log.e("",name+ "is registered for yearly");
    }
}
