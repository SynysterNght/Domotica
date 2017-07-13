package com.interfaceinc.domotica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;



import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class clsPrincipal extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference();

    DatabaseReference general= ref.child("General");
    DatabaseReference sala= ref.child("Sala");
    DatabaseReference recamara1= ref.child("Recamara 1");
    DatabaseReference recamara2= ref.child("Recamara 2");
    DatabaseReference cocina= ref.child("Cocina");
    DatabaseReference cuartoservicio= ref.child("Cuarto de Servicio");
    DatabaseReference bano= ref.child("Bano");
    /* hijos */

    /////General///
    DatabaseReference LucesFront= general.child("LucesFront");
    DatabaseReference PuertaP= general.child("PuertaP");
    DatabaseReference PuertaT= general.child("PuertaT");

    ////Sala///
    DatabaseReference LucesS= sala.child("LucesS");
    DatabaseReference VentS= sala.child("VentS");
    DatabaseReference WinS= sala.child("WinS");


    /////Recamara 1/////
    DatabaseReference LucesR1= recamara1.child("LucesR1");
    DatabaseReference VentR1= recamara1.child("VentR1");
    DatabaseReference WinR1= recamara1.child("WinR1");


    ////Recamara 2//
    DatabaseReference LucesR2= recamara2.child("LucesR2");
    DatabaseReference VentR2= recamara2.child("VentR2");
    DatabaseReference WinR2= recamara2.child("WinR2");


    /*Cocina*/
    DatabaseReference LucesCS= cocina.child("LucesCS");
    DatabaseReference VentC= cocina.child("VentC");

    ///Bano////
    DatabaseReference LucesB= bano.child("LucesB");




    ////CuartoServicio///
    DatabaseReference LucesServ= cuartoservicio.child("LucesServ");





