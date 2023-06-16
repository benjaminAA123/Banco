package com.iesam.bank.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ClienteFileLocalDataSource {

    private static AlumnoFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Alumno>>() {
    }.getType();

    private AlumnoFileLocalDataSource() {
    }

    public void save(Alumno alumno) {
        List<Alumno> alumnos = findAll();
        alumnos.add(alumno);
        saveToFile(alumnos);
    }

    private void saveToFile(List<Alumno> alumnos) {
        try {
            FileWriter myWriter = new FileWriter("alumnos.txt");
            myWriter.write(gson.toJson(alumnos));
            myWriter.close();
            System.out.println("Alumno guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Alumno findById(Integer alumnoId) {
        List<Alumno> alumnos = findAll();
        for (Alumno alumno : alumnos) {
            if (Objects.equals(alumno.id, alumnoId)) {
                return alumno;
            }
        }
        return null;
    }

    public List<Alumno> findAll() {
        try {
            File myObj = new File("alumnos.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeAlumnList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<Alumno>();
    }

    public static AlumnoFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new AlumnoFileLocalDataSource();
        }
        return instance;
    }
}
*/