package com.example.jay.myapplication;

import android.content.Intent;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    Button btn;
    TextView mytext;
    Switch level_switch;

    RadioGroup radioGroupA;
    RadioGroup radioGroupB;
    RadioGroup radioGroupC;
    RadioGroup radioGroupD;
    RadioGroup radioGroupE;
    RadioGroup radioGroupF;
    RadioGroup radioGroupG;
    RadioGroup radioGroupH;
    RadioGroup radioGroupI;
    RadioGroup radioGroupJ;

    RadioButton lin1_1;
    RadioButton lin1_2;
    RadioButton lin1_3;

    RadioButton lin2_1;
    RadioButton lin2_2;
    RadioButton lin2_3;

    RadioButton lin3_1;
    RadioButton lin3_2;
    RadioButton lin3_3;

    RadioButton lin4_1;
    RadioButton lin4_2;
    RadioButton lin4_3;

    RadioButton lin5_1;
    RadioButton lin5_2;
    RadioButton lin5_3;

    RadioButton lin6_1;
    RadioButton lin6_2;
    RadioButton lin6_3;

    RadioButton lin7_1;
    RadioButton lin7_2;
    RadioButton lin7_3;


    RadioButton lin8_1;
    RadioButton lin8_2;
    RadioButton lin8_3;

    RadioButton lin9_1;
    RadioButton lin9_2;
    RadioButton lin9_3;


    RadioButton lin10_1;
    RadioButton lin10_2;
    RadioButton lin10_3;
    TextView set_hard;
    TextView answer_table;
    TextView display_score;
    Button submit_button;
    ArrayList<RadioButton> g1 = new ArrayList<>();
    ArrayList<RadioButton> g2 = new ArrayList<>();
    ArrayList<RadioButton> g3 = new ArrayList<>();
    ArrayList<RadioButton> g4 = new ArrayList<>();
    ArrayList<RadioButton> g5 = new ArrayList<>();
    ArrayList<RadioButton> g6 = new ArrayList<>();
    ArrayList<RadioButton> g7 = new ArrayList<>();
    ArrayList<RadioButton> g8 = new ArrayList<>();
    ArrayList<RadioButton> g9 = new ArrayList<>();
    ArrayList<RadioButton> g10 = new ArrayList<>();


    ArrayList<ArrayList<RadioButton>> radiogroup = new ArrayList<ArrayList<RadioButton>>();

    ArrayList<String> user_answer = new ArrayList<>();

    boolean flag = false;
    ArrayList<String> arr = new ArrayList<>();



    private static int launch_screen_timer = 40000;

    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, launch_screen_timer);


        btn = findViewById(R.id.start);
        level_switch = findViewById(R.id.level_switch);
        level_switch.setOnCheckedChangeListener(this);
        set_hard = findViewById(R.id.set_hard);
        radioGroupA = findViewById(R.id.GroupA);
        radioGroupB = findViewById(R.id.GroupB);
        radioGroupC = findViewById(R.id.GroupC);
        radioGroupD = findViewById(R.id.GroupD);
        radioGroupE = findViewById(R.id.GroupE);
        radioGroupF = findViewById(R.id.GroupF);
        radioGroupG = findViewById(R.id.GroupG);
        radioGroupH = findViewById(R.id.GroupH);
        radioGroupI = findViewById(R.id.GroupI);
        radioGroupJ = findViewById(R.id.GroupJ);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level_switch.setVisibility(View.VISIBLE);
                set_hard.setVisibility(View.VISIBLE);
                String str = fix_text(arr);
                System.out.println(str);
                mytext = findViewById(R.id.maintext);
                mytext.setText(str);
                init_easy_answer();

            }
        });


        onClickListenerButton();


    }



    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;
    RadioButton r5;
    RadioButton r6;
    RadioButton r7;
    RadioButton r8;
    RadioButton r9;
    RadioButton r10;


    public void onClickListenerButton() {
        submit_button = findViewById(R.id.submit_button);
        display_score = findViewById(R.id.display_score);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id1 = 0;
                selected_id1 = radioGroupA.getCheckedRadioButtonId();
                r1 = findViewById(selected_id1);



                int selected_id2 = radioGroupB.getCheckedRadioButtonId();
                r2 = findViewById(selected_id2);

                int selected_id3 = radioGroupC.getCheckedRadioButtonId();
                r3 = findViewById(selected_id3);

                int selected_id4 = radioGroupD.getCheckedRadioButtonId();
                r4 = findViewById(selected_id4);

                int selected_id5 = radioGroupE.getCheckedRadioButtonId();
                r5 = findViewById(selected_id5);

                int selected_id6 = radioGroupF.getCheckedRadioButtonId();
                r6 = findViewById(selected_id6);

                int selected_id7 = radioGroupG.getCheckedRadioButtonId();
                r7 = findViewById(selected_id7);

                int selected_id8 = radioGroupH.getCheckedRadioButtonId();
                r8 = findViewById(selected_id8);

                int selected_id9 = radioGroupI.getCheckedRadioButtonId();
                r9 = findViewById(selected_id9);

                int selected_id10 = radioGroupG.getCheckedRadioButtonId();
                r10 = findViewById(selected_id1);
                //Toast.makeText(MainActivity.this,r1.getText().toString(),Toast.LENGTH_SHORT ).show();



                //Toast.makeText(MainActivity.this,r1.getText().toString(),Toast.LENGTH_SHORT ).show();
                user_answer.add(r1.getText().toString());

                user_answer.add(r2.getText().toString());
                user_answer.add(r3.getText().toString());
                user_answer.add(r4.getText().toString());
                user_answer.add(r5.getText().toString());
                user_answer.add(r6.getText().toString());
                user_answer.add(r7.getText().toString());
                user_answer.add(r8.getText().toString());
                user_answer.add(r9.getText().toString());
                user_answer.add(r10.getText().toString());


                display_correct_answer();
            }
        });


    }

    public void display_correct_answer()
    {
        int score = 0;
        String answer = "Answer: ";

        for(int i = 0; i < 10; i++)
        {
            if(user_answer.get(i) == arr.get(i))
            {
                score++;
            }
            answer += String.valueOf(i + 1) + ": " + arr.get(i) + " ";
        }

        answer_table = findViewById(R.id.answer_table);
        answer_table.setText(answer);
        Toast.makeText(MainActivity.this, "Your Score is : " + String.valueOf(score),Toast.LENGTH_SHORT ).show();

    }



    public void fillGroupButton_array()
    {
        lin1_1 = findViewById(R.id.GroupA_1);
        lin1_2 = findViewById(R.id.GroupA_2);
        lin1_3 = findViewById(R.id.GroupA_3);

        lin2_1 = findViewById(R.id.GroupB_1);
        lin2_2 = findViewById(R.id.GroupB_2);
        lin2_3 = findViewById(R.id.GroupB_3);

        lin3_1 = findViewById(R.id.GroupC_1);
        lin3_2 = findViewById(R.id.GroupC_2);
        lin3_3 = findViewById(R.id.GroupC_3);

        lin4_1 = findViewById(R.id.GroupD_1);
        lin4_2 = findViewById(R.id.GroupD_2);
        lin4_3 = findViewById(R.id.GroupD_3);

        lin5_1 = findViewById(R.id.GroupE_1);
        lin5_2 = findViewById(R.id.GroupE_2);
        lin5_3 = findViewById(R.id.GroupE_3);

        lin6_1 = findViewById(R.id.GroupF_1);
        lin6_2 = findViewById(R.id.GroupF_2);
        lin6_3 = findViewById(R.id.GroupF_3);

        lin7_1 = findViewById(R.id.GroupG_1);
        lin7_2 = findViewById(R.id.GroupG_2);
        lin7_3 = findViewById(R.id.GroupG_3);

        lin8_1 = findViewById(R.id.GroupH_1);
        lin8_2 = findViewById(R.id.GroupH_2);
        lin8_3 = findViewById(R.id.GroupH_3);

        lin9_1 = findViewById(R.id.GroupI_1);
        lin9_2 = findViewById(R.id.GroupI_2);
        lin9_3 = findViewById(R.id.GroupI_3);

        lin10_1 = findViewById(R.id.GroupJ_1);
        lin10_2 = findViewById(R.id.GroupJ_2);
        lin10_3 = findViewById(R.id.GroupJ_3);
        g1.add(lin1_1);
        g1.add(lin1_2);
        g1.add(lin1_3);

        g2.add(lin2_1);
        g2.add(lin2_2);
        g2.add(lin2_3);

        g3.add(lin3_1);
        g3.add(lin3_2);
        g3.add(lin3_3);

        g4.add(lin4_1);
        g4.add(lin4_2);
        g4.add(lin4_3);

        g5.add(lin5_1);
        g5.add(lin5_2);
        g5.add(lin5_3);

        g6.add(lin6_1);
        g6.add(lin6_2);
        g6.add(lin6_3);

        g7.add(lin7_1);
        g7.add(lin7_2);
        g7.add(lin7_3);

        g8.add(lin8_1);
        g8.add(lin8_2);
        g8.add(lin8_3);

        g9.add(lin9_1);
        g9.add(lin9_2);
        g9.add(lin9_3);

        g10.add(lin10_1);
        g10.add(lin10_2);
        g10.add(lin10_3);
        radiogroup.add(g1);
        radiogroup.add(g2);
        radiogroup.add(g3);
        radiogroup.add(g4);
        radiogroup.add(g5);
        radiogroup.add(g6);
        radiogroup.add(g7);
        radiogroup.add(g8);
        radiogroup.add(g9);
        radiogroup.add(g10);
    }

    void init_easy_answer()
    {
        fillGroupButton_array();
        ArrayList<String> level_database = new ArrayList<>();
        easy_database easy_database = new easy_database();
        level_database = easy_database.easy_dictionaries();
        int size;
        //System.out.println(arr.get(1));
        for(int i = 0; i < 10; i++)
        {
            size = level_database.size();
            Random rand = new Random();



            int first;
            int second;
            int correct_index = rand.nextInt(3);
            first = rand.nextInt(3);
            second = first;
            for(int j = 0; j < 20; j++)
                if(first == correct_index)
                    first = rand.nextInt(3);
                else
                    first = first;
            for(int k = 0; k < 20; k++)
            {

                if(second == first || second == correct_index)
                    second = rand.nextInt(3);
                else
                    second = second;
            }
            first = first;
            second = second;

            int myrand1 = rand.nextInt(level_database.size());
            int myrand2 = rand.nextInt(level_database.size());
            for(int h = 0; h < 20; h++)
            {
                if(myrand1 == myrand2)
                    myrand2 = rand.nextInt(level_database.size());
                else
                    myrand2 = myrand2;
            }
            radiogroup.get(i).get(correct_index).setText(arr.get(i));
            radiogroup.get(i).get(first).setText(level_database.get(myrand1));
            radiogroup.get(i).get(second).setText(level_database.get(myrand2));
        }
        radioGroupA.setVisibility(View.VISIBLE);
        radioGroupB.setVisibility(View.VISIBLE);
        radioGroupC.setVisibility(View.VISIBLE);
        radioGroupD.setVisibility(View.VISIBLE);
        radioGroupE.setVisibility(View.VISIBLE);
        radioGroupF.setVisibility(View.VISIBLE);
        radioGroupG.setVisibility(View.VISIBLE);
        radioGroupH.setVisibility(View.VISIBLE);
        radioGroupI.setVisibility(View.VISIBLE);
        radioGroupJ.setVisibility(View.VISIBLE);
        submit_button.setVisibility(View.VISIBLE);

    }
    public void onCheckedChanged(CompoundButton compoundButton, boolean b)
    {
        fillGroupButton_array();
        if(level_switch.isChecked())
            flag = true;
        else
            flag = false;


        ArrayList<String> level_database = new ArrayList<>();
        int size = 0;
        if(flag == true) {
            hard_database hard_dictionaries = new hard_database();
            level_database = hard_dictionaries.hard_dictionaries();
        }
        else {
            easy_database easy_database = new easy_database();
            level_database = easy_database.easy_dictionaries();
        }

        //System.out.println(arr.get(1));
        for(int i = 0; i < 10; i++)
        {
            size = level_database.size();
            Random rand = new Random();



            int first;
            int second;
            int correct_index = rand.nextInt(3);
            first = rand.nextInt(3);
            second = first;
            for(int j = 0; j < 20; j++)
                if(first == correct_index)
                    first = rand.nextInt(3);
                else
                    first = first;
            for(int k = 0; k < 20; k++)
            {

                if(second == first || second == correct_index)
                    second = rand.nextInt(3);
                else
                    second = second;
            }
            first = first;
            second = second;

            int myrand1 = rand.nextInt(level_database.size());
            int myrand2 = rand.nextInt(level_database.size());
            for(int h = 0; h < 20; h++)
            {
                if(myrand1 == myrand2)
                    myrand2 = rand.nextInt(level_database.size());
                else
                    myrand2 = myrand2;
            }
            radiogroup.get(i).get(correct_index).setText(arr.get(i));
            radiogroup.get(i).get(first).setText(level_database.get(myrand1));
            radiogroup.get(i).get(second).setText(level_database.get(myrand2));
        }
        radioGroupA.setVisibility(View.VISIBLE);
        radioGroupB.setVisibility(View.VISIBLE);
        radioGroupC.setVisibility(View.VISIBLE);
        radioGroupD.setVisibility(View.VISIBLE);
        radioGroupE.setVisibility(View.VISIBLE);
        radioGroupF.setVisibility(View.VISIBLE);
        radioGroupG.setVisibility(View.VISIBLE);
        radioGroupH.setVisibility(View.VISIBLE);
        radioGroupI.setVisibility(View.VISIBLE);
        radioGroupJ.setVisibility(View.VISIBLE);
        level_switch.setVisibility(View.INVISIBLE);

        set_hard.setVisibility(View.INVISIBLE);

        submit_button.setVisibility(View.VISIBLE);

    }



    public String display()
    {
        String path = "/sdcard/Download/1.txt";
        String content = "";
        File file = new File(path);
        try {
            InputStream instream = new FileInputStream(file);
            if(instream != null)
            {
                InputStreamReader inputStreamReader = new InputStreamReader(instream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line;
                while((line = bufferedReader.readLine()) != null)
                {
                    content += line + "\n";
                }
                instream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public String fix_text(ArrayList<String> correct_result)
    {
        int len = correct_result.size();
        String fixed_text = " ";
        String text = display();
        String[] str = text.split("\\s+");
        int index = 0;
        int num = 1;
        for(String s: str) {
            if (index % 15 == 0 && index > 15 && num <= 10) {
                correct_result.add(s);
                len++;
                s = Integer.toString(num) + ".______";
                num++;
            }
            fixed_text += s + " ";
            index++;
        }
        return fixed_text;
    }

}

