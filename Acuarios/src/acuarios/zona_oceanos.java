
package acuarios;

import java.util.ArrayList;
import java.util.Scanner;

 


public class zona_oceanos {

    
    ArrayList<String> Habitats = new ArrayList<String>();
    
    ArrayList<String> salinidad = new ArrayList<String>();
    ArrayList<String> temperatura = new ArrayList<String>();
    ArrayList<String> continentes = new ArrayList<String>();
    ArrayList<String> presion = new ArrayList<String>();
    ArrayList<String> luminosidad = new ArrayList<String>();
    ArrayList<String> tipodehabitad = new ArrayList<String>();  
    ArrayList<String> biota = new ArrayList<String>();
    ArrayList<String> enquezona = new ArrayList<String>();
    
    //Zonas
    ArrayList<String> Tropical_agua_dulce = new ArrayList<String>();
    ArrayList<String> Tropical_Marino = new ArrayList<String>();
    ArrayList<String> Tanque_Oceanico = new ArrayList<String>();
    ArrayList<String> Campos_de_Posidonia = new ArrayList<String>();
    ArrayList<String> Fondos_rocosos = new ArrayList<String>();
    ArrayList<String> Zona_Toca_Toca = new ArrayList<String>();
    
    //habitad con peces 
    //1
    ArrayList<String> nombrepez = new ArrayList<String>();
    ArrayList<String> nombrecientifico = new ArrayList<String>();
    ArrayList<String> peso = new ArrayList<String>();
    ArrayList<String> fechadenacimiento = new ArrayList<String>();
    ArrayList<String> esperanzadevida = new ArrayList<String>(); 
    ArrayList<String> general = new ArrayList<String>();
    ArrayList<String> otrazonas = new ArrayList<String>();
    
    //2
    ArrayList<String> nombrepez2 = new ArrayList<String>();
    ArrayList<String> nombrecientifico2 = new ArrayList<String>();
    ArrayList<String> peso2 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento2 = new ArrayList<String>();
    ArrayList<String> esperanzadevida2 = new ArrayList<String>(); 
    ArrayList<String> general2 = new ArrayList<String>();
    ArrayList<String> otrazonas2 = new ArrayList<String>();
    //3
    ArrayList<String> nombrepez3 = new ArrayList<String>();
    ArrayList<String> nombrecientifico3 = new ArrayList<String>();
    ArrayList<String> peso3 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento3 = new ArrayList<String>();
    ArrayList<String> esperanzadevida3 = new ArrayList<String>(); 
    ArrayList<String> general3 = new ArrayList<String>();
    ArrayList<String> otrazonas3 = new ArrayList<String>();
    //4
    ArrayList<String> nombrepez4 = new ArrayList<String>();
    ArrayList<String> nombrecientifico4 = new ArrayList<String>();
    ArrayList<String> peso4 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento4 = new ArrayList<String>();
    ArrayList<String> esperanzadevida4 = new ArrayList<String>(); 
    ArrayList<String> general4 = new ArrayList<String>();
    ArrayList<String> otrazonas4 = new ArrayList<String>();
    //5
    ArrayList<String> nombrepez5 = new ArrayList<String>();
    ArrayList<String> nombrecientifico5 = new ArrayList<String>();
    ArrayList<String> peso5 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento5 = new ArrayList<String>();
    ArrayList<String> esperanzadevida5 = new ArrayList<String>(); 
    ArrayList<String> general5 = new ArrayList<String>();
    ArrayList<String> otrazonas5 = new ArrayList<String>();
    //6
    ArrayList<String> nombrepez6 = new ArrayList<String>();
    ArrayList<String> nombrecientifico6 = new ArrayList<String>();
    ArrayList<String> peso6 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento6 = new ArrayList<String>();
    ArrayList<String> esperanzadevida6 = new ArrayList<String>(); 
    ArrayList<String> general6 = new ArrayList<String>();
    ArrayList<String> otrazonas6 = new ArrayList<String>();
    //7
    ArrayList<String> nombrepez7 = new ArrayList<String>();
    ArrayList<String> nombrecientifico7 = new ArrayList<String>();
    ArrayList<String> peso7 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento7 = new ArrayList<String>();
    ArrayList<String> esperanzadevida7 = new ArrayList<String>(); 
    ArrayList<String> general7 = new ArrayList<String>();
    ArrayList<String> otrazonas7 = new ArrayList<String>();
    //8
    ArrayList<String> nombrepez8 = new ArrayList<String>();
    ArrayList<String> nombrecientifico8 = new ArrayList<String>();
    ArrayList<String> peso8 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento8 = new ArrayList<String>();
    ArrayList<String> esperanzadevida8 = new ArrayList<String>(); 
    ArrayList<String> general8 = new ArrayList<String>();
    ArrayList<String> otrazonas8 = new ArrayList<String>();
    //9
    ArrayList<String> nombrepez9 = new ArrayList<String>();
    ArrayList<String> nombrecientifico9 = new ArrayList<String>();
    ArrayList<String> peso9 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento9 = new ArrayList<String>();
    ArrayList<String> esperanzadevida9 = new ArrayList<String>(); 
    ArrayList<String> general9 = new ArrayList<String>();
    ArrayList<String> otrazonas9 = new ArrayList<String>();
    //10
    ArrayList<String> nombrepez10 = new ArrayList<String>();
    ArrayList<String> nombrecientifico10 = new ArrayList<String>();
    ArrayList<String> peso10 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento10 = new ArrayList<String>();
    ArrayList<String> esperanzadevida10 = new ArrayList<String>(); 
    ArrayList<String> general10 = new ArrayList<String>();
    ArrayList<String> otrazonas10 = new ArrayList<String>();
    //11
    ArrayList<String> nombrepez11 = new ArrayList<String>();
    ArrayList<String> nombrecientifico11 = new ArrayList<String>();
    ArrayList<String> peso11 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento11 = new ArrayList<String>();
    ArrayList<String> esperanzadevida11 = new ArrayList<String>(); 
    ArrayList<String> general11 = new ArrayList<String>();
    ArrayList<String> otrazonas11 = new ArrayList<String>();
    //12
    ArrayList<String> nombrepez12 = new ArrayList<String>();
    ArrayList<String> nombrecientifico12 = new ArrayList<String>();
    ArrayList<String> peso12 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento12 = new ArrayList<String>();
    ArrayList<String> esperanzadevida12 = new ArrayList<String>(); 
    ArrayList<String> general12 = new ArrayList<String>();
    ArrayList<String> otrazonas12 = new ArrayList<String>();
    //13
    ArrayList<String> nombrepez13 = new ArrayList<String>();
    ArrayList<String> nombrecientifico13 = new ArrayList<String>();
    ArrayList<String> peso13 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento13 = new ArrayList<String>();
    ArrayList<String> esperanzadevida13 = new ArrayList<String>(); 
    ArrayList<String> general13 = new ArrayList<String>();
    ArrayList<String> otrazonas13 = new ArrayList<String>();
    //14
    ArrayList<String> nombrepez14 = new ArrayList<String>();
    ArrayList<String> nombrecientifico14 = new ArrayList<String>();
    ArrayList<String> peso14 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento14 = new ArrayList<String>();
    ArrayList<String> esperanzadevida14 = new ArrayList<String>(); 
    ArrayList<String> general14 = new ArrayList<String>();
    ArrayList<String> otrazonas14 = new ArrayList<String>();
    //15
    ArrayList<String> nombrepez15 = new ArrayList<String>();
    ArrayList<String> nombrecientifico15 = new ArrayList<String>();
    ArrayList<String> peso15 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento15 = new ArrayList<String>();
    ArrayList<String> esperanzadevida15 = new ArrayList<String>(); 
    ArrayList<String> general15 = new ArrayList<String>();
    ArrayList<String> otrazonas15 = new ArrayList<String>();
    //16
    ArrayList<String> nombrepez16 = new ArrayList<String>();
    ArrayList<String> nombrecientifico16 = new ArrayList<String>();
    ArrayList<String> peso16 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento16 = new ArrayList<String>();
    ArrayList<String> esperanzadevida16 = new ArrayList<String>(); 
    ArrayList<String> general16 = new ArrayList<String>();
    ArrayList<String> otrazonas16 = new ArrayList<String>();
    //17
    ArrayList<String> nombrepez17 = new ArrayList<String>();
    ArrayList<String> nombrecientifico17 = new ArrayList<String>();
    ArrayList<String> peso17 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento17 = new ArrayList<String>();
    ArrayList<String> esperanzadevida17 = new ArrayList<String>(); 
    ArrayList<String> general17 = new ArrayList<String>();
    ArrayList<String> otrazonas17 = new ArrayList<String>();
    //18
    ArrayList<String> nombrepez18 = new ArrayList<String>();
    ArrayList<String> nombrecientifico18 = new ArrayList<String>();
    ArrayList<String> peso18 = new ArrayList<String>();
    ArrayList<String> fechadenacimiento18 = new ArrayList<String>();
    ArrayList<String> esperanzadevida18 = new ArrayList<String>(); 
    ArrayList<String> general18 = new ArrayList<String>();
    ArrayList<String> otrazonas18 = new ArrayList<String>();
    
    
    
    
    
