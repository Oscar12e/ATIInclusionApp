package com.example.atiinclusionapp.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.atiinclusionapp.R;

import java.util.List;

public class GrupoAdapter extends ArrayAdapter<Grupo> {

    public GrupoAdapter(Context context, List<Grupo> grupos) {
        super(context, 0, grupos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Grupo grupo = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_grupo, parent, false);
        }

        // Lookup view for data population
        TextView txt_curso = convertView.findViewById(R.id.txt_curso);
        TextView text_grupo = convertView.findViewById(R.id.txt_grupo);
        TextView txt_profesor = convertView.findViewById(R.id.txt_profesor);


        if (grupo != null) {
            txt_curso.setText( grupo.getCurso().getId() + " " + grupo.getCurso().getNombre()  );
            text_grupo.setText( "Grupo: " + Integer.toString( grupo.getNumGrupo() ));
            txt_profesor.setText( grupo.getProfesor() );
        } else {
            System.out.println(position);
        }



        // Populate the data into the template view using the data object

        // Return the completed view to render on screen
        return convertView;
    }


}
