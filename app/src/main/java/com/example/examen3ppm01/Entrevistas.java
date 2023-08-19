package com.example.examen3ppm01;

import android.os.Parcel;
import android.os.Parcelable;

public class Entrevistas implements Parcelable {

    private int id;
    private String nombre;

    public Entrevistas() {
    }

    public Entrevistas(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nombre);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readInt();
        this.nombre = source.readString();
    }

    protected Entrevistas(Parcel in) {
        this.id = in.readInt();
        this.nombre = in.readString();
    }

    public static final Parcelable.Creator<Entrevistas> CREATOR = new Parcelable.Creator<Entrevistas>() {
        @Override
        public Entrevistas createFromParcel(Parcel source) {
            return new Entrevistas(source);
        }

        @Override
        public Entrevistas[] newArray(int size) {
            return new Entrevistas[size];
        }
    };
}
