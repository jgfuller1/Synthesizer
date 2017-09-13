package com.example.user.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int WHOLE_NOTE = 1000;
    private MediaPlayer[] notes;
    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton,
            fButton, fsButton, gButton, gsButton, ahButton, ashButton, bhButton, chButton,
            cshButton, dhButton, dshButton, ehButton, fhButton, fshButton, ghButton, gshButton,
            play1Button, play1_1Button, play2Button, dontButton;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote,
            gNote, gsNote, ahNote, ashNote, bhNote, chNote, cshNote, dhNote, dshNote, ehNote,
            fhNote, fshNote, ghNote, gshNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        //creates array notes with all notes
        notes = new MediaPlayer[]{
                aNote = MediaPlayer.create(this, R.raw.scalea),
                asNote = MediaPlayer.create(this, R.raw.scalebb),
                bNote = MediaPlayer.create(this, R.raw.scaleb),
                cNote = MediaPlayer.create(this, R.raw.scalec),
                csNote = MediaPlayer.create(this, R.raw.scalecs),
                dNote = MediaPlayer.create(this, R.raw.scaled),
                dsNote = MediaPlayer.create(this, R.raw.scaleds),
                eNote = MediaPlayer.create(this, R.raw.scalee),
                fNote = MediaPlayer.create(this, R.raw.scalef),
                fsNote = MediaPlayer.create(this, R.raw.scalefs),
                gNote = MediaPlayer.create(this, R.raw.scaleg),
                gsNote = MediaPlayer.create(this, R.raw.scalegs),
                ahNote = MediaPlayer.create(this, R.raw.scalehigha),
                ashNote = MediaPlayer.create(this, R.raw.scalehighbb),
                bhNote = MediaPlayer.create(this, R.raw.scalehighb),
                chNote = MediaPlayer.create(this, R.raw.scalehighc),
                cshNote = MediaPlayer.create(this, R.raw.scalehighcs),
                dhNote = MediaPlayer.create(this, R.raw.scalehighd),
                dshNote = MediaPlayer.create(this, R.raw.scalehighds),
                ehNote = MediaPlayer.create(this, R.raw.scalehighe),
                fhNote = MediaPlayer.create(this, R.raw.scalehighf),
                fshNote = MediaPlayer.create(this, R.raw.scalehighfs),
                ghNote = MediaPlayer.create(this, R.raw.scalehighg),
                gshNote = MediaPlayer.create(this, R.raw.scalehighgs),
        };
    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        ahButton = (Button) findViewById(R.id.button_ah);
        ashButton = (Button) findViewById(R.id.button_ash);
        bhButton = (Button) findViewById(R.id.button_bh);
        chButton = (Button) findViewById(R.id.button_ch);
        cshButton = (Button) findViewById(R.id.button_csh);
        dhButton = (Button) findViewById(R.id.button_dh);
        dshButton = (Button) findViewById(R.id.button_dsh);
        ehButton = (Button) findViewById(R.id.button_eh);
        fhButton = (Button) findViewById(R.id.button_fh);
        fshButton = (Button) findViewById(R.id.button_fsh);
        ghButton = (Button) findViewById(R.id.button_gh);
        gshButton = (Button) findViewById(R.id.button_gsh);
        play1Button = (Button) findViewById(R.id.button_play1);
        play1_1Button = (Button) findViewById(R.id.button_play1_1);
        play2Button = (Button) findViewById(R.id.button_play2);
        dontButton = (Button) findViewById(R.id.button_dont);
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        ahButton.setOnClickListener(this);
        ashButton.setOnClickListener(this);
        bhButton.setOnClickListener(this);
        chButton.setOnClickListener(this);
        cshButton.setOnClickListener(this);
        dhButton.setOnClickListener(this);
        dshButton.setOnClickListener(this);
        ehButton.setOnClickListener(this);
        fhButton.setOnClickListener(this);
        fshButton.setOnClickListener(this);
        ghButton.setOnClickListener(this);
        gshButton.setOnClickListener(this);
        play1Button.setOnClickListener(this);
        play1_1Button.setOnClickListener(this);
        play2Button.setOnClickListener(this);
        dontButton.setOnClickListener(this);
    }
    //IN CASE THE ARRAY BRAKES
