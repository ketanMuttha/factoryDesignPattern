package com.design.factoryPattern.factory;

import com.design.factoryPattern.model.FullYearMemberShipUser;
import com.design.factoryPattern.model.MonthlyMemberShipUser;
import com.design.factoryPattern.model.User;

public class UserFactory {


    public static User CreateMemberShip(String type){

        if(type.equals("fullyear")){
            return new FullYearMemberShipUser();
        }else     if(type.equals("Monthly")){
            return new MonthlyMemberShipUser();
        }

        return null;
    }
}
