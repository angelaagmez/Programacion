package U5.ejercicio_adicional;

public class Main_Minecraft {
    public static void main(String[] args) {
        Minecraft minecraft = new Minecraft();

        Rocas roc = new Rocas("Grafito",300,50,20,true,100);
        Cristal cris = new Cristal("Vidrio",100,70,30,true,Tipo.TRANSLUCIDO);
        Metal met = new Metal("Hierro",150,80,40,true,true);
        Sierra si = new Sierra("Sierra",200,65,25,true,5);
        Pico pi = new Pico("Pico",80,40,15,true,20);


        minecraft.addMateriales(roc);
        minecraft.addMateriales(cris);
        minecraft.addMateriales(met);
        minecraft.addMateriales(si);
        minecraft.addMateriales(pi);

        minecraft.mostrarEstado();
        minecraft.mostrarxDiluir();
        minecraft.mostrarxQuemar();

        roc.mezclarConMaterial(roc);
        cris.mezclarConMaterial(pi);
        met.mezclarConMaterial(roc);






    }
}
