package com.example.higom.edpdm.ventadeproductos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btn1, btn2, btn3, btn4, btn5, btn6;

    ListView tecnologia;
    ListView productImages;
    ListView products;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Products productsData[] = new Products[] {
                new Products(1,R.drawable.led_55_uhd_smarttv, "LED 55\" UHD Smart TV | KD55X727E", "electrodomesticos","Que el entretenimiento cobre protagonismo en tu casa y te embarque junto a tu familia en una experiencia visual sin precedentes, gracias al LED 55\" UHD Smart TV | KD55X727E de Sony, un potente televisor con tecnología 4K HDR que hará que los colores cobren vida para reproducir cada tono y matiz con el realismo que siempre esperaste. Ahora ver series, películas y videos será realmente envolvente.\n" +
                        "Además, cuenta con tecnología SmartTV, que te dará acceso a aplicaciones como YouTube para acercarte al contenido que más te gusta. Por otro lado, el respaldo de su procesador X-Reality PRO mejorará cada píxel para imágenes impecables. ¡Lleva el tuyo y haz que cada detalle valga la pena!\n", 100000),
                new Products(2, R.drawable.consola_play_station4_slim, "Consola Playstation 4 Slim 1tb Con 1 Control Ps4 1000gb","electrodomesticos","Nueva PlayStation 4 Slim con aspecto rediseñado más estilizado, te permite disfrutar de colores increíblemente vivos y brillantes con los asombrosos gráficos HDR, Además de ser un 30% más delgada, y un 16% más ligera que el modelo de Ps4 original. Guarda tus juegos, aplicaciones, capturas de pantalla, y videos en el disco duro de 1000 GIGAS", 984900),
                new Products(3,R.drawable.nevecon_whirlpool_side_by_side_680_lts, "Nevecon Whirlpool Side By Side 680 Lts - Wrs49aktww", "electrodomesticos", "", 3314925),
                new Products(4, R.drawable.videoproyector_powerlite_x29, "Videoproyector Powerlite X29", "electrodomesticos", "Proyecta tus mejores ideas y sorprende a los espectadores con resultados de imagen profesional con el Videoproyector PowerLite X29 de Epson, un producto en el que encontrarás toda la versatilidad, eficiencia y calidad que siempre esperaste a la hora de hacer presentaciones. Ha sido pensado para responder a necesidades de todo tipo, desde proyecciones en un salón de clases hasta en una sala de conferencias", 2511900 ),
                new Products(5, R.drawable.lavadora_secadora_carga_frontal15_kg, "Lavadora Secadora Carga Frontal 15 kg | WD1577RD", "electrodosmesticos", "", 3699990),

                new Products(6, R.drawable.legging_tiana, "Legging Tiana","ropa", "", 300900 ),
                new Products(7, R.drawable.chaqueta, "Chaqueta","ropa", "", 99990 ),
                new Products(8, R.drawable.traje_de_bano, "Traje de baño","ropa", "", 49990 ),
                new Products(9, R.drawable.vestido, "Vestido","ropa", "", 55993 ),
                new Products(10,R.drawable.blazer_americana_boreal1, "Blazer Americana Boreal1", "ropa", "", 169900),

                new Products(11, R.drawable.viola_145_hxzq_03_solid_inland, "Viola 14.5 HXZQ03 Solid Inland", "musica", "Cada uno de los productos de Verona están fabricados con materiales de alta calidad para proporcionarte la comodidad y seguridad que siempre has buscado al momento de ensayar y llevar a cabo tu presentación musical", 307900),
                new Products(12, R.drawable.bateria_element_2216_blanco, "Batería Element 22-16 Blanco", "musica", "Tradición, artesanía y excelencia es lo que encontrarás en las baterías Ludwig, que diseñadas milimétricamente, potenciarán tus habilidades musicales para que acompañes las mejores composiciones y le des fuerza a esas notas que tanto te gustan. Toma las baquetas y deja lo mejor de ti en el escenario, cada golpe demostrará la calidad y desempeño de este increíble instrumento. ¡lleva la tuya y demuestra que eres el mejor!", 2801900),
                new Products(13, R.drawable.guitarra_valencia_negra_vc154bk, "Guitarra Valencia Negra VC154BK", "musica", "la marca Valencia, marca reconocida por sus instrumentos musicales elaborados en madera y otros materiales resistentes y duraderos.\n" +
                        "Valencia se ha especializado en la fabricación de guitarras acústicas, logrando que cada una de sus creaciones tengan un toque de originalidad sin perder su esencia y tradición\n", 194900),
                new Products(14, R.drawable.baquetas_trilok_gurtu_astr, "Baquetas Trilok Gurtu ASTR", "musica", "los productos de Zildjian, pionero en la creación de platillos musicales y baquetas profesionales reconocido en el mundo musical por ser la marca insignia de famosas bandas de rock y artistas pop. \n" +
                        "Cada uno de los accesorios y platillos de Zildjian están elaborados con materiales resistentes al contacto, brindando un sónido único e inigualable.\n", 34900),
                new Products(15, R.drawable.audifonos_quiet_comfort35, "Audífonos QuietComfort 35", "musica", "La música suena mejor cuando tienes accesorios como los Audífonos QuietComfort 35 de Bose. Enciéndelos y descubre las nuevas alturas que alcanzará tu música. Canciones plenas y clarasque parecerá que las escuchas por primera vez combinado con una duración excepcional de batería de hasta 20 horas de uso en modo inalámbrico.", 1299900)
        };

        // adaptador de images para un listView de solo imagenes
        /*ImagesAdapter imagesAdapter = new ImagesAdapter(this, R.layout.listview_item_images_row, imagesList);
        productImages = (ListView) findViewById(R.id.imageItemRandom);
        productImages.setAdapter(imagesAdapter);*/

        //adaptador de productos con su titulo
        ProductsAdapter adapter = new ProductsAdapter(this, R.layout.listview_item_products_row, productsData);
        products = (ListView) findViewById(R.id.listView);
        /*View header = (View) getLayoutInflater().inflate(R.layout.list_header_products_row, null);
        products.addHeaderView(header);*/
        products.setAdapter(adapter);

        //adaptador sencillo de datos estaticos
       /*tecnologia = (ListView) findViewById(R.id.listView);
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,productosTecnologia);
       tecnologia.setAdapter(adapter);*/

        Intent intent = getIntent();

        btn1 = (ImageButton) findViewById(R.id.imageButtonElectrodomesticos);
        btn1.setOnClickListener(this);
        btn2 = (ImageButton) findViewById(R.id.imageButtonRopa);
        btn2.setOnClickListener(this);
        btn3 = (ImageButton) findViewById(R.id.imageButtonLibros);
        btn3.setOnClickListener(this);
        btn4 = (ImageButton) findViewById(R.id.imageButtonComputacion);
        btn4.setOnClickListener(this);
        btn5 = (ImageButton) findViewById(R.id.imageButtonBelleza);
        btn5.setOnClickListener(this);
        btn6 = (ImageButton) findViewById(R.id.imageButtonMusica);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.imageButtonElectrodomesticos:
                /*Intent intent1 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent1);*/

                final Products electrodomesticosArray[] = new Products[] {
                        new Products(1,R.drawable.led_55_uhd_smarttv, "LED 55\" UHD Smart TV | KD55X727E", "electrodomesticos","Que el entretenimiento cobre protagonismo en tu casa y te embarque junto a tu familia en una experiencia visual sin precedentes, gracias al LED 55\" UHD Smart TV | KD55X727E de Sony, un potente televisor con tecnología 4K HDR que hará que los colores cobren vida para reproducir cada tono y matiz con el realismo que siempre esperaste. Ahora ver series, películas y videos será realmente envolvente.\n" +
                                "Además, cuenta con tecnología SmartTV, que te dará acceso a aplicaciones como YouTube para acercarte al contenido que más te gusta. Por otro lado, el respaldo de su procesador X-Reality PRO mejorará cada píxel para imágenes impecables. ¡Lleva el tuyo y haz que cada detalle valga la pena!\n", 100000),
                        new Products(2, R.drawable.consola_play_station4_slim, "Consola Playstation 4 Slim 1tb Con 1 Control Ps4 1000gb","electrodomesticos","Nueva PlayStation 4 Slim con aspecto rediseñado más estilizado, te permite disfrutar de colores increíblemente vivos y brillantes con los asombrosos gráficos HDR, Además de ser un 30% más delgada, y un 16% más ligera que el modelo de Ps4 original. Guarda tus juegos, aplicaciones, capturas de pantalla, y videos en el disco duro de 1000 GIGAS", 984900),
                        new Products(3,R.drawable.nevecon_whirlpool_side_by_side_680_lts, "Nevecon Whirlpool Side By Side 680 Lts - Wrs49aktww", "electrodomesticos", "", 3314925),
                        new Products(4, R.drawable.videoproyector_powerlite_x29, "Videoproyector Powerlite X29", "electrodomesticos", "Proyecta tus mejores ideas y sorprende a los espectadores con resultados de imagen profesional con el Videoproyector PowerLite X29 de Epson, un producto en el que encontrarás toda la versatilidad, eficiencia y calidad que siempre esperaste a la hora de hacer presentaciones. Ha sido pensado para responder a necesidades de todo tipo, desde proyecciones en un salón de clases hasta en una sala de conferencias", 2511900 ),
                        new Products(5, R.drawable.lavadora_secadora_carga_frontal15_kg, "Lavadora Secadora Carga Frontal 15 kg | WD1577RD", "electrodosmesticos", "", 3699990)
                };

                final ProductsAdapter electrodomesticosAdapter = new ProductsAdapter(this, R.layout.listview_item_products_row, electrodomesticosArray);
                products = (ListView) findViewById(R.id.listView);
                /*View header = (View) getLayoutInflater().inflate(R.layout.list_header_products_row, null);
                products.addHeaderView(header);*/
                products.setAdapter(electrodomesticosAdapter);

                products.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        TextView msg = (TextView) view.findViewById(R.id.listView);

                        Bundle arguments = new Bundle();

                        arguments.putInt("ID", electrodomesticosAdapter.getItem(position).getId());
                        arguments.putInt("ICON", electrodomesticosAdapter.getItem(position).getIcon());
                        arguments.putString("TITTLE", electrodomesticosAdapter.getItem(position).getTittle());
                        arguments.putString("DESCRIPTION", electrodomesticosAdapter.getItem(position).getDescription());
                        arguments.putString("CATEGORY", electrodomesticosAdapter.getItem(position).getCategory());
                        arguments.putInt("PRICE", electrodomesticosAdapter.getItem(position).getPrice());

                        Intent intent1 = new Intent(MainActivity.this,ProductActivity.class);

                        intent1.putExtras(arguments);
                        //Toast.makeText(getApplicationContext(),electrodomesticosAdapter.getItem(position).getTittle(),Toast.LENGTH_SHORT).show();
                        startActivity(intent1);

                    }
                });


                break;
            case R.id.imageButtonRopa:
                /*Intent intent2 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent2);*/

                Products ropaArray[] = new Products[] {
                        new Products(6, R.drawable.legging_tiana, "Legging Tiana","ropa", "", 300900 ),
                        new Products(7, R.drawable.chaqueta, "Chaqueta","ropa", "", 99990 ),
                        new Products(8, R.drawable.traje_de_bano, "Traje de baño","ropa", "", 49990 ),
                        new Products(9, R.drawable.vestido, "Vestido","ropa", "", 55993 ),
                        new Products(10,R.drawable.blazer_americana_boreal1, "Blazer Americana Boreal1", "ropa", "", 169900)
                };

                ProductsAdapter ropaAdapter = new ProductsAdapter(this, R.layout.listview_item_products_row, ropaArray);
                products = (ListView) findViewById(R.id.listView);
                /*View header = (View) getLayoutInflater().inflate(R.layout.list_header_products_row, null);
                products.addHeaderView(header);*/
                products.setAdapter(ropaAdapter);

                break;
            case R.id.imageButtonLibros:
                /*Intent intent3 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent3);*/




                break;
            case R.id.imageButtonComputacion:
                Intent intent4 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent4);
                break;
            case R.id.imageButtonBelleza:
                Intent intent5 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent5);
                break;
            case R.id.imageButtonMusica:
                /*Intent intent6 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent6);*/

                Products musicaArray[] = new Products[] {
                        new Products(11, R.drawable.viola_145_hxzq_03_solid_inland, "Viola 14.5 HXZQ03 Solid Inland", "musica", "Cada uno de los productos de Verona están fabricados con materiales de alta calidad para proporcionarte la comodidad y seguridad que siempre has buscado al momento de ensayar y llevar a cabo tu presentación musical", 307900),
                        new Products(12, R.drawable.bateria_element_2216_blanco, "Batería Element 22-16 Blanco", "musica", "Tradición, artesanía y excelencia es lo que encontrarás en las baterías Ludwig, que diseñadas milimétricamente, potenciarán tus habilidades musicales para que acompañes las mejores composiciones y le des fuerza a esas notas que tanto te gustan. Toma las baquetas y deja lo mejor de ti en el escenario, cada golpe demostrará la calidad y desempeño de este increíble instrumento. ¡lleva la tuya y demuestra que eres el mejor!", 2801900),
                        new Products(13, R.drawable.guitarra_valencia_negra_vc154bk, "Guitarra Valencia Negra VC154BK", "musica", "la marca Valencia, marca reconocida por sus instrumentos musicales elaborados en madera y otros materiales resistentes y duraderos.\n" +
                                "Valencia se ha especializado en la fabricación de guitarras acústicas, logrando que cada una de sus creaciones tengan un toque de originalidad sin perder su esencia y tradición\n", 194900),
                        new Products(14, R.drawable.baquetas_trilok_gurtu_astr, "Baquetas Trilok Gurtu ASTR", "musica", "los productos de Zildjian, pionero en la creación de platillos musicales y baquetas profesionales reconocido en el mundo musical por ser la marca insignia de famosas bandas de rock y artistas pop. \n" +
                                "Cada uno de los accesorios y platillos de Zildjian están elaborados con materiales resistentes al contacto, brindando un sónido único e inigualable.\n", 34900),
                        new Products(15, R.drawable.audifonos_quiet_comfort35, "Audífonos QuietComfort 35", "musica", "La música suena mejor cuando tienes accesorios como los Audífonos QuietComfort 35 de Bose. Enciéndelos y descubre las nuevas alturas que alcanzará tu música. Canciones plenas y clarasque parecerá que las escuchas por primera vez combinado con una duración excepcional de batería de hasta 20 horas de uso en modo inalámbrico.", 1299900)
                };

                ProductsAdapter musicaAdapter = new ProductsAdapter(this, R.layout.listview_item_products_row, musicaArray);
                products = (ListView) findViewById(R.id.listView);
                /*View header = (View) getLayoutInflater().inflate(R.layout.list_header_products_row, null);
                products.addHeaderView(header);*/
                products.setAdapter(musicaAdapter);

                break;
        }
    }
}