//    private void createdMediaPlayers() {
//        notes =  {
//                aNote = MediaPlayer.create(this, R.raw.scalea),
//                asNote = MediaPlayer.create(this, R.raw.scalebb),
//                bNote = MediaPlayer.create(this, R.raw.scaleb),
//                cNote = MediaPlayer.create(this, R.raw.scalec),
//                csNote = MediaPlayer.create(this, R.raw.scalecs),
//                dNote = MediaPlayer.create(this, R.raw.scaled),
//                dsNote = MediaPlayer.create(this, R.raw.scaleds),
//                eNote = MediaPlayer.create(this, R.raw.scalee),
//                fNote = MediaPlayer.create(this, R.raw.scalef),
//                fsNote = MediaPlayer.create(this, R.raw.scalefs),
//                gNote = MediaPlayer.create(this, R.raw.scaleg),
//                gsNote = MediaPlayer.create(this, R.raw.scalegs),
//                ahNote = MediaPlayer.create(this, R.raw.scalehigha),
//                ashNote = MediaPlayer.create(this, R.raw.scalehighbb),
//                bhNote = MediaPlayer.create(this, R.raw.scalehighb),
//                chNote = MediaPlayer.create(this, R.raw.scalehighc),
//                cshNote = MediaPlayer.create(this, R.raw.scalehighcs),
//                dhNote = MediaPlayer.create(this, R.raw.scalehighd),
//                dshNote = MediaPlayer.create(this, R.raw.scalehighds),
//                ehNote = MediaPlayer.create(this, R.raw.scalehighe),
//                fhNote = MediaPlayer.create(this, R.raw.scalehighf),
//                fshNote = MediaPlayer.create(this, R.raw.scalehighfs),
//                ghNote = MediaPlayer.create(this, R.raw.scalehighg),
//                gshNote = MediaPlayer.create(this, R.raw.scalehighgs),
//        };
//
//    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }


    @Override
    public void onClick(View view) { //what to do for each button.
        switch (view.getId()) {
            case R.id.button_play2:
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cNote.pause();
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cNote.pause();
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.pause();
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.pause();
                ahNote.seekTo(0);
                ahNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ahNote.pause();
                ahNote.seekTo(0);
                ahNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ahNote.pause();
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.pause();
                fNote.seekTo(0);
                fNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fNote.pause();
                fNote.seekTo(0);
                fNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fNote.pause();
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.pause();
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.pause();
                dNote.seekTo(0);
                dNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dNote.pause();
                dNote.seekTo(0);
                dNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dNote.pause();
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_dont: //just don't
                try {
                    delayPlaying(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } //rest for 3 seconds to add confusion
                for (MediaPlayer b : notes) {
                    b.seekTo(0);
                    b.start();
                    b.seekTo(0);
                    b.start();
                    b.seekTo(0);
                    b.start();
                    b.seekTo(0);
                    b.start();
                    for (MediaPlayer a : notes) {
                        a.seekTo(0);
                        a.start();
                        a.seekTo(0);
                        a.start();
                        a.seekTo(0);
                        a.start();
                        a.seekTo(0);
                        a.start();
                        for (MediaPlayer c : notes) {
                            c.seekTo(0);
                            c.start();
                            c.seekTo(0);
                            c.start();
                            c.seekTo(0);
                            c.start();
                            c.seekTo(0);
                            c.start();
                            for (MediaPlayer d : notes) {
                                dont();
                            }
                            c.seekTo(0);
                            c.start();
                            c.seekTo(0);
                            c.start();
                            c.seekTo(0);
                            c.start();
                            c.seekTo(0);
                            c.start();
                        }
                        a.seekTo(0);
                        a.start();
                        a.seekTo(0);
                        a.start();
                        a.seekTo(0);
                        a.start();
                        a.seekTo(0);
                        a.start();
                    }
                    b.seekTo(0);
                    b.start();
                    b.seekTo(0);
                    b.start();
                    b.seekTo(0);
                    b.start();

                    b.seekTo(0);
                    b.start();
                }

                break;
            case R.id.button_play1_1://Play through all 24 notes half note delays
                for (MediaPlayer a : notes) {
                    int noteTracker = 0;
                    if (noteTracker == 25) {
                        break;
                    } else {
                        a.seekTo(0);
                        a.start();
                        try {
                            delayPlaying(WHOLE_NOTE / 2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        noteTracker++;
                    }
                }
                break;
            case R.id.button_play1: //Plays Scale
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying(WHOLE_NOTE / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fsNote.seekTo(0);
                fsNote.start();
                try {
                    delayPlaying(WHOLE_NOTE / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying(WHOLE_NOTE / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ahNote.seekTo(0);
                ahNote.start();
                try {
                    delayPlaying(WHOLE_NOTE / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bhNote.seekTo(0);
                bhNote.start();
                try {
                    delayPlaying(WHOLE_NOTE / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cshNote.seekTo(0);
                cshNote.start();
                try {
                    delayPlaying(WHOLE_NOTE / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dhNote.seekTo(0);
                dhNote.start();
                try {
                    delayPlaying(WHOLE_NOTE / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ehNote.seekTo(0);
                ehNote.start();
                try {
                    delayPlaying(WHOLE_NOTE / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
//play the corresponding note when the button is pressed
            case R.id.button_a:
                //Toast.makeText(this, "A pressed", Toast.LENGTH_SHORT).show();
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_as:
                //Toast.makeText(this, "A# pressed", Toast.LENGTH_SHORT).show();
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_gs:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.button_g:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_ah:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                ahNote.seekTo(0);
                ahNote.start();
                break;
            case R.id.button_ash:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                ashNote.seekTo(0);
                ashNote.start();
                break;
            case R.id.button_bh:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                bhNote.seekTo(0);
                bhNote.start();
                break;
            case R.id.button_ch:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                chNote.seekTo(0);
                chNote.start();
                break;
            case R.id.button_csh:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                cshNote.seekTo(0);
                cshNote.start();
                break;
            case R.id.button_dh:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                dhNote.seekTo(0);
                dhNote.start();
                break;
            case R.id.button_dsh:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                dshNote.seekTo(0);
                dshNote.start();
                break;
            case R.id.button_eh:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                ehNote.seekTo(0);
                ehNote.start();
                break;
            case R.id.button_fh:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                fhNote.seekTo(0);
                fhNote.start();
                break;
            case R.id.button_fsh:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                fshNote.seekTo(0);
                fshNote.start();
                break;
            case R.id.button_gh:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                ghNote.seekTo(0);
                ghNote.start();
                break;
            case R.id.button_gsh:
                //Toast.makeText(this, "B pressed", Toast.LENGTH_SHORT).show();
                gshNote.seekTo(0);
                gshNote.start();
                break;
            default:
                Toast.makeText(this, "test toast please ignore", Toast.LENGTH_SHORT).show();

        }
    }
//add layers of ear shredding
    private void dont() {
        for (MediaPlayer b : notes) {
            b.seekTo(0);
            b.start();
            b.seekTo(0);
            b.start();
            b.seekTo(0);
            b.start();
            b.seekTo(0);
            b.start();
            for (MediaPlayer a : notes) {
                a.seekTo(0);
                a.start();
                a.seekTo(0);
                a.start();
                a.seekTo(0);
                a.start();
                a.seekTo(0);
                a.start();
                for (MediaPlayer c : notes) {
                    c.seekTo(0);
                    c.start();
                    c.seekTo(0);
                    c.start();
                    c.seekTo(0);
                    c.start();
                    c.seekTo(0);
                    c.start();
                    c.seekTo(0);
                    c.start();
                    c.seekTo(0);
                    c.start();
                    c.seekTo(0);
                    c.start();
                    c.seekTo(0);
                    c.start();
                }
                a.seekTo(0);
                a.start();
                a.seekTo(0);
                a.start();
                a.seekTo(0);
                a.start();
                a.seekTo(0);
                a.start();
            }
            b.seekTo(0);
            b.start();
            b.seekTo(0);
            b.start();
            b.seekTo(0);
            b.start();
            b.seekTo(0);
            b.start();
        }
    }
}
