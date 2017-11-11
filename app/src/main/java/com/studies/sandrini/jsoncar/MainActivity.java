package com.studies.sandrini.jsoncar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView carInfo = (TextView) findViewById(R.id.car_info);
        try{
            carInfo.setText(adicaoSimplesDeDados().toString());
            carInfo.setText(carInfo.getText() + "\n" + adicaoDeUmObjeto());
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private JSONObject adicaoSimplesDeDados() throws JSONException {
        //criação do objeto carro e atribuição de valores
        Carro carro = new Carro();
        carro.setId(1);
        carro.setModelo("Celta");
        carro.setPlaca("AAA1234");

        //criação do objeto carroJson
        JSONObject carroJson = new JSONObject();
        //inserção de valores do carro no objeto JSON
        carroJson.put("id", carro.getId());
        carroJson.put("modelo", carro.getModelo());
        carroJson.put("placa", carro.getPlaca());

        //Retorno do objeto JSON
        return carroJson;
    }

    private String adicaoDeUmObjeto() throws JSONException {
        Carro carro = new Carro();
        carro.setId(2);
        carro.setModelo("Celta");
        carro.setPlaca("AAA1234");

        JSONObject carroJson = new JSONObject();
        carroJson.put("carro", carro);

        return carroJson.toString();
    }


}
