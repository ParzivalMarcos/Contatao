package com.example.contatao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.lvContatos = findViewById(R.id.lvContatos);
        ArrayList<Contato> lstContato = new ArrayList<>();
        lstContato.add(new Contato(1, "Jubileu", "4002-8922", R.drawable.jubileu));
        lstContato.add(new Contato(2, "CJ", "0000000", R.drawable.cj));
        lstContato.add(new Contato(3, "Narutinho", "xxxx", R.drawable.narutinho));
        lstContato.add(new Contato(4, "goku", "123456789", R.drawable.goku));
        lstContato.add(new Contato(5, "Cris", "123456", R.drawable.cris));
        lstContato.add(new Contato(6, "Ronaldinho", "586476", R.drawable.ronaldinho));
        lstContato.add(new Contato(6, "Rubinho", "586476", R.drawable.rubinho));

        ContatoAdapter adapter = new ContatoAdapter(this, lstContato);
        this.lvContatos.setAdapter(adapter);



    }
}