/////Bano///
    Switch SwitchLucesB;
    Boolean auxLucesB;

    //////////Cocina///
    Switch SwitchVentC;
    Switch SwitchLucesCS;

    Boolean auxVentC;
    Boolean auxLucesCS;


    /////////Cuarto de Servicio
    Switch SwitchLucesServ;
    Boolean auxLucesServ;

    //////////////General
    Switch SwitchPuertaP;
    Switch SwitchPuertaT;
    Switch SwitchLucesFront;

    Boolean auxPuertaP;
    Boolean auxPuertaT;
    Boolean auxLucesFront;

    ///////////////Sala/////////

    Switch SwitchLucesS;
    Switch SwitchVentS;
    Switch SwitchWinS;

    Boolean auxLucesS;
    Boolean auxVentS;
    Boolean auxWinS;

    //////////////Recamara 1//////
    Switch SwitchLucesR1;
    Switch SwitchVentR1;
    Switch SwitchWinR1;

    Boolean auxLucesR1;
    Boolean auxVentR1;
    Boolean auxWinR1;


    //////////////Recamara 2//////
    Switch SwitchLucesR2;
    Switch SwitchVentR2;
    Switch SwitchWinR2;

    Boolean auxLucesR2;
    Boolean auxVentR2;
    Boolean auxWinR2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        ///////General///


        SwitchLucesFront = (Switch) findViewById(R.id.SLucesFront);
        SwitchLucesFront.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedLucesFront) {

               isCheckedLucesFront = auxLucesFront;
                if (isCheckedLucesFront) {
                    apagar(LucesFront);
                }

                 else{
                    encender(LucesFront);
                }
            }
        });





        SwitchPuertaP = (Switch) findViewById(R.id.SPuertaP);
        SwitchPuertaP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedPuertaP) {

                isCheckedPuertaP = auxPuertaP;
                if (isCheckedPuertaP) {
                    apagar(PuertaP);
                }

                 else{
                    encender(PuertaP);
                }
            }
        });


        SwitchPuertaT = (Switch) findViewById(R.id.SPuertaT);
        SwitchPuertaT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedPuertaT) {

                isCheckedPuertaT = auxPuertaT;
                if (isCheckedPuertaT) {
                    apagar(PuertaT);
                }

                else{
                    encender(PuertaT);
                }
            }
        });


        //////////SALA////

        SwitchLucesS = (Switch) findViewById(R.id.SLucesS);
        SwitchLucesS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedLucesS) {

                isCheckedLucesS = auxLucesS;
                if (isCheckedLucesS) {
                    apagar(LucesS);
                }

                 else{
                    encender(LucesS);
                }
            }
        });




       SwitchWinS=(Switch) findViewById(R.id.SWinS);
        SwitchWinS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedWinS) {

                isCheckedWinS = auxWinS;
                if (isCheckedWinS) {
                    apagar(WinS);
                }

                 else{
                    encender(WinS);
                }
            }
        });

      /*  SwitchWinS=(Switch) findViewById(R.id.SWinS);
        SwitchWinS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(auxWinS){
                    apagar(WinS);
                }else{
                    encender(WinS);
                }

            }
        });*/


        //////RECAMARA 1//////


        SwitchLucesR1=(Switch) findViewById(R.id.SLucesR1);
        SwitchLucesR1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedLucesR1) {

                isCheckedLucesR1 = auxLucesR1;
                if (isCheckedLucesR1) {
                    apagar(LucesR1);
                }

                else{
                    encender(LucesR1);
                }
            }
        });

        SwitchVentR1=(Switch) findViewById(R.id.SVentR1);
        SwitchVentR1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedVentR1) {

                isCheckedVentR1 = auxVentR1;
                if (isCheckedVentR1) {
                    apagar(VentR1);
                }

                else{
                    encender(VentR1);
                }
            }
        });



       SwitchWinR1=(Switch) findViewById(R.id.SWinR1);
      /*  if(auxWinR1==true){
            SwitchWinR1.setChecked(true);
        }else{
            SwitchWinR1.setChecked(false);

        }*/

        SwitchWinR1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedWinR1) {
                if (isCheckedWinR1) {
                    apagar(WinR1);
                }

                else{
                    encender(WinR1);
                }
            }
        });


        ///////////RECAMARA 2////////



        SwitchLucesR2=(Switch) findViewById(R.id.SLucesR2);
        SwitchLucesR2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedLucesR2) {

                isCheckedLucesR2 = auxLucesR2;
                if (isCheckedLucesR2) {
                    apagar(LucesR2);
                }

                else{
                    encender(LucesR2);
                }
            }
        });

        SwitchVentR2=(Switch) findViewById(R.id.SVentR2);
        SwitchVentR2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedVentR2) {

                isCheckedVentR2 = auxVentR2;
                if (isCheckedVentR2) {
                    apagar(VentR2);
                }

                else{
                    encender(VentR2);
                }
            }
        });



        SwitchWinR2=(Switch) findViewById(R.id.SWinR2);
        SwitchWinR2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedWinR2) {

                isCheckedWinR2 = auxWinR2;
                if (isCheckedWinR2) {
                    apagar(WinR2);
                }

                else{
                    encender(WinR2);
                }
            }
        });

        //////////COCINA//////

        SwitchLucesCS=(Switch) findViewById(R.id.SLucesCS);
        SwitchLucesCS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedLucesCS) {

                isCheckedLucesCS = auxLucesCS;
                if (isCheckedLucesCS) {
                    apagar(LucesCS);
                }

                else{
                    encender(LucesCS);
                }
            }
        });

        SwitchVentC=(Switch) findViewById(R.id.SVentC);
        SwitchVentC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedVentC) {

                isCheckedVentC = auxVentC;
                if (isCheckedVentC) {
                    apagar(VentC);
                }

                else{
                    encender(VentC);
                }
            }
        });


        ////////Cuarto de Servicio////////
        SwitchLucesServ=(Switch) findViewById(R.id.SLucesServ);
        SwitchLucesServ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedLucesServ) {

                isCheckedLucesServ = auxLucesServ;
                if (isCheckedLucesServ) {
                    apagar(LucesServ);
                }

                else{
                    encender(LucesServ);
                }
            }
        });

        /////////Bano///////////
        SwitchLucesB=(Switch) findViewById(R.id.SLucesB);
        SwitchLucesB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isCheckedLucesB) {

                isCheckedLucesB = auxLucesB;
                if (isCheckedLucesB) {
                    apagar(LucesB);
                }

                else{
                    encender(LucesB);
                }
            }
        });


    }



    @Override
    protected void onStart() {


        super.onStart();


        ///////General/////

        LucesFront.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueLucesFront = dataSnapshot.getValue(Boolean.class);
                auxLucesFront = valueLucesFront;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });



        PuertaP.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valuePuertaP = dataSnapshot.getValue(Boolean.class);
                auxPuertaP = valuePuertaP;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        PuertaT.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valuePuertaT = dataSnapshot.getValue(Boolean.class);
                auxPuertaT = valuePuertaT;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //////////SALA////////

        LucesS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueLucesS = dataSnapshot.getValue(Boolean.class);
                auxLucesS = valueLucesS;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        VentS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueVentS = dataSnapshot.getValue(Boolean.class);
                auxVentS = valueVentS;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        WinS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueWinS = dataSnapshot.getValue(Boolean.class);
                auxWinS = valueWinS;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ///////////////Recamara 1////////

        LucesR1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueLucesR1 = dataSnapshot.getValue(Boolean.class);
                auxLucesR1 = valueLucesR1;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        VentR1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueVentR1 = dataSnapshot.getValue(Boolean.class);
                auxVentR1 = valueVentR1;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        WinR1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueWinR1 = dataSnapshot.getValue(Boolean.class);
                auxWinR1 = valueWinR1;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        //////////Recamara 2//////////


        LucesR2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueLucesR2 = dataSnapshot.getValue(Boolean.class);
                auxLucesR2 = valueLucesR2;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        VentR2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueVentR2 = dataSnapshot.getValue(Boolean.class);
                auxVentR2 = valueVentR2;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        WinR2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueWinR2 = dataSnapshot.getValue(Boolean.class);
                auxWinR2 = valueWinR2;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        ///////////Cocina///////

        LucesCS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueLucesCS = dataSnapshot.getValue(Boolean.class);
                auxLucesCS = valueLucesCS;
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        VentC.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueVentC = dataSnapshot.getValue(Boolean.class);
                auxVentC = valueVentC;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        ///////////Cuarto Servicio///////

        LucesServ.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueLucesServ = dataSnapshot.getValue(Boolean.class);
                auxLucesServ = valueLucesServ;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        ////////////Bano//////////

        LucesB.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Boolean valueB= dataSnapshot.getValue(Boolean.class);
                auxLucesB=valueB;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }


    public void apagar(DatabaseReference x){
        x.setValue(false);
    }
    public void encender(DatabaseReference x){
        x.setValue(true);
    }



}
