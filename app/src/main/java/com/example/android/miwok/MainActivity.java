/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //Find view that shows numbers category and set onclicklistener
        TextView numbers = findViewById(R.id.numbers);
        TextView family_members = findViewById(R.id.family);
        TextView colors = findViewById(R.id.colors);
        TextView phrases = findViewById(R.id.phrases);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(myintent);

            }
        });
        family_members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(myintent);

            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(myintent);

            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(myintent);

            }
        });
    }

    public void openNumbersActivity(View view) {
        Intent myintent = new Intent(MainActivity.this, NumbersActivity.class);
        startActivity(myintent);
    }

    public void openFamilyMembersActivity(View view) {
        Intent myintent = new Intent(MainActivity.this, FamilyMembersActivity.class);
        startActivity(myintent);
    }

    public void openColorsActivity(View view) {
        Intent myintent = new Intent(MainActivity.this, ColorsActivity.class);
        startActivity(myintent);
    }

    public void openPhrasesActivity(View view) {
        Intent myintent = new Intent(MainActivity.this, PhrasesActivity.class);
        startActivity(myintent);
    }

}
