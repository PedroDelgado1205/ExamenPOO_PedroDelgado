import java.util.List;
import java.util.Scanner;

public class Estudiante {

    public void menu(List<Persona> listaEstudiantes){
        int op=0;
        Scanner index = new Scanner(System.in);
        System.out.println("*****************MENU*****************");
        System.out.println("1.- Agregar un estudiante a la lista");
        System.out.println("2.- Mostrar la lista de estudiantes");
        System.out.println("3.- Calcular el promedio de edad de todos los estudiantes");
        System.out.println("4.- Calcular el promedio de notas ");
        System.out.println("5.- Mostrar el total de hombres y mujeres");
        System.out.println("6.- Salir de la aplicación");
        op = index.nextInt();
        switch (op){
            case 1:
                agregar(listaEstudiantes);
                break;
            case 2:
                mostrar(listaEstudiantes);
                break;
            case 3:
                calcularaEdad(listaEstudiantes);
                break;
            case 4:
                calcularNota(listaEstudiantes);
                break;
            case 5:
                totalGenero(listaEstudiantes);
                break;
            default:
        }
    }
    public void agregar(List<Persona> listaEstudiantes){
        Scanner cont = new Scanner(System.in);
        String nom, sex, tel, cur;
        int eda;
        Double not;
        System.out.println("Nombre:");
        nom=cont.nextLine();
        System.out.println("Sexo (M:masculino/F:femenino):");
        sex=cont.nextLine();
        System.out.println("Edad:");
        eda=cont.nextInt();
        System.out.println("Teléfono:");
        tel=cont.nextLine();
        tel=cont.nextLine();
        System.out.println("Curso:");
        cur=cont.nextLine();
        System.out.println("Nota:");
        not=cont.nextDouble();
        listaEstudiantes.add(new Persona(nom,sex,eda,tel,cur,not));
        menu(listaEstudiantes);
    }
    public void mostrar(List<Persona> listaEstudiantes){
        for (int i=0; i<listaEstudiantes.size();i++){
            Persona pe = (Persona)listaEstudiantes.get(i);
            System.out.println("Estudiante: "+i);
            System.out.println("Nombre:"+pe.nombre+" \nSexo:"+pe.sexo);
            System.out.println("Edad:"+pe.edad+" \ntelefono:"+pe.telefono);
            System.out.println("Curso:"+pe.curso+" \nNota:"+pe.nota);
            System.out.println("--------------------");
        }
        menu(listaEstudiantes);
    }
    public void calcularaEdad(List<Persona> listaEstudiantes){
        double pro=0, proedad=0;
        for (int i=0; i<listaEstudiantes.size();i++){
            Persona pe = (Persona)listaEstudiantes.get(i);
            pro += pe.edad;
        }
        proedad = pro/listaEstudiantes.size();
        System.out.println("El promedio de edades es: "+proedad);
        menu(listaEstudiantes);
    }
    public void calcularNota(List<Persona> listaEstudiantes){
        double pro=0, pronot=0;
        for (int i=0; i<listaEstudiantes.size();i++){
            Persona pe = (Persona)listaEstudiantes.get(i);
            pro += pe.nota;
        }
        pronot = pro/listaEstudiantes.size();
        System.out.println("El promedio de notas es: "+pronot);
        menu(listaEstudiantes);
    }
    public void totalGenero(List<Persona> listaEstudiantes){
        int totm=0, totf=0;
        for (int i=0; i<listaEstudiantes.size();i++){
            Persona pe = (Persona)listaEstudiantes.get(i);
            if (pe.sexo == "M"){
                totm+=1;
            }else{
                totf+=1;
            }
        }
        System.out.println("En total hay "+totm+" Hombres y "+totf+" Mujeres");
        menu(listaEstudiantes);
    }
}
