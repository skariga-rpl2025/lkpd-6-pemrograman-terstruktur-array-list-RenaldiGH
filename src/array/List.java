/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.ArrayList;

/**
 *
 * @author Toshiba
 */
public class List {

    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList(); // membuat ArrayList baru
        nama.add("Ani"); // menambah elemen
        nama.add("Budi");
        nama.add("Cici");
        System.out.println("ArrayList berisi: " + nama.size() + " yaitu: " + nama);
        nama.clear();
    }
}
