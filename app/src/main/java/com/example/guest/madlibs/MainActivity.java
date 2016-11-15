package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.button) Button mButton;
    @Bind(R.id.inputBodyPartEditText) EditText mBodyPartEditText;
    @Bind(R.id.inputDayEditText) EditText mDayEditText;
    @Bind(R.id.inputFacialExpressionEditText) EditText mExpressionEditText;
    @Bind(R.id.inputFoodEditText) EditText mFoodEditText;
    @Bind(R.id.inputFoodPlacEditText) EditText mFoodPlaceEditText;
    @Bind(R.id.inputNounEditText) EditText mNounEditText;
    @Bind(R.id.inputVehicleEditText) EditText mVehicleEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vehicle = mVehicleEditText.getText().toString();
                String noun = mNounEditText.getText().toString();
                String place = mFoodPlaceEditText.getText().toString();
                String food = mFoodEditText.getText().toString();
                String expression = mExpressionEditText.getText().toString();
                String day = mDayEditText.getText().toString();
                String bodypart = mBodyPartEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, StoryActivity.class);

                intent.putExtra("vehicle", vehicle);
                intent.putExtra("noun", noun);
                intent.putExtra("place", place);
                intent.putExtra("food", food);
                intent.putExtra("expression", expression);
                intent.putExtra("day", day);
                intent.putExtra("bodypart", bodypart);

                startActivity(intent);


            }
        });
    }
}