    public void llenarhabitats(String Usuario,String Contrasena){
        
        
        
        int op;
        Scanner leer = new Scanner(System.in);
        
        
        if((Usuario.equals("Administrador") && Contrasena.equals("1229")) || (Usuario.equals("Trabajador") && Contrasena.equals("1234"))){
            
        
        do{
           
            System.out.println("Que haras en la area de Habitats(Maximo 3 habitats por zona). Elige en numeros ");
            System.out.println("\n 1. Añadir un habitat");
            System.out.println("\n 2. Eliminar habitat");
            System.out.println("\n 3. Mostar habitats");
            System.out.println("\n 4. Añadir peces");
            System.out.println("\n 0. Salir");
          
            
            op= leer.nextInt();
            
            switch (op){
         
     
                case 1:
                    if(Usuario.equals("Administrador") && Contrasena.equals("1229")){
                        
                    
                    String rep;
                    int nomc;
                    //do{
                        
                    
                    System.out.println("\n Nombre del habitat");
                    leer.nextLine();
                    String nom = leer.nextLine();
                    Habitats.add(nom);
                    
                    System.out.println("\n Dime los grados de salinidad ");
                    String sali = leer.nextLine();
                    salinidad.add(sali);
                    System.out.println("\n Dime la temperatura del agua ");
                    String tem = leer.nextLine();
                    temperatura.add(tem);
                    System.out.println("\n Dime los continentes que se encuentran ");
                    String cont = leer.nextLine();
                    continentes.add(cont);
                    System.out.println("\n Cual es la pesion? ");
                    String pres = leer.nextLine();
                    presion.add(pres);
                    System.out.println("\n Cual es la luminosidad del habitad? Se define en lumenes");
                    String lumi = leer.nextLine();
                    luminosidad.add(lumi);
                    
                    int habitadmc;
                    do{
                        System.out.println("\n Que tipo de Habitad es: Elige en numeros "
                        + "\n 1. Hábitats marinos       " 
                        + "\n 2. Hábitats de agua continental    "
                    
                        );
                        habitadmc = leer.nextInt();
                        
                            switch (habitadmc){


                                case 1:
                                    tipodehabitad.add("Hábitats marinos");
                                    int biot ;
                                    do{
                                        System.out.println("\n Que tipo de biota es: Elige en numeros "
                                        + "\n 1. Zona costera       " 
                                        + "\n 2. Mar abierto    "
                                        + "\n 3. Fondo    "            
                                        );
                                        
                                        biot = leer.nextInt();
                                        switch (biot){
                                            case 1:
                                                biota.add("Zona costera");
                                                
                                                
                                            break;

                                            case 2:
                                                
                                                biota.add("Mar abierto");
                                                    
                                            break;
                                            
                                            case 3:
                                                
                                                biota.add("Fondo");
                                    

                                            break;

                                             
                     
                                            default:
                        
                                            System.out.println("Error eliga de nuevo");    
                                            
                                            
                                        }
                                        
                                        
                                        
                                    }
                                    while(biot <= 0 || biot >= 4);  
                                    

                                break;

                                case 2:
                                    tipodehabitad.add("Hábitats de agua continental");
                                    int biot2 ;
                                    do{
                                        System.out.println("\n Que tipo de biota es: Elige en numeros "
                                        + "\n 1. Lénticos       " 
                                        + "\n 2. Lóticos    "         
                                        );
                                        
                                        biot2 = leer.nextInt();
                                        switch (biot2){
                                            case 1:
                                                biota.add("Lénticos");
                                                
                                                
                                            break;

                                            case 2:
                                                
                                                biota.add("Lóticos");
                                                    
                                            break;
                                            
                                            

                                             
                     
                                            default:
                        
                                            System.out.println("Error eliga de nuevo");    
                                            
                                            
                                        }
                                        
                                        
                                        
                                    }
                                    while(biot2 <= 0 || biot2 >= 3);  
                                    
                                    

                                break;

                                
                     
                                default:
                        
                                System.out.println("Error eliga de nuevo");


                            } 
                    }
                    while(habitadmc <= 0 || habitadmc >= 3);  
                    
                    
                    
                    do{
                        System.out.println("\n En que numero de zona esta: Elige en numeros "
                        + "\n 1. Tropical agua dulce       " 
                        + "\n 2. Tropical Marino    " 
                        + "\n 3. Tanque Oceanico                 " 
                        + "\n 4. Campos de Posidonia    " 
                        + "\n 5. Fondos rocosos      " 
                        + "\n 6. Zona Toca-Toca   " 
                    
                        );
                        nomc = leer.nextInt();
                            switch (nomc){


                                case 1:
                                    if(Tropical_agua_dulce.size() < 3){
                                        Tropical_agua_dulce.add("1");
                                    enquezona.add("Tropical agua dulce");
                                        
                                    }    
                                    else {
                                        System.out.println("error esta zona esta lleno se borrara los datos");
                                        Habitats.remove(Habitats.size()-1);
                                        
                                        salinidad.remove(salinidad.size() - 1);
                                        temperatura.remove(temperatura.size()-1);
                                        continentes.remove(continentes.size()-1);
                                        presion.remove(presion.size()-1);
                                        luminosidad.remove(luminosidad.size()-1);
                                        tipodehabitad.remove(tipodehabitad.size()-1);
                                        biota.remove(biota.size()-1);
                                        }

                                break;

                                case 2:
                                    if(Tropical_Marino.size() < 3){
                                        
                                        Tropical_Marino.add("2");
                                        enquezona.add("Tropical Marino");
                                    }
                                    else {
                                        System.out.println("error esta zona esta lleno se borrara los datos");
                                        Habitats.remove(Habitats.size()-1);
                                        
                                        salinidad.remove(salinidad.size() - 1);
                                        temperatura.remove(temperatura.size()-1);
                                        continentes.remove(continentes.size()-1);
                                        presion.remove(presion.size()-1);
                                        luminosidad.remove(luminosidad.size()-1);
                                        tipodehabitad.remove(tipodehabitad.size()-1);
                                        biota.remove(biota.size()-1);
                                        }

                                break;

                                case 3:
                                    if(Tanque_Oceanico.size() < 3){
                                        
                                        Tanque_Oceanico.add("3");
                                        enquezona.add("Tanque Oceanico");
                                        
                                    }
                                    else {
                                        System.out.println("error esta zona esta lleno se borrara los datos");
                                        Habitats.remove(Habitats.size()-1);
                                        
                                        salinidad.remove(salinidad.size() - 1);
                                        temperatura.remove(temperatura.size()-1);
                                        continentes.remove(continentes.size()-1);
                                        presion.remove(presion.size()-1);
                                        luminosidad.remove(luminosidad.size()-1);
                                        tipodehabitad.remove(tipodehabitad.size()-1);
                                        biota.remove(biota.size()-1);
                                        }


                                break;

                                case 4:
                                    if(Campos_de_Posidonia.size() < 3){
                                        
                                        Campos_de_Posidonia.add("4");
                                        enquezona.add("Campos de Posidonia");
                                        
                                    }
                                    else {
                                        System.out.println("error esta zona esta lleno se borrara los datos");
                                        Habitats.remove(Habitats.size()-1);
                                        
                                        salinidad.remove(salinidad.size() - 1);
                                        temperatura.remove(temperatura.size()-1);
                                        continentes.remove(continentes.size()-1);
                                        presion.remove(presion.size()-1);
                                        luminosidad.remove(luminosidad.size()-1);
                                        tipodehabitad.remove(tipodehabitad.size()-1);
                                        biota.remove(biota.size()-1);
                                        }
                                    

                                break;

                                case 5:
                                    
                                    if(Fondos_rocosos.size() < 3){
                                        
                                        Fondos_rocosos.add("5");
                                        enquezona.add("Fondos rocosos");
                                    }
                                    else {
                                        System.out.println("error esta zona esta lleno se borrara los datos");
                                        Habitats.remove(Habitats.size()-1);
                                        
                                        salinidad.remove(salinidad.size() - 1);
                                        temperatura.remove(temperatura.size()-1);
                                        continentes.remove(continentes.size()-1);
                                        presion.remove(presion.size()-1);
                                        luminosidad.remove(luminosidad.size()-1);
                                        tipodehabitad.remove(tipodehabitad.size()-1);
                                        biota.remove(biota.size()-1);
                                        }
                                    
                                    

                                break;

                                case 6:
                                    
                                    if(Zona_Toca_Toca.size() < 3){
                                        
                                        Zona_Toca_Toca.add("6");
                                        enquezona.add("Zona Toca-Toca");
                                        
                                    }
                                    else {
                                        System.out.println("error esta zona esta lleno se borrara los datos");
                                        Habitats.remove(Habitats.size()-1);
                                        
                                        salinidad.remove(salinidad.size() - 1);
                                        temperatura.remove(temperatura.size()-1);
                                        continentes.remove(continentes.size()-1);
                                        presion.remove(presion.size()-1);
                                        luminosidad.remove(luminosidad.size()-1);
                                        tipodehabitad.remove(tipodehabitad.size()-1);
                                        biota.remove(biota.size()-1);
                                        }

                                    

                                break;
                                case 0:
                        
                        
                                break  ;  
                     
                                default:
                        
                                System.out.println("Error eliga de nuevo");


                            } 
                    }
                    while(nomc <= 0 || nomc >= 7);  
                    
                            
                            
                            
                    
                   
                   
                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                    for (int i = 0; i<Habitats.size(); i++)
                    {
                        
                    
                    
                        System.out.println("\n\n"+(i+1)+" Habitat " 
                                + "\n Nombre del Habitat:     " + Habitats.get(i)
                                + "\n Zona:                   " + enquezona.get(i)
                                + "\n Grados de salinidad:    " + salinidad.get(i)
                                + "\n Temperatura del aguea:  " + temperatura.get(i)
                                + "\n Continentes que vive:   " + continentes.get(i)
                                + "\n Presion:                " + presion.get(i)
                                + "\n Luminosidad:            " + luminosidad.get(i) + " lumenes"
                                + "\n Tipo de habitad:        " + tipodehabitad.get(i)
                                + "\n Biota:                  " + biota.get(i)
                                
                                 );
                        
                        }
                       // System.out.println("\n Quieres añadir otro pez?");
                      //  rep = leer.nextLine();
                    //}
                   // while((rep.equals("Si")) || (rep.equals("si")) );
                    }
                    else {
                        System.out.println("No tienes derecho a elijir esta opcion :( ");
                        
                    }
                    
                    break;
                    
                case 2:
                    if(Usuario.equals("Administrador") && Contrasena.equals("1229")){
                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                    for (int i = 0; i<Habitats.size(); i++)
                    {
                        
                    
                    
                        System.out.println("\n\n"+(i+1)+" Habitat " 
                                + "\n Nombre del Habitat:     " + Habitats.get(i)
                                + "\n Zona:                   " + enquezona.get(i)
                                + "\n Grados de salinidad:    " + salinidad.get(i)
                                + "\n Temperatura del aguea:  " + temperatura.get(i)
                                + "\n Continentes que vive:   " + continentes.get(i)
                                + "\n Presion:                " + presion.get(i)
                                + "\n Luminosidad:            " + luminosidad.get(i) + " lumenes"
                                + "\n Tipo de habitad:        " + tipodehabitad.get(i)
                                + "\n Biota:                  " + biota.get(i)
                                
                                 );
                        
                        }
                    
                    System.out.println("Que numero de habitad deseas eliminar: ");
                    int elipe = leer.nextInt();
                    if(elipe <= Habitats.size() && elipe > 0){
                        
                    
                                
                                
                                salinidad.remove(elipe-1);
                                temperatura.remove(elipe-1);
                                continentes.remove(elipe-1);
                                presion.remove(elipe-1);
                                luminosidad.remove(elipe-1);
                                tipodehabitad.remove(elipe-1);
                                biota.remove(elipe-1);
                                
                                
                                //System.out.println(enquezona.get(elipe-1).contains("Tropical agua dulce"));
                                if (enquezona.get(elipe-1).contains("Tropical agua dulce")){
                                    Tropical_agua_dulce.remove(0);
                                 //   System.out.println(Tropical_agua_dulce);
                                }
                               // System.out.println(enquezona.get(elipe-1).contains("Tropical Marino"));
                                if (enquezona.get(elipe-1).contains("Tropical Marino")){
                                    Tropical_Marino.remove(0);
                                  //  System.out.println(Tropical_Marino);
                                }
                               // System.out.println(enquezona.get(elipe-1).contains("Tanque Oceanico"));
                                if (enquezona.get(elipe-1).contains("Tanque Oceanico")){
                                    Tanque_Oceanico.remove(0);
                                   // System.out.println(Tanque_Oceanico);
                                }
                                //System.out.println(enquezona.get(elipe-1).contains("Campos de Posidonia"));
                                if (enquezona.get(elipe-1).contains("Campos de Posidonia")){
                                    Campos_de_Posidonia.remove(0);
                                   // System.out.println(Campos_de_Posidonia);
                                }
                              //  System.out.println(enquezona.get(elipe-1).contains("Fondos rocosos"));
                                if (enquezona.get(elipe-1).contains("Fondos rocosos")){
                                    Fondos_rocosos.remove(0);
                                  //  System.out.println(Fondos_rocosos);
                                }
                               // System.out.println(enquezona.get(elipe-1).contains("Zona Toca-Toca"));
                                if (enquezona.get(elipe-1).contains("Zona Toca-Toca")){
                                    Zona_Toca_Toca.remove(0);
                                  //  System.out.println(Zona_Toca_Toca);
                                    
                                }
                                 
                                
                                //1
                                
                                if (elipe == 1){
                                    
                                    nombrepez.clear() ;
                                    nombrecientifico.clear() ;
                                    peso.clear() ;
                                    fechadenacimiento.clear() ;
                                    esperanzadevida.clear() ; 
                                    general.clear() ;
                                    otrazonas.clear() ;
                                    
                                    nombrepez.addAll(nombrepez2) ;
                                    nombrecientifico.addAll(nombrecientifico2);
                                    peso.addAll(peso2) ;
                                    fechadenacimiento.addAll(fechadenacimiento2) ;
                                    esperanzadevida.addAll(esperanzadevida2) ; 
                                    general.addAll(general2) ;
                                    otrazonas.addAll(otrazonas2) ;
                                    
                                    nombrepez2.clear() ;
                                    nombrecientifico2.clear() ;
                                    peso2.clear() ;
                                    fechadenacimiento2.clear() ;
                                    esperanzadevida2.clear() ; 
                                    general2.clear() ;
                                    otrazonas2.clear() ;
                                    
                                    nombrepez2.addAll(nombrepez3) ;
                                    nombrecientifico2.addAll(nombrecientifico3);
                                    peso2.addAll(peso3) ;
                                    fechadenacimiento2.addAll(fechadenacimiento3) ;
                                    esperanzadevida2.addAll(esperanzadevida3) ; 
                                    general2.addAll(general3) ;
                                    otrazonas2.addAll(otrazonas3) ;
                                    
                                    nombrepez3.clear() ;
                                    nombrecientifico3.clear() ;
                                    peso3.clear() ;
                                    fechadenacimiento3.clear() ;
                                    esperanzadevida3.clear() ; 
                                    general3.clear() ;
                                    otrazonas3.clear() ;
                                    
                                    nombrepez3.addAll(nombrepez4) ;
                                    nombrecientifico3.addAll(nombrecientifico4);
                                    peso3.addAll(peso4) ;
                                    fechadenacimiento3.addAll(fechadenacimiento4) ;
                                    esperanzadevida3.addAll(esperanzadevida4) ; 
                                    general3.addAll(general4) ;
                                    otrazonas3.addAll(otrazonas4) ;
                                    
                                    nombrepez4.clear() ;
                                    nombrecientifico4.clear() ;
                                    peso4.clear() ;
                                    fechadenacimiento4.clear() ;
                                    esperanzadevida4.clear() ; 
                                    general4.clear() ;
                                    otrazonas4.clear() ;
                                    
                                    nombrepez4.addAll(nombrepez5) ;
                                    nombrecientifico4.addAll(nombrecientifico5);
                                    peso4.addAll(peso5) ;
                                    fechadenacimiento4.addAll(fechadenacimiento5) ;
                                    esperanzadevida4.addAll(esperanzadevida5) ; 
                                    general4.addAll(general5) ;
                                    otrazonas4.addAll(otrazonas5) ;
                                    
                                    nombrepez5.clear() ;
                                    nombrecientifico5.clear() ;
                                    peso5.clear() ;
                                    fechadenacimiento5.clear() ;
                                    esperanzadevida5.clear() ; 
                                    general5.clear() ;
                                    otrazonas5.clear() ;
                                    
                                    nombrepez5.addAll(nombrepez6) ;
                                    nombrecientifico5.addAll(nombrecientifico6);
                                    peso5.addAll(peso6) ;
                                    fechadenacimiento5.addAll(fechadenacimiento6) ;
                                    esperanzadevida5.addAll(esperanzadevida6) ; 
                                    general5.addAll(general6) ;
                                    otrazonas5.addAll(otrazonas6) ;
                                    
                                    nombrepez6.clear() ;
                                    nombrecientifico6.clear() ;
                                    peso6.clear() ;
                                    fechadenacimiento6.clear() ;
                                    esperanzadevida6.clear() ; 
                                    general6.clear() ;
                                    otrazonas6.clear() ;
                                    
                                    nombrepez6.addAll(nombrepez7) ;
                                    nombrecientifico6.addAll(nombrecientifico7);
                                    peso6.addAll(peso7) ;
                                    fechadenacimiento6.addAll(fechadenacimiento7) ;
                                    esperanzadevida6.addAll(esperanzadevida7) ; 
                                    general6.addAll(general7) ;
                                    otrazonas6.addAll(otrazonas7) ;
                                    
                                    nombrepez7.clear() ;
                                    nombrecientifico7.clear() ;
                                    peso7.clear() ;
                                    fechadenacimiento7.clear() ;
                                    esperanzadevida7.clear() ; 
                                    general7.clear() ;
                                    otrazonas7.clear() ;
                                    
                                    nombrepez7.addAll(nombrepez8) ;
                                    nombrecientifico7.addAll(nombrecientifico8);
                                    peso7.addAll(peso8) ;
                                    fechadenacimiento7.addAll(fechadenacimiento8) ;
                                    esperanzadevida7.addAll(esperanzadevida8) ; 
                                    general7.addAll(general8) ;
                                    otrazonas7.addAll(otrazonas8) ;
                                    
                                    nombrepez8.clear() ;
                                    nombrecientifico8.clear() ;
                                    peso8.clear() ;
                                    fechadenacimiento8.clear() ;
                                    esperanzadevida8.clear() ; 
                                    general8.clear() ;
                                    otrazonas8.clear() ;
                                    
                                    nombrepez8.addAll(nombrepez9) ;
                                    nombrecientifico8.addAll(nombrecientifico9);
                                    peso8.addAll(peso9) ;
                                    fechadenacimiento8.addAll(fechadenacimiento9) ;
                                    esperanzadevida8.addAll(esperanzadevida9) ; 
                                    general8.addAll(general9) ;
                                    otrazonas8.addAll(otrazonas9) ;
                                    
                                    nombrepez9.clear() ;
                                    nombrecientifico9.clear() ;
                                    peso9.clear() ;
                                    fechadenacimiento9.clear() ;
                                    esperanzadevida9.clear() ; 
                                    general9.clear() ;
                                    otrazonas9.clear() ;
                                    
                                    nombrepez9.addAll(nombrepez10) ;
                                    nombrecientifico9.addAll(nombrecientifico10);
                                    peso9.addAll(peso10) ;
                                    fechadenacimiento9.addAll(fechadenacimiento10) ;
                                    esperanzadevida9.addAll(esperanzadevida10) ; 
                                    general9.addAll(general10) ;
                                    otrazonas9.addAll(otrazonas10) ;
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                

                                //2
                                if (elipe == 2){
                                    
                                    nombrepez2.clear() ;
                                    nombrecientifico2.clear() ;
                                    peso2.clear() ;
                                    fechadenacimiento2.clear() ;
                                    esperanzadevida2.clear() ; 
                                    general2.clear() ;
                                    otrazonas2.clear() ;
                                    
                                    nombrepez2.addAll(nombrepez3) ;
                                    nombrecientifico2.addAll(nombrecientifico3);
                                    peso2.addAll(peso3) ;
                                    fechadenacimiento2.addAll(fechadenacimiento3) ;
                                    esperanzadevida2.addAll(esperanzadevida3) ; 
                                    general2.addAll(general3) ;
                                    otrazonas2.addAll(otrazonas3) ;
                                    
                                    nombrepez3.clear() ;
                                    nombrecientifico3.clear() ;
                                    peso3.clear() ;
                                    fechadenacimiento3.clear() ;
                                    esperanzadevida3.clear() ; 
                                    general3.clear() ;
                                    otrazonas3.clear() ;
                                    
                                    nombrepez3.addAll(nombrepez4) ;
                                    nombrecientifico3.addAll(nombrecientifico4);
                                    peso3.addAll(peso4) ;
                                    fechadenacimiento3.addAll(fechadenacimiento4) ;
                                    esperanzadevida3.addAll(esperanzadevida4) ; 
                                    general3.addAll(general4) ;
                                    otrazonas3.addAll(otrazonas4) ;
                                    
                                    nombrepez4.clear() ;
                                    nombrecientifico4.clear() ;
                                    peso4.clear() ;
                                    fechadenacimiento4.clear() ;
                                    esperanzadevida4.clear() ; 
                                    general4.clear() ;
                                    otrazonas4.clear() ;
                                    
                                    nombrepez4.addAll(nombrepez5) ;
                                    nombrecientifico4.addAll(nombrecientifico5);
                                    peso4.addAll(peso5) ;
                                    fechadenacimiento4.addAll(fechadenacimiento5) ;
                                    esperanzadevida4.addAll(esperanzadevida5) ; 
                                    general4.addAll(general5) ;
                                    otrazonas4.addAll(otrazonas5) ;
                                    
                                    nombrepez5.clear() ;
                                    nombrecientifico5.clear() ;
                                    peso5.clear() ;
                                    fechadenacimiento5.clear() ;
                                    esperanzadevida5.clear() ; 
                                    general5.clear() ;
                                    otrazonas5.clear() ;
                                    
                                    nombrepez5.addAll(nombrepez6) ;
                                    nombrecientifico5.addAll(nombrecientifico6);
                                    peso5.addAll(peso6) ;
                                    fechadenacimiento5.addAll(fechadenacimiento6) ;
                                    esperanzadevida5.addAll(esperanzadevida6) ; 
                                    general5.addAll(general6) ;
                                    otrazonas5.addAll(otrazonas6) ;
                                    
                                    nombrepez6.clear() ;
                                    nombrecientifico6.clear() ;
                                    peso6.clear() ;
                                    fechadenacimiento6.clear() ;
                                    esperanzadevida6.clear() ; 
                                    general6.clear() ;
                                    otrazonas6.clear() ;
                                    
                                    nombrepez6.addAll(nombrepez7) ;
                                    nombrecientifico6.addAll(nombrecientifico7);
                                    peso6.addAll(peso7) ;
                                    fechadenacimiento6.addAll(fechadenacimiento7) ;
                                    esperanzadevida6.addAll(esperanzadevida7) ; 
                                    general6.addAll(general7) ;
                                    otrazonas6.addAll(otrazonas7) ;
                                    
                                    nombrepez7.clear() ;
                                    nombrecientifico7.clear() ;
                                    peso7.clear() ;
                                    fechadenacimiento7.clear() ;
                                    esperanzadevida7.clear() ; 
                                    general7.clear() ;
                                    otrazonas7.clear() ;
                                    
                                    nombrepez7.addAll(nombrepez8) ;
                                    nombrecientifico7.addAll(nombrecientifico8);
                                    peso7.addAll(peso8) ;
                                    fechadenacimiento7.addAll(fechadenacimiento8) ;
                                    esperanzadevida7.addAll(esperanzadevida8) ; 
                                    general7.addAll(general8) ;
                                    otrazonas7.addAll(otrazonas8) ;
                                    
                                    nombrepez8.clear() ;
                                    nombrecientifico8.clear() ;
                                    peso8.clear() ;
                                    fechadenacimiento8.clear() ;
                                    esperanzadevida8.clear() ; 
                                    general8.clear() ;
                                    otrazonas8.clear() ;
                                    
                                    nombrepez8.addAll(nombrepez9) ;
                                    nombrecientifico8.addAll(nombrecientifico9);
                                    peso8.addAll(peso9) ;
                                    fechadenacimiento8.addAll(fechadenacimiento9) ;
                                    esperanzadevida8.addAll(esperanzadevida9) ; 
                                    general8.addAll(general9) ;
                                    otrazonas8.addAll(otrazonas9) ;
                                    
                                    nombrepez9.clear() ;
                                    nombrecientifico9.clear() ;
                                    peso9.clear() ;
                                    fechadenacimiento9.clear() ;
                                    esperanzadevida9.clear() ; 
                                    general9.clear() ;
                                    otrazonas9.clear() ;
                                    
                                    nombrepez9.addAll(nombrepez10) ;
                                    nombrecientifico9.addAll(nombrecientifico10);
                                    peso9.addAll(peso10) ;
                                    fechadenacimiento9.addAll(fechadenacimiento10) ;
                                    esperanzadevida9.addAll(esperanzadevida10) ; 
                                    general9.addAll(general10) ;
                                    otrazonas9.addAll(otrazonas10) ;
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //3
                                if (elipe == 3){

                                    nombrepez3.clear() ;
                                    nombrecientifico3.clear() ;
                                    peso3.clear() ;
                                    fechadenacimiento3.clear() ;
                                    esperanzadevida3.clear() ; 
                                    general3.clear() ;
                                    otrazonas3.clear() ;
                                    
                                    nombrepez3.addAll(nombrepez4) ;
                                    nombrecientifico3.addAll(nombrecientifico4);
                                    peso3.addAll(peso4) ;
                                    fechadenacimiento3.addAll(fechadenacimiento4) ;
                                    esperanzadevida3.addAll(esperanzadevida4) ; 
                                    general3.addAll(general4) ;
                                    otrazonas3.addAll(otrazonas4) ;
                                    
                                    nombrepez4.clear() ;
                                    nombrecientifico4.clear() ;
                                    peso4.clear() ;
                                    fechadenacimiento4.clear() ;
                                    esperanzadevida4.clear() ; 
                                    general4.clear() ;
                                    otrazonas4.clear() ;
                                    
                                    nombrepez4.addAll(nombrepez5) ;
                                    nombrecientifico4.addAll(nombrecientifico5);
                                    peso4.addAll(peso5) ;
                                    fechadenacimiento4.addAll(fechadenacimiento5) ;
                                    esperanzadevida4.addAll(esperanzadevida5) ; 
                                    general4.addAll(general5) ;
                                    otrazonas4.addAll(otrazonas5) ;
                                    
                                    nombrepez5.clear() ;
                                    nombrecientifico5.clear() ;
                                    peso5.clear() ;
                                    fechadenacimiento5.clear() ;
                                    esperanzadevida5.clear() ; 
                                    general5.clear() ;
                                    otrazonas5.clear() ;
                                    
                                    nombrepez5.addAll(nombrepez6) ;
                                    nombrecientifico5.addAll(nombrecientifico6);
                                    peso5.addAll(peso6) ;
                                    fechadenacimiento5.addAll(fechadenacimiento6) ;
                                    esperanzadevida5.addAll(esperanzadevida6) ; 
                                    general5.addAll(general6) ;
                                    otrazonas5.addAll(otrazonas6) ;
                                    
                                    nombrepez6.clear() ;
                                    nombrecientifico6.clear() ;
                                    peso6.clear() ;
                                    fechadenacimiento6.clear() ;
                                    esperanzadevida6.clear() ; 
                                    general6.clear() ;
                                    otrazonas6.clear() ;
                                    
                                    nombrepez6.addAll(nombrepez7) ;
                                    nombrecientifico6.addAll(nombrecientifico7);
                                    peso6.addAll(peso7) ;
                                    fechadenacimiento6.addAll(fechadenacimiento7) ;
                                    esperanzadevida6.addAll(esperanzadevida7) ; 
                                    general6.addAll(general7) ;
                                    otrazonas6.addAll(otrazonas7) ;
                                    
                                    nombrepez7.clear() ;
                                    nombrecientifico7.clear() ;
                                    peso7.clear() ;
                                    fechadenacimiento7.clear() ;
                                    esperanzadevida7.clear() ; 
                                    general7.clear() ;
                                    otrazonas7.clear() ;
                                    
                                    nombrepez7.addAll(nombrepez8) ;
                                    nombrecientifico7.addAll(nombrecientifico8);
                                    peso7.addAll(peso8) ;
                                    fechadenacimiento7.addAll(fechadenacimiento8) ;
                                    esperanzadevida7.addAll(esperanzadevida8) ; 
                                    general7.addAll(general8) ;
                                    otrazonas7.addAll(otrazonas8) ;
                                    
                                    nombrepez8.clear() ;
                                    nombrecientifico8.clear() ;
                                    peso8.clear() ;
                                    fechadenacimiento8.clear() ;
                                    esperanzadevida8.clear() ; 
                                    general8.clear() ;
                                    otrazonas8.clear() ;
                                    
                                    nombrepez8.addAll(nombrepez9) ;
                                    nombrecientifico8.addAll(nombrecientifico9);
                                    peso8.addAll(peso9) ;
                                    fechadenacimiento8.addAll(fechadenacimiento9) ;
                                    esperanzadevida8.addAll(esperanzadevida9) ; 
                                    general8.addAll(general9) ;
                                    otrazonas8.addAll(otrazonas9) ;
                                    
                                    nombrepez9.clear() ;
                                    nombrecientifico9.clear() ;
                                    peso9.clear() ;
                                    fechadenacimiento9.clear() ;
                                    esperanzadevida9.clear() ; 
                                    general9.clear() ;
                                    otrazonas9.clear() ;
                                    
                                    nombrepez9.addAll(nombrepez10) ;
                                    nombrecientifico9.addAll(nombrecientifico10);
                                    peso9.addAll(peso10) ;
                                    fechadenacimiento9.addAll(fechadenacimiento10) ;
                                    esperanzadevida9.addAll(esperanzadevida10) ; 
                                    general9.addAll(general10) ;
                                    otrazonas9.addAll(otrazonas10) ;
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
  
                                }
                                
                                //4
                                if (elipe == 4){
                                    
                                    nombrepez4.clear() ;
                                    nombrecientifico4.clear() ;
                                    peso4.clear() ;
                                    fechadenacimiento4.clear() ;
                                    esperanzadevida4.clear() ; 
                                    general4.clear() ;
                                    otrazonas4.clear() ;
                                    
                                    nombrepez4.addAll(nombrepez5) ;
                                    nombrecientifico4.addAll(nombrecientifico5);
                                    peso4.addAll(peso5) ;
                                    fechadenacimiento4.addAll(fechadenacimiento5) ;
                                    esperanzadevida4.addAll(esperanzadevida5) ; 
                                    general4.addAll(general5) ;
                                    otrazonas4.addAll(otrazonas5) ;
                                    
                                    nombrepez5.clear() ;
                                    nombrecientifico5.clear() ;
                                    peso5.clear() ;
                                    fechadenacimiento5.clear() ;
                                    esperanzadevida5.clear() ; 
                                    general5.clear() ;
                                    otrazonas5.clear() ;
                                    
                                    nombrepez5.addAll(nombrepez6) ;
                                    nombrecientifico5.addAll(nombrecientifico6);
                                    peso5.addAll(peso6) ;
                                    fechadenacimiento5.addAll(fechadenacimiento6) ;
                                    esperanzadevida5.addAll(esperanzadevida6) ; 
                                    general5.addAll(general6) ;
                                    otrazonas5.addAll(otrazonas6) ;
                                    
                                    nombrepez6.clear() ;
                                    nombrecientifico6.clear() ;
                                    peso6.clear() ;
                                    fechadenacimiento6.clear() ;
                                    esperanzadevida6.clear() ; 
                                    general6.clear() ;
                                    otrazonas6.clear() ;
                                    
                                    nombrepez6.addAll(nombrepez7) ;
                                    nombrecientifico6.addAll(nombrecientifico7);
                                    peso6.addAll(peso7) ;
                                    fechadenacimiento6.addAll(fechadenacimiento7) ;
                                    esperanzadevida6.addAll(esperanzadevida7) ; 
                                    general6.addAll(general7) ;
                                    otrazonas6.addAll(otrazonas7) ;
                                    
                                    nombrepez7.clear() ;
                                    nombrecientifico7.clear() ;
                                    peso7.clear() ;
                                    fechadenacimiento7.clear() ;
                                    esperanzadevida7.clear() ; 
                                    general7.clear() ;
                                    otrazonas7.clear() ;
                                    
                                    nombrepez7.addAll(nombrepez8) ;
                                    nombrecientifico7.addAll(nombrecientifico8);
                                    peso7.addAll(peso8) ;
                                    fechadenacimiento7.addAll(fechadenacimiento8) ;
                                    esperanzadevida7.addAll(esperanzadevida8) ; 
                                    general7.addAll(general8) ;
                                    otrazonas7.addAll(otrazonas8) ;
                                    
                                    nombrepez8.clear() ;
                                    nombrecientifico8.clear() ;
                                    peso8.clear() ;
                                    fechadenacimiento8.clear() ;
                                    esperanzadevida8.clear() ; 
                                    general8.clear() ;
                                    otrazonas8.clear() ;
                                    
                                    nombrepez8.addAll(nombrepez9) ;
                                    nombrecientifico8.addAll(nombrecientifico9);
                                    peso8.addAll(peso9) ;
                                    fechadenacimiento8.addAll(fechadenacimiento9) ;
                                    esperanzadevida8.addAll(esperanzadevida9) ; 
                                    general8.addAll(general9) ;
                                    otrazonas8.addAll(otrazonas9) ;
                                    
                                    nombrepez9.clear() ;
                                    nombrecientifico9.clear() ;
                                    peso9.clear() ;
                                    fechadenacimiento9.clear() ;
                                    esperanzadevida9.clear() ; 
                                    general9.clear() ;
                                    otrazonas9.clear() ;
                                    
                                    nombrepez9.addAll(nombrepez10) ;
                                    nombrecientifico9.addAll(nombrecientifico10);
                                    peso9.addAll(peso10) ;
                                    fechadenacimiento9.addAll(fechadenacimiento10) ;
                                    esperanzadevida9.addAll(esperanzadevida10) ; 
                                    general9.addAll(general10) ;
                                    otrazonas9.addAll(otrazonas10) ;
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //5
                                if (elipe == 5){
                                    
                                    nombrepez5.clear() ;
                                    nombrecientifico5.clear() ;
                                    peso5.clear() ;
                                    fechadenacimiento5.clear() ;
                                    esperanzadevida5.clear() ; 
                                    general5.clear() ;
                                    otrazonas5.clear() ;
                                    
                                    nombrepez5.addAll(nombrepez6) ;
                                    nombrecientifico5.addAll(nombrecientifico6);
                                    peso5.addAll(peso6) ;
                                    fechadenacimiento5.addAll(fechadenacimiento6) ;
                                    esperanzadevida5.addAll(esperanzadevida6) ; 
                                    general5.addAll(general6) ;
                                    otrazonas5.addAll(otrazonas6) ;
                                    
                                    nombrepez6.clear() ;
                                    nombrecientifico6.clear() ;
                                    peso6.clear() ;
                                    fechadenacimiento6.clear() ;
                                    esperanzadevida6.clear() ; 
                                    general6.clear() ;
                                    otrazonas6.clear() ;
                                    
                                    nombrepez6.addAll(nombrepez7) ;
                                    nombrecientifico6.addAll(nombrecientifico7);
                                    peso6.addAll(peso7) ;
                                    fechadenacimiento6.addAll(fechadenacimiento7) ;
                                    esperanzadevida6.addAll(esperanzadevida7) ; 
                                    general6.addAll(general7) ;
                                    otrazonas6.addAll(otrazonas7) ;
                                    
                                    nombrepez7.clear() ;
                                    nombrecientifico7.clear() ;
                                    peso7.clear() ;
                                    fechadenacimiento7.clear() ;
                                    esperanzadevida7.clear() ; 
                                    general7.clear() ;
                                    otrazonas7.clear() ;
                                    
                                    nombrepez7.addAll(nombrepez8) ;
                                    nombrecientifico7.addAll(nombrecientifico8);
                                    peso7.addAll(peso8) ;
                                    fechadenacimiento7.addAll(fechadenacimiento8) ;
                                    esperanzadevida7.addAll(esperanzadevida8) ; 
                                    general7.addAll(general8) ;
                                    otrazonas7.addAll(otrazonas8) ;
                                    
                                    nombrepez8.clear() ;
                                    nombrecientifico8.clear() ;
                                    peso8.clear() ;
                                    fechadenacimiento8.clear() ;
                                    esperanzadevida8.clear() ; 
                                    general8.clear() ;
                                    otrazonas8.clear() ;
                                    
                                    nombrepez8.addAll(nombrepez9) ;
                                    nombrecientifico8.addAll(nombrecientifico9);
                                    peso8.addAll(peso9) ;
                                    fechadenacimiento8.addAll(fechadenacimiento9) ;
                                    esperanzadevida8.addAll(esperanzadevida9) ; 
                                    general8.addAll(general9) ;
                                    otrazonas8.addAll(otrazonas9) ;
                                    
                                    nombrepez9.clear() ;
                                    nombrecientifico9.clear() ;
                                    peso9.clear() ;
                                    fechadenacimiento9.clear() ;
                                    esperanzadevida9.clear() ; 
                                    general9.clear() ;
                                    otrazonas9.clear() ;
                                    
                                    nombrepez9.addAll(nombrepez10) ;
                                    nombrecientifico9.addAll(nombrecientifico10);
                                    peso9.addAll(peso10) ;
                                    fechadenacimiento9.addAll(fechadenacimiento10) ;
                                    esperanzadevida9.addAll(esperanzadevida10) ; 
                                    general9.addAll(general10) ;
                                    otrazonas9.addAll(otrazonas10) ;
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //6
                                if (elipe == 6){
                                    
                                    nombrepez6.clear() ;
                                    nombrecientifico6.clear() ;
                                    peso6.clear() ;
                                    fechadenacimiento6.clear() ;
                                    esperanzadevida6.clear() ; 
                                    general6.clear() ;
                                    otrazonas6.clear() ;
                                    
                                    nombrepez6.addAll(nombrepez7) ;
                                    nombrecientifico6.addAll(nombrecientifico7);
                                    peso6.addAll(peso7) ;
                                    fechadenacimiento6.addAll(fechadenacimiento7) ;
                                    esperanzadevida6.addAll(esperanzadevida7) ; 
                                    general6.addAll(general7) ;
                                    otrazonas6.addAll(otrazonas7) ;
                                    
                                    nombrepez7.clear() ;
                                    nombrecientifico7.clear() ;
                                    peso7.clear() ;
                                    fechadenacimiento7.clear() ;
                                    esperanzadevida7.clear() ; 
                                    general7.clear() ;
                                    otrazonas7.clear() ;
                                    
                                    nombrepez7.addAll(nombrepez8) ;
                                    nombrecientifico7.addAll(nombrecientifico8);
                                    peso7.addAll(peso8) ;
                                    fechadenacimiento7.addAll(fechadenacimiento8) ;
                                    esperanzadevida7.addAll(esperanzadevida8) ; 
                                    general7.addAll(general8) ;
                                    otrazonas7.addAll(otrazonas8) ;
                                    
                                    nombrepez8.clear() ;
                                    nombrecientifico8.clear() ;
                                    peso8.clear() ;
                                    fechadenacimiento8.clear() ;
                                    esperanzadevida8.clear() ; 
                                    general8.clear() ;
                                    otrazonas8.clear() ;
                                    
                                    nombrepez8.addAll(nombrepez9) ;
                                    nombrecientifico8.addAll(nombrecientifico9);
                                    peso8.addAll(peso9) ;
                                    fechadenacimiento8.addAll(fechadenacimiento9) ;
                                    esperanzadevida8.addAll(esperanzadevida9) ; 
                                    general8.addAll(general9) ;
                                    otrazonas8.addAll(otrazonas9) ;
                                    
                                    nombrepez9.clear() ;
                                    nombrecientifico9.clear() ;
                                    peso9.clear() ;
                                    fechadenacimiento9.clear() ;
                                    esperanzadevida9.clear() ; 
                                    general9.clear() ;
                                    otrazonas9.clear() ;
                                    
                                    nombrepez9.addAll(nombrepez10) ;
                                    nombrecientifico9.addAll(nombrecientifico10);
                                    peso9.addAll(peso10) ;
                                    fechadenacimiento9.addAll(fechadenacimiento10) ;
                                    esperanzadevida9.addAll(esperanzadevida10) ; 
                                    general9.addAll(general10) ;
                                    otrazonas9.addAll(otrazonas10) ;
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //7
                                if (elipe == 7){
                                    
                                    nombrepez7.clear() ;
                                    nombrecientifico7.clear() ;
                                    peso7.clear() ;
                                    fechadenacimiento7.clear() ;
                                    esperanzadevida7.clear() ; 
                                    general7.clear() ;
                                    otrazonas7.clear() ;
                                    
                                    nombrepez7.addAll(nombrepez8) ;
                                    nombrecientifico7.addAll(nombrecientifico8);
                                    peso7.addAll(peso8) ;
                                    fechadenacimiento7.addAll(fechadenacimiento8) ;
                                    esperanzadevida7.addAll(esperanzadevida8) ; 
                                    general7.addAll(general8) ;
                                    otrazonas7.addAll(otrazonas8) ;
                                    
                                    nombrepez8.clear() ;
                                    nombrecientifico8.clear() ;
                                    peso8.clear() ;
                                    fechadenacimiento8.clear() ;
                                    esperanzadevida8.clear() ; 
                                    general8.clear() ;
                                    otrazonas8.clear() ;
                                    
                                    nombrepez8.addAll(nombrepez9) ;
                                    nombrecientifico8.addAll(nombrecientifico9);
                                    peso8.addAll(peso9) ;
                                    fechadenacimiento8.addAll(fechadenacimiento9) ;
                                    esperanzadevida8.addAll(esperanzadevida9) ; 
                                    general8.addAll(general9) ;
                                    otrazonas8.addAll(otrazonas9) ;
                                    
                                    nombrepez9.clear() ;
                                    nombrecientifico9.clear() ;
                                    peso9.clear() ;
                                    fechadenacimiento9.clear() ;
                                    esperanzadevida9.clear() ; 
                                    general9.clear() ;
                                    otrazonas9.clear() ;
                                    
                                    nombrepez9.addAll(nombrepez10) ;
                                    nombrecientifico9.addAll(nombrecientifico10);
                                    peso9.addAll(peso10) ;
                                    fechadenacimiento9.addAll(fechadenacimiento10) ;
                                    esperanzadevida9.addAll(esperanzadevida10) ; 
                                    general9.addAll(general10) ;
                                    otrazonas9.addAll(otrazonas10) ;
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //8
                                if (elipe == 8){
                                    
                                    nombrepez8.clear() ;
                                    nombrecientifico8.clear() ;
                                    peso8.clear() ;
                                    fechadenacimiento8.clear() ;
                                    esperanzadevida8.clear() ; 
                                    general8.clear() ;
                                    otrazonas8.clear() ;
                                    
                                    nombrepez8.addAll(nombrepez9) ;
                                    nombrecientifico8.addAll(nombrecientifico9);
                                    peso8.addAll(peso9) ;
                                    fechadenacimiento8.addAll(fechadenacimiento9) ;
                                    esperanzadevida8.addAll(esperanzadevida9) ; 
                                    general8.addAll(general9) ;
                                    otrazonas8.addAll(otrazonas9) ;
                                    
                                    nombrepez9.clear() ;
                                    nombrecientifico9.clear() ;
                                    peso9.clear() ;
                                    fechadenacimiento9.clear() ;
                                    esperanzadevida9.clear() ; 
                                    general9.clear() ;
                                    otrazonas9.clear() ;
                                    
                                    nombrepez9.addAll(nombrepez10) ;
                                    nombrecientifico9.addAll(nombrecientifico10);
                                    peso9.addAll(peso10) ;
                                    fechadenacimiento9.addAll(fechadenacimiento10) ;
                                    esperanzadevida9.addAll(esperanzadevida10) ; 
                                    general9.addAll(general10) ;
                                    otrazonas9.addAll(otrazonas10) ;
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //9
                                if (elipe == 9){
                                    
                                    nombrepez9.clear() ;
                                    nombrecientifico9.clear() ;
                                    peso9.clear() ;
                                    fechadenacimiento9.clear() ;
                                    esperanzadevida9.clear() ; 
                                    general9.clear() ;
                                    otrazonas9.clear() ;
                                    
                                    nombrepez9.addAll(nombrepez10) ;
                                    nombrecientifico9.addAll(nombrecientifico10);
                                    peso9.addAll(peso10) ;
                                    fechadenacimiento9.addAll(fechadenacimiento10) ;
                                    esperanzadevida9.addAll(esperanzadevida10) ; 
                                    general9.addAll(general10) ;
                                    otrazonas9.addAll(otrazonas10) ;
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                    
                                    
                                }
                                    
                                
                                
                                //10
                                if (elipe == 10){
                                    
                                    nombrepez10.clear() ;
                                    nombrecientifico10.clear() ;
                                    peso10.clear() ;
                                    fechadenacimiento10.clear() ;
                                    esperanzadevida10.clear() ; 
                                    general10.clear() ;
                                    otrazonas10.clear() ;
                                    
                                    nombrepez10.addAll(nombrepez11) ;
                                    nombrecientifico10.addAll(nombrecientifico11);
                                    peso10.addAll(peso11) ;
                                    fechadenacimiento10.addAll(fechadenacimiento11) ;
                                    esperanzadevida10.addAll(esperanzadevida11) ; 
                                    general10.addAll(general11) ;
                                    otrazonas10.addAll(otrazonas11) ;
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                    
                                    
                                }
                                
                                
                                //11
                                if (elipe == 11){
                                    
                                    nombrepez11.clear() ;
                                    nombrecientifico11.clear() ;
                                    peso11.clear() ;
                                    fechadenacimiento11.clear() ;
                                    esperanzadevida11.clear() ; 
                                    general11.clear() ;
                                    otrazonas11.clear() ;
                                    
                                    nombrepez11.addAll(nombrepez12) ;
                                    nombrecientifico11.addAll(nombrecientifico12);
                                    peso11.addAll(peso12) ;
                                    fechadenacimiento11.addAll(fechadenacimiento12) ;
                                    esperanzadevida11.addAll(esperanzadevida12) ; 
                                    general11.addAll(general12) ;
                                    otrazonas11.addAll(otrazonas12) ;
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //12
                                if (elipe == 12){
                                    
                                    nombrepez12.clear() ;
                                    nombrecientifico12.clear() ;
                                    peso12.clear() ;
                                    fechadenacimiento12.clear() ;
                                    esperanzadevida12.clear() ; 
                                    general12.clear() ;
                                    otrazonas12.clear() ;
                                    
                                    nombrepez12.addAll(nombrepez13) ;
                                    nombrecientifico12.addAll(nombrecientifico13);
                                    peso12.addAll(peso13) ;
                                    fechadenacimiento12.addAll(fechadenacimiento13) ;
                                    esperanzadevida12.addAll(esperanzadevida13) ; 
                                    general12.addAll(general13) ;
                                    otrazonas12.addAll(otrazonas13) ;
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                }
                                
                                //13
                                if (elipe == 13){
                                    
                                    nombrepez13.clear() ;
                                    nombrecientifico13.clear() ;
                                    peso13.clear() ;
                                    fechadenacimiento13.clear() ;
                                    esperanzadevida13.clear() ; 
                                    general13.clear() ;
                                    otrazonas13.clear() ;
                                    
                                    nombrepez13.addAll(nombrepez14) ;
                                    nombrecientifico13.addAll(nombrecientifico14);
                                    peso13.addAll(peso14) ;
                                    fechadenacimiento13.addAll(fechadenacimiento14) ;
                                    esperanzadevida13.addAll(esperanzadevida14) ; 
                                    general13.addAll(general14) ;
                                    otrazonas13.addAll(otrazonas14) ;
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //14
                                if (elipe == 14){
                                    
                                    nombrepez14.clear() ;
                                    nombrecientifico14.clear() ;
                                    peso14.clear() ;
                                    fechadenacimiento14.clear() ;
                                    esperanzadevida14.clear() ; 
                                    general14.clear() ;
                                    otrazonas14.clear();
                                    
                                    nombrepez14.addAll(nombrepez15) ;
                                    nombrecientifico14.addAll(nombrecientifico15);
                                    peso14.addAll(peso15) ;
                                    fechadenacimiento14.addAll(fechadenacimiento15) ;
                                    esperanzadevida14.addAll(esperanzadevida15) ; 
                                    general14.addAll(general15) ;
                                    otrazonas14.addAll(otrazonas15) ;
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //15
                                if (elipe == 15){
                                    
                                    nombrepez15.clear() ;
                                    nombrecientifico15.clear() ;
                                    peso15.clear() ;
                                    fechadenacimiento15.clear() ;
                                    esperanzadevida15.clear() ; 
                                    general15.clear() ;
                                    otrazonas15.clear() ;
                                    
                                    nombrepez15.addAll(nombrepez16) ;
                                    nombrecientifico15.addAll(nombrecientifico16);
                                    peso15.addAll(peso16) ;
                                    fechadenacimiento15.addAll(fechadenacimiento16) ;
                                    esperanzadevida15.addAll(esperanzadevida16) ; 
                                    general15.addAll(general16) ;
                                    otrazonas15.addAll(otrazonas16) ;
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                    
                                }
                                
                                //16
                                if (elipe == 16){
                                    
                                    nombrepez16.clear() ;
                                    nombrecientifico16.clear() ;
                                    peso16.clear() ;
                                    fechadenacimiento16.clear() ;
                                    esperanzadevida16.clear() ; 
                                    general16.clear() ;
                                    otrazonas16.clear() ;
                                    
                                    nombrepez16.addAll(nombrepez17) ;
                                    nombrecientifico16.addAll(nombrecientifico17);
                                    peso16.addAll(peso17) ;
                                    fechadenacimiento16.addAll(fechadenacimiento17) ;
                                    esperanzadevida16.addAll(esperanzadevida17) ; 
                                    general16.addAll(general17) ;
                                    otrazonas16.addAll(otrazonas17) ;
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                    
                                }
                                
                                //17
                                if (elipe == 17){
                                    
                                    nombrepez17.clear() ;
                                    nombrecientifico17.clear() ;
                                    peso17.clear() ;
                                    fechadenacimiento17.clear() ;
                                    esperanzadevida17.clear() ; 
                                    general17.clear() ;
                                    otrazonas17.clear() ;
                                    
                                    nombrepez17.addAll(nombrepez18) ;
                                    nombrecientifico17.addAll(nombrecientifico18);
                                    peso17.addAll(peso18) ;
                                    fechadenacimiento17.addAll(fechadenacimiento18) ;
                                    esperanzadevida17.addAll(esperanzadevida18) ; 
                                    general17.addAll(general18) ;
                                    otrazonas17.addAll(otrazonas18) ;
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                }
                                
                                //18
                                if (elipe == 18){
                                    
                                    nombrepez18.clear() ;
                                    nombrecientifico18.clear() ;
                                    peso18.clear() ;
                                    fechadenacimiento18.clear() ;
                                    esperanzadevida18.clear() ; 
                                    general18.clear() ;
                                    otrazonas18.clear() ;
                                    
                                }
                                
                                
                                
                                
                                enquezona.remove(elipe-1);
                                Habitats.remove(elipe-1);
                                
                                
                                
                                
                                
                                
                                
                                
                    System.out.println("Listo");
                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                    for (int i = 0; i<Habitats.size(); i++)
                    {
                        
                    
                    
                        System.out.println("\n\n"+(i+1)+" Habitat " 
                                + "\n Nombre del Habitat:     " + Habitats.get(i)
                                + "\n Zona:                   " + enquezona.get(i)
                                + "\n Grados de salinidad:    " + salinidad.get(i)
                                + "\n Temperatura del aguea:  " + temperatura.get(i)
                                + "\n Continentes que vive:   " + continentes.get(i)
                                + "\n Presion:                " + presion.get(i)
                                + "\n Luminosidad:            " + luminosidad.get(i) + " lumenes"
                                + "\n Tipo de habitad:        " + tipodehabitad.get(i)
                                + "\n Biota:                  " + biota.get(i)
                                
                                 );
                        
                        }
                    
                    }else{
                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");
                        
                    } 
                    
                    }
                    else {
                        System.out.println("No tienes acceso a esta opcion :( ");
                        
                    }
                     break;
                     
                     
                    case 3:
                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                    for (int i = 0; i<Habitats.size(); i++)
                    {
                        
                    
                    
                        System.out.println("\n\n"+(i+1)+" Habitat " 
                                + "\n Nombre del Habitat:     " + Habitats.get(i)
                                + "\n Zona:                   " + enquezona.get(i)
                                + "\n Grados de salinidad:    " + salinidad.get(i)
                                + "\n Temperatura del aguea:  " + temperatura.get(i)
                                + "\n Continentes que vive:   " + continentes.get(i)
                                + "\n Presion:                " + presion.get(i)
                                + "\n Luminosidad:            " + luminosidad.get(i) + " lumenes"
                                + "\n Tipo de habitad:        " + tipodehabitad.get(i)
                                + "\n Biota:                  " + biota.get(i)
                                
                                
                                 );
                        
                        }
                    
                    break;
                    
                    case 0:
                        System.out.println("Adios");
                        
                    break  ;  
                    
                    case 4:
                        int tizonasto ;
                                    do{
                                        System.out.println("\n Que numero de habitad quieres entrar: ");
                                        for (int i = 0; i<Habitats.size(); i++)
                                            {
                        
                    
                    
                                                System.out.println("\n\n"+(i+1)+" Habitat " 
                                                    + "\n Nombre del Habitat:     " + Habitats.get(i)
                                                    + "\n Zona:                   " + enquezona.get(i)
                                                    + "\n Grados de salinidad:    " + salinidad.get(i)
                                                    + "\n Temperatura del aguea:  " + temperatura.get(i)
                                                    + "\n Continentes que vive:   " + continentes.get(i)
                                                    + "\n Presion:                " + presion.get(i)
                                                    + "\n Luminosidad:            " + luminosidad.get(i) + " lumenes"
                                                    + "\n Tipo de habitad:        " + tipodehabitad.get(i)
                                                    + "\n Biota:                  " + biota.get(i)
                                
                                
                                                    );
                        
                                                }
                                        
                                        tizonasto = leer.nextInt();
                                        switch (tizonasto){
                                            case 1:
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    int op1;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op1= leer.nextInt();
             
                                                            switch (op1){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom1 = leer.nextLine();
                                                                    nombrepez.add(nom1);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc1 = leer.nextLine();
                                                                    nombrecientifico.add(nomc1);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes01 = leer.nextLine();
                                                                    peso.add(pes01);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech1 = leer.nextLine();
                                                                    fechadenacimiento.add(fech1);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida1 = leer.nextLine();
                                                                    esperanzadevida.add(vida1);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene1 = leer.nextLine();
                                                                    general.add(gene1);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon1 = leer.nextLine();
                                                                    if ((zon1.equals("Si")) || (zon1.equals("si"))|| (zon1.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribe la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                                );
                                                                        String zonvar = leer.nextLine();
                                                                        otrazonas.add(zonvar);

                                                                    }else{
                                                                        otrazonas.add(zon1);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico.get(i)
                                                                                + "\n Peso                 " + peso.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida.get(i)
                                                                                + "\n Descripcion general  " + general.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico.get(i)
                                                                                + "\n Peso                 " + peso.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida.get(i)
                                                                                + "\n Descripcion general  " + general.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe1 = leer.nextInt();
                                                                    if(elipe1 <= nombrepez.size()){


                                                                                nombrepez.remove(elipe1-1);
                                                                                nombrecientifico.remove(elipe1-1);
                                                                                peso.remove(elipe1-1);
                                                                                fechadenacimiento.remove(elipe1-1);
                                                                                esperanzadevida.remove(elipe1-1);
                                                                                general.remove(elipe1-1);
                                                                                otrazonas.remove(elipe1-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico.get(i)
                                                                                + "\n Peso                 " + peso.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida.get(i)
                                                                                + "\n Descripcion general  " + general.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico.get(i)
                                                                                + "\n Peso                 " + peso.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida.get(i)
                                                                                + "\n Descripcion general  " + general.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op1 != 0);   
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                            break;

                                            case 2:
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    int op2;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op2= leer.nextInt();
             
                                                            switch (op2){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom2 = leer.nextLine();
                                                                    nombrepez2.add(nom2);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc2 = leer.nextLine();
                                                                    nombrecientifico2.add(nomc2);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes02 = leer.nextLine();
                                                                    peso2.add(pes02);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech2 = leer.nextLine();
                                                                    fechadenacimiento2.add(fech2);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida2 = leer.nextLine();
                                                                    esperanzadevida2.add(vida2);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene2 = leer.nextLine();
                                                                    general2.add(gene2);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon2 = leer.nextLine();
                                                                    if ((zon2.equals("Si")) || (zon2.equals("si"))|| (zon2.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar2 = leer.nextLine();
                                                                        otrazonas2.add(zonvar2);

                                                                    }else{
                                                                        otrazonas2.add(zon2);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez2.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez2.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico2.get(i)
                                                                                + "\n Peso                 " + peso2.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento2.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida2.get(i)
                                                                                + "\n Descripcion general  " + general2.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas2.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez2.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez2.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico2.get(i)
                                                                                + "\n Peso                 " + peso2.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento2.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida2.get(i)
                                                                                + "\n Descripcion general  " + general2.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas2.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe2 = leer.nextInt();
                                                                    if(elipe2 <= nombrepez2.size()){


                                                                                nombrepez2.remove(elipe2-1);
                                                                                nombrecientifico2.remove(elipe2-1);
                                                                                peso2.remove(elipe2-1);
                                                                                fechadenacimiento2.remove(elipe2-1);
                                                                                esperanzadevida2.remove(elipe2-1);
                                                                                general2.remove(elipe2-1);
                                                                                otrazonas2.remove(elipe2-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez2.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez2.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico2.get(i)
                                                                                + "\n Peso                 " + peso2.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento2.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida2.get(i)
                                                                                + "\n Descripcion general  " + general2.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas2.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez2.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez2.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico2.get(i)
                                                                                + "\n Peso                 " + peso2.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento2.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida2.get(i)
                                                                                + "\n Descripcion general  " + general2.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas2.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op2 != 0);   
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                
                                                    
                                            break;
                                            
                                            case 3:
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    int op3;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op3= leer.nextInt();
             
                                                            switch (op3){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom3 = leer.nextLine();
                                                                    nombrepez3.add(nom3);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc3 = leer.nextLine();
                                                                    nombrecientifico3.add(nomc3);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes03 = leer.nextLine();
                                                                    peso3.add(pes03);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech3 = leer.nextLine();
                                                                    fechadenacimiento3.add(fech3);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida3 = leer.nextLine();
                                                                    esperanzadevida3.add(vida3);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene3 = leer.nextLine();
                                                                    general3.add(gene3);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon3 = leer.nextLine();
                                                                    if ((zon3.equals("Si")) || (zon3.equals("si"))|| (zon3.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar3 = leer.nextLine();
                                                                        otrazonas3.add(zonvar3);

                                                                    }else{
                                                                        otrazonas3.add(zon3);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez3.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez3.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico3.get(i)
                                                                                + "\n Peso                 " + peso3.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento3.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida3.get(i)
                                                                                + "\n Descripcion general  " + general3.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas3.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez3.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez3.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico3.get(i)
                                                                                + "\n Peso                 " + peso3.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento3.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida3.get(i)
                                                                                + "\n Descripcion general  " + general3.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas3.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe3 = leer.nextInt();
                                                                    if(elipe3 <= nombrepez3.size()){


                                                                                nombrepez3.remove(elipe3-1);
                                                                                nombrecientifico3.remove(elipe3-1);
                                                                                peso3.remove(elipe3-1);
                                                                                fechadenacimiento3.remove(elipe3-1);
                                                                                esperanzadevida3.remove(elipe3-1);
                                                                                general3.remove(elipe3-1);
                                                                                otrazonas3.remove(elipe3-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez3.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez3.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico3.get(i)
                                                                                + "\n Peso                 " + peso3.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento3.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida3.get(i)
                                                                                + "\n Descripcion general  " + general3.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas3.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez3.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez3.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico3.get(i)
                                                                                + "\n Peso                 " + peso3.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento3.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida3.get(i)
                                                                                + "\n Descripcion general  " + general3.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas3.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op3 != 0);
                                                    
                                                    
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                
                                                    
                                            break;
                                            
                                            case 4:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    
                                                    int op4;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op4= leer.nextInt();
             
                                                            switch (op4){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom4 = leer.nextLine();
                                                                    nombrepez4.add(nom4);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc4 = leer.nextLine();
                                                                    nombrecientifico4.add(nomc4);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes04 = leer.nextLine();
                                                                    peso4.add(pes04);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech4 = leer.nextLine();
                                                                    fechadenacimiento4.add(fech4);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida4 = leer.nextLine();
                                                                    esperanzadevida4.add(vida4);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene4 = leer.nextLine();
                                                                    general4.add(gene4);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon4 = leer.nextLine();
                                                                    if ((zon4.equals("Si")) || (zon4.equals("si"))|| (zon4.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar4 = leer.nextLine();
                                                                        otrazonas4.add(zonvar4);

                                                                    }else{
                                                                        otrazonas4.add(zon4);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez4.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez4.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico4.get(i)
                                                                                + "\n Peso                 " + peso4.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento4.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida4.get(i)
                                                                                + "\n Descripcion general  " + general4.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas4.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez4.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez4.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico4.get(i)
                                                                                + "\n Peso                 " + peso4.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento4.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida4.get(i)
                                                                                + "\n Descripcion general  " + general4.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas4.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe4 = leer.nextInt();
                                                                    if(elipe4 <= nombrepez4.size()){


                                                                                nombrepez4.remove(elipe4-1);
                                                                                nombrecientifico4.remove(elipe4-1);
                                                                                peso4.remove(elipe4-1);
                                                                                fechadenacimiento4.remove(elipe4-1);
                                                                                esperanzadevida4.remove(elipe4-1);
                                                                                general4.remove(elipe4-1);
                                                                                otrazonas4.remove(elipe4-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez4.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez4.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico4.get(i)
                                                                                + "\n Peso                 " + peso4.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento4.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida4.get(i)
                                                                                + "\n Descripcion general  " + general4.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas4.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez4.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez4.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico4.get(i)
                                                                                + "\n Peso                 " + peso4.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento4.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida4.get(i)
                                                                                + "\n Descripcion general  " + general4.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas4.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op4 != 0);
                                                    
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                
                                                    
                                            break;
                                            
                                            case 5:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    int op5;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op5= leer.nextInt();
             
                                                            switch (op5){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom5 = leer.nextLine();
                                                                    nombrepez5.add(nom5);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc5 = leer.nextLine();
                                                                    nombrecientifico5.add(nomc5);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes05 = leer.nextLine();
                                                                    peso5.add(pes05);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech5 = leer.nextLine();
                                                                    fechadenacimiento5.add(fech5);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida5 = leer.nextLine();
                                                                    esperanzadevida5.add(vida5);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene5 = leer.nextLine();
                                                                    general5.add(gene5);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon5 = leer.nextLine();
                                                                    if ((zon5.equals("Si")) || (zon5.equals("si"))|| (zon5.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar5 = leer.nextLine();
                                                                        otrazonas5.add(zonvar5);

                                                                    }else{
                                                                        otrazonas5.add(zon5);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez5.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez5.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico5.get(i)
                                                                                + "\n Peso                 " + peso5.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento5.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida5.get(i)
                                                                                + "\n Descripcion general  " + general5.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas5.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez5.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez5.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico5.get(i)
                                                                                + "\n Peso                 " + peso5.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento5.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida5.get(i)
                                                                                + "\n Descripcion general  " + general5.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas5.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe5 = leer.nextInt();
                                                                    if(elipe5 <= nombrepez5.size()){


                                                                                nombrepez5.remove(elipe5-1);
                                                                                nombrecientifico5.remove(elipe5-1);
                                                                                peso5.remove(elipe5-1);
                                                                                fechadenacimiento5.remove(elipe5-1);
                                                                                esperanzadevida5.remove(elipe5-1);
                                                                                general5.remove(elipe5-1);
                                                                                otrazonas5.remove(elipe5-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez5.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez5.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico5.get(i)
                                                                                + "\n Peso                 " + peso5.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento5.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida5.get(i)
                                                                                + "\n Descripcion general  " + general5.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas5.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez5.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez5.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico5.get(i)
                                                                                + "\n Peso                 " + peso5.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento5.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida5.get(i)
                                                                                + "\n Descripcion general  " + general5.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas5.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op5 != 0);
                                                    
                                                    
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                
                                                    
                                            break;
                                            
                                            case 6:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                  
                                                    int op6;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op6= leer.nextInt();
             
                                                            switch (op6){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom6 = leer.nextLine();
                                                                    nombrepez6.add(nom6);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc6 = leer.nextLine();
                                                                    nombrecientifico6.add(nomc6);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes06 = leer.nextLine();
                                                                    peso6.add(pes06);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech6 = leer.nextLine();
                                                                    fechadenacimiento6.add(fech6);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida6 = leer.nextLine();
                                                                    esperanzadevida6.add(vida6);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene6 = leer.nextLine();
                                                                    general6.add(gene6);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon6 = leer.nextLine();
                                                                    if ((zon6.equals("Si")) || (zon6.equals("si"))|| (zon6.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar6 = leer.nextLine();
                                                                        otrazonas6.add(zonvar6);

                                                                    }else{
                                                                        otrazonas6.add(zon6);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez6.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez6.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico6.get(i)
                                                                                + "\n Peso                 " + peso6.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento6.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida6.get(i)
                                                                                + "\n Descripcion general  " + general6.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas6.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez6.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez6.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico6.get(i)
                                                                                + "\n Peso                 " + peso6.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento6.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida6.get(i)
                                                                                + "\n Descripcion general  " + general6.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas6.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe6 = leer.nextInt();
                                                                    if(elipe6 <= nombrepez6.size()){


                                                                                nombrepez6.remove(elipe6-1);
                                                                                nombrecientifico6.remove(elipe6-1);
                                                                                peso6.remove(elipe6-1);
                                                                                fechadenacimiento6.remove(elipe6-1);
                                                                                esperanzadevida6.remove(elipe6-1);
                                                                                general6.remove(elipe6-1);
                                                                                otrazonas6.remove(elipe6-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez6.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez6.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico6.get(i)
                                                                                + "\n Peso                 " + peso6.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento6.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida6.get(i)
                                                                                + "\n Descripcion general  " + general6.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas6.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez6.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez6.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico6.get(i)
                                                                                + "\n Peso                 " + peso6.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento6.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida6.get(i)
                                                                                + "\n Descripcion general  " + general6.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas6.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op6 != 0);
                                                    
                                                    
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                
                                                    
                                            break;
                                            
                                            case 7:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    
                                                    int op7;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op7= leer.nextInt();
             
                                                            switch (op7){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom7 = leer.nextLine();
                                                                    nombrepez7.add(nom7);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc7 = leer.nextLine();
                                                                    nombrecientifico7.add(nomc7);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes07 = leer.nextLine();
                                                                    peso7.add(pes07);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech7 = leer.nextLine();
                                                                    fechadenacimiento7.add(fech7);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida7 = leer.nextLine();
                                                                    esperanzadevida7.add(vida7);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene7 = leer.nextLine();
                                                                    general7.add(gene7);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon7 = leer.nextLine();
                                                                    if ((zon7.equals("Si")) || (zon7.equals("si"))|| (zon7.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar7 = leer.nextLine();
                                                                        otrazonas7.add(zonvar7);

                                                                    }else{
                                                                        otrazonas7.add(zon7);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez7.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez7.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico7.get(i)
                                                                                + "\n Peso                 " + peso7.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento7.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida7.get(i)
                                                                                + "\n Descripcion general  " + general7.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas7.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez7.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez7.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico7.get(i)
                                                                                + "\n Peso                 " + peso7.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento7.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida7.get(i)
                                                                                + "\n Descripcion general  " + general7.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas7.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe7 = leer.nextInt();
                                                                    if(elipe7 <= nombrepez7.size()){


                                                                                nombrepez7.remove(elipe7-1);
                                                                                nombrecientifico7.remove(elipe7-1);
                                                                                peso7.remove(elipe7-1);
                                                                                fechadenacimiento7.remove(elipe7-1);
                                                                                esperanzadevida7.remove(elipe7-1);
                                                                                general7.remove(elipe7-1);
                                                                                otrazonas7.remove(elipe7-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez7.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez7.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico7.get(i)
                                                                                + "\n Peso                 " + peso7.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento7.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida7.get(i)
                                                                                + "\n Descripcion general  " + general7.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas7.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez7.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez7.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico7.get(i)
                                                                                + "\n Peso                 " + peso7.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento7.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida7.get(i)
                                                                                + "\n Descripcion general  " + general7.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas7.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op7 != 0);
                                                    
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                
                                                    
                                            break;
                                            
                                            case 8:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    
                                                    int op8;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op8= leer.nextInt();
             
                                                            switch (op8){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom8 = leer.nextLine();
                                                                    nombrepez8.add(nom8);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc8 = leer.nextLine();
                                                                    nombrecientifico8.add(nomc8);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes08 = leer.nextLine();
                                                                    peso8.add(pes08);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech8 = leer.nextLine();
                                                                    fechadenacimiento8.add(fech8);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida8 = leer.nextLine();
                                                                    esperanzadevida8.add(vida8);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene8 = leer.nextLine();
                                                                    general8.add(gene8);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon8 = leer.nextLine();
                                                                    if ((zon8.equals("Si")) || (zon8.equals("si"))|| (zon8.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar8 = leer.nextLine();
                                                                        otrazonas8.add(zonvar8);

                                                                    }else{
                                                                        otrazonas8.add(zon8);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez8.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez8.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico8.get(i)
                                                                                + "\n Peso                 " + peso8.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento8.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida8.get(i)
                                                                                + "\n Descripcion general  " + general8.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas8.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez8.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez8.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico8.get(i)
                                                                                + "\n Peso                 " + peso8.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento8.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida8.get(i)
                                                                                + "\n Descripcion general  " + general8.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas8.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe8 = leer.nextInt();
                                                                    if(elipe8 <= nombrepez8.size()){


                                                                                nombrepez8.remove(elipe8-1);
                                                                                nombrecientifico8.remove(elipe8-1);
                                                                                peso8.remove(elipe8-1);
                                                                                fechadenacimiento8.remove(elipe8-1);
                                                                                esperanzadevida8.remove(elipe8-1);
                                                                                general8.remove(elipe8-1);
                                                                                otrazonas8.remove(elipe8-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez8.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez8.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico8.get(i)
                                                                                + "\n Peso                 " + peso8.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento8.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida8.get(i)
                                                                                + "\n Descripcion general  " + general8.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas8.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez8.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez8.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico8.get(i)
                                                                                + "\n Peso                 " + peso8.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento8.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida8.get(i)
                                                                                + "\n Descripcion general  " + general8.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas8.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op8 != 0);
                                                    
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                
                                                
                                                    
                                            break;
                                            
                                            case 9:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                  
                                                    int op9;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op9= leer.nextInt();
             
                                                            switch (op9){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom9 = leer.nextLine();
                                                                    nombrepez9.add(nom9);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc9 = leer.nextLine();
                                                                    nombrecientifico9.add(nomc9);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes09 = leer.nextLine();
                                                                    peso9.add(pes09);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech9 = leer.nextLine();
                                                                    fechadenacimiento9.add(fech9);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida9 = leer.nextLine();
                                                                    esperanzadevida9.add(vida9);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene9 = leer.nextLine();
                                                                    general9.add(gene9);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon9 = leer.nextLine();
                                                                    if ((zon9.equals("Si")) || (zon9.equals("si"))|| (zon9.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar9 = leer.nextLine();
                                                                        otrazonas9.add(zonvar9);

                                                                    }else{
                                                                        otrazonas9.add(zon9);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez9.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez9.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico9.get(i)
                                                                                + "\n Peso                 " + peso9.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento9.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida9.get(i)
                                                                                + "\n Descripcion general  " + general9.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas9.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez9.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez9.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico9.get(i)
                                                                                + "\n Peso                 " + peso9.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento9.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida9.get(i)
                                                                                + "\n Descripcion general  " + general9.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas9.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe9 = leer.nextInt();
                                                                    if(elipe9 <= nombrepez9.size()){


                                                                                nombrepez9.remove(elipe9-1);
                                                                                nombrecientifico9.remove(elipe9-1);
                                                                                peso9.remove(elipe9-1);
                                                                                fechadenacimiento9.remove(elipe9-1);
                                                                                esperanzadevida9.remove(elipe9-1);
                                                                                general9.remove(elipe9-1);
                                                                                otrazonas9.remove(elipe9-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez9.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez9.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico9.get(i)
                                                                                + "\n Peso                 " + peso9.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento9.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida9.get(i)
                                                                                + "\n Descripcion general  " + general9.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas9.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez9.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez9.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico9.get(i)
                                                                                + "\n Peso                 " + peso9.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento9.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida9.get(i)
                                                                                + "\n Descripcion general  " + general9.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas9.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op9 != 0);
                                                    
                                                    
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                
                                                    
                                            break;
                                            
                                            case 10:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    
                                                    int op10;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op10= leer.nextInt();
             
                                                            switch (op10){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom10 = leer.nextLine();
                                                                    nombrepez10.add(nom10);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc10 = leer.nextLine();
                                                                    nombrecientifico10.add(nomc10);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes010 = leer.nextLine();
                                                                    peso10.add(pes010);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech10 = leer.nextLine();
                                                                    fechadenacimiento10.add(fech10);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida10 = leer.nextLine();
                                                                    esperanzadevida10.add(vida10);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene10 = leer.nextLine();
                                                                    general10.add(gene10);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon10 = leer.nextLine();
                                                                    if ((zon10.equals("Si")) || (zon10.equals("si"))|| (zon10.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar10 = leer.nextLine();
                                                                        otrazonas10.add(zonvar10);

                                                                    }else{
                                                                        otrazonas10.add(zon10);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez10.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez10.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico10.get(i)
                                                                                + "\n Peso                 " + peso10.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento10.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida10.get(i)
                                                                                + "\n Descripcion general  " + general10.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas10.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez10.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez10.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico10.get(i)
                                                                                + "\n Peso                 " + peso10.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento10.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida10.get(i)
                                                                                + "\n Descripcion general  " + general10.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas10.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe10 = leer.nextInt();
                                                                    if(elipe10 <= nombrepez10.size()){


                                                                                nombrepez10.remove(elipe10-1);
                                                                                nombrecientifico10.remove(elipe10-1);
                                                                                peso10.remove(elipe10-1);
                                                                                fechadenacimiento10.remove(elipe10-1);
                                                                                esperanzadevida10.remove(elipe10-1);
                                                                                general10.remove(elipe10-1);
                                                                                otrazonas10.remove(elipe10-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez10.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez10.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico10.get(i)
                                                                                + "\n Peso                 " + peso10.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento10.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida10.get(i)
                                                                                + "\n Descripcion general  " + general10.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas10.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez10.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez10.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico10.get(i)
                                                                                + "\n Peso                 " + peso10.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento10.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida10.get(i)
                                                                                + "\n Descripcion general  " + general10.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas10.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op10 != 0);
                                                    
                                                    
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                    
                                            break;
                                            
                                            case 11:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                  
                                                    int op11;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op11= leer.nextInt();
             
                                                            switch (op11){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom11 = leer.nextLine();
                                                                    nombrepez11.add(nom11);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc11 = leer.nextLine();
                                                                    nombrecientifico11.add(nomc11);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes011 = leer.nextLine();
                                                                    peso11.add(pes011);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech11 = leer.nextLine();
                                                                    fechadenacimiento11.add(fech11);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida11 = leer.nextLine();
                                                                    esperanzadevida11.add(vida11);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene11 = leer.nextLine();
                                                                    general11.add(gene11);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon11 = leer.nextLine();
                                                                    if ((zon11.equals("Si")) || (zon11.equals("si"))|| (zon11.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar11= leer.nextLine();
                                                                        otrazonas11.add(zonvar11);

                                                                    }else{
                                                                        otrazonas11.add(zon11);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez11.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez11.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico11.get(i)
                                                                                + "\n Peso                 " + peso11.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento11.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida11.get(i)
                                                                                + "\n Descripcion general  " + general11.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas11.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez11.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez11.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico11.get(i)
                                                                                + "\n Peso                 " + peso11.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento11.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida11.get(i)
                                                                                + "\n Descripcion general  " + general11.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas11.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe11 = leer.nextInt();
                                                                    if(elipe11 <= nombrepez11.size()){


                                                                                nombrepez11.remove(elipe11-1);
                                                                                nombrecientifico11.remove(elipe11-1);
                                                                                peso11.remove(elipe11-1);
                                                                                fechadenacimiento11.remove(elipe11-1);
                                                                                esperanzadevida11.remove(elipe11-1);
                                                                                general11.remove(elipe11-1);
                                                                                otrazonas11.remove(elipe11-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez11.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez11.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico11.get(i)
                                                                                + "\n Peso                 " + peso11.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento11.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida11.get(i)
                                                                                + "\n Descripcion general  " + general11.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas11.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez11.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez11.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico11.get(i)
                                                                                + "\n Peso                 " + peso11.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento11.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida11.get(i)
                                                                                + "\n Descripcion general  " + general11.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas11.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op11 != 0);
                                                    
                                                    
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                    
                                            break;
                                            
                                            case 12:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                  
                                                    int op12;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op12= leer.nextInt();
             
                                                            switch (op12){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom12 = leer.nextLine();
                                                                    nombrepez12.add(nom12);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc12 = leer.nextLine();
                                                                    nombrecientifico12.add(nomc12);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes012 = leer.nextLine();
                                                                    peso12.add(pes012);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech12 = leer.nextLine();
                                                                    fechadenacimiento12.add(fech12);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida12 = leer.nextLine();
                                                                    esperanzadevida12.add(vida12);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene12 = leer.nextLine();
                                                                    general12.add(gene12);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon12 = leer.nextLine();
                                                                    if ((zon12.equals("Si")) || (zon12.equals("si"))|| (zon12.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar12 = leer.nextLine();
                                                                        otrazonas12.add(zonvar12);

                                                                    }else{
                                                                        otrazonas12.add(zon12);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez12.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez12.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico12.get(i)
                                                                                + "\n Peso                 " + peso12.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento12.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida12.get(i)
                                                                                + "\n Descripcion general  " + general12.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas12.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez12.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez12.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico12.get(i)
                                                                                + "\n Peso                 " + peso12.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento12.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida12.get(i)
                                                                                + "\n Descripcion general  " + general12.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas12.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe12 = leer.nextInt();
                                                                    if(elipe12 <= nombrepez12.size()){


                                                                                nombrepez12.remove(elipe12-1);
                                                                                nombrecientifico12.remove(elipe12-1);
                                                                                peso12.remove(elipe12-1);
                                                                                fechadenacimiento12.remove(elipe12-1);
                                                                                esperanzadevida12.remove(elipe12-1);
                                                                                general12.remove(elipe12-1);
                                                                                otrazonas12.remove(elipe12-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez12.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez12.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico12.get(i)
                                                                                + "\n Peso                 " + peso12.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento12.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida12.get(i)
                                                                                + "\n Descripcion general  " + general12.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas12.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez12.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez12.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico12.get(i)
                                                                                + "\n Peso                 " + peso12.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento12.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida12.get(i)
                                                                                + "\n Descripcion general  " + general12.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas12.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op12 != 0);
                                                    
                                                    
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                    
                                            break;
                                            
                                            case 13:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                  
                                                    int op13;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op13= leer.nextInt();
             
                                                            switch (op13){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom13 = leer.nextLine();
                                                                    nombrepez13.add(nom13);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc13 = leer.nextLine();
                                                                    nombrecientifico13.add(nomc13);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes013 = leer.nextLine();
                                                                    peso13.add(pes013);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech13 = leer.nextLine();
                                                                    fechadenacimiento13.add(fech13);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida13 = leer.nextLine();
                                                                    esperanzadevida13.add(vida13);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene13 = leer.nextLine();
                                                                    general13.add(gene13);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon13 = leer.nextLine();
                                                                    if ((zon13.equals("Si")) || (zon13.equals("si"))|| (zon13.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar13 = leer.nextLine();
                                                                        otrazonas13.add(zonvar13);

                                                                    }else{
                                                                        otrazonas13.add(zon13);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez13.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez13.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico13.get(i)
                                                                                + "\n Peso                 " + peso13.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento13.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida13.get(i)
                                                                                + "\n Descripcion general  " + general13.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas13.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez13.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez13.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico13.get(i)
                                                                                + "\n Peso                 " + peso13.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento13.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida13.get(i)
                                                                                + "\n Descripcion general  " + general13.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas13.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe13 = leer.nextInt();
                                                                    if(elipe13 <= nombrepez13.size()){


                                                                                nombrepez13.remove(elipe13-1);
                                                                                nombrecientifico13.remove(elipe13-1);
                                                                                peso13.remove(elipe13-1);
                                                                                fechadenacimiento13.remove(elipe13-1);
                                                                                esperanzadevida13.remove(elipe13-1);
                                                                                general13.remove(elipe13-1);
                                                                                otrazonas13.remove(elipe13-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez13.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez13.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico13.get(i)
                                                                                + "\n Peso                 " + peso13.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento13.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida13.get(i)
                                                                                + "\n Descripcion general  " + general13.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas13.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez13.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez13.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico13.get(i)
                                                                                + "\n Peso                 " + peso13.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento13.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida13.get(i)
                                                                                + "\n Descripcion general  " + general13.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas13.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op13 != 0);
                                                    
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                    
                                            break;
                                            
                                            case 14:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                  
                                                    int op14;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op14= leer.nextInt();
             
                                                            switch (op14){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom14 = leer.nextLine();
                                                                    nombrepez14.add(nom14);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc14= leer.nextLine();
                                                                    nombrecientifico14.add(nomc14);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes014 = leer.nextLine();
                                                                    peso14.add(pes014);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech14 = leer.nextLine();
                                                                    fechadenacimiento14.add(fech14);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida14 = leer.nextLine();
                                                                    esperanzadevida14.add(vida14);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene14 = leer.nextLine();
                                                                    general14.add(gene14);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon14 = leer.nextLine();
                                                                    if ((zon14.equals("Si")) || (zon14.equals("si"))|| (zon14.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar14 = leer.nextLine();
                                                                        otrazonas14.add(zonvar14);

                                                                    }else{
                                                                        otrazonas14.add(zon14);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez14.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez14.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico14.get(i)
                                                                                + "\n Peso                 " + peso14.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento14.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida14.get(i)
                                                                                + "\n Descripcion general  " + general14.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas14.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez14.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez14.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico14.get(i)
                                                                                + "\n Peso                 " + peso14.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento14.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida14.get(i)
                                                                                + "\n Descripcion general  " + general14.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas14.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe14 = leer.nextInt();
                                                                    if(elipe14 <= nombrepez14.size()){


                                                                                nombrepez14.remove(elipe14-1);
                                                                                nombrecientifico14.remove(elipe14-1);
                                                                                peso14.remove(elipe14-1);
                                                                                fechadenacimiento14.remove(elipe14-1);
                                                                                esperanzadevida14.remove(elipe14-1);
                                                                                general14.remove(elipe14-1);
                                                                                otrazonas14.remove(elipe14-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez14.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez14.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico14.get(i)
                                                                                + "\n Peso                 " + peso14.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento14.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida14.get(i)
                                                                                + "\n Descripcion general  " + general14.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas14.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez14.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez14.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico14.get(i)
                                                                                + "\n Peso                 " + peso14.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento14.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida14.get(i)
                                                                                + "\n Descripcion general  " + general14.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas14.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op14 != 0);
                                                    
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                    
                                            break;
                                            
                                            case 15:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    
                                                    int op15;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op15= leer.nextInt();
             
                                                            switch (op15){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom15 = leer.nextLine();
                                                                    nombrepez15.add(nom15);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc15 = leer.nextLine();
                                                                    nombrecientifico15.add(nomc15);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes015 = leer.nextLine();
                                                                    peso15.add(pes015);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech15 = leer.nextLine();
                                                                    fechadenacimiento15.add(fech15);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida15 = leer.nextLine();
                                                                    esperanzadevida15.add(vida15);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene15 = leer.nextLine();
                                                                    general15.add(gene15);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon15 = leer.nextLine();
                                                                    if ((zon15.equals("Si")) || (zon15.equals("si"))|| (zon15.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar15 = leer.nextLine();
                                                                        otrazonas15.add(zonvar15);

                                                                    }else{
                                                                        otrazonas15.add(zon15);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez15.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez15.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico15.get(i)
                                                                                + "\n Peso                 " + peso15.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento15.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida15.get(i)
                                                                                + "\n Descripcion general  " + general15.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas15.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez15.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez15.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico15.get(i)
                                                                                + "\n Peso                 " + peso15.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento15.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida15.get(i)
                                                                                + "\n Descripcion general  " + general15.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas15.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe15 = leer.nextInt();
                                                                    if(elipe15 <= nombrepez15.size()){


                                                                                nombrepez15.remove(elipe15-1);
                                                                                nombrecientifico15.remove(elipe15-1);
                                                                                peso15.remove(elipe15-1);
                                                                                fechadenacimiento15.remove(elipe15-1);
                                                                                esperanzadevida15.remove(elipe15-1);
                                                                                general15.remove(elipe15-1);
                                                                                otrazonas15.remove(elipe15-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez15.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez15.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico15.get(i)
                                                                                + "\n Peso                 " + peso15.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento15.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida15.get(i)
                                                                                + "\n Descripcion general  " + general15.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas15.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez15.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez15.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico15.get(i)
                                                                                + "\n Peso                 " + peso15.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento15.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida15.get(i)
                                                                                + "\n Descripcion general  " + general15.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas15.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op15 != 0);
                                                    
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                    
                                            break;
                                            
                                            case 16:
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                    int op16;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op16= leer.nextInt();
             
                                                            switch (op16){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom16 = leer.nextLine();
                                                                    nombrepez16.add(nom16);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc16 = leer.nextLine();
                                                                    nombrecientifico16.add(nomc16);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes016 = leer.nextLine();
                                                                    peso16.add(pes016);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech16 = leer.nextLine();
                                                                    fechadenacimiento16.add(fech16);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida16 = leer.nextLine();
                                                                    esperanzadevida16.add(vida16);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene16 = leer.nextLine();
                                                                    general16.add(gene16);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon16 = leer.nextLine();
                                                                    if ((zon16.equals("Si")) || (zon16.equals("si"))|| (zon16.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar16 = leer.nextLine();
                                                                        otrazonas16.add(zonvar16);

                                                                    }else{
                                                                        otrazonas16.add(zon16);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez16.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez16.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico16.get(i)
                                                                                + "\n Peso                 " + peso16.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento16.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida16.get(i)
                                                                                + "\n Descripcion general  " + general16.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas16.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez16.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez16.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico16.get(i)
                                                                                + "\n Peso                 " + peso16.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento16.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida16.get(i)
                                                                                + "\n Descripcion general  " + general16.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas16.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe16 = leer.nextInt();
                                                                    if(elipe16 <= nombrepez16.size()){


                                                                                nombrepez16.remove(elipe16-1);
                                                                                nombrecientifico16.remove(elipe16-1);
                                                                                peso16.remove(elipe16-1);
                                                                                fechadenacimiento16.remove(elipe16-1);
                                                                                esperanzadevida16.remove(elipe16-1);
                                                                                general16.remove(elipe16-1);
                                                                                otrazonas16.remove(elipe16-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez16.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez16.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico16.get(i)
                                                                                + "\n Peso                 " + peso16.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento16.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida16.get(i)
                                                                                + "\n Descripcion general  " + general16.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas16.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez16.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez16.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico16.get(i)
                                                                                + "\n Peso                 " + peso16.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento16.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida16.get(i)
                                                                                + "\n Descripcion general  " + general16.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas16.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op16 != 0);
                                                    
                                                  
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                
                                                    
                                            break;
                                            
                                            case 17:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                  
                                                    int op17;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op17= leer.nextInt();
             
                                                            switch (op17){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom17 = leer.nextLine();
                                                                    nombrepez17.add(nom17);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc17 = leer.nextLine();
                                                                    nombrecientifico17.add(nomc17);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes017 = leer.nextLine();
                                                                    peso17.add(pes017);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech17 = leer.nextLine();
                                                                    fechadenacimiento17.add(fech17);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida17 = leer.nextLine();
                                                                    esperanzadevida17.add(vida17);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene17 = leer.nextLine();
                                                                    general17.add(gene17);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon17 = leer.nextLine();
                                                                    if ((zon17.equals("Si")) || (zon17.equals("si"))|| (zon17.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar17 = leer.nextLine();
                                                                        otrazonas17.add(zonvar17);

                                                                    }else{
                                                                        otrazonas17.add(zon17);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez17.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez17.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico17.get(i)
                                                                                + "\n Peso                 " + peso17.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento17.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida17.get(i)
                                                                                + "\n Descripcion general  " + general17.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas17.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez17.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez17.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico17.get(i)
                                                                                + "\n Peso                 " + peso17.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento17.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida17.get(i)
                                                                                + "\n Descripcion general  " + general17.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas17.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe17 = leer.nextInt();
                                                                    if(elipe17 <= nombrepez17.size()){


                                                                                nombrepez17.remove(elipe17-1);
                                                                                nombrecientifico17.remove(elipe17-1);
                                                                                peso17.remove(elipe17-1);
                                                                                fechadenacimiento17.remove(elipe17-1);
                                                                                esperanzadevida17.remove(elipe17-1);
                                                                                general17.remove(elipe17-1);
                                                                                otrazonas17.remove(elipe17-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez17.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez17.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico17.get(i)
                                                                                + "\n Peso                 " + peso17.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento17.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida17.get(i)
                                                                                + "\n Descripcion general  " + general17.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas17.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez17.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez17.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico17.get(i)
                                                                                + "\n Peso                 " + peso17.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento17.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida17.get(i)
                                                                                + "\n Descripcion general  " + general17.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas17.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op17 != 0);
                                                    
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                    
                                            break;
                                            
                                            case 18:
                                                
                                                if( (tizonasto-1) < Habitats.size() ){
                                                  
                                                  
                                                    int op18;
                                                    do{
                                                    System.out.println("Que haras en esta habitad. Elige con numeros");
                                                    System.out.println("\n 1. Añadir un pez");
                                                    System.out.println("\n 2. Eliminar Pez");
                                                    System.out.println("\n 3. Mostrar Pezes");
                                                    System.out.println("\n 0. Salir");
                                                    op18= leer.nextInt();
             
                                                            switch (op18){


                                                                case 1:
                                                                    
                                                                    //do{


                                                                    System.out.println("\n Nombre del pez");
                                                                    leer.nextLine();
                                                                    String nom18 = leer.nextLine();
                                                                    nombrepez18.add(nom18);

                                                                    System.out.println("\n Nombre cientifico del pez ");
                                                                    String nomc18 = leer.nextLine();
                                                                    nombrecientifico18.add(nomc18);

                                                                    System.out.println("\n Peso del pez");
                                                                    String pes018 = leer.nextLine();
                                                                    peso18.add(pes018);



                                                                    System.out.println("\n Fecha de nacimiento del pez");
                                                                    String fech18 = leer.nextLine();
                                                                    fechadenacimiento18.add(fech18);

                                                                    System.out.println("\n Esperanza de vida del pez");
                                                                    String vida18 = leer.nextLine();
                                                                    esperanzadevida18.add(vida18);

                                                                    System.out.println("\n Descripcion general del pez");
                                                                    String gene18 = leer.nextLine();
                                                                    general18.add(gene18);

                                                                    System.out.println("\n Vive en otras zonas el pez (Poner Si o No)");
                                                                    String zon18 = leer.nextLine();
                                                                    if ((zon18.equals("Si")) || (zon18.equals("si"))|| (zon18.equals("SI")) ){
                                                                        System.out.println("\n Cuales seria (Escribir la zona)"
                                                                                + "\n Tropical agua dulce       " 
                                                                                + "\n Tropical Marino    " 
                                                                                + "\n Tanque Oceanico                 " 
                                                                                + "\n Campos de Posidonia    " 
                                                                                + "\n Fondos rocosos      " 
                                                                                + "\n Zona Toca-Toca   " 
                                                                        
                                                                        
                                                                        
                                                                                );
                                                                        String zonvar18 = leer.nextLine();
                                                                        otrazonas18.add(zonvar18);

                                                                    }else{
                                                                        otrazonas18.add(zon18);

                                                                    }
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez18.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez18.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico18.get(i)
                                                                                + "\n Peso                 " + peso18.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento18.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida18.get(i)
                                                                                + "\n Descripcion general  " + general18.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas18.get(i)

                                                                                 );

                                                                        }
                                                                       // System.out.println("\n Quieres añadir otro pez?");
                                                                      //  rep = leer.nextLine();
                                                                    //}
                                                                   // while((rep.equals("Si")) || (rep.equals("si")) );


                                                                    break;

                                                                case 2:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez18.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez18.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico18.get(i)
                                                                                + "\n Peso                 " + peso18.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento18.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida18.get(i)
                                                                                + "\n Descripcion general  " + general18.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas18.get(i)

                                                                                 );

                                                                        }

                                                                    System.out.println("Que numero de pez deseas eliminar: ");
                                                                    int elipe18 = leer.nextInt();
                                                                    if(elipe18 <= nombrepez18.size()){


                                                                                nombrepez18.remove(elipe18-1);
                                                                                nombrecientifico18.remove(elipe18-1);
                                                                                peso18.remove(elipe18-1);
                                                                                fechadenacimiento18.remove(elipe18-1);
                                                                                esperanzadevida18.remove(elipe18-1);
                                                                                general18.remove(elipe18-1);
                                                                                otrazonas18.remove(elipe18-1);

                                                                    System.out.println("Listo");
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez18.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez18.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico18.get(i)
                                                                                + "\n Peso                 " + peso18.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento18.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida18.get(i)
                                                                                + "\n Descripcion general  " + general18.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas18.get(i)

                                                                                 );

                                                                        }

                                                                    }else{
                                                                        System.out.println("Error, no hay datos guardados o la posicion no existe, favor de llenar sus datos");

                                                                    } 


                                                                     break;

                                                                case 3:
                                                                    System.out.println("\n Tus datos guardados son los siguientes: "); 
                                                                    for (int i = 0; i<nombrepez18.size(); i++)
                                                                    {



                                                                        System.out.println("\n\n"+(i+1)+" Pez " 
                                                                                + "\n Nombre del pez       " + nombrepez18.get(i)
                                                                                + "\n Nombre Cientifico    " + nombrecientifico18.get(i)
                                                                                + "\n Peso                 " + peso18.get(i)
                                                                                + "\n Fecha de nacimiento  " + fechadenacimiento18.get(i)
                                                                                + "\n Esperanza de vida    " + esperanzadevida18.get(i)
                                                                                + "\n Descripcion general  " + general18.get(i)
                                                                                + "\n Otras zona que viva  " + otrazonas18.get(i)

                                                                                 );

                                                                        }

                                                                    break;

                                                                    case 0:
                                                                        System.out.println("Adios");

                                                                    break  ;  

                                                                    default:

                                                                        System.out.println("Error eliga de nuevo");



                                                                }    

                                                    }
                                                    while(op18 != 0);
                                                    
                                                }
                                                else {
                                                  
                                                    System.out.println("No hay ningun habitad");
                                                  
                                                } 
                                                    
                                            break;

                                            case 0:
                        
                        
                                            break  ;  
                     
                                            default:
                        
                                            System.out.println("Error eliga de nuevo");    
                                            
                                            
                                        }
                                        
                                        
                                        
                                    }
                                    while(tizonasto <= 0 || tizonasto >= 19); 
                     
                    break;    
                         
                    default:
                        
                        System.out.println("Error eliga de nuevo");
                     
                     
                }    
            
        }
        while(op != 0);  
    }
    else{
               System.out.println("Los peces que hay en todo en el acuario son los siguientes:");
               if (nombrepez.size()>0){
                                  System.out.println("\n"+nombrepez);

               }
               if (nombrepez2.size()>0){
                                  System.out.println("\n"+nombrepez2);

               }
               if (nombrepez3.size()>0){
                                  System.out.println("\n"+nombrepez3);

               }
               if (nombrepez4.size()>0){
                                  System.out.println("\n"+nombrepez4);

               }
               if (nombrepez5.size()>0){
                                  System.out.println("\n"+nombrepez5);

               }
               if (nombrepez6.size()>0){
                                  System.out.println("\n"+nombrepez6);

               }
               if (nombrepez7.size()>0){
                                  System.out.println("\n"+nombrepez7);

               }
               if (nombrepez8.size()>0){
                                  System.out.println("\n"+nombrepez8);

               }
               if (nombrepez9.size()>0){
                                  System.out.println("\n"+nombrepez9);

               }
               if (nombrepez10.size()>0){
                                  System.out.println("\n"+nombrepez10);

               }
               if (nombrepez11.size()>0){
                                  System.out.println("\n"+nombrepez11);

               }
               if (nombrepez12.size()>0){
                                  System.out.println("\n"+nombrepez12);

               }
               if (nombrepez13.size()>0){
                                  System.out.println("\n"+nombrepez13);

               }
               if (nombrepez14.size()>0){
                                  System.out.println("\n"+nombrepez14);

               }
               if (nombrepez15.size()>0){
                                  System.out.println("\n"+nombrepez15);

               }
               if (nombrepez16.size()>0){
                                  System.out.println("\n"+nombrepez16);

               }
               if (nombrepez17.size()>0){
                                  System.out.println("\n"+nombrepez17);

               }
               if (nombrepez18.size()>0){
                                  System.out.println("\n"+nombrepez18);

               }
                
               
               
    }
    }     
}
