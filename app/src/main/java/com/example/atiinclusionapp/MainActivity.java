package com.example.atiinclusionapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.atiinclusionapp.Data.DataHolder;
import com.example.atiinclusionapp.Model.Grupo;
import com.example.atiinclusionapp.Model.GrupoAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Grupo> gruposDisponibles;
    private List<Grupo> gruposRegistrados;
    private ArrayAdapter<Grupo> gruposAdapter;
    private ListView groupList;
    private Grupo grupoSelected;
    private ConstraintLayout dialogLayout;
    private RadioButton radYes, radNo;
    private EditText comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataHolder.getInstance().simulate();

        this.gruposDisponibles = DataHolder.getInstance().getOferta(); // new ArrayList<>();

        this.gruposAdapter = new GrupoAdapter(this, this.gruposDisponibles);
        this.groupList = findViewById(R.id.dlist_groups);
        this.dialogLayout = findViewById(R.id.dialog_layer);
        this.radYes = findViewById(R.id.radSi);
        this.radNo = findViewById(R.id.radNo);
        this.comment = findViewById(R.id.tbox_comment);

        this.groupList.setAdapter(this.gruposAdapter);
        this.groupList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                grupoSelected = gruposDisponibles.get(i);
                showRegisterDialog();
            }
        });

        //Aca llamar la carga de grupos
        this.gruposAdapter.notifyDataSetChanged();
    }


    @Override
    public void onStart(){
        super.onStart();
        this.gruposAdapter.notifyDataSetChanged();
    }

    public void showRegisterDialog(){
        this.dialogLayout.setVisibility(View.VISIBLE);
        radNo.setSelected(true);
        radYes.setSelected(false);
    }

    public void hideRegisterDialog(View view){
        this.dialogLayout.setVisibility(View.GONE);
    }

    public void registerInclusion(View view){
        RadioButton radYes = findViewById(R.id.radSi);
        boolean planB = radYes.isSelected();
        String commentBody = comment.getText().toString();
    }

    public void confirmInclusions(View view){
        new AlertDialog.Builder(this)
                .setTitle("Title")
                .setMessage("Do you really want to whatever?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Toast.makeText(MainActivity.this, "Yaay", Toast.LENGTH_SHORT).show();
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }



}
