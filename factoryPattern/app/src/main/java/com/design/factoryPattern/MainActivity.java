package com.design.factoryPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.design.factoryPattern.factory.UserFactory;
import com.design.factoryPattern.model.User;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {



    @BindView(R.id.userName)
    EditText mUserId;

    @BindView(R.id.memberTypes)
    Spinner mMemberTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        addItemsOnSpinner();
    }


    @OnClick(R.id.submit)
    public void memberShipCreate(View view) {
        User user= UserFactory.CreateMemberShip(mMemberTypes.getSelectedItem().toString());
        user.register(mUserId.getText().toString());

    }


    // add items into spinner dynamically
    public void addItemsOnSpinner() {


        List<String> list = new ArrayList<String>();
        list.add("fullyear");
        list.add("Monthly");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mMemberTypes.setAdapter(dataAdapter);
    }
}
