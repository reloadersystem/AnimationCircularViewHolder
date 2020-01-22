package ar.reloadersystem.animationcircularviewholder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class northknowActivity extends AppCompatActivity {

    List<Lugares> lista_lugares;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northknow);
        setTitle("Reloader");

        lista_lugares = new ArrayList<>();

        lista_lugares.add(new Lugares("San Salvador de Jujuy", getString(R.string.jujuy), R.drawable.image_1));
        lista_lugares.add(new Lugares("Quebrada de Humahuaca",  getString(R.string.quebrada), R.drawable.image_2));
        lista_lugares.add(new Lugares("Thermas de Río de Hondo", getString(R.string.thermas), R.drawable.image_3));
        lista_lugares.add(new Lugares("San Miguel de Tucumán", getString(R.string.tucuman), R.drawable.image_6));
        lista_lugares.add(new Lugares("Teleferico de Salta", getString(R.string.teleferico), R.drawable.imagen_7));
        lista_lugares.add(new Lugares("Salinas",  getString(R.string.salinas), R.drawable.imagen_8));
        lista_lugares.add(new Lugares("Salta",  getString(R.string.salta), R.drawable.imagen_9));
        lista_lugares.add( new Lugares("Cascada del Río Noque", getString(R.string.cascada),R.drawable.imagen_4));

        RecyclerView myrc= findViewById(R.id.recycler_id);

        RecyclerViewAdapter myAdapter= new RecyclerViewAdapter( this,lista_lugares);
        myrc.setLayoutManager(new GridLayoutManager(this,2));
        myrc.setAdapter(myAdapter);
    }
}
