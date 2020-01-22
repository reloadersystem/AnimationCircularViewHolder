package ar.reloadersystem.animationcircularviewholder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ResumenTourActivity extends AppCompatActivity {
    private TextView tv_titulo, tv_descripcion;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_tour);

        setTitle("Reloader");

        tv_titulo= findViewById(R.id.categoria_id);
        tv_descripcion=findViewById(R.id.descripcion_id);
        img=findViewById(R.id.id_photoResume);

        Intent intent= getIntent();
        String titulo=intent.getExtras().getString("titulo");
        String descripcion=intent.getExtras().getString("descripcion");
        int  imagen=intent.getExtras().getInt("imagen");

        tv_titulo.setText(titulo);
        tv_descripcion.setText(descripcion);
        img.setImageResource(imagen);



    }
}
