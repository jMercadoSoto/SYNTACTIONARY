package com.example.jay.myapplication;

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

    @Override

    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                level_switch.setVisibility(View.VISIBLE);
                set_hard.setVisibility(View.VISIBLE);
                submit_button.setVisibility(View.VISIBLE);
                String str = fix_text(arr);
                System.out.println(str);
                mytext = findViewById(R.id.maintext);
                mytext.setText(str);

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

                int selected_id1 = radioGroupA.getCheckedRadioButtonId();
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
            level_database = hard_dictionaries();
        }
        else
            level_database = easy_dictionaries();


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

    public ArrayList<String> hard_dictionaries()
    {
        ArrayList<String> myDic_DB = new ArrayList<>();
        myDic_DB.add("abject");
        myDic_DB.add("aberration");
        myDic_DB.add("abjure");
        myDic_DB.add("abnegation");
        myDic_DB.add("abrogate");
        myDic_DB.add("abscond");
        myDic_DB.add("abstruse");
        myDic_DB.add("accede");
        myDic_DB.add("accost");
        myDic_DB.add("accretion");
        myDic_DB.add("acumen");
        myDic_DB.add("adamant");
        myDic_DB.add("admonish");
        myDic_DB.add("adumbrate");
        myDic_DB.add("adverse");
        myDic_DB.add("advocate");
        myDic_DB.add("affluent");
        myDic_DB.add("aggrandize");
        myDic_DB.add("alacrity");
        myDic_DB.add("alias");
        myDic_DB.add("ambivalent");
        myDic_DB.add("amenable");
        myDic_DB.add("amorphous");
        myDic_DB.add("anachronistic");
        myDic_DB.add("anathema");
        myDic_DB.add("annex");
        myDic_DB.add("antediluvian");
        myDic_DB.add("antiseptic");
        myDic_DB.add("apathetic");
        myDic_DB.add("antithesis");
        myDic_DB.add("apocryphal");
        myDic_DB.add("approbation");
        myDic_DB.add("arbitrary");
        myDic_DB.add("arboreal");
        myDic_DB.add("arcane");
        myDic_DB.add("archetypal");
        myDic_DB.add("arrogate");
        myDic_DB.add("ascetic");
        myDic_DB.add("aspersion");
        myDic_DB.add("assiduous");
        myDic_DB.add("atrophy");
        myDic_DB.add("bane");
        myDic_DB.add("bashful");
        myDic_DB.add("beguile");
        myDic_DB.add("bereft");
        myDic_DB.add("blandishment");
        myDic_DB.add("bilk");
        myDic_DB.add("bombastic");
        myDic_DB.add("cajole");
        myDic_DB.add("callous");
        myDic_DB.add("calumny");
        myDic_DB.add("camaraderie");
        myDic_DB.add("candor");
        myDic_DB.add("capitulate");
        myDic_DB.add("carouse");
        myDic_DB.add("cavort");
        myDic_DB.add("circumlocution");
        myDic_DB.add("circumscribe");
        myDic_DB.add("circumvent");
        myDic_DB.add("clamor");
        myDic_DB.add("cleave");
        myDic_DB.add("cobbler");
        myDic_DB.add("cogent");
        myDic_DB.add("cognizant");
        myDic_DB.add("commensurate");
        myDic_DB.add("complement");
        myDic_DB.add("compunction");
        myDic_DB.add("concomitant");
        myDic_DB.add("conduit");
        myDic_DB.add("conflagration");
        myDic_DB.add("congruity");
        myDic_DB.add("connive");
        myDic_DB.add("consign");
        myDic_DB.add("constituent");
        myDic_DB.add("construe");
        myDic_DB.add("contusion");
        myDic_DB.add("contrite");
        myDic_DB.add("contentious");
        myDic_DB.add("contravene");
        myDic_DB.add("convivial");
        myDic_DB.add("corpulence");
        myDic_DB.add("covet");
        myDic_DB.add("cupidity");
        myDic_DB.add("dearth");
        myDic_DB.add("debacle");
        myDic_DB.add("debauch");
        myDic_DB.add("debunk");
        myDic_DB.add("debunk");
        myDic_DB.add("demagogue");
        myDic_DB.add("denigrate");
        myDic_DB.add("derivative");
        myDic_DB.add("despot");
        myDic_DB.add("diaphanous");
        myDic_DB.add("didactic");
        myDic_DB.add("dirge");
        myDic_DB.add("disaffected");
        myDic_DB.add("discomfit");
        myDic_DB.add("disparate");
        myDic_DB.add("dispel");
        myDic_DB.add("disrepute");
        myDic_DB.add("divisive");
        myDic_DB.add("dogmatic");
        myDic_DB.add("dour");
        myDic_DB.add("duplicity");
        myDic_DB.add("duress");
        myDic_DB.add("eclectic");
        myDic_DB.add("edict");
        myDic_DB.add("ebullient");
        myDic_DB.add("egregious");
        myDic_DB.add("elegy");
        myDic_DB.add("elicit");
        myDic_DB.add("embezzlement");
        myDic_DB.add("emend");
        myDic_DB.add("emollient");
        myDic_DB.add("empirical");
        myDic_DB.add("emulate");
        myDic_DB.add("enervate");
        myDic_DB.add("enfranchise");
        myDic_DB.add("engender");
        myDic_DB.add("ephemeral");
        myDic_DB.add("epistolary");
        myDic_DB.add("equanimity");
        myDic_DB.add("equivocal");
        myDic_DB.add("espouse");
        myDic_DB.add("evanescent");
        myDic_DB.add("evince");
        myDic_DB.add("exacerbate");
        myDic_DB.add("exhort");
        myDic_DB.add("execrable");
        myDic_DB.add("exigent");
        myDic_DB.add("expedient");
        myDic_DB.add("expiate");
        myDic_DB.add("expunge");
        myDic_DB.add("extraneous");
        myDic_DB.add("extol");
        myDic_DB.add("extant");
        myDic_DB.add("expurgate");
        myDic_DB.add("fallacious");
        myDic_DB.add("fatuous");
        myDic_DB.add("fetter");
        myDic_DB.add("flagrant");
        myDic_DB.add("foil");
        myDic_DB.add("forbearance");
        myDic_DB.add("fortuitous");
        myDic_DB.add("fractious");
        myDic_DB.add("garrulous");
        myDic_DB.add("gourmand");
        myDic_DB.add("grandiloquent");
        myDic_DB.add("gratuitous");
        myDic_DB.add("hapless");
        myDic_DB.add("hegemony");
        myDic_DB.add("heterogenous");
        myDic_DB.add("iconoclast");
        myDic_DB.add("idiosyncratic");
        myDic_DB.add("impecunious");
        myDic_DB.add("impetuous");
        myDic_DB.add("impinge");
        myDic_DB.add("impute");
        myDic_DB.add("inane");
        myDic_DB.add("inchoate");
        myDic_DB.add("incontrovertible");
        myDic_DB.add("incumbent");
        myDic_DB.add("inexorable");
        myDic_DB.add("inimical");
        myDic_DB.add("injunction");
        myDic_DB.add("inoculate");
        myDic_DB.add("insidious");
        myDic_DB.add("instigate");
        myDic_DB.add("insurgent");
        myDic_DB.add("interlocutor");
        myDic_DB.add("intimation");
        myDic_DB.add("inure");
        myDic_DB.add("invective");
        myDic_DB.add("intransigent");
        myDic_DB.add("inveterate");
        myDic_DB.add("irreverence");
        myDic_DB.add("knell");
        myDic_DB.add("largesse");
        myDic_DB.add("legerdemain");
        myDic_DB.add("libertarian");
        myDic_DB.add("licentious");
        myDic_DB.add("linchpin");
        myDic_DB.add("litigant");
        myDic_DB.add("maelstrom");
        myDic_DB.add("maudlin");
        myDic_DB.add("maverick");
        myDic_DB.add("mawkish");
        myDic_DB.add("maxim");
        myDic_DB.add("mendacious");
        myDic_DB.add("modicum");
        myDic_DB.add("morass");
        myDic_DB.add("mores");
        myDic_DB.add("munificent");
        myDic_DB.add("multifarious");
        myDic_DB.add("nadir");
        myDic_DB.add("negligent");
        myDic_DB.add("neophyte");
        myDic_DB.add("noxious");
        myDic_DB.add("obdurate");
        myDic_DB.add("obfuscate");
        myDic_DB.add("obstreperous");
        myDic_DB.add("officious");
        myDic_DB.add("onerous");
        myDic_DB.add("ostensible");
        myDic_DB.add("ostracism");
        myDic_DB.add("palliate");
        myDic_DB.add("panacea");
        myDic_DB.add("paradigm");
        myDic_DB.add("pariah");
        myDic_DB.add("partisan");
        myDic_DB.add("paucity");
        myDic_DB.add("pejorative");
        myDic_DB.add("pellucid");
        myDic_DB.add("penchant");
        myDic_DB.add("penurious");
        myDic_DB.add("pert");
        myDic_DB.add("pernicious");
        myDic_DB.add("pertinacious");
        myDic_DB.add("phlegmatic");
        myDic_DB.add("philanthropic");
        myDic_DB.add("pithy");
        myDic_DB.add("platitude");
        myDic_DB.add("plaudit");
        myDic_DB.add("plenitude");
        myDic_DB.add("plethora");
        myDic_DB.add("portent");
        myDic_DB.add("potentate");
        myDic_DB.add("preclude");
        myDic_DB.add("predilection");
        myDic_DB.add("preponderance");
        myDic_DB.add("presage");
        myDic_DB.add("probity");
        myDic_DB.add("proclivity");
        myDic_DB.add("profligate");
        myDic_DB.add("promulgate");
        myDic_DB.add("proscribe");
        myDic_DB.add("protean");
        myDic_DB.add("prurient");
        myDic_DB.add("puerile");
        myDic_DB.add("pugnacious");
        myDic_DB.add("pulchritude");
        myDic_DB.add("punctilious");
        myDic_DB.add("quaint");
        myDic_DB.add("quixotic");
        myDic_DB.add("quandary");
        myDic_DB.add("recalcitrant");
        myDic_DB.add("redoubtable");
        myDic_DB.add("relegate");
        myDic_DB.add("remiss");
        myDic_DB.add("reprieve");
        myDic_DB.add("reprobate");
        myDic_DB.add("rescind");
        myDic_DB.add("requisition");
        myDic_DB.add("rife");
        myDic_DB.add("sanctimonious");
        myDic_DB.add("sanguine");
        myDic_DB.add("scurrilous");
        myDic_DB.add("semaphore");
        myDic_DB.add("serendipity");
        myDic_DB.add("sobriety");
        myDic_DB.add("solicitous");
        myDic_DB.add("solipsism");
        myDic_DB.add("spurious");
        myDic_DB.add("staid");
        myDic_DB.add("stolid");
        myDic_DB.add("subjugate");
        myDic_DB.add("surfeit");
        myDic_DB.add("surreptitious");
        myDic_DB.add("swarthy");
        myDic_DB.add("tangential");
        myDic_DB.add("tome");
        myDic_DB.add("toady");
        myDic_DB.add("torpid");
        myDic_DB.add("travesty");
        myDic_DB.add("trenchant");
        myDic_DB.add("trite");
        myDic_DB.add("truculent");
        myDic_DB.add("turpitude");
        myDic_DB.add("ubiquitous");
        myDic_DB.add("umbrage");
        myDic_DB.add("upbraid");
        myDic_DB.add("utilitarian");
        myDic_DB.add("veracity");
        myDic_DB.add("vestige");
        myDic_DB.add("vicissitude");
        myDic_DB.add("vilify");
        myDic_DB.add("virtuoso");
        myDic_DB.add("vitriolic");
        myDic_DB.add("vituperate");
        myDic_DB.add("vociferous");
        myDic_DB.add("wanton");
        myDic_DB.add("winsome");
        myDic_DB.add("yoke");
        myDic_DB.add("zephyr");
        myDic_DB.add("wily");
        myDic_DB.add("tirade");
        return myDic_DB;
    }

    public ArrayList<String> easy_dictionaries()
    {
        ArrayList<String> myDB_easy = new ArrayList<>();
        myDB_easy.add("the");
        myDB_easy.add("of");
        myDB_easy.add("and");
        myDB_easy.add("to");
        myDB_easy.add("in");
        myDB_easy.add("is");
        myDB_easy.add("you");
        myDB_easy.add("that");
        myDB_easy.add("or");
        myDB_easy.add("one");
        myDB_easy.add("which");
        myDB_easy.add("no");
        myDB_easy.add("our");
        myDB_easy.add("health");
        myDB_easy.add("study");
        myDB_easy.add("why");
        myDB_easy.add("few");
        myDB_easy.add("had");
        myDB_easy.add("system");
        myDB_easy.add("computer");
        myDB_easy.add("keep");
        myDB_easy.add("part");
        myDB_easy.add("start");
        myDB_easy.add("something");
        myDB_easy.add("without");
        myDB_easy.add("better");
        myDB_easy.add("general");
        myDB_easy.add("process");
        myDB_easy.add("thanks");
        myDB_easy.add("specific");
        myDB_easy.add("she");
        myDB_easy.add("come");
        myDB_easy.add("sure");
        myDB_easy.add("both");
        myDB_easy.add("heat");
        myDB_easy.add("specific");
        myDB_easy.add("enough");
        myDB_easy.add("long");
        myDB_easy.add("lot");
        myDB_easy.add("hand");
        myDB_easy.add("popular");
        myDB_easy.add("small");
        myDB_easy.add("though");
        myDB_easy.add("experience");
        myDB_easy.add("include");
        myDB_easy.add("job");
        myDB_easy.add("music");
        myDB_easy.add("person");
        myDB_easy.add("really");
        myDB_easy.add("although");
        myDB_easy.add("thank");
        myDB_easy.add("book");
        myDB_easy.add("early");
        myDB_easy.add("reading");
        myDB_easy.add("end");
        myDB_easy.add("method");
        myDB_easy.add("never");
        myDB_easy.add("less");
        myDB_easy.add("play");
        myDB_easy.add("able");
        myDB_easy.add("data");
        myDB_easy.add("feel");
        myDB_easy.add("high");
        myDB_easy.add("off");
        myDB_easy.add("point");
        myDB_easy.add("type");
        myDB_easy.add("whether");
        myDB_easy.add("food");
        myDB_easy.add("understanding");
        myDB_easy.add("here");
        myDB_easy.add("home");
        myDB_easy.add("certain");
        myDB_easy.add("economy");
        myDB_easy.add("little");
        myDB_easy.add("theory");
        myDB_easy.add("tonight");
        myDB_easy.add("law");
        myDB_easy.add("put");
        myDB_easy.add("under");
        myDB_easy.add("value");
        myDB_easy.add("always");
        myDB_easy.add("body");
        myDB_easy.add("common");
        myDB_easy.add("market");
        myDB_easy.add("set");
        myDB_easy.add("bird");
        myDB_easy.add("guide");
        myDB_easy.add("provide");
        myDB_easy.add("change");
        myDB_easy.add("interest");
        myDB_easy.add("literature");
        myDB_easy.add("sometimes");
        myDB_easy.add("problem");
        myDB_easy.add("say");
        myDB_easy.add("next");
        myDB_easy.add("create");
        myDB_easy.add("simple");
        myDB_easy.add("software");
        myDB_easy.add("state");
        myDB_easy.add("together");
        myDB_easy.add("control");
        myDB_easy.add("knowledge");
        myDB_easy.add("power");
        myDB_easy.add("radio");
        myDB_easy.add("ability");
        myDB_easy.add("basic");
        myDB_easy.add("course");
        myDB_easy.add("economics");
        myDB_easy.add("hard");
        myDB_easy.add("add");
        myDB_easy.add("company");
        myDB_easy.add("known");
        myDB_easy.add("love");
        myDB_easy.add("past");
        myDB_easy.add("price");
        myDB_easy.add("size");
        myDB_easy.add("away");
        myDB_easy.add("big");
        myDB_easy.add("internet");
        myDB_easy.add("possible");
        myDB_easy.add("television");
        myDB_easy.add("three");
        myDB_easy.add("various");
        myDB_easy.add("yourself");
        myDB_easy.add("card");
        myDB_easy.add("difficult");
        myDB_easy.add("including");
        myDB_easy.add("list");
        myDB_easy.add("mind");
        myDB_easy.add("particular");
        myDB_easy.add("real");
        myDB_easy.add("science");
        myDB_easy.add("trade");
        myDB_easy.add("consider");
        myDB_easy.add("either");
        myDB_easy.add("library");
        myDB_easy.add("likely");
        myDB_easy.add("nature");
        myDB_easy.add("fact");
        myDB_easy.add("line");
        myDB_easy.add("product");
        myDB_easy.add("care");
        myDB_easy.add("group");
        myDB_easy.add("idea");
        myDB_easy.add("risk");
        myDB_easy.add("several");
        myDB_easy.add("someone");
        myDB_easy.add("temperature");
        myDB_easy.add("united");
        myDB_easy.add("word");
        myDB_easy.add("fat");
        myDB_easy.add("force");
        myDB_easy.add("key");
        myDB_easy.add("light");
        myDB_easy.add("simply");
        myDB_easy.add("today");
        myDB_easy.add("training");
        myDB_easy.add("until");
        myDB_easy.add("major");
        myDB_easy.add("name");
        myDB_easy.add("personal");
        myDB_easy.add("school");
        myDB_easy.add("top");
        myDB_easy.add("current");
        myDB_easy.add("generally");
        myDB_easy.add("historical");
        myDB_easy.add("investment");
        myDB_easy.add("left");
        myDB_easy.add("national");
        myDB_easy.add("amount");
        myDB_easy.add("level");
        myDB_easy.add("order");
        myDB_easy.add("practice");
        myDB_easy.add("research");
        myDB_easy.add("sense");
        myDB_easy.add("service");
        myDB_easy.add("area");
        myDB_easy.add("cut");
        myDB_easy.add("hot");
        myDB_easy.add("instead");
        myDB_easy.add("least");
        myDB_easy.add("natural");
        myDB_easy.add("physical");
        myDB_easy.add("piece");
        myDB_easy.add("show");
        myDB_easy.add("choose");
        myDB_easy.add("industry");
        myDB_easy.add("mental");
        myDB_easy.add("move");
        myDB_easy.add("sport");
        myDB_easy.add("actually");
        myDB_easy.add("against");



        return myDB_easy;
    }

}
