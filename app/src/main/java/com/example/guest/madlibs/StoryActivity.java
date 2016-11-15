package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StoryActivity extends AppCompatActivity {
    @Bind(R.id.storyTextView) TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String vehicle = intent.getStringExtra("vehicle");
        String food = intent.getStringExtra("food");
        String bodypart = intent.getStringExtra("bodypart");
        String expression = intent.getStringExtra("expression");
        String noun = intent.getStringExtra("noun");
        String place = intent.getStringExtra("place");
        String day = intent.getStringExtra("day");

        Toast.makeText(StoryActivity.this, vehicle, Toast.LENGTH_SHORT).show();

        String story = "She tripped on a " + food;
        story += " and fell into the street in front of a " + vehicle + ".";
        story += " The " + vehicle + " driver screeched the " + vehicle + " to a halt and yelled, 'How dare you!' \n\n";
        story += "She was so mad that she picked up the smooshed " + food + " and threw it at the driver's face";
        story += ". The driver, little did she know, loved her spunk and " + expression;
        story += ". The " + food + " guts ran down his brow and onto his " + bodypart;
        story += ". She said, 'you've got " + food + " on your " + bodypart;
        story += ". haha, haha.' \n\n";
        story += "He wiped his " + bodypart + " and asked, 'Are you free " + day + " night?'";
        story += " Shocked, but not surprised, she replied, 'Normally I wouldn't say yes but you've got a great " + noun + ". ";
        story += "He replied, 'Good, " + place + " is a great place for a food fight.'";

        mStoryTextView.setText(story);
    }
}
