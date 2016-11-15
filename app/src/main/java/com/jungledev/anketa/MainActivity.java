package com.jungledev.anketa;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

import clases.Pregunta;
import layout.FragmentEight;
import layout.FragmentEleven;
import layout.FragmentFive;
import layout.FragmentFour;
import layout.FragmentNine;
import layout.FragmentOne;
import layout.FragmentSeven;
import layout.FragmentSix;
import layout.FragmentTen;
import layout.FragmentThree;
import layout.FragmentTwelve;
import layout.FragmentTwo;
import layout.RootFragment;
import layout.StaticFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    ViewPagerAdapter adapter;
    private static final int ITEMS = 12;
    public static Map<Integer,Pregunta> preguntas = new HashMap<>();
    public static Map<Integer,Object> respuestas = new HashMap<>();
    public static enum Demarcacion{MALO, REGULAR, BUENO, MUY_BUENO,EXCELENTE};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        Pregunta pregunta1 = new Pregunta(1, "1-¿Cuánto calificarías el servicio en general de La Parrilla al Pan?");
        Pregunta pregunta2 = new Pregunta(2, "2-¿Cuánto calificarías la atención al público tanto en el local, en el Whatspp, llamadas y redes sociales?");
        Pregunta pregunta3 = new Pregunta(3, "3-¿Cuánto calificarías la labor de nuestros ayudantes?");
        Pregunta pregunta4 = new Pregunta(4, "4-¿Cuánto calificarías el tiempo de espera para la entrega de nuestro producto?");
        Pregunta pregunta5= new Pregunta(5, "5-Alguna sugerencia respecto al tiempo de espera:");
        Pregunta pregunta6 = new Pregunta(6, "6-¿Pagarías un 10% más por una mejora del packaging/embalaje?");
        Pregunta pregunta7 = new Pregunta(7,"7-¿Qué producto de La Parrilla al Pan recomedarías?");
        Pregunta pregunta8 = new Pregunta(8,"8-¿Qué otro local de comidas rápidas y/o producto nos recomendarias?");
        Pregunta pregunta9 = new Pregunta(9,"9-¿Qué salsas probaste de La Parrila al Pan y te gusto?");
        Pregunta pregunta10 = new Pregunta(10,"10-¿Qué otra salsa te gustaría que tenga de La Parrilla al Pan?");
        Pregunta pregunta11 = new Pregunta(11,"11-¿Pagarías un 20% por consumir un mejor corte de carne? Por Ejemplo, Lomito");
        preguntas.put(1,pregunta1);
        preguntas.put(2,pregunta2);
        preguntas.put(3,pregunta3);
        preguntas.put(4,pregunta4);
        preguntas.put(5,pregunta5);
        preguntas.put(6,pregunta6);
        preguntas.put(7,pregunta7);
        preguntas.put(8,pregunta8);
        preguntas.put(9,pregunta9);
        preguntas.put(10,pregunta10);
        preguntas.put(11, pregunta11);

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

    }


    public void setCurrentItem (int item, boolean smoothScroll) {
        try {
            viewPager.setCurrentItem(item, smoothScroll);
        }
        catch (Exception e){
            Log.e("Fragment ", e.getMessage());
        }
    }
    class ViewPagerAdapter extends FragmentPagerAdapter {

        public ViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }



        @Override
        public int getCount() {
            return ITEMS;
        }

        @Override
        public Fragment getItem(int position) {



            if (position == 0)
                    return new RootFragment();
            else{
                     return new FragmentEleven();
            }
//                case 1:
//                    return new FragmentTwo();
//                case 2:
//                    return new FragmentThree();
//                case 3:
//                    return new FragmentFour();
//                case 4:
//                    return new FragmentFive();
//                case 5:
//                    return new FragmentSix();
//                case 6:
//                    return new FragmentSeven();
//                case 7:
//                    return new FragmentEight();
//                case 8:
//                    return new FragmentNine();
//                case 9:
//                    return new FragmentTen();
//                case 10:
//                    return new FragmentEleven();
//                case 11:
//                    return new FragmentTwelve();


        }

    }

}