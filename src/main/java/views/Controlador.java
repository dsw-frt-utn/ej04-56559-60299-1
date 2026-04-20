package views;

import data.Persistencia;
import domain.Vehiculo;
import domain.VehiculoTipo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import domain.*;

public class Controlador {
    
    public static ArrayList<VehiculoViewModel> getVehiculos(){
        ArrayList<VehiculoViewModel> vehiculos = new ArrayList<>();
        for(Vehiculo vehiculo : Persistencia.getVehiculos()) {
            vehiculos.add(new VehiculoViewModel(vehiculo));
        }
        return vehiculos;
    }
    
    public static double[] calcularConsumos(Map<String, Double> vehiculos){
        double consumoElectricos = 0;
        double consumoCombustible= 0;
        for(Map.Entry<String, Double> entry : vehiculos.entrySet()){
           double consumo = 0;
           Optional<Vehiculo> vehiculo = Persistencia.getVehiculo(entry.getKey());
           if(vehiculo.isPresent()){
               consumo = vehiculo.get().calcularConsumo(entry.getValue());
               consumoElectricos += vehiculo.get().esDe(VehiculoTipo.ELECTRICO) ? consumo : 0;
               consumoCombustible += vehiculo.get().esDe(VehiculoTipo.COMBUSTIBLE) ? consumo : 0;
           }
        }
        return new double[] {consumoElectricos, consumoCombustible};
    }
    
    /*public static void addVehiculoElectrico(String patente, String nombremarca,String paismarca, String modelo, int anio, double capcarga, String sucursal, double kwhBase){
    Marca m = new Marca( nombremarca, paismarca);
    Sucursal s = new Sucursal(sucursal, "","",null);
    VehiculoElectrico v = new VehiculoElectrico(patente, m ,modelo, anio, capcarga, s, kwhBase);
    
    Persistencia.addVehiculo(v);*/
    
    public static void addVehiculoElectrico(String patente, Marca marca, String modelo, int anio, double carga, String sucursal, double kwhBase){
        Marca m = marca;
        Sucursal s = new Sucursal(sucursal, "","",null);
        VehiculoElectrico v = new VehiculoElectrico(patente, m, modelo, anio, carga, s, kwhBase);
        
        Persistencia.addVehiculo(v);
    }
    
    public static void addVehiculoCombustible(String patente, Marca marca, String modelo, int anio, double carga, String sucursal, double kmLitro, double extraLitro){
        
        Marca m = marca;
        Sucursal s = new Sucursal(sucursal, "","",null);
        VehiculoCombustible v = new VehiculoCombustible(patente, m, modelo, anio, carga,s, kmLitro, extraLitro);
        
        Persistencia.addVehiculo(v);
        
    }
    
}
