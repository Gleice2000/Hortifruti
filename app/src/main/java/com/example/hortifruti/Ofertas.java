package com.example.hortifruti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Ofertas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ofertas);

        RecyclerView recyclerViewProdutos = findViewById(R.id.recyclerView_produtos);
        recyclerViewProdutos.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewProdutos.setHasFixedSize(true);

        // Configurar o AdaptadorProduto
        List<Produto> listaProdutos = new ArrayList<>();
        AdaptadorProduto adaptadorProduto = new AdaptadorProduto(this, listaProdutos);
        recyclerViewProdutos.setAdapter(adaptadorProduto);

        Produto produto1 = new Produto(R.drawable.logo_abacate, "abacate",
                "Fruta saudável e nutritiva, oferecendo uma variedade de benefícios à saúde. " +
                        "Sua polpa cremosa e saborosa faz dele uma adição deliciosa a uma dieta equilibrada.", "R$4,99");

        listaProdutos.add(produto1);


        Produto produto2 = new Produto(R.drawable.logo_couve, "couve",
                "Folha verde escura e altamente nutritiva, rica em vitaminas A, C e K, além de minerais como cálcio e ferro, a couve é um excelente complemento para uma dieta equilibrada.", "R$2,99");

        listaProdutos.add(produto2);


        Produto produto3 = new Produto(R.drawable.logo_laranja, "laranja",
                "Fruta cítrica suculenta e refrescante, conhecida por ser uma excelente fonte de vitamina C e antioxidantes.", "R$1,99");

        listaProdutos.add(produto3);

        Produto produto4 = new Produto(R.drawable.logo_melancia, "melancia",
                "Fruta refrescante e hidratante, perfeita para os dias quentes de verão." +
                        "Rica em água, vitaminas e minerais, como vitamina A e C, potássio e licopeno, é uma ótima opção para saciar a sede e fornecer nutrientes ao organismo.", "R$3,99");

        listaProdutos.add(produto4);

        Produto produto5 = new Produto(R.drawable.logo_pimentao, "pimentao",
                "Vegetal versátil e saboroso, amplamente utilizado na culinária para adicionar cor, sabor e textura aos pratos." +
                        "Rico em vitamina C, antioxidantes e fibras, o pimentão oferece diversos benefícios à saúde.", "R$0,99");

        listaProdutos.add(produto5);
    }
}
