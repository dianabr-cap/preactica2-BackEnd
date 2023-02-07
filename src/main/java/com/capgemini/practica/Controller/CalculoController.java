package com.capgemini.practica.Controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.capgemini.practica.Controlller.Result;
import com.capgemini.practica.Controlller.Tabla;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CalculoController {

    @GetMapping("/calcular")
    @ResponseBody
    public Result calculo(
            @RequestParam String inversionInicial,
            @RequestParam String aportacionAnual,
            @RequestParam String incrementoAnual,
            @RequestParam String anosInversion,
            @RequestParam String rendimiento
    ){
        int rendi = Integer.parseInt(rendimiento);
        int anos = Integer.parseInt(anosInversion);
        Tabla[] inversiones = new Tabla[Integer.parseInt(anosInversion)];
        double inversionIni = Float.parseFloat(inversionInicial);
        double saldoInicial = Float.parseFloat(inversionInicial);
        double aportacion = Float.parseFloat(aportacionAnual);
        double incremento = Integer.parseInt(incrementoAnual);
        double rendimientoTabla = 0;
        double saldoFinal = 0;
        double gananciaPorInversion = 0;
        double montoFinal = 0;
        double aportacionesAnuales = 0;



        Tabla inversion = new Tabla();
        for(int i=0; i<anos; i++){
            saldoInicial = i==0 ? saldoInicial : saldoFinal;
            aportacion = i==0 ? aportacion : (aportacion*(1+(incremento/100)));
            rendimientoTabla = (saldoInicial+aportacion) * 0.21;
            saldoFinal = saldoInicial + aportacion + rendimientoTabla;

            inversiones[i] = new Tabla(i+1, (int)saldoInicial, (int)aportacion, (int)rendimientoTabla, (int)saldoFinal);

            aportacionesAnuales += aportacion;

            montoFinal = saldoFinal;
        }

        gananciaPorInversion = montoFinal - inversionIni - aportacionesAnuales;
        Result result = new Result((int)gananciaPorInversion, (int)montoFinal, inversiones);

        return result;
    }
}